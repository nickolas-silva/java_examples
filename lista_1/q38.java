import java.util.Arrays;
import java.util.List;
public class q38 {
  public static void main(String[] args){
    
    printObject("Nome");

    List<Integer> listInteger = Arrays.asList(10, 5, 4, 2);
    
    printvetObject(listInteger); 
  }

  
  public static void printObject(Object myObj){
    System.out.println(myObj.toString());
  }

  public static <E> void printvetObject(List<E> mObjects){
    for(E element : mObjects){
      System.out.println(element.toString());

    }
  }
  



}
