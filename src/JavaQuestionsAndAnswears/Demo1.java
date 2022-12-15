package JavaQuestionsAndAnswears;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
       String s="bib kek bib kek bib kek nec er nec r er er er er helik helik ";

          String[] st=s.split(" ");
        HashMap<String,Integer> list=new HashMap<>();

        for (int i = 0; i <st.length ; i++) {
            if (list.containsKey(st[i])){
                int count = list.get(st[i]);
                list.put(st[i],count+1);
            }else {
                list.put(st[i],1);
            }
        }
        System.out.println(list);








    }
}
