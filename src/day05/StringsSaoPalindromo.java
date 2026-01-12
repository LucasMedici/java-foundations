package day05;

public class StringsSaoPalindromo {
    public static void main(String[] args){
        String p = "ovo";
        System.out.println(isPalindrome(p));
    }

    public static boolean isPalindrome(String palavra){
        char[] charArray = palavra.toCharArray();
        int inicio = 0;
        int fim = charArray.length-1;

        while(inicio<fim) {
            if(charArray[inicio] != charArray[fim]){
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }
}
