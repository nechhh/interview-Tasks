package JavaQuestionsAndAnswears;

import java.util.*;

public class ReverseOrder {
    public static void main(String[] args) {
        /*create a String and print it in reverse order (Sunday ->yadnuS)*/
        String str="Sunday";
       for (int i=str.length()-1;i>=0;i--){
           System.out.print(str.charAt(i));
       }
        System.out.println();

String nec="Nico";


StringBuffer necs=new StringBuffer(nec);
        System.out.println(necs.reverse());

        System.out.println("Without Using Reverse Function ");



      String a="Erish Na zaloma";

      String b="";

      for (int i = a.length()-1; i>=0;i--){
          b=b+a.charAt(i);

      }
        System.out.println("reserved order = "+b);

        List<String> myList=new ArrayList<>();
        myList.add("zaloma");
        myList.add("Na");
        myList.add("Erish");
        System.out.println(myList);

        Collections.reverse(myList);
    }




}
