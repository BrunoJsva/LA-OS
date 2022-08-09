public class TestaBreak {

  public static void main(String[] args) {
    
    // int i = 0;
    // while (i < 10) {
    //   i++;
    //   if (i == 5) break;
    //   System.out.println("Quebra o laço" + i);
    // }
    // System.out.println("fora do laço");

    for (int j = 1; j < 10; j++) {
      if (j == 8) break;
      if (j == 5) continue;
      System.out.println(j);
    }


  }
}
