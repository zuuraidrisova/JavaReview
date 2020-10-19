package day12_JavaRecap;

import java.util.Scanner;

public class StatusCodeTernaryScanner {

    public static void main(String[] args) {

              /*
200, OK
201, Created
202, Accepted
301, Moved Permanently
303, See Other
304, Not Modified
307, Temporary Redirect
400, Bad Request
401, Unauthorized
403, Forbidden
404, Not Found
410, Gone
500, Internal Server Error
503, Service Unavailable
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter status code: ");

        int statusCode = scanner.nextInt();

        String status = (statusCode == 200)? "Ok" : (statusCode == 201) ? "Created" :
                (statusCode == 202) ? "Accepted" : (statusCode == 204) ? "No Content" :
                (statusCode == 301) ? "Moved Permanently" : (statusCode == 303) ? "See Other":
                (statusCode ==304) ? "Not Modified" : (statusCode == 307) ? "Temporary Redirect" :
                (statusCode == 400)? "Bad Request" : (statusCode == 401) ? "Unauthorized":
                (statusCode == 403) ? "Forbidden" : (statusCode == 404) ? "Not Found":
                (statusCode == 410) ? "Gone" : (statusCode == 500) ? "Internal Server Error" :
                (statusCode ==503) ? "Service Unavailable" : "Invalid Status Code";

        System.out.println("status = " + status);
    }
}
