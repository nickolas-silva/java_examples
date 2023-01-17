import java.util.Scanner;
public class questOnze{
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    double conta1 = 100;
    double conta2 = 0;

    System.out.println("Escolha quanto deseja transferir para a conta2: ");
    double qnt = scanner.nextDouble();

    if(qnt > conta1){
      System.out.println("Saldo insuficiente!");
    }
    else{
      conta1 -= qnt;
      conta2 += qnt;
      System.out.println("Transferencia realizada com sucesso! \n Saldo Conta 1: " + conta1 + "\n Saldo conta 2: " + conta2);
    }
  }
}