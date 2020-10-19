package day25_MethodsRecap;

public class Driver_Ternary {

    public static void main(String[] args) {

            /*
    write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "id", "safari",
				"edge", "Opera"}, then it returns the name of that specific browser'
				driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above,
				the method should return "Invalid"
				APPLY SWITCH STATEMENTS
     */

        String str = "Chrome";

       String browser =  getDriver(str);

        System.out.println("browser = " + browser);

    }

    public static String getDriver(String browser){

        browser = browser.toLowerCase();

        return  (browser.equals("chrome")) ? "Chrome is opening" : (browser.equals("safari"))?
                "Safari is opening" : (browser.equals("ie")) ? "IE is opening" :(browser.equals("opera")) ?
                "Opera is opening" :(browser.equals("firefox")) ? "Firefox is opening" : "Invalid Browser";


    }
}
