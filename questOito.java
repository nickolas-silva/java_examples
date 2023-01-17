import java.util.Scanner;
import java.lang.Math;

public class questOito {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Entre com a seu peso em kg: ");
    double peso = scanner.nextDouble();

    System.out.println("Entre com a sua altura em metros: ");
    double altura = scanner.nextDouble();

    if (altura == 0){
      System.out.println("Nao foi possivel realizar o calculo de IMC");
    }
    else{
      double imc = peso / (Math.pow(altura, 2));
      System.out.printf("Seu IMC e igual a: %.2f", imc);
    }
    



  }
}