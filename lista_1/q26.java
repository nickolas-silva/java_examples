import java.util.Scanner;
public class q26 {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Defina o tamanho da matriz: ");
    int linhas = scanner.nextInt();
    int colunas = scanner.nextInt();
    int mat[][] = new int[linhas][colunas];

    for(int l = 0; l<linhas;l++){
      for(int c = 0; c<colunas;c++){
        mat[l][c]= l + c;
      }
    }
    
    System.out.println("Imprimindo a matriz: \n ");
    imprimirMatriz(mat);
  }

  private static void imprimirMatriz(int[][] m) {
    int linhas = m.length;
    int colunas = m[0].length;
    
    for (int l = 0; l < linhas; l++) {
      System.out.println();
      for (int c = 0; c < colunas; c++) {
        System.out.print(m[l][c] + "\t");
      }
    }

  }
}
