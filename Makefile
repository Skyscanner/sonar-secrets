build-java-jar:
	cd java && mvn clean package

build-javascript-jar:
	cd javascript && mvn clean package

build: build-java-jar build-javascript-jar

.PHONY: build-java-jar build-javascript-jar build
