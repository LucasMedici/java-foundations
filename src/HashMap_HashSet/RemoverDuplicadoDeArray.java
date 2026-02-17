package HashMap_HashSet;

import java.util.HashSet;

public class RemoverDuplicadoDeArray {
    public static void main(String[] args){
        String[] lista = {"Fallen", "Molodoy", "Yuriih", "Fallen", "Yuriih", "Kscerato", "Yekindar", "Fallen"};

        var  set = new HashSet<String>();

        for(String nome : lista){
            set.add(nome);
        }

        System.out.println(set);

    }
}
