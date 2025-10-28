# Java EE Login App (Servlets + JSP + JDBC)
a simple Java EE web application demonstrating **user authentication** using **Servlets**, **JSP**, and **JDBC** with a MySQL database.
### features
user Registration and Login<br>
session Management<br>
input Validation (Server-side)<br>
MVC Architecture (Servlets as Controllers, JSP as Views)<br>
mySql Database Connectivity using JDBC<br>
deployed on Apache Tomcat 10.0
### tech stack
language - Java (JDK 17+ [25])
<br>
web Framework - Servlet & JSP (Jakarta EE)
<br> 
database - MySQL 
<br> 
server - Apache Tomcat 10.0
<br> 
IDE - Eclipse IDE for Enterprise Java Developers
### setup instructions
#### 1. clone the repository
git clone https://github.com/satoru1726/JavaEE-LoginApp.git 
#### 2. import into eclipse IDE
Open Eclipse → File → Import → Existing Projects into Workspace <br> Select this folder and finish.
#### 3. configure database
-- create a MySQL database (e.g. userdb)
<br> -- run the provided SQL script in /sql/ 
<br> -- update file [.java] with your DB credentials.
<br> -- create a MySQL database by running the SQL script:
``` bash
mysql -u root -p < sql/userdb.sql
```
#### 4. run on tomcat
add project to Apache Tomcat server
start the server
Visit: http://localhost:8080/JavaEE-LoginApp
### author info.
•𝗥𝗬ō𝗜𝗞𝗜 𝗧𝗘𝗡𝗞ā𝗜•
<br>
aspiring Full Stack Dev.
<br>
mail: zeninmakisan2025@gmail.com
<br>
linkedIn: www.linkedin.com/in/jayanth-a-r-254232323 
### license info.
this project is open-source and available under the MIT License.
