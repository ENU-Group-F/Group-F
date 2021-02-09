FROM openjdk:latest
COPY ./target/Group-F-1.0-SNAPSHOT-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "Group-F-1.0-SNAPSHOT-jar-with-dependencies.jar"]