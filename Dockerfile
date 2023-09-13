FROM openjdk:11
EXPOSE 8080
ADD target/Helloworld.jar Helloworld.jar
ENTRYPOINT ["java","-jar","/Helloworld.jar" ]