# Spring MVC [Model-View-Controller]

It is a framework used to develop Java-based web applications

> Model-View-Controller design pattern
- The Model represents the data and business logic
- The View represents the user interface
- The Controller acts as an intermediary between the Model and the View

> [Web.xml](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/SpringMVC/src/main/webapp/WEB-INF/web.xml)
- It is to define the servlet configuration for the application
- It is used to map the DispatcherServlet, which is the front controller of the Spring MVC application, to a specific URL pattern, so that requests made to that URL pattern are handled by the DispatcherServlet
- This servlet is responsible for forwarding requests to the appropriate controllers, processing the response from the controllers, and rendering the final view

## Flow 
- A user makes a request to the server by entering a URL in the browser or by clicking a link.
- The request is sent to the [DispatcherServlet](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/SpringMVC/src/main/webapp/WEB-INF/dispatcher-servlet.xml), which acts as the front controller in Spring MVC.
- The DispatcherServlet determines which controller should handle the request based on the URL mapping defined in the configuration.
- The [Selected controller](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/SpringMVC/src/main/java/com/mvc/controller/WelcomeController.java) performs the necessary business logic and returns a ModelAndView object that contains the model data and the name of the view to be used.
- The DispatcherServlet forwards the request to the [View](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/SpringMVC/src/main/webapp/WEB-INF/views/welcomepage.jsp) (e.g. JSP, Thymeleaf template) for rendering the response.
- The view uses the model data to generate the HTML output and returns the response to the user.
- The response is sent back to the user's browser, and the process is complete.



## Tech Stack 
- Spring MVC
- Maven
