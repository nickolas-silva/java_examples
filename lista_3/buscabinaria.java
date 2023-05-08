public class buscabinaria {
  
  public static void main(String[] args) {
    int vet[] = new int[4];
    vet[0] = 10;
    vet[1] = 20;
    vet[2] = 30;
    vet[3] = 40;
    

    System.out.println("Resultado: " + buscaBinaria(vet, 40));
  }

  public static int buscaBinaria(int[] array, int valorBuscado) {
    int inicio = 0;
    int fim = array.length - 1;
    while (inicio <= fim) {
      int meio = (inicio + fim) / 2;
      if (array[meio] == valorBuscado) {
        return meio; // Retorna o índice do elemento encontrado
      } else if (array[meio] < valorBuscado) {
        inicio = meio + 1;
      } else {
        fim = meio - 1;
      }
    }
    return -1; // Retorna -1 caso o elemento não seja encontrado
  }

}
