import java.util.Scanner;

public class q12 {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    System.out.println("Entre com a media do aluno: ");
    float media = scanner.nextFloat();
    if(media >= 7)
      System.out.println("O aluno esta APROVADO!");
    if(media < 7 && media >= 3.5)
      System.out.println("O aluno esta na PROVA FINAL!");
    if(media < 3.5)
      System.out.println("O aluno esta REPROVADO!");
    
  }
}