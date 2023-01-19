import java.util.Scanner;
public class questVintedois {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    System.out.println("Entre com o numero inicial: ");
    int numi = scanner.nextInt();
    System.out.println("Entre com o numero final: ");
    int numf = scanner.nextInt();

    System.out.println("A soma do intervalo e igual a: " + soma(numi, numf));
    
  }

  public static int soma(int ini, int fin) {
    int result = 0;
    for(int i = ini; i<= fin; i++){
      result += i;
    }
    return result;
  }
}
