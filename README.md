# Java EE Login App (Servlets + JSP + JDBC)
A simple Java EE web application demonstrating **user authentication** using **Servlets**, **JSP**, and **JDBC** with a MySQL database.
### Features
- User Registration and Login
- Session Management
- Input Validation (Server-side)
- MVC Architecture (Servlets as Controllers, JSP as Views)
- MySQL Database Connectivity using JDBC
- Deployed on Apache Tomcat 10.0
### Tech stack
Language - Java (JDK 17+ [25])
<br>
Web Framework - Servlet & JSP (Jakarta EE)
<br> 
Database - MySQL 
<br> 
Server - Apache Tomcat 10.0
<br> 
IDE - Eclipse IDE for Enterprise Java Developers
### Setup Instructions
##### 1. clone the repository
git clone https://github.com/satoru1726/JavaEE-LoginApp.git 
##### 2. import into eclipse IDE
Open Eclipse → File → Import → Existing Projects into Workspace <br> Select this folder and finish.
##### 3. configure database
-- create a MySQL database (e.g. userdb)
<br> -- run the provided SQL script in /sql/ 
<br> -- update file [.java] with your DB credentials.
<br> -- create a MySQL database by running the SQL script:
``` bash
mysql -u root -p < sql/userdb.sql
```
##### 4. run on tomcat
add project to Apache Tomcat server
start the server
Visit: http://localhost:8080/JavaEE-LoginApp
### Author
Jayanth A R 
<br>
Aspiring Full Stack Dev.
### License
This project is open-source and available under the MIT License.
