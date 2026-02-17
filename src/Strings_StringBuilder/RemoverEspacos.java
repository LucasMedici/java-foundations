package Strings_StringBuilder;

public class RemoverEspacos {
    public static void main(String[] args){
        String texto = "Pessoa programa em java";
        System.out.println(texto);
        String textoSemEspaco = texto.replace(" ","");
        System.out.println(textoSemEspaco);
    }
}
