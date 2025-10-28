# Java EE Login App (Servlets + JSP + JDBC)
A simple Java EE web application demonstrating **user authentication** using **Servlets**, **JSP**, and **JDBC** with a MySQL database.

### Features <br>
- User Registration and Login
- Session Management
- Input Validation (Server-side)
- MVC Architecture (Servlets as Controllers, JSP as Views)
- MySQL Database Connectivity using JDBC
- Deployed on Apache Tomcat 10.0

### Tech stack <br>
Language------------------------------ Java (JDK 17+ [25])
<br>
Web Framework------------------------- Servlet & JSP (Jakarta EE)
<br> 
Database------------------------------ MySQL 
<br> 
Server-------------------------------- Apache Tomcat 10.0
<br> 
IDE----------------------------------- Eclipse IDE for Enterprise Java Developers

### Setup Instructions

#### 1. Clone the Repository
git clone https://github.com/satoru1726/JavaEE-LoginApp.git 
<br>
#### 2. Import into Eclipse
Open Eclipse → File → Import → Existing Projects into Workspace
Select this folder and finish.
<br>
#### 3. Configure Database
Create a MySQL database (e.g. userdb)
Run the provided SQL script in /sql/ 
Update DBConnection.java with your DB credentials.
Create a MySQL database by running the SQL script:
<br>
  mysql -u root -p < sql/userdb.sql
<br>
Update DBConnection.java with your MySQL username and password.
<br>
#### 4. Run on Tomcat
Add project to Apache Tomcat server
Start the server
Visit: http://localhost:8080/JavaEE-LoginApp
<br>
#### **Author**
Jayanth A R
Aspiring Full Stack Dev.
<br>
#### **License**
This project is open-source and available under the MIT License.
