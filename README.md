# Spring Boot - Playground
This repository of Spring Boot starter project is intended for experimenting various concepts and plugins in Spring Boot to stay up to date with the latest development in this space.

## What is covered?
Running list of updates in this repo in ascending order

* <b>[Jan, 04, 2022]:</b>
    - [Jooq](https://www.jooq.org/) is a SQL DSL rather than an ORM. The Java classes for the tables are auto generated and it makes it whole lot simpler to work at the SQL level while interacting with the databases. A good comparision between Jooq and myBatis is available here [myBatis vs Jooq](https://blog.jooq.org/tag/mybatis/).

* <b>[Jan, 03, 2022]:</b>
    - While we can use the JPA DTO for requestand response, it is usually considered a good practice to keep them separate. There are multiple Java mapping frameworks [https://auth0.com/blog/how-to-automatically-map-jpa-entities-into-dtos-in-spring-boot-using-mapstruct/](https://auth0.com/blog/how-to-automatically-map-jpa-entities-into-dtos-in-spring-boot-using-mapstruct/) and [https://www.baeldung.com/java-performance-mapping-frameworks](https://www.baeldung.com/java-performance-mapping-frameworks)

* <b>[Jan, 02, 2022]:</b>
    - *Database change control:* Added support for Spring Flyway [https://flywaydb.org/documentation/usage/plugins/springboot](https://flywaydb.org/documentation/usage/plugins/springboot)
* <b>[Jan, 01, 2022]:</b>
    - *Starter App* Base Spring Boot application generated from [https://start.spring.io/](https://start.spring.io/). The started app uses Java language and Maven build and includes Spring Boot DevTools, Web, Lombok, Spring Data JPA support.
    - *Logging:* Log using Lombok Sl4j annotation [https://projectlombok.org/api/lombok/extern/slf4j/Slf4j.html](https://projectlombok.org/api/lombok/extern/slf4j/Slf4j.html)
