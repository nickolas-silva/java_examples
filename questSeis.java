import java.util.Scanner;
public class questSeis {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    double refri = 1.5;
    double pizzaf = 3.0;
    double taxag = 1.1;

    System.out.println("Entre com a quantidade de refrigerante e de fatias de pizza respectivamente:  ");
    int qntrefri = scanner.nextInt();
    int qntpizza = scanner.nextInt();
    System.out.println("Quantas pessoas estavam na mesa? ");
    int qntpessoas = scanner.nextInt();


    double total = (qntrefri * refri) + (qntpizza * pizzaf);
    System.out.println("O total sem taxa e de: " + total);
    total *= taxag;
    System.out.printf("O total com a tax e de: %.2f \n", total);
    total /= qntpessoas;
    System.out.printf("O total por pessoa taxa e de: %.2f \n", total);

  }
}