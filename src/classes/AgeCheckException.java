package classes;

public class AgeCheckException extends Exception {
    public AgeCheckException(int a) {
        System.out.println("Число " + a + " не может быть возрастом");
    }
}
