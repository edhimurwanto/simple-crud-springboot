FROM adoptopenjdk:11-jre-hotspot
MAINTAINER Edi Murwanto <edhi.uchiha@gmail.com>

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]