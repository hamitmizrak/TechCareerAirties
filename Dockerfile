FROM adoptopenjdk/openjdk16-openj9
EXPOSE 8080
ARG JAR_FILE=out/artifacts/TechCareerAirties_jar/TechCareerAirties.jar
ADD ${JAR_FILE} application.jar
ENTRYPOINT ["java","jar","/application.jar"]