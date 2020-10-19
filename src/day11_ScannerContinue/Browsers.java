package day11_ScannerContinue;

public class Browsers {

    public static void main(String[] args) {

        String browser = "Opera";

        switch (browser){

            case "chrome": //means or , in case it starts with lower case
            case "Chrome":
                System.out.println("Opera is opening...");
                break;
            case "firefox":
            case "Firefox":
                System.out.println("Firefox is opening...");
                break;
            case "opera":
            case "Opera":
                System.out.println("Opera is opening...");
                break;
            case "safari":
            case "Safari":
                System.out.println("Safari is opening...");
                break;
            default:
                System.out.println("Invalid browser");
                break;
        }


    }
}
