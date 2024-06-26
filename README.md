ScalikeJdbc
-----------
>ScalikeJdbc feature test and performance benchmark against H2 using Scala 3.

Test
----
1. sbt clean test

Benchmark
---------
>See Performance class for details.
1. sbt jmh:run

Results
-------
>OpenJDK Runtime Environment Zulu22.30+13-CA (build 22.0.1+8), **Scala 3.5.0-RC1**, Apple M1
1. addTodo - 33.005
2. updateTodo - 30.721
3. listTodos - 25.852
>Total time: 602 s (10:02), 10 warmups, 10 iterations, average time in microseconds, completed **2024.5.21**

>OpenJDK Runtime Environment Zulu22.28+91-CA (build 22+36), **Scala 3.4.1-RC2**, Apple M1
1. addTodo - 32.528
2. updateTodo - 30.165
3. listTodos - 25.936
>Total time: 602 s (10:02), 10 warmups, 10 iterations, average time in microseconds, completed **2024.3.22**

>OpenJDK Runtime Environment Zulu21.28+85-CA (build 21+35), Scala 3.1.1, Apple M1
1. addTodo - 31.347
2. updateTodo - 29.617
3. listTodos - 25.164
>Total time: 602 s (10:04), 10 warmups, 10 iterations, average time in microseconds, completed 2023.9.27

Comparison
----------
>ScalikeJdbc is more performant than ScalikeJdbc ORM:

>[ ScalikeJdbc ORM ] OpenJDK Runtime Environment Zulu22.30+13-CA (build 22.0.1+8), **Scala 3.5.0-RC1**, Apple M1
1. addTodo - 38.934
2. updateTodo - 37.679
3. listTodos - 42.660
>Total time: 603 s (10:03), 10 warmups, 10 iterations, average time in microseconds, completed **2024.5.21**

Resources
---------
* [ScalikeJdbc](https://scalikejdbc.org/)