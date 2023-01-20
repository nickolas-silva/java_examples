import java.util.Scanner;
public class questVintenove {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args){
    int vet[] = new int[5];
    vet[0] = 3;
    vet[1] = 21;
    vet[2] = 10;
    vet[3] = 10;
    vet[4] = 15;

    int aux[] = new int[5];
    aux[0] = 3;
    aux[1] = 21;
    aux[2] = 10;
    aux[3] = 10;
    aux[4] = 15;

    System.out.println("Diga quantas vezes deseja realizar a mudanca de posicao: ");
    int qnt = scanner.nextInt();
    for(int x = 0; x<=qnt;x++)
      alteraP(vet, aux, qnt);
    imprimirVetor(vet);
  }

  private static void alteraP(int[] v, int[] a, int loop){
    int size = v.length;
    for(int l = 1; l <= loop; l++){
      for(int i = 0; i<size;i++){
        if(i < size -1)
        v[i] = a[i+1];
      }
      v[size-1] = a[0];
      a[0] = v[0];
      a[1] =  v[1];
      a[2] =  v[2];
      a[3] =  v[3];
      a[4] =  v[4];
    }
    
    
  }
  
  private static void imprimirVetor(int[] v) {
    int size = v.length;
    System.out.println("O vetor alterado: ");
    for (int i = 0; i < size; i++) {
      System.out.print(v[i] + " ");
    }
  }
}
