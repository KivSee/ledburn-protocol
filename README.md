# ledburn-protocol
Implementation for the ledburn protocol - for real time addressable leds control
Large scale installations of LED that requires Real-Time

[![Release](https://jitpack.io/v/leddict/ledburn-protocol.svg)](https://jitpack.io/#leddict/ledburn-protocol)

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
	  <groupId>com.github.leddict</groupId>
	  <artifactId>ledburn-protocol</artifactId>
	  <version>0.5</version>
  </dependency>
```

You should probably check the example file here (MISSING A LINK)

If you want to contribute please see [CONTRIBUTING.md](CONTRIBUTING.md)
