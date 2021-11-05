Scalikejdbc
-----------
>Scalikejdbc feature tests and performance benchmark.

Test
----
1. sbt clean test

Benchmark
---------
1. sbt jmh:run

Results
-------
>OpenJDK 64-Bit Server VM (Zulu 8.56.0.23-CA-macos-aarch64) (build 25.302-b08, mixed mode)
1. addTodo - 48.485
2. updateTodo - 48.388
3. listTodos - 42.427
>Total time: 605 s (10:05), 10 warmups, 10 iterations, in microseconds, completed 2021.11.5