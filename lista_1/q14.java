import java.util.Scanner;
import java.lang.Math;

public class q14 {
  private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Entre com os valores de a,b e c: ");
    float a = scanner.nextFloat();
    float b = scanner.nextFloat();
    float c = scanner.nextFloat();

    double delta = delta(a, b, c);
    //System.out.println(delta);

    raiz(a, b, delta);
  }

  public static double delta(double a, double b, double c){
    double result = (Math.pow(b, 2) - (4 * a * c));
    return result;
  }

  public static void raiz(float a, float b, double delta){
    double result1 = (((b * -1) + Math.sqrt(delta))/2*a);
    double result2 = (((b * -1) - Math.sqrt(delta))/2*a);

    System.out.printf("X' = %.2f\n", result1);
    System.out.printf("X'' = %.2f\n", result2);

  }
}