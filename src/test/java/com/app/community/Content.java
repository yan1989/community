package com.app.community;

public class Content {
  public static String content = """
    2025-02-06T09:58:49.793+08:00  INFO 21772 --- [community] [           main] com.app.community.CommunityApplication   : Starting CommunityApplication using Java 17.0.8.1 with PID 21772 (D:\\IdeaProject\\community\\target\\classes started by Administrator in D:\\IdeaProject\\community)
    2025-02-06T09:58:49.795+08:00  INFO 21772 --- [community] [           main] com.app.community.CommunityApplication   : No active profile set, falling back to 1 default profile: "default"
    2025-02-06T09:58:51.117+08:00  INFO 21772 --- [community] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
    2025-02-06T09:58:51.183+08:00  INFO 21772 --- [community] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 58 ms. Found 4 JPA repository interfaces.
    2025-02-06T09:58:51.926+08:00  INFO 21772 --- [community] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
    2025-02-06T09:58:51.955+08:00  INFO 21772 --- [community] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
    2025-02-06T09:58:51.955+08:00  INFO 21772 --- [community] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.34]
    2025-02-06T09:58:52.001+08:00  INFO 21772 --- [community] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
    2025-02-06T09:58:52.001+08:00  INFO 21772 --- [community] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2161 ms
    2025-02-06T09:58:52.397+08:00  INFO 21772 --- [community] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
    2025-02-06T09:58:52.471+08:00  INFO 21772 --- [community] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.6.4.Final
    2025-02-06T09:58:52.505+08:00  INFO 21772 --- [community] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
    2025-02-06T09:58:52.887+08:00  INFO 21772 --- [community] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
    2025-02-06T09:58:52.920+08:00  INFO 21772 --- [community] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
    2025-02-06T09:58:53.103+08:00  INFO 21772 --- [community] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.mysql.jdbc.JDBC4Connection@70ed902a
    2025-02-06T09:58:53.104+08:00  INFO 21772 --- [community] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
    2025-02-06T09:58:53.134+08:00  WARN 21772 --- [community] [           main] org.hibernate.dialect.Dialect            : HHH000511: The 5.7.44 version for [org.hibernate.dialect.MySQLDialect] is no longer supported, hence certain features may not work properly. The minimum supported version is 8.0.0. Check the community dialects project for available legacy versions.
    2025-02-06T09:58:53.137+08:00  WARN 21772 --- [community] [           main] org.hibernate.orm.deprecation            : HHH90000025: MySQLDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
    2025-02-06T09:58:53.152+08:00  INFO 21772 --- [community] [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
    	Database JDBC URL [Connecting through datasource 'HikariDataSource (HikariPool-1)']
    	Database driver: undefined/unknown
    	Database version: 5.7.44
    	Autocommit mode: undefined/unknown
    	Isolation level: undefined/unknown
    	Minimum pool size: undefined/unknown
    	Maximum pool size: undefined/unknown
    Hibernate: create table post (id bigint not null auto_increment, content text not null, date datetime(6) not null, summary varchar(800) not null, title varchar(255) not null, update_time datetime(6), section_id bigint, uid bigint, primary key (id)) engine=InnoDB
    Hibernate: alter table post add constraint FK3j1ud3lm6ae9aa87bg60jsnd1 foreign key (section_id) references section (id)
    Hibernate: alter table post add constraint FKdog8w91w62bio3blfdnh7p1gy foreign key (uid) references user (uid)
    2025-02-06T09:58:54.139+08:00  INFO 21772 --- [community] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
    2025-02-06T09:58:54.648+08:00  WARN 21772 --- [community] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
    2025-02-06T09:58:54.706+08:00  INFO 21772 --- [community] [           main] r$InitializeUserDetailsManagerConfigurer : Global AuthenticationManager configured with UserDetailsService bean with name communityUserDetailsService
    2025-02-06T09:58:55.907+08:00  INFO 21772 --- [community] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 1 endpoint beneath base path '/actuator'
    2025-02-06T09:58:56.038+08:00  INFO 21772 --- [community] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
    2025-02-06T09:58:56.050+08:00  INFO 21772 --- [community] [           main] com.app.community.CommunityApplication   : Started CommunityApplication in 6.686 seconds (process running for 8.493)
    2025-02-06T09:58:56.411+08:00  INFO 21772 --- [community] [)-192.168.1.103] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
    2025-02-06T09:58:56.411+08:00  INFO 21772 --- [community] [)-192.168.1.103] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
    2025-02-06T09:58:56.413+08:00  INFO 21772 --- [community] [)-192.168.1.103] o.s.web.servlet.DispatcherServlet        : Completed initialization in 2 ms
    """;
}
