package JavaQuestionsAndAnswears;

import java.util.*;

public class Demo {
    public static void main(String[] args) {


        String s = "SEYIT VEDAT SERVET NEC VEDAT SEYIT ozlem ozlem SERVET NEC VEDAT ozlem VEDAT VEDAT ozlem ";

        String sArr[] = s.split(" ");
        HashMap<String, Integer> hMap = new HashMap<>();
        for (int i = 0; i < sArr.length; i++) {
            if (hMap.containsKey(sArr[i])) {
                int count = hMap.get(sArr[i]);
                hMap.put(sArr[i], count + 1);
            } else {
                hMap.put(sArr[i], 1);
            }

        }
        System.out.println(hMap);

    }


}


