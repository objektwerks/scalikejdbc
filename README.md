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
>OpenJDK Runtime Environment Zulu21.28+85-CA (build 21+35), Scala 3.1.1, Apple M1
1. addTodo - 32.279
2. listTodos - 27.079
3. updateTodo - 32.757
>Total time: 604 s (10:04), 10 warmups, 10 iterations, in microseconds, completed 2023.9.20

>OpenJDK Runtime Environment Zulu17.30+51-CA (build 17.0.1+12-LTS), Scala 3.0.0, Apple M1
1. addTodo - 30.310
2. listTodos - 26.623
3. updateTodo - 31.458
>Total time: 605 s (10:05), 10 warmups, 10 iterations, in microseconds, completed 2023.5.20