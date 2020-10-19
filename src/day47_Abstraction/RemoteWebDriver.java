package day47_Abstraction;

public abstract class RemoteWebDriver {

     /*
    Task03:
		1. create an abstract class called RemoteWebDriver
					attributes: browserName
					methods:
							abstract methods: get(URL), close(), maximize();
		2. create three sub classes of Browser:
								1. ChromeBrowser
								2. SafariBrowser
								3. OperaBrowser
						each class MUST have constructors to initialize the attributes
					each actions should ONLY be applicable to the object it's called from
					Ex:
						chrome.get("https://www.google.com")
						output should be: chrome browse is opening https://www.google.com
						(it should not open the URL in different browser other than chrome)
     */

    public String browserName;

    public abstract void get(String url);

    public abstract void close();

    public abstract void maximize();


}

class ChromeDriver extends RemoteWebDriver{


    public ChromeDriver(String browserName){

        this.browserName = browserName;
    }

    @Override
    public void get(String url){

        System.out.println(browserName+" is opening "+url);
    }

    @Override
    public void close(){

        System.out.println(browserName+" is closing");
    }

    public void maximize(){

        System.out.println(browserName+" maximizes");
    }
}

class OperaDriver extends RemoteWebDriver{

    public OperaDriver(String browserName){

        this.browserName = browserName;

    }

    @Override
    public void get(String url) {

        System.out.println(browserName+" is opening "+url);
    }

    @Override
    public void close() {

        System.out.println(browserName+" is closing");
    }

    @Override
    public void maximize() {

        System.out.println(browserName+" maximizes");
    }
}

class SafariDriver extends RemoteWebDriver{

    public SafariDriver(String browserName){

        this.browserName = browserName;

    }

    @Override
    public void get(String url) {

        System.out.println(browserName+" is opening "+url);
    }

    @Override
    public void close() {

        System.out.println(browserName+" is closing");
    }

    @Override
    public void maximize() {

        System.out.println(browserName+" maximizes");
    }
}

class DriverObjects{


    public static void main(String[] args) {

        ChromeDriver chrome = new ChromeDriver("Chrome");

        chrome.get("https://www.google.com");
        chrome.maximize();
        chrome.close();

        System.out.println("=====================================");

        OperaDriver opera = new OperaDriver("Opera");

        opera.get("https://www.google.com");
        opera.maximize();
        opera.close();

        System.out.println("=====================================");

        SafariDriver safari = new SafariDriver("Safari");

        safari.get("https://www.google.com");
        safari.maximize();
        safari.close();

    }
}