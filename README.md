# liferay-arquillian

A sample project to launch Arquillian Tests with Liferay 6.2 based on [this article](https://www.liferay.com/fr/web/manuel.delapenya/blog/-/blogs/-the-plugin-worked-on-my-computer-is-not-valid-anymore) instructions

## Configure tomcat

- Enable JMX on your bundled tomcat 7 server adding 

-Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.authenticate=false 
-Dcom.sun.management.jmxremote.port=8099 -Dcom.sun.management.jmxremote.ssl=false
on JAVA_OPTS in setenv file

- Add /manager webapp in tomcat webapps dir
- Uncomment tomcat role & user in conf/tomcat-users.xml : add roles tomcat,manager-gui,manager-script,manager-jmx,manager-status to tomcat user
- Start Tomcat

## Launch sample test

- Pull projects
- Configure root pom.xml tomcat profil to set portal path
- maven must be installed on your path

from /sample-arquillian project run 

<blockquote>mvn test</blockquote>

You should have :


    Running fr.booster.arquillian.LiferayArquillianTest
    ….
    ….
    Infos: Connecting to JMX at service:jmx:rmi:///jndi/rmi://localhost:8099/jmxrmi
    Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.082 sec

    Results :

    Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 11.282s
    [INFO] Finished at: Fri Feb 20 11:27:23 CET 2015
    [INFO] Final Memory: 19M/213M
    [INFO] ------------------------------------------------------------------------
