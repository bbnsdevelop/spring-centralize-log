FROM openjdk:11

ARG JAR_FILE=target/*.jar

WORKDIR /opt/app

COPY ${JAR_FILE} /opt/app/app.jar

ENTRYPOINT ["java","-jar","/opt/app/app.jar"]