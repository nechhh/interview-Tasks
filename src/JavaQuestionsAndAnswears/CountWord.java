package JavaQuestionsAndAnswears;

import java.util.HashMap;

public class CountWord {
    public static void main(String[] args) {

        String s = "SEYIT VEDAT SERVET NEC VEDAT SEYIT ozlem ozlem SERVET NEC VEDAT ozlem VEDAT VEDAT ozlem ";

        String[] sArr = s.split(" ");//
        HashMap<String, Integer> maplist = new HashMap<>();//

        for (int i = 0; i<sArr.length; i++) {//
            if (maplist.containsKey(sArr[i])) {
                int count = maplist.get(sArr[i]);
                maplist.put(sArr[i], count + 1);
            } else {
                maplist.put(sArr[i], 1);
            }
        }

        System.out.println(maplist);

    }
}
