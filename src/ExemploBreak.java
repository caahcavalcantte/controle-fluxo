public class ExemploBreak {
  public static void main(String[] args) {
    for(int numero = 1; numero <=5; numero ++){
      if(numero==4)
      /*break; */
      continue;

      System.out.println(numero);
    }
  }
}
