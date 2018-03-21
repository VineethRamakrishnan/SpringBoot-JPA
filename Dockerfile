FROM java:8
VOLUME /tmp
ADD springboot-sample-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "java", "-jar", "app.jar" ]