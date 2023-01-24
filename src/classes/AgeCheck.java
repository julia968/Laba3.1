package classes;

public class AgeCheck {
    public static void checkingTheAgeValue(int a) throws AgeCheckException {
        if (a< 0) {
            throw new AgeCheckException(a);
        }
        else {
            System.out.println("Возраст соответсвует");
        }
    }
}
