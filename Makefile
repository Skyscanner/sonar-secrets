build:
	cd java && mvn clean package
	cd javascript && mvn clean package

.PHONY: build
