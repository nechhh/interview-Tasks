package JavaQuestionsAndAnswears;

import java.util.HashMap;

public class MostPoeticalWord {

    public static void main(String[] args) {

        // a,b,c,d,e,f +1
        // x -2
        // k -1

        System.out.println(mostPoeticalWord("Que par la douleur du partir keeeeek"));
    }

    public static String mostPoeticalWord(String poem){

        String poetricalWord = " ";

        String[] sArr = poem.split(" ");//
        HashMap<String, Integer> maplist = new HashMap<>();//

        for (int i=0;i< sArr.length; i++ ){
            char[] ch = new char[sArr[i].length()];
            int temp =0;
            for (int y = 0; y < sArr[i].length(); y++) {
                ch[y] = sArr[i].charAt(y);
                char letter = ch[y];
                if(letter=='a' || letter=='b' || letter=='c' || letter=='d' || letter=='e' || letter=='f' ){
                    temp = temp+1;
                } else if (letter=='k') {
                    temp = temp-1;
                } else if (letter=='x') {
                    temp = temp-2;
                }

            }
            maplist.put(sArr[i], temp);

        }

        poetricalWord = maplist.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();

        return poetricalWord;
    }
}
