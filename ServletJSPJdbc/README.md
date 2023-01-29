# Data Fetcher Web App

It absorbs the user ID from the user and compares the User ID with the database, returns the whole data associate with the ID.

## Flow

(1/2)  index.jsp  --->  (Receives the ID from User)  --->  Server.java  --->  (Passes the ID to UserDAO.java)  --->  UserDAO.java  --->  Fetches the data and returns back.

(2/2)  (The returned data stored in User.java)  --->  (Passes the Data in form of object through RequestDispatcher)  --->  displayUser.jsp   --->  Displays the Data.
   
## Tech Stack 
- JSP
- Servlet
- JDBC
- Maven
