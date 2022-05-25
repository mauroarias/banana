FROM adoptopenjdk/openjdk11:latest

COPY target/banana*.jar /usr/lib/banana/app.jar
WORKDIR /usr/lib/banana
VOLUME /etc/cfg
EXPOSE 80 8081

ENV SPRING_PROFILES_ACTIVE=dev
ENV JAVA_OPTS="-Xms30m -Xmx30m -Xss256k -XX:MaxMetaspaceSize=64m"
ENV CONFIG_PATH=/etc/cfg/

ENTRYPOINT exec java $JAVA_OPTS -jar app.jar
