# rservlet 6.0
A Hello World Servlet. Scala 3.6.2. Files must be in the following structure. That structure can lie in root or any sub folder.

/WEB-INF/web.xml

/WEB-INF/classes/mypack/ServApp.class

/WEB-INF/lib/scala-library-2.13.15.jar + scala3-library_3-3.6.2

So if this is installed on a local machine in the webapps/Hello folder and the port is unchanged from the default the page will display at
http://localhost:8080/Hello/welcome 
Requires Apache Tomcat 10.1+
Requires Jetty 12.0 with --add-modules=ee10-deploy