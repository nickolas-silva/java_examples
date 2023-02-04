import java.util.Scanner;
public class q4 {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Entre com os 3 numeros inteiros: ");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int num3 = scanner.nextInt();

    int media = (num1 + num2 + num3)/3;
    System.out.println("A media aritmetrica dos 3 numeros e igual a: " + media);
  }
}