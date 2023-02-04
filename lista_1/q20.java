import java.util.Scanner;

public class q20{
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    System.out.println("Qual o investimento inicial: ");
    double invi = scanner.nextDouble();
    System.out.println("Valor mensal? ");
    double mensa = scanner.nextDouble();
    System.out.println("Quantos meses? ");
    int meses = scanner.nextInt();
    System.out.println("Taxa de juros ao mes? ");
    float juros = scanner.nextFloat();


    double saldoa = invi;
    for(int i =1; i<=meses;i++)
    {
      saldoa += mensa;
      double rm = saldoa * juros;
      saldoa = saldoa + rm;
      System.out.printf("O saldo do mes foi de: %.2f \n", saldoa);
      System.out.printf("O rendimento mensal foi de: %.2f\n", rm);
      System.out.println();
    }
  }
}