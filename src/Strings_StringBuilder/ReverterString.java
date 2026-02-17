package Strings_StringBuilder;

public class ReverterString {
    public static void main(String[] args) {
        String palavra = "brasil";

        String invertida = inverterString(palavra);
        System.out.println(invertida);
    }

    public static String inverterString(String palavra) {
        char[] chars = palavra.toCharArray();
        int inicio = 0;
        int fim = chars.length - 1;

        while (inicio < fim) {
            char temp = chars[inicio];
            chars[inicio] = chars[fim];
            chars[fim] = temp;

            inicio++;
            fim--;
        }

        return new String(chars);
    }
}