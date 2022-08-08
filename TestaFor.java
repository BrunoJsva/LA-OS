import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestaFor {

  public static void main(String[] args) {
    //Pode-se declarar mais de uma variável separado-as com ",".
    //As variáveis precisam ser do mesmo tipo.
    // for (int a = 1, b = 1; a < 11; a++) {
    //   System.out.println(a + "x" + b + "=" + a * b);
    // }
    
    //For percorrendo um array de números.
    // int numeros[] = {1,2,3,4,5};
    // for(int i = 0 ; i < numeros.length; i++){
    //     int numero = numeros[i];
    //     System.out.println(numero);
    // }

    //Método igual mais de outra forma.
    // for(int numero : numeros){
    //     System.out.println(numero);
    // }

    //No for It e necessário passar por todos elementos sempre.
    ArrayList<String> nomes = new ArrayList<>();

    nomes.add("Brunos");
    nomes.add("Marli");

    for(String nome : nomes){
        System.out.println(nome);
    }



    
  }
}
