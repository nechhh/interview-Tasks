package JavaQuestionsAndAnswears;

public class IsPalindrome {
    public static void main(String[] args) {
        String original = "kek";
        String reverse = "";

        for (int i=original.length()-1; i>=0; i--){
            reverse=reverse+original.charAt(i);

        }
        if (original.equals(reverse)){
            System.out.println("it is palidrome");
        }else {
            System.out.println("it is not palidrome");
        }








    }
}
