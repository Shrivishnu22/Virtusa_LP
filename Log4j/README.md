# Log4j

It is a Java-based logging utility, and provides a flexible and efficient way to output log statements from Java applications

> [log.properties](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/Log4j/log.properties)
- It is a configuration file for log4j, which is a logging framework used in Java applications. 
- It contains various properties and settings that control the behavior of log4j. These properties determine things like the logging level (e.g., ERROR, WARNING, INFO, etc.), the appenders (i.e., the destinations to which log messages are sent), and the format of the log messages themselves
- `%d{yyyy-MM-dd HH:mm:ss} %-5p  %c{1}:%L  -  %m%n` is a conversion pattern used in log4j to format log messages.
  - %d{yyyy-MM-dd HH:mm:ss}: This part of the pattern specifies the date and time format of the log message.
  - %-5p: This specifies the logging level (ERROR, WARN, INFO, DEBUG, TRACE) with a minimum width of 5 characters.
  - %c{1}:%L: This specifies the name of the class and the line number from where the log message is being written.
  - %m%n: This represents the actual log message and a newline character.

## Work Flow
-  A static logger instance named `logger` is created and it is initialized with the logger for the class "Access"
-  `BasicConfigurator.configure()` is used to configure the logger with a basic configuration if the properties file is not available.
-  `PropertyConfigurator.configure("log.properties")`- The logger is configured with the properties specified in the log4j properties file "log.properties".
-  Further lines are used to log using logger into [printLog.log](https://github.com/Shrivishnu22/Virtusa_LP/blob/master/Log4j/log/printLog.log)

   
## Tech Stack 
- Log4j
- Maven
