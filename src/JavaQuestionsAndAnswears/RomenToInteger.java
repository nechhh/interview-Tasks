package JavaQuestionsAndAnswears;

import java.util.HashMap;
import java.util.Map;

public class RomenToInteger {

    public static void main(String[] args) {
        System.out.println(romenToInt("MDLXVI"));
    }
    public static int romenToInt(String a){


        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

         int res=0;

        for (int i = 0; i <a.length() ; i++) {

            if(i>0 && map.get(a.charAt(i)) > map.get(a.charAt(i-1))){

            }else {
                res +=map.get(a.charAt(i));
            }

        }
    return res;
    }

}

