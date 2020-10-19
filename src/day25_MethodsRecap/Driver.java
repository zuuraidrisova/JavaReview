package day25_MethodsRecap;

import javax.swing.plaf.nimbus.AbstractRegionPainter;

public class Driver {
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

        String browser = "Chrome";

        String driver = getDriver(browser);

        System.out.println("browser = " + driver);
    }

    public static String getDriver(String browser){

        switch (browser){

            case "chrome":
            case "Chrome":
                return "Chrome";
            case "opera":
            case "Opera":
                return "Opera";
            case "firefox":
            case "FireFox":
                return "Firefox";
            case "safari":
            case "Safari":
                return "Safari";
            case "IE":
            case "ie":
                return "IE";
            default:
                return "Invalid Browser";
        }
    }
}
