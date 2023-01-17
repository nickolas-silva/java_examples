import java.util.Scanner;
public class questDezoito{
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    String senha = "seila";
    String senhau;

    //do-while
    /*do {
      System.out.println("Digite a senha: ");
      senhau = scanner.next();
    }while(!senhau.equals(senha));*/

    //do
    System.out.println("Digite a senha: ");
    senhau = scanner.next();
    while(!senhau.equals(senha)){
      System.out.println("Digite a senha: ");
      senhau = scanner.next();
    }
    System.out.println("Senha CORRETA!");
  }
}