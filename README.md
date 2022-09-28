# springhibernate
In this project, have explored spring data jpa with hibernate implementation.

**Note:**

**MySQL** is used for database operation. If MySQL setup is **not present in your machine**, please feel free to use **H2 database** by changing the profile --> **@ActiveProfiles** from "dev" to "int" in all test files, in this <a href="https://github.com/sureshbabk19698/springhibernate/blob/main/src/test/java/com/sk/hibernate/">folder</a>

----------------------------------------------------------------------------------------------
**Finder Methods** - Spring JPA has provided features, such as without writing a JPQL, desired search operation can be performed by using method name itself.
* Refer : <a href="https://github.com/sureshbabk19698/springhibernate/blob/main/src/test/java/com/sk/hibernate/product/ProductApplicationTests.java">Few examples</a>
* Refer : <a href="https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repository-query-keywords">Spring Documentation</a>

----------------------------------------------------------------------------------------------
**Cache :** 
* <a href="https://github.com/sureshbabk19698/springhibernate/blob/main/src/test/java/com/sk/hibernate/product/ProductApplicationFirstLevelCacheTest.java">FirstLevelCache</a>

* For <a href="https://github.com/sureshbabk19698/springhibernate/blob/main/src/test/java/com/sk/hibernate/product/ProductApplicationSecondLevelCacheTest.java">SecondLevelCache</a>, explore <a href="https://github.com/sureshbabk19698/springhibernate/blob/main/src/main/resources/application.properties">application.properties</a> and <a href="https://github.com/sureshbabk19698/springhibernate/blob/main/src/main/resources/ehcache.xml">ehcache.xml</a>

* <a href="https://github.com/sureshbabk19698/springhibernate/blob/main/src/test/java/com/sk/hibernate/product/ProductApplicationSpringCacheTest.java">Spring Cache</a>

Note : To show the difference between First and SecondLevelCache, second level cache is disabled in
<a href="https://github.com/sureshbabk19698/springhibernate/blob/main/src/test/java/com/sk/hibernate/product/ProductApplicationFirstLevelCacheTest.java">FirstLevelCache</a> using **--spring.jpa.properties.hibernate.cache.use_second_level_cache=false**
------------------------------------------------------------------------------------------------
<a href="https://github.com/sureshbabk19698/springhibernate/blob/main/src/test/java/com/sk/hibernate/bank/BankApplicationTests.java">Pageable and Sorting</a>