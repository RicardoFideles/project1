# Working with Spring Boot


## Mongodb config

```
<dependency>
	<groupId>org.springframework.data</groupId>
	<artifactId>spring-data-mongodb</artifactId>
	<version>2.0.2.RELEASE</version>
</dependency>
```

Add in application.properties

```
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=projeto1
```

Reference docs.
https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html

### Queries
https://docs.spring.io/spring-data/mongodb/docs/current/reference/html/#repositories.query-methods

## H2
```
<dependency>
	<groupId>com.h2database</groupId>
	<artifactId>h2</artifactId>
	<scope>runtime</scope>
</dependency>
```
Add in application.properties

```
spring.h2.console.enabled=true
```

http://localhost:8080/h2-console

## Mysql

```
<dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
</dependency>
```

Add in application.properties

```
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/dbprojeto1
spring.datasource.username=demo
spring.datasource.password=demo
spring.jpa.properties.hibernate.enable_lazy_load_no_trans=true
```


