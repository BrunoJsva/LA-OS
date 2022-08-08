public class TestaWhile{

    public static void main(String[] args){
        //Tomar cuidado para não entrar no loop infinito.
        //Atribuindo o valor a variável que vai ser usada!
        //Primeiro executa a condição.
        int i = 0;
        //Verifica a expressão boolean, se retornar true ele entra no laço.
        while(i < 10){
            //Print o valor da variável.
            System.out.println(i);
            //Adiciona +1 no valor da variável.
            i++;
        }
    }
}