package objektwerks

import com.typesafe.config.Config

import scalikejdbc._

object Store:
  def apply(conf: Config): Store = new Store(conf)

class Store(conf: Config):
  val driver = conf.getString("db.driver")
  val url = conf.getString("db.url")
  val user = conf.getString("db.user")
  val password = conf.getString("db.password")

  Class.forName(driver)
  ConnectionPool.singleton(url, user, password)

  def addTodo(todo: Todo): Int =
    DB localTx { implicit session =>
      sql"insert into todo(task) values(${todo.task})".updateAndReturnGeneratedKey().toInt
    }

  def updateTodo(todo: Todo): Unit =
    DB localTx { implicit session =>
      sql"update todo set task = ${todo.task} where id = ${todo.id}".update()
    }
    ()

  def listTodos(): Seq[Todo] =
    DB readOnly { implicit session =>
      sql"select * from todo"
        .map(rs => Todo( rs.int("id"), rs.string("task") ) )
        .list()
    }