Scalikejdbc
-----------
>Scalikejdbc feature tests.

Test
----
1. sbt clean test

Benchmark
---------
1. sbt jmh:run

Results
-------
1. addTodo - 44.293
2. listTodos - 40.524
>Total time: 402 s (06:42), 10 warmups, 10 iterations, in microseconds, completed 2021.9.10