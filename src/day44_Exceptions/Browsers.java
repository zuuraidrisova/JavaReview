package day44_Exceptions;

public class Browsers {

    /*

warmup task:
	1. create a class called Browsers
			actions: openBrowser(): opens the default browser
					 closeBrowser(): closes the default browser
	2. create a class called ChromeBrowser
			actions: openBrowser(): opens the chrome browser
					 closeBrowser(): closes the chrome browser
	3. create a class called FirefoxBrowser
			actions: openBrowser(): opens the Firefox browser
					 closeBrowser(): closes the Firefox browser
	4. create a class called Opera browser
			actions: openBrowser(): opens the Opera browser
					 closeBrowser(): closes the Opera browser
	5. create a class called Test:
			create an object of each browsers and call the openBrowser & closeBrowser
			 actions
 */

    public void openBrowser(){

        System.out.println("Opening the default browser");
    }

    public void closeBrowser(){

        System.out.println("Closing the default browser");
    }


}

class ChromeBrowser extends Browsers{

    @Override
    public void openBrowser(){

        System.out.println("Opening Chrome Browser");
    }

    @Override
    public void closeBrowser(){

        System.out.println("Closing Chrome Browser");
    }
}

class OperaBrowser extends Browsers{

    @Override
    public void openBrowser(){

        System.out.println("Opening Opera Browser");
    }

    @Override
    public void closeBrowser(){

        System.out.println("Closing Opera Browser");
    }
}

class FireFoxBrowser extends Browsers{

    @Override
    public void openBrowser(){

        System.out.println("Opening FireFox Browser");
    }

    @Override
    public void closeBrowser(){

        System.out.println("Closing FireFox Browser");
    }
}

class BrowserObjects{

    public static void main(String[] args) {

        ChromeBrowser chrome = new ChromeBrowser();

        chrome.openBrowser();
        chrome.closeBrowser();

        System.out.println("=================================================");

        FireFoxBrowser firefox = new FireFoxBrowser();

        firefox.openBrowser();
        firefox.closeBrowser();

        System.out.println("=================================================");

        OperaBrowser opera = new OperaBrowser();

        opera.openBrowser();
        opera.closeBrowser();

        System.out.println("=================================================");

        Browsers defaultB = new Browsers();

        defaultB.openBrowser();
        defaultB.closeBrowser();

    }
}