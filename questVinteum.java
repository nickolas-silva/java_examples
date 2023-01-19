import java.util.Scanner;
public class questVinteum {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Entre com um numero: ");
    int num = scanner.nextInt();
    int cont = 0;

    for(int i = 1; i <= num; i++){
      if(num % i == 0)
        cont++;
    }

    String result = (cont == 2) ? "Esse numero e primo!" : "Esse numero nao e primo!";
    System.out.println(result);
  }
}
