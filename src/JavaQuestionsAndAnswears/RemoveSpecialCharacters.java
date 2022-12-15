package JavaQuestionsAndAnswears;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String st="kfjsdfDDFGG534534$%#$^DFG$%^#$%45345";
        String sl=st.replaceAll("[^A-Za-z1-9]","*");
        System.out.println(sl);

    }



}
