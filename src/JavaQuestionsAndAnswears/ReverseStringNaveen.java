package JavaQuestionsAndAnswears;

public class ReverseStringNaveen {
    public static void main(String[] args) {
        //using for loop
        String s ="Selenium world ";
        int len=s.length();
        String reverse=" ";
        for (int i = len-1 ; i>=0; i--){
            reverse=reverse+s.charAt(i);
        }
        System.out.println(reverse);

        //using StringBuffer class:
        StringBuffer sf=new StringBuffer(s);
        System.out.println(sf.reverse());
    }


}
