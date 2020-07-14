## Building the project with Docker

In case you don't have Java 8 and maven installed in your machine, you can use Docker to build the project and generate the `app.jar`.

In this directory, compile the image using the existing Dockerfile:

```cli
$> docker build -t sonar-secrets-java .
```
The Docker image `sonar-secrets-java` that has been generated contains the `app.jar` file in the `/output` folder of the image filesystem.

In order to take the `output/app.jar` file out of the image, you can attach a Docker volume when you first run the container: 

```cli
$> docker run --rm -d -v myvol:/output sonar-secrets-java
```
A volume with the name `myvol` should have just been created and that is mapped to the `/output` folder in the container, where the `app.jar` file lives.

In your host filesystem, you should be able to find the `app.jar` file under `/var/lib/docker/volumes/myvol/_data`.