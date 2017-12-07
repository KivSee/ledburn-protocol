# ledburn-protocol
Implementation for the ledburn protocol - for real time addressable leds control

[![Release](https://jitpack.io/v/jitpack/maven-simple.svg)](https://jitpack.io/#jitpack/maven-simple)

# Requirments
1. [Install JDK 1.7+](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
2. (For Mac Os) Install Mvn 3.5+ On **Mac**:
You need `brew`. You can `install brew` by running :
  * `/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
 `
* Then run `brew install maven`

3. Install Mvn For Windows / Linux you can follow:
(https://maven.apache.org/download.cgi)


# Use it

To use it in your Maven build add:
```xml
  <repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
  </repositories>
```

and the dependency:

```xml
	<dependency>
		<groupId>com.leddict</groupId>
		<artifactId>ledburn-protocol</artifactId>
		<version>0.1</version>
	</dependency>
```

