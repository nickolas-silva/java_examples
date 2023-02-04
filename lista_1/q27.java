//import java.util.Scanner;
public class q27 {
  //private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    int vet[] = new int[5];
    for(int a = 0; a<5; a++){
      vet[a] = a;
    }
    invertVetor(vet);

  }
  private static void invertVetor(int[] v){
    int size = v.length - 1 ;
    System.out.println("Imprimindo o vetor ao contrario: ");
    for(int i=size; i>=0;i--){
      System.out.print(v[i] + " ");
    }
  }
}
