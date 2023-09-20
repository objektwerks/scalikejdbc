Scalikejdbc
-----------
>Scalikejdbc feature tests and performance benchmark against H2 and Scala 3.

Test
----
1. sbt clean test

Benchmark
---------
>See Performance class for details.
1. sbt jmh:run

Results
-------
>OpenJDK Runtime Environment Zulu17.30+51-CA (build 17.0.1+12-LTS), Scala 3.1.1-RC1, Apple M1
1. addTodo - 30.310
2. listTodos - 26.623
3. updateTodo - 31.458
>Total time: 605 s (10:05), 10 warmups, 10 iterations, in microseconds, completed 2021.12.14
