/*
 * Class name :  PalindromeService
 *
 * @author Oleksii Shevchenko
 *
 * Description:
 *
 * 1) Implement static method isValid(...){...}
 * 2) Logic of method isValid(...){...} has to be encapsulated
 * 3) Implement logger and test for each method of class PalindromeService
 * 4) Implement cyrillic symbols check
 *
 */
package shev.edu;

import java.util.logging.Logger;

public class PolindromService {

    private String string;
    private static final Logger LOGGER =
            Logger.getLogger(PolindromService.class.getName());
    private static final String regex =  "[^a-zA-Zа-яА-Я]";


        //constructor
    public PolindromService(String string) {
        this.string = string;
    }
    //empty constructor
    public PolindromService(){}


    //get set
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

     // Method to convert string to lower case
    private void toLowerCase() {
        LOGGER.info("Started toLowerCase method");
        this.setString(this.string.toLowerCase());
    }

    //  Method to get formatted string free from symbols and spaces
    private void getCleanedString(){
        LOGGER.info("Started getCleanedString method");
        this.setString(this.string.replaceAll(regex, ""));
    }

     //Method to get reversed string to check
    private String getReversed(){
        LOGGER.info("Started getReversed method");
        return new StringBuilder (string).reverse().toString();
    }


     //Static implementation to check whether string is palindrome or not

    public static Boolean isValid(String string) {
        LOGGER.info("Started isValid method");
        if (string == null) return null;
        PolindromService palindromeService = new PolindromService(string);
        palindromeService.toLowerCase();
        palindromeService.getCleanedString();
        if (palindromeService.getString().length() == 0) return false;
        return palindromeService.getString().equals(palindromeService.getReversed());
    }



}
