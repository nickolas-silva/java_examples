import java.util.Scanner;

public class input {
  private static Scanner ler = new Scanner(System.in);

  public static void main(String[] args){
    System.out.println("Digite sua idade: ");
    int idade = ler.nextInt();

    System.out.println("Digite sua altura: ");
    double altura = ler.nextDouble();

    //System.out.println("Digite a primeira letra do seu nome: ");
    ler.nextLine();
    
    System.out.println("Digite seu nome: ");
    String nome = ler.nextLine();
    char ch = nome.charAt(0);

    System.out.println("Sua idade: " + idade);
    System.out.println("Sua altura: " + altura);
    System.out.println("Seu nome: " + nome);
    System.out.println("A primeira letra do seu nome: " + ch);

  }
}