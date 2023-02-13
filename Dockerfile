FROM amazoncorretto:17-alpine-jdk
MAINTAINER LJM
COPY target/PorfolioBack1-0.0.1-SNAPSHOT.jar PorfolioBack1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/PorfolioBack1-0.0.1-SNAPSHOT.jar"]
