import java.lang.Math;
import java.util.Scanner;
public class q24 {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    
    //int num2 = scanner.nextInt();

    int opcao = 0;


    do{
      System.out.println("Entre com os numeros: ");
      int num1 = scanner.nextInt();

      double result = 0;
      System.out.println("1-Potenciacao\n2-Raiz quadrada\n3-Fatorial\n0-Sair");
      opcao = scanner.nextInt();
      switch(opcao){
        case 1: result = Math.pow(num1, 2);
                System.out.println("Resultado da operacao: " + result);
                break;
                         
        case 2: result = Math.sqrt(num1);
                System.out.println("Resultado da operacao: " + result);
                break;
                         
        case 3: result = calc(num1);
                System.out.println("Resultado da operacao: " + result);
                break;
                
        //default: break;
        case 0: break;
      }
    } while(opcao != 0);
  }
  public static int calc(int num){
    int result = num;
    for(int i = 1; i < num; i++){
      result *= i;
    }
    return result;
  }
}
