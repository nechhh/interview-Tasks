package JavaQuestionsAndAnswears;

import java.util.Scanner;

public class simplePasword {
    public static void main(String[] args) {
        final int NUM_UPPER_LETTERS =1;
        final int NUM_LOWER_LETTERS =1;
        final int NUM_DIGITS =1;

        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        int letterCount = 0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your password");
        String  input=sc.nextLine();
         int  size=input.length();

        for (int i = 0; i <size ; i++) {
            char ch=input.charAt(i);
            if (Character.isLowerCase(ch))
                lowerCount++;
            else if (Character.isUpperCase(ch))
                upperCount++;
            else if (Character.isDigit(ch))
               digitCount++;
            }
        if (upperCount >0 && letterCount >0 && digitCount >0)
            System.out.println("valid pasword");

           else {
            System.out.println("The Password  has not followings");
               if(upperCount<1)
                   System.out.println("please at least one upper case");
               if (lowerCount <1)
                   System.out.println("Please at least one lower case");
               if (digitCount <1)
                   System.out.println("please add one digit");
        }

        }


    }


