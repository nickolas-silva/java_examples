import java.util.Scanner;
public class questQuinze {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Entre com um numero: ");
    int num = scanner.nextInt();
    
    if(num >= 1 && num <= 5){
      switch(num){
        case 1: System.out.println("Um");
        break;
        case 2: System.out.println("Dois");
        break;
        case 3: System.out.println("Tres");
        break;
        case 4: System.out.println("Quatro");
        break;
        case 5: System.out.println("Cinco");
        break;
        default : System.out.println("Nao sei nada sobre esse numero \n");
	      break;
      }
    }
    else {
      System.out.println("Numero invalido!");
    }
  }

}