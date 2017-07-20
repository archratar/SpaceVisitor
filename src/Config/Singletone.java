package Config;

public class Singletone {

    private static Singletone instanse;

    private String someField;

    private Singletone(String someField) {
        this.someField = someField;
    }

    public static Singletone getInstanse(String someField) {

        if (instanse == null) {

            instanse = new Singletone(someField);
        }

        return instanse;
    }

    public static void test() {

        char[][] charArr = {{'a'},{'b'}, {'c'}};
        char[] number = {'1', '2', '3'};
        String charArrToString = new String(number);
        System.out.println(Integer.parseInt(charArrToString));
        //System.out.println(charArrToString);
    }
}
