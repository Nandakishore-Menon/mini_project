FROM openjdk:19
ADD target/mini_project-1.0-jar-with-dependencies.jar mini_project.jar
ENTRYPOINT ["java", "-jar","mini_project.jar"]
EXPOSE 8000
