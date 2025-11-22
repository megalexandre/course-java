FROM gradle:8.11-jdk21-jammy

# Install sudo
RUN apt-get update && apt-get install -y sudo && apt-get clean

# The gradle image already has a gradle user with uid/gid 1000
# Just give it sudo access
RUN echo "gradle ALL=(ALL) NOPASSWD:ALL" >> /etc/sudoers

USER gradle
