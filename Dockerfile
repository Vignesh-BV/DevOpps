FROM eclipse_temurin:17
COPY target/devopps.jar devopps.jar 
CMD ["java","-jar","devopps.jar"]