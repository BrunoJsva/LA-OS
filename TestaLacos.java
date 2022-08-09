public class TestaLacos {

  public static void main(String[] args) {
    int condicao = 0;

    int numeros[] = new int[20];
    //Percorrer array
    //enhanced for
    for (int numero : numeros) {
      System.out.println(numero);
    }

    //For tradicional.
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
      i++;
    }

    //Comparação while com do-while;
    //Condição pode ser executada ou não.
    while (condicao < 10) {
      System.out.println(condicao);
      condicao++;
    }

    //Sempre será executada uma vez.
    do {
      System.out.println("do.....while" + condicao);
      condicao++;
    } while (condicao < 10);
    //enhanced for
    //Enquanto houver saldo na conta você saca 1000;
    // while(conta.getSaldo() < 0){
    //     conta.saca(1000);
  }
}
