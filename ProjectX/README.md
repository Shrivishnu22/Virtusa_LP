# Append and Display Data using Auth Web App

It allows you to add data to the database and display it as a table. It also uses session management to protect the data injection pages from outsiders. 
It permits only authenticated users

## Flow 

(1/3) Login.jsp  --->  Login.java  ---> (Checks the credentials and Session gets created) --->  Home.jsp  --->  Add.jsp  ---> (Collects Data from User) -->  Append.java  ---> (Append the Data into Database and Redirects) --->  Home.jsp
 
 (2/3) Home.jsp  --->  Display.jsp   ---> (Displays Data in form of Table and Redirects)  --->  Home.jsp
 
 (3/3) Home.jsp --->  Logout.java  --->  Invalidate Session
   
   
## Tech Stack 
- JSP
- Servlet
- JDBC
- Session Management
