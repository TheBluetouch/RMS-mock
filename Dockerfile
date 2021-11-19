FROM openjdk:11
COPY target/rms-0.0.1-SNAPSHOT.jar rms-mock2.jar
ENTRYPOINT ["java","-jar","rms-mock2.jar"]