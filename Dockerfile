From openjdk:8
ADD target/employe-jdbc-0.0.1.jar employe-jdbc-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "employe-jdbc-0.0.1.jar"]