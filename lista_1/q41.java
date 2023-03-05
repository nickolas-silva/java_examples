import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class q41 {
  public static void main(String[] args) {
    //Nao remove duplicatas
    ArrayList array = new ArrayList<>();
    array.add('b');
    array.add('a');
    array.add('a');
    array.add('c');
    System.out.println(array.toString());

    //Mesma coisa do arraylist
    Vector vect = new Vector<>();
    vect.add('b');
    vect.add('a');
    vect.add('a');
    vect.add('c');
    System.out.println(vect.toString());

    //LinkedList
    LinkedList ll = new LinkedList<>();
    ll.add('b');
    ll.add('a');
    ll.add('a');
    ll.add('c');
    System.out.println(ll.toString());

    //Não adiciona duplicatas
    HashSet<Integer> dset = new HashSet<Integer>();
    dset.add(2);
    dset.add(1);
    dset.add(3);
    dset.add(2);
    dset.add(4);


    TreeSet<Integer> tree = new TreeSet<Integer>();
    tree.add(12);
    tree.add(63);
    tree.add(34);
    tree.add(45);

    LinkedHashSet<String> lhs = new LinkedHashSet<String>();
    lhs.add("ola");
    lhs.add("ola");
    lhs.add("ola");
    lhs.add("ola");
    lhs.add("ola");

    //Fila prioritária
    PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
    queue.add(10);

    HashMap map2 = new HashMap<>();
    map2.put(3, "tres");

    LinkedHashMap map = new LinkedHashMap<>();
    map.put(10, "dez");

    TreeMap treem = new TreeMap<>();
    treem.put(20, "vinte");
  }
}
