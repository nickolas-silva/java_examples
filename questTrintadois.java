import java.io.File;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class questTrintadois {
  private static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    String path = "temp/aquivo_binario.dat";

    List<Pessoa> listInput = new ArrayList<Pessoa>();

    System.out.println("Entre com a quantidade de pessoas: ");
    int qnt = scan.nextInt();
    scan.nextLine();
    Pessoa pessoas = new Pessoa();

    for (int i = 0; i < qnt; i++) {
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

      pessoas.calcimc(pessoas.peso, pessoas.altura, pessoas.nome, pessoas);
      scan.nextLine();

      
      listInput.add(pessoas);

      try {
        escritor(path, listInput);
      } catch (IOException e) {
        System.out.println("Erro na escrita");
        e.printStackTrace();
      }
      
    }

  }
  
  public static void escritor(String path, List<Pessoa> listInput2) throws IOException {
    File file = new File(path);
    file.delete();
    file.createNewFile();

    ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(file));

    objOutput.writeObject(listInput2);
    objOutput.close();
  }
}

class Pessoa implements Serializable{
  String nome;
  double cpf;
  int idade;
  String sexo;
  double peso;
  double altura;
  double imc;

  public void calcimc(double p, double a, String n, Pessoa pe) {
    double imc = peso / (Math.pow(altura, 2));
    System.out.println("O IMC de " + n + " e igual a: " + imc);
  }
}