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
      float n4 = scanner.nextFloat();
      double mf = (media * 6 + n4 * 4)/10;
      if(mf >= 5){
        System.out.println("O aluno esta aprovado!");
      }
      else{
        System.out.println("O aluno esta reprovado!");
      }
    }
    if(media < 3.5)
      System.out.println("O aluno esta REPROVADO!");
    
  }
}