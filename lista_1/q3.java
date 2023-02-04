import java.util.Scanner;
public class q3 {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Digite o primeiro numero: ");
    int num1 = scanner.nextInt();
    System.out.println("Digite o primeiro numero: ");
    int num2 = scanner.nextInt();

    //Operações 
    System.out.println("Adicao: " + (num1 + num2));
    System.out.println("Subtracao: " + (num1 - num2));
    System.out.println("Multiplicacao: " + (num1 * num2));
    System.out.println("Quociente: " + (num1 / num2));
    System.out.println("Resto: " + (num1 % num2));




  }
}