import java.util.Scanner;
public class q36 {
  private static Scanner cin = new Scanner(System.in);
  public static void main(String args[]){
    System.out.println("Entre com o numero: ");
    int n = cin.nextInt();
    System.out.println("O fatorial de " + n + " e igual a: " + fatorial(n));

  }

  private static double fatorial(int n){
    double fat;
    if(n == 0){
      fat = 1;
    }
    else{
      fat = n * fatorial(n-1);
    }
    return fat;
  }
}
