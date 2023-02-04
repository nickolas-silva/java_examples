public class q29 {
  public static int vet[] = { 8, 2, 1, 6, 5 };

  public static void main(String[] args) {

    for (int i = 0; i < vet.length; i++) {
      System.out.print(vet[i] + " ");
    }

    System.out.println();

    int k = 1;

    for (int j = k; j > 0 && vet[j] < vet[j - 1]; j--) {

      int x = vet[j - 1];
      vet[j - 1] = vet[j];
      vet[j] = x;

    }

    System.out.println();

    for (int i = 0; i < vet.length; i++) {
      System.out.print(vet[i] + " ");
    }

  }
}
