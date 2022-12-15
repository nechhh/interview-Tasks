package JavaQuestionsAndAnswears;

enum Level {//CREATE EMUM OUTSIDE OF CLASS
    //we use enum for  constants rather than have an array it is easier and cleaner to have enum
    LOW, MEDIUM, HIGH;
}
public class EnumP {

  public static void main(String[] args) {




        System.out.println("OUTSIDE THE CLASS");
        Level l = Level.MEDIUM;
        System.out.println(l);
        System.out.println(Level.HIGH);
        System.out.println(Level.LOW);

        switch (l) {
            case LOW:
                System.out.println("Level is LOW");
                break;
            case MEDIUM:
                System.out.println("Level is MEDIUM");
                break;
            case HIGH:
                System.out.println("Level is HIGH");
                break;

        }
    }

}
