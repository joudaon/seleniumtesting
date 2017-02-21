#SELENIUM TESTING

##Table of Contents

- [Selenium Web Driver and FF Browser Copatibilities](#selenium-web-driver-and-ff-browser-compatibilities)
- [Setting up the Driver 3.0.x](#setting-up-the-driver-3-0-1)

## Selenium Web Driver and FF Browser Compatibilities

| Selenium Web Driver | Firefox  | Gecko Driver |
| ------ | ------ | ------ |
| [v2.52](http://selenium-release.storage.googleapis.com/index.html?path=2.52/) | [v45.0](https://ftp.mozilla.org/pub/firefox/releases/45.0/) | x |
| [v3.0.1](http://selenium-release.storage.googleapis.com/3.0/selenium-java-3.0.1.zip) | [v45.0](https://ftp.mozilla.org/pub/firefox/releases/45.0/) | [v.0.14.0](https://github.com/mozilla/geckodriver/releases/download/v0.14.0/geckodriver-v0.14.0-arm7hf.tar.gz) |

## Setting up the driver 3.0.1

We must declare "System.setProperty("key", "def")" before declaring FirefoxDriver. If not, it won�t work. 

```java
1| WebDriver driver;
2| System.setProperty("webdriver.gecko.driver", "pathtogeckodriver\\geckodriver.exe");
3| driver = new FirefoxDriver();
```
