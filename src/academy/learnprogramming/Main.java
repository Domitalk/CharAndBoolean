package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        // the difference between string and character is "" string and '' character
        // char only holds one character

        char myUnicode = '\u0044';
        // this is unicode. characters are stored as unicode. they take up 2 bytes of memory.

        System.out.println(myChar);
        // D
        System.out.println(myUnicode);
        // D

        char myCopyRight = '\u00A9';

        System.out.println(myCopyRight);
        // the copyright character

        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;

        boolean isCustomerOverTwentyOne = true;
        // naming convention to start with isAndTheRestOfTheQuestion
        

    }
}
