public class q37 {
  public static void main(String[] args){
    int n1 = 2;
    int n2 = 10;
  
    //Repetição
    // for(int i = n1 + 1; i<n2; i++){
    //   result += i;
    // }
    // System.out.println(result);

    //Recursividade
    System.out.println(func(n1, n2)- n2);
  }

  private static double func(int n1, int n2){
    if(n2==n1){
      return 0;
    }
    else{
      return n2 + func(n1, n2-1);
    }
  }
}
