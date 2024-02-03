package utils;

public class Helper {

    private static final int DIZAINE = 10;
    private static final int CENTAINE = 100;
    private static final int MILLIEME = 1000;
    private static final int DIZAINE_MILLE = 10000;

    public static String generateAccountNumber(Integer number) {
        if (number < DIZAINE) return "0000" + number;
        else if (number < CENTAINE) return "000" + number;
        else if (number < MILLIEME) return "00" + number;
        else if (number < DIZAINE_MILLE) return "0" + number;
        else return String.valueOf(number);
    }
}
