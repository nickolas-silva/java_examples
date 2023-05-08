public class ShellSort {
  public static void shellSort(int[] arr) {
    int n = arr.length;
    int gap = n / 2;
    while (gap > 0) {
      for (int i = gap; i < n; i++) {
        int temp = arr[i];
        int j = i;
        while (j >= gap && arr[j - gap] > temp) {
          arr[j] = arr[j - gap];
          j -= gap;
        }
        arr[j] = temp;
      }
      gap /= 2;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 25, 24, 65, 2, 10, 33, 120 };
    shellSort(arr);
    System.out.println("Sorted array:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
