FROM gradle:9.1.0-jdk25

RUN apt-get update && apt-get install -y sudo && apt-get clean
RUN echo "gradle ALL=(ALL) NOPASSWD:ALL" >> /etc/sudoers

USER gradle
