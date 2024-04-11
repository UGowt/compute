FROM eclipse-temurin:17
COPY target/cloud.jar compute.jar
CMD [ "java","-jar","compute.jar" ]