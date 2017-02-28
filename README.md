#SELENIUM TESTING

##Table of Contents

- [Selenium Web Driver and FF Browser Copatibilities](#selenium-web-driver-and-ff-browser-compatibilities)
- [Selenium Web Driver and Chrome Browser Copatibilities](#selenium-web-driver-and-chrome-browser-compatibilities)
- [Selenium Web Driver and IE Browser Copatibilities](#selenium-web-driver-and-ie-browser-compatibilities)
- [Setting up the Driver 3.0.x](#setting-up-the-driver-3-0-1)
- [Firebug and Firepath Installation](#firebug-and-firepath-installation)
- [Setting up Log4j2](#setting-up-log4j2)

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