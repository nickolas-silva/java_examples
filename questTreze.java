import java.util.Scanner;
public class questTreze {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Entre com as 3 notas do aluno: ");
    float n1 = scanner.nextFloat();
    float n2 = scanner.nextFloat();
    float n3 = scanner.nextFloat();

    float media = (n1+n2+n3)/3;

    if(media >= 7)
      System.out.println("O aluno esta APROVADO!");
    if(media < 7 && media >= 3.5) {
      System.out.println("O aluno esta na PROVA FINAL!\n Entre com a nota da prova final: ");
      //float n4 = scanner.nextFloat();
      double nf = ((media * 6)-50);
      nf = nf * -1;
      nf = nf /4;

      System.out.println("O aluno precisa tirar " + nf + " na prova final!");
    }
    if(media < 3.5)
      System.out.println("O aluno esta REPROVADO!");
    
  }
}