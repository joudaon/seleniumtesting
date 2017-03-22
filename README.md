#SELENIUM TESTING

##Table of Contents

- [Selenium Web Driver and FF Browser Copatibilities](#selenium-web-driver-and-ff-browser-compatibilities)
- [Selenium Web Driver and Chrome Browser Copatibilities](#selenium-web-driver-and-chrome-browser-compatibilities)
- [Selenium Web Driver and IE Browser Copatibilities](#selenium-web-driver-and-ie-browser-compatibilities)
- [Setting up the Driver 3.0.x](#setting-up-the-driver-3-0-1)
- [Firebug and Firepath Installation](#firebug-and-firepath-installation)
- [Setting up Log4j2](#setting-up-log4j2)
- [Setting up TestNG](#setting-up-testng)
- [Advanced Reporting](#advanced-reporting)
- [Data Driven Testing](#data-driven-testing)
- [Maven Installation and Setup](#maven-installation-and-setup)
- [Cucumber Setup](#cucumber-setup)
- [Code Coverage](#code-coverage)

## Selenium Web Driver and FF Browser Compatibilities

| Selenium Web Driver | Firefox  | Gecko Driver |
| ------ | ------ | ------ |
| [v.2.52](http://selenium-release.storage.googleapis.com/index.html?path=2.52/) | [v.45.0](https://ftp.mozilla.org/pub/firefox/releases/45.0/) | x |
| [v.3.0.1](http://selenium-release.storage.googleapis.com/3.0/selenium-java-3.0.1.zip) | [v.45.0](https://ftp.mozilla.org/pub/firefox/releases/45.0/) | [v.0.14.0](https://github.com/mozilla/geckodriver/releases/download/v0.14.0/geckodriver-v0.14.0-arm7hf.tar.gz) |

## Selenium Web Driver and Chrome Browser Compatibilities

| Selenium Web Driver | Chrome Browser  | Chrome Driver |
| ------ | ------ | ------ |
| [v.2.52](http://selenium-release.storage.googleapis.com/index.html?path=2.52/) | [v.56.0.2924.87](http://www.filehorse.com/download-google-chrome-64/) | [v.2.27](https://chromedriver.storage.googleapis.com/index.html) |

## Selenium Web Driver and IE Browser Compatibilities

x32 version faces less issues than x64

| Selenium Web Driver | IE Browser  | IE Driver |
| ------ | ------ | ------ |
| [v.2.52](http://selenium-release.storage.googleapis.com/index.html?path=2.52/) | [v.11.0.9600.18537](https://www.microsoft.com/es-es/download/details.aspx?id=40854) | [v.3.0](http://selenium-release.storage.googleapis.com/index.html?path=3.0/) |

## Setting up the driver 3.0.1

We must declare "System.setProperty("key", "def")" before declaring FirefoxDriver. If not, it won´t work. 

```java
1| WebDriver driver;
2| System.setProperty("webdriver.gecko.driver", "pathtogeckodriver\\geckodriver.exe");
3| driver = new FirefoxDriver();
```

## Firebug and Firepath Installation

| Firefox | Firebug  | Firepath |
| ------ | ------ | ------ |
| [v.45.0](https://ftp.mozilla.org/pub/firefox/releases/45.0/) | [v.2.0.18]( https://addons.mozilla.org/en-US/firefox/addon/firebug/versions/) | [v.0.9.7.1.1-signed.1-signed](https://addons.mozilla.org/es/firefox/addon/firepath/) |

## Setting up Log4j2

All we need is the following two jars.

- log4j-api-2.x.jar
- log4j-core-2.x.jar

They can be downloaded from: https://logging.apache.org/log4j/2.0/download.html

Log4j2.xml file is created in a folder and then that folder should be added to the build path of the project.

## Setting up TestNG

- Go to Eclipse
- Go to Help > Install New Software
- Click "Add..." > TestNG - https://beust.com/eclipse/

## Advanced Reporting

Jars for Advanced Reporting can be downloaded at: http://extentreports.com/community/

Required Jars are the followings:

- freemarker-2.3.23.jar
- jsoup-1.8.3.jar
- sqlite-jdbc-3.8.11.1.jar
- extentreports-2.41.2.jar

## Data Driven Testing

Jars For Data Driven Testing can be downloaded at: http://poi.apache.org/download.html

Required Jars are the followings:

- poi-3.16-beta2.jar
- poi-examples-3.16-beta2.jar
- poi-excelant-3.16-beta2.jar
- poi-ooxml-3.16-beta2.jar
- poi-ooxml-schemas-3.16-beta2.jar
- poi-scratchpad-3.16-beta2.jar
- ooxml-lib / xmlbeans-2.6.0.jar
- commons-codec-1.10.jar
- commons-logging-1.2.jar
- junit-4.12.jar

## Maven Installation and Setup

Donwload latest Binary zip archive from: http://maven.apache.org/download.cgi

Extract the zip (usually in: C:\apache\apache-maven\)

Set environment variables:

```sh
$ M2_HOME=C:\Program Files\Apache\apache-maven-3.3.3
$ M2=%M2_HOME%\bin
$ MAVEN_OPTS=-Xms256m -Xmx512m
```

Append the String ";%M2%" to the system variable. 

Go to console and type:

```sh
$ mvn --version
```

It should return informative data.

## Cucumber Setup

In Eclipse go to Help > Install New Software > Add:

Cucumber Plugin - http://cucumber.github.com/cucumber-eclipse/update-site

## Code Coverage

We will use EclEmma Plugin for Eclipse.

In Eclipse go to Help > Install New Software > Add: 

EclEmma - http://update.eclemma.org/

More info at: [http://www.eclemma.org/](http://www.eclemma.org/)