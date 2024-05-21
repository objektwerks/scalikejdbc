package objektwerks

import com.typesafe.config.Config

import scalikejdbc.*

final class Store(config: Config):
  val url = config.getString("db.url")
  val user = config.getString("db.user")
  val password = config.getString("db.password")

  ConnectionPool.singleton(url, user, password)

  def addTodo(todo: Todo): Long =
    DB localTx { implicit session =>
      sql"insert into todo(task) values(${todo.task})".updateAndReturnGeneratedKey()
    }

  def updateTodo(todo: Todo): Int =
    DB localTx { implicit session =>
      sql"update todo set task = ${todo.task} where id = ${todo.id}".update()
    }

  def listTodos(): Seq[Todo] =
    DB readOnly { implicit session =>
      sql"select * from todo"
        .map(rs => Todo( rs.int("id"), rs.string("task") ) )
        .list()
    }