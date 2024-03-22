Scalikejdbc
-----------
>Scalikejdbc feature test and performance benchmark against H2 using Scala 3.

Test
----
1. sbt clean test

Benchmark
---------
>See Performance class for details.
1. sbt jmh:run

Results
-------
>OpenJDK Runtime Environment Zulu22.28+91-CA (build 22+36), **Scala 3.4.1-RC2**, Apple M1
1. addTodo - 4.455
2. listTodos - 1.901
3. updateTodo - 3.648
>Total time: 604 s (10:04), 10 warmups, 10 iterations, average time in microseconds, completed **2024.3.22**

>OpenJDK Runtime Environment Zulu21.28+85-CA (build 21+35), Scala 3.1.1, Apple M1
1. addTodo - 31.347
2. updateTodo - 29.617
3. listTodos - 25.164
>Total time: 602 s (10:04), 10 warmups, 10 iterations, average time in microseconds, completed 2023.9.27

>OpenJDK Runtime Environment Zulu17.30+51-CA (build 17.0.1+12-LTS), Scala 3.0.0, Apple M1
1. addTodo - 30.310
2. updateTodo - 31.458
3. listTodos - 26.623
>Total time: 605 s (10:05), 10 warmups, 10 iterations, average time in microseconds, completed 2023.5.20
