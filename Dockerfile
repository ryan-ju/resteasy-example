FROM stackoverflower/java7-tomcat7-maven3:1.0

MAINTAINER rju

COPY src /project/src/

COPY pom.xml /project/

RUN cd /project/ && mvn clean install && cp target/docker-restaesy-1-1.0.0-SNAPSHOT.war /tomcat/webapps/api.war

EXPOSE 8080

ENTRYPOINT ["/run.sh"] 
