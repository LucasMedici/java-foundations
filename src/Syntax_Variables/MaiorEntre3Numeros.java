package Syntax_Variables;

public class MaiorEntre3Numeros {
    public static void main(String[] args){
    int num1 = 10;
    int num2 = 55;
    int num3 = 30;

    int maior = num1;

    if(num2 > maior){
        maior = num2;
    }

    if(num3 > maior){
        maior = num3;
    }

    System.out.println("O maior número é o: " + maior);
    }
}
