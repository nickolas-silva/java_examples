import java.util.Scanner;
public class q30{
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    System.out.println("Entre com uma frase: ");
    String t = scanner.nextLine();
    char frase[] = new char[20];
    int f = t.length() -1;
    for(int i =0; i<t.length(); i++){
        frase[i] = t.charAt(f);
      f--;

    }
    System.out.print(frase);

    
  }
}