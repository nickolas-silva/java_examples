import java.util.Scanner;
public class q23 {
  private static Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args){
    System.out.println("Digite o numero que quer calcular o fatorial: ");
    int num = scanner.nextInt();

    System.out.println("O fatorial de " + num + " e igual a: " + calc(num));
  }

  public static int calc(int num){
    int result = num;
    for(int i = 1; i < num; i++){
      result *= i;
    }
    return result;
  }
}
