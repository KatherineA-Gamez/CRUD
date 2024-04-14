FROM  openjdk:17
COPY Crud/target/Crud-0.0.1-SNAPSHOT.jar java-app.jar
ENTRYPOINT [ "java", "-jar", "java-app.jar" ]
