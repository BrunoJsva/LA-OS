public class whileLoop {
    public static void main(String[] args){
        int i = 20;
        while(i < 10){
            System.out.println(i);
            i++;
        }
        //No método do-while executa pelo menos uma vez o código porque a verificação da condição e feita depois.
        int j = 20;
        do {
            System.out.println(j);
            j++;
        }while(j <10);
    }
}
