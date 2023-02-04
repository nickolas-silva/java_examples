import java.util.Scanner;
public class q17{
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Entre com o numero inicial e o final respectivamente: ");
    int numi = scanner.nextInt();
    int numf = scanner.nextInt();

    //while
    /*while(numi <= numf){
      if(numi % 2 != 0)
        System.out.printf(numi + " ");
        numi++;
    }*/

    //do-while
    /*do {
      if(numi % 2 != 0){
      System.out.printf(numi + " ");
      }
      numi++;
    } while(numi <= numf);*/

    //for
    for(int i = numi; i <= numf; i++){
      if(i % 2 != 0)
        System.out.printf(i + " ");
    }
  }
}