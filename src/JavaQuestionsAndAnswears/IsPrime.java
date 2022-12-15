package JavaQuestionsAndAnswears;

public class IsPrime {


    public static void main(String[] args) {
        int given=7;
        boolean isPrime=true;
        if (given>1){
            for (int i = 2; i <given ; i++) {
                if (given%i==0){
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }
        System.out.println("Given number "+given+" is prime ? ="+isPrime);


    }



}
