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
1. addTodo - 47.908
2. updateTodo - 50.249
3. listTodos - 43.479
>Total time: 605 s (06:43), 10 warmups, 10 iterations, in microseconds, completed 2021.11.5