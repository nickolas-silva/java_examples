import java.util.Scanner;
public class questDez {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Entre com um numero: ");
    int num = scanner.nextInt();
    if (num % 2 == 0)
      System.out.println("Esse numero e par!");
    else
      System.out.println("Esse numero e impar!");
  }
}