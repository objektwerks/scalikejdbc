Scalikejdbc
-----------
>Scalikejdbc feature tests and performance benchmark.

Test
----
1. sbt clean test

Benchmark
---------
>See Performance class for details.
1. sbt jmh:run

Results
-------
>OpenJDK Runtime Environment Zulu17.30+51-CA (build 17.0.1+12-LTS), Scala 2.13.7, Apple M1
1. addTodo - 48.485
2. listTodos - 42.427
3. updateTodo - 48.388
>Total time: 605 s (10:05), 10 warmups, 10 iterations, in microseconds, completed 2021.11.5