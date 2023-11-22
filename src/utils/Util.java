package utils;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class Util {
    // Метод для форматирования десятичных чисел
    public static String formatDecimal(double number) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(number);
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean isValidProductId(String productId) {
        return productId != null && Pattern.matches("P\\d+", productId);
    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
