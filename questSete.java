import java.util.Scanner;
public class questSete {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Entre com os dois numeros da divisao: ");
    double num1 = scanner.nextDouble();
    double num2 = scanner.nextDouble();

    if (num2 == 0)
      System.out.println("Nao foi possivel realizar a divisao por 0!");
    else {
      double div = (num1 / num2);
      System.out.printf("O resultado da divisao entre os dois numeros e igual a: %.2f", div);
    }
  }
}