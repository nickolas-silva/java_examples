import java.util.Scanner;
public class q19{
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    System.out.println("Entre com o numero: ");
    int n = scanner.nextInt();

    for(int i = 1; i<10; i++){
      System.out.println(n + " x " + i + " = " + (n * i));
      
    }
  }
}