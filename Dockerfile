FROM openjdk:11

ARG PROFILE
ARG ADITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADITIONAL_OPTS=${ADITIONAL_OPTS}

WORKDIR /opt/dockerapi

COPY /target/docker-api*.jar docker-api.jar

SHELL ["/bin/sh", "-c"]

EXPOSE 8080
EXPOSE 5005

CMD java ${ADITIONAL_OPTS} -jar docker-api.jar --spring.profiles.active=${PROFILE}