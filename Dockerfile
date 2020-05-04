FROM openjdk:8
ADD target/Calculator_SPE-1.0-SNAPSHOT.jar Calculator_SPE-1.0-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "Calculator_SPE-1.0-SNAPSHOT.jar", "com.calculator.Calculator"]
