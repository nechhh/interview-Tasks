package JavaQuestionsAndAnswears;

public class FirstFibbonaciNums {
    public static void main(String[] args) {
        int a,b,c;
        a=0;
        b=1;

        for (int i = 1; i <131 ; i++) {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }




    }
}
