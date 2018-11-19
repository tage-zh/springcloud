# spring cloud
#
# VERSION               0.0.1

FROM java

MAINTAINER tiger.zhao "117676896@qq.com"

ENV JAVA_OPTS              "-Xms128m -Xmx128m"

COPY target/ribbon-service-0.0.1-SNAPSHOT.jar /usr/local/spring.jar

CMD ["/bin/sh", "-c", "java $JAVA_OPTS -Dfile.encoding=UTF-8 -jar /usr/local/spring.jar"]