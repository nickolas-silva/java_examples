import java.util.Scanner;
import java.lang.Math;

public class questTrintaum {
  private static Scanner scan = new Scanner(System.in);
  public static void main(String[] args){
    System.out.println("Entre com a quantidade de pessoas: ");
    int qnt = scan.nextInt();
    scan.nextLine();
    Pessoa pessoas = new Pessoa();

    for(int i = 0; i < qnt; i++){
      System.out.println("Entre com o nome da pessoa: ");
      pessoas.nome = scan.nextLine();

      System.out.println("Entre com o cpf da pessoa: ");
      pessoas.cpf = scan.nextDouble();

      System.out.println("Entre com a idade da pessoa: ");
      pessoas.idade = scan.nextInt();
      scan.nextLine();
      
      System.out.println("Entre com o sexo da pessoa: ");
      pessoas.sexo = scan.nextLine();

      System.out.println("Entre com o peso da pessoa: ");
      pessoas.peso = scan.nextDouble();

      System.out.println("Entre com a altura da pessoa: ");
      pessoas.altura = scan.nextDouble();
      
      pessoas.calcimc(pessoas.peso, pessoas.altura, pessoas.nome);

    }

  }



  
}

class Pessoa {
  String nome;
  double cpf;
  int idade;
  String sexo;
  double peso;
  double altura;
  double imc;

  public void calcimc(double p, double a, String n) {
    double imc = peso / (Math.pow(altura, 2));
    System.out.println("O IMC de "+ n + " e igual a: " + imc);
  }
}