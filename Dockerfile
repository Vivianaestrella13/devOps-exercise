FROM amazoncorretto:17
ARG artifactId
ENV ARTIFACT_ID=exercise-devops-0.0.1-SNAPSHOT.jar
COPY target/${artifactId} /devOps/
WORKDIR /devOps
ENTRYPOINT java -jar $ARTIFACT_ID