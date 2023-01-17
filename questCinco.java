import java.util.Scanner;
public class questCinco {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Entre com os 3 numeros reais: ");
    double num2 = scanner.nextDouble();
    double num3 = scanner.nextDouble();
    double num1 = scanner.nextDouble();

    double media = (num1 + num2 + num3)/3;
    System.out.println("A media aritmetrica dos 3 numeros e igual a: " + media);
  }
}