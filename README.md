# payara-micro-demo
A demo project using Java EE 7 running on Payara micro container. To run the project, you must have Maven 3 + Java SE 8 installed on you local machine. 

To build type 'mvn clean install'

To start the application, type 'java -jar payara-micro-X.y.z.jar --deploy payara-1.0.war'. The application will start on address http://localhost:8080/payara-1.0/service/greet/Your_name . NOTE! You will need to download the micro container jar (payara-micro-X.y.z.jar) from http://www.payara.fish/downloads

Additional info: 
This Java EE7 app also runs on Raspberry Pi Model 1B. Just install Java 8 on your Raspberry Pi and execute with the above command.
