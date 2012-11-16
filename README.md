jboss-eclipselink-problem
=========================

Repository to show code that fails when using JBoss AS7 with EclipseLink

Requirements
=========================

* JBoss AS7 v7.1.1 running on localhost
* EclipseLink 2.4.1 installed as JBoss module
* Default H2 datasource: ExampleDS

Steps to reproduce
=========================

Use "maven clean install" to build in the following order:

1. persistence
2. war
3. ear

Deploy on JBoss by dropping ear/target/ear-0.0.1-SNAPSHOT.ear in 
JBoss standalone/deployments. Wait for EAR to be deployed.

Open http://localhost:8080/war in web browser.

Click on Injection Case to see problem with getting EntityManager injected
in AccountService.java.

Click on Transaction Case to see problem with transaction when EntityManager
is sent as argument to AccountService.java constructor.

