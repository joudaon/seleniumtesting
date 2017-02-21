#SELENIUM TESTING

##Table of Contents

- [Selenium Web Driver and FF Browser Copatibilities](#selenium-web-driver-and-ff-browser-compatibilities)
- [Selenium Web Driver and Chrome Browser Copatibilities](#selenium-web-driver-and-chrome-browser-compatibilities)
- [Selenium Web Driver and IE Browser Copatibilities](#selenium-web-driver-and-ie-browser-compatibilities)
- [Setting up the Driver 3.0.x](#setting-up-the-driver-3-0-1)

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
| Selenium Web Driver | IE Browser  | IE Driver |
| ------ | ------ | ------ |
| [v.2.52](http://selenium-release.storage.googleapis.com/index.html?path=2.52/) | [v.11.0.9600.18537](https://www.microsoft.com/es-es/download/details.aspx?id=40854) | [v.3.0](http://selenium-release.storage.googleapis.com/3.0/IEDriverServer_x64_3.0.0.zip) |

## Setting up the driver 3.0.1

We must declare "System.setProperty("key", "def")" before declaring FirefoxDriver. If not, it won´t work. 

```java
1| WebDriver driver;
2| System.setProperty("webdriver.gecko.driver", "pathtogeckodriver\\geckodriver.exe");
3| driver = new FirefoxDriver();
```
