package JavaQuestionsAndAnswears;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Nico");
        list.add("Adam");
        list.add("Olric");
        list.add("Olric");
        list.add("Nico");
        list.add("Rem");
//        System.out.println(list);
//       HashSet<String> newlist=new HashSet<>(list);
//        System.out.println(newlist);

        System.out.println("Second Way ");
        HashSet hList=new HashSet<>();
        for (String a:list){
            hList.add(a);
        }
        System.out.println(hList);
    }
}
