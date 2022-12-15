package JavaQuestionsAndAnswears;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String s1, String s2){
        String str1=s1.replaceAll(" ","");//Remove spaces
        String str2=s2.replaceAll(" ","");
        if (str1.length() !=str2.length()){
            return false;
        }else {
            char v1[]=str1.toLowerCase().toCharArray();//convert to lover case
            char v2[]=str2.toLowerCase().toCharArray();

            Arrays.sort(v1);  //b e g m u
            Arrays.sort(v2);   //b e g m u

            return Arrays.equals(v1,v2);
        }



    }
    public static void main(String[] args) {
        System.out.println(isAnagram("ozlem","melzi"));


    }

}
