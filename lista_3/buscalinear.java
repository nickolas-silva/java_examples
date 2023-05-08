import java.util.Scanner;

public class buscalinear {
  public static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
    int vet[] = new int[3];
    vet[0] = 10;
    vet[1] = 4;
    vet[2] = 6;
    //vet[3] = 9; 
    System.out.println("Diga o valor que deseja buscar: ");
    int valor= scan.nextInt();
    System.out.println("Resultado: " + busca(vet, valor));

  }


  public static int busca(int[] v, int val){
    for(int i = 0 ; i < v.length; i++){
      if(v[i] == val)
      return v[i];
      
    }
    return -1;
  }
  
}
