FROM eclipse-temurin:17
COPY target/compute.jar compute.jar
CMD [ "java","-jar","compute.jar" ]