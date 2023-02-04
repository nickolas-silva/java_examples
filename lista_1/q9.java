import java.util.Scanner;
import java.lang.Math;
public class q9 {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    System.out.println("Entre com o valor positivo pro raio: ");
    double raio = scanner.nextDouble();

    double result = Math.PI * Math.pow(raio, 2);
    System.out.printf("A area do circulo e de: %.2f", result);
  }
  
}