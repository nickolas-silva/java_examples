public class q28 {
  public static void main(String[] args){
    int vet[] = new int[5];
    vet[0] = 3;
    vet[1] = 21;
    vet[2] = 10;
    vet[3] = 10;
    vet[4] = 15;

    System.out.println("O maior numero do vetor e: " + maior(vet));
    System.out.println("O menor numero do vetor e: " + menor(vet));

  }

  private static int maior(int[] v){
    int size = v.length;
    int maior = v[0];
    for(int i = 0; i<size; i++){
      if(maior < v[i])
        maior = v[i];
    }
    return maior;
  }

  private static int menor(int[] v) {
    int size = v.length;
    int menor = v[0];
    for (int i = 0; i < size; i++) {
      if(menor > v[i])
        menor = v[i];
    }
    return menor;
  }
}
