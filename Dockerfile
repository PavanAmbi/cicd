FROM openjdk:11-jdk-oracle
MAINTAINER pavan.fly@gmail.com
COPY target/springjava-practise-0.0.1-SNAPSHOT.jar springjavapractise.jar
ENTRYPOINT ["java","-jar","/springjavapractise.jar"]