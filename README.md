# Java EE Login App (Servlets + JSP + JDBC)
A simple Java EE web application demonstrating **user authentication** using **Servlets**, **JSP**, and **JDBC** with a MySQL database.

### Features 
<br>
- User Registration and Login
- Session Management
- Input Validation (Server-side)
- MVC Architecture (Servlets as Controllers, JSP as Views)
- MySQL Database Connectivity using JDBC
- Deployed on Apache Tomcat 10.0

### Tech stack
<br>
**Language**------------------------------ _Java (JDK 17+ [25])_ 
<br>
**Web Framework**------------------------- _Servlet & JSP (Jakarta EE)_ 
<br> 
**Database**------------------------------ _MySQL_ 
<br> 
**Server**-------------------------------- _Apache Tomcat 10.0_ 
<br> 
**IDE**----------------------------------- _Eclipse IDE for Enterprise Java Developers_ 

### Setup Instructions

#### 1. Clone the Repository

```bash
git clone https://github.com/<your-username>/JavaEE-LoginApp.git ```

#### 2. Import into Eclipse

Open Eclipse → File → Import → Existing Projects into Workspace
Select this folder and finish.

#### 3. Configure Database

Create a MySQL database (e.g. userdb)
Run the provided SQL script in /sql/ 
Update DBConnection.java with your DB credentials.
Create a MySQL database by running the SQL script:
  ```bash
  mysql -u root -p < sql/userdb.sql
  
Update DBConnection.java with your MySQL username and password.

#### 4. Run on Tomcat
Add project to Apache Tomcat server
Start the server
Visit: http://localhost:8080/JavaEE-LoginApp

#### **Author**
Jayanth A R
Aspiring Full Stack Dev.

#### **License**
This project is open-source and available under the MIT License.
