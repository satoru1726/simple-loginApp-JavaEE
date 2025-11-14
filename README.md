# Java EE Login App (Servlets + JSP + JDBC)
a simple Java EE web application demonstrating **user authentication** using **Servlets**, **JSP**, and **JDBC** with a MySQL database.

## features
- user Registration and Login<br>
- session Management<br>
- input Validation (Server-side)<br>
- MVC Architecture (Servlets as Controllers, JSP as Views)<br>
- mySql Database Connectivity using JDBC<br>
- deployed on Apache Tomcat 10.0
  
## tech stack
- language - Java (JDK 17+ [25])
- web Framework - Servlet & JSP (Jakarta EE)
- database - MySQL 
- server - Apache Tomcat 10.0
- IDE - Eclipse IDE for Enterprise Java Developers
  
## setup instructions
- clone the repository
git clone https://github.com/satoru1726/JavaEE-LoginApp.git 
- import into eclipse IDE
Open eclipse --> file --> import --> existing projects into Workspace --> Select this folder and finish.
- configure database
  -- create a MySQL database (e.g. userdb)
  -- run the provided SQL script in /sql/
  -- update file [.java] with your DB credentials.
  -- create a MySQL database by running the SQL script:
```
mysql -u root -p < sql/userdb.sql
```
- run on tomcat
- add project to Apache Tomcat server
- start the server
- visit: http://localhost:8080/JavaEE-LoginApp
  
## author info.
**_Jayanth A R_**
<br>
aspiring Full Stack Dev.
<br>
mail: <jayanthcrpar@gmail.com>
<br>
linkedIn: <www.linkedin.com/in/jayanth-a-r-254232323>

## license info.
this project is open-source and available under the MIT License.
