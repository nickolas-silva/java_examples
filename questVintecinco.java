import java.util.Scanner;
public class questVintecinco {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    System.out.println("Defina o tamanho do vetor: ");
    int size = scanner.nextInt();
    int vet[]= new int[size];
    
    System.out.println("Imprimindo o vetor: \n ");
    for(int i = 0; i < size; i++)
    {
      vet[i] = i;
    }
    imprimirVetor(vet);
  }

  private static void imprimirVetor(int[] v){
    int size = v.length;

    for(int i=0; i<size; i++){
      System.out.print(v[i] + " ");
    }
  }
}
