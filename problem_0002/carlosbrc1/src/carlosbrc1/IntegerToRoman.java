package carlosbrc1;

import java.util.HashMap;
import java.util.Map;

public final class IntegerToRoman {
    ///
    public static String convertToRomanArrayAproach(int number) {
        if (number <= 0 || number > 3999)
            throw new IllegalArgumentException("The number is out of range 1 to 3999.");

        String[] symbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] valores = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        StringBuilder resultado = new StringBuilder();

        for (int i = valores.length - 1; i >= 0; i--) {
            while (number >= valores[i]) {
                number -= valores[i];
                resultado.append(symbols[i]);
            }
        }

        return resultado.toString();
    }

    public static String convertToRomanMapAproach(int number) {
        if (number <= 0 || number > 3999)
            throw new IllegalArgumentException("The number is out of range 1 to 3999.");

        var romanTable = buildRomanNumberList();

        StringBuilder integerToRoman = new StringBuilder();
        for (Map.Entry<Integer, String> entry : romanTable.entrySet()) {
            int valor = entry.getKey();
            String simbolo = entry.getValue();
            while (number >= valor) {
                integerToRoman.append(simbolo);
                number -= valor;
            }
        }

        return integerToRoman.toString();
    }

    private static Map<Integer, String> buildRomanNumberList() {
        Map<Integer, String> romanTable = new HashMap<>();
        romanTable.put(1, "I");
        romanTable.put(4, "IV");
        romanTable.put(5, "V");
        romanTable.put(9, "IX");
        romanTable.put(10, "X");
        romanTable.put(40, "XL");
        romanTable.put(50, "L");
        romanTable.put(90, "XC");
        romanTable.put(100, "C");
        romanTable.put(400, "CD");
        romanTable.put(500, "D");
        romanTable.put(900, "CM");
        romanTable.put(1000, "M");

        return romanTable;
    }
}
