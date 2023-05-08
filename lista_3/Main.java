import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    HashTable tabela1 = new HashTable(31);

    tabela1.put(0, "eu sou");
    tabela1.put(0, "oi");
    tabela1.put(2, "o goku");

    System.out.println("get: " + tabela1.get(0));
    System.out.println(tabela1.getSize() + " " + tabela1.getCapacity());

    
  }

}



class HashTable {
  private int size;
  private int capacity;
  private LinkedList<Node>[] table;

  @SuppressWarnings("unchecked")
  public HashTable(int capacity) {
    this.capacity = 31;
    this.size = 0;
    this.table = new LinkedList[capacity];
    for (int i = 0; i < capacity; i++) {
      table[i] = new LinkedList<Node>();
    }
  }

  private int hashFunction(int key) {
    return key % capacity;
  }

  public void put(int key, String value) {
    int index = hashFunction(key);
    LinkedList<Node> list = table[index];
    for (Node node : list) {
      if (node.key == key) {
        node.value = value;
        return;
      }
    }
    list.add(new Node(key, value));
    size++;
  }

  public int getSize(){
    return size;
  }

  public int getCapacity(){
    return capacity;
  }

  public String get(int key) {
    int index = hashFunction(key);
    LinkedList<Node> list = table[index];
    for (Node node : list) {
      if (node.key == key) {
        return node.value;
      }
    }
    return null;
  }

  public void remove(int key) {
    int index = hashFunction(key);
    LinkedList<Node> list = table[index];
    for (Node node : list) {
      if (node.key == key) {
        list.remove(node);
        size--;
        return;
      }
    }
  }

  public int size() {
    return size;
  }

  private class Node {
    private int key;
    private String value;

    public Node(int key, String value) {
      this.key = key;
      this.value = value;
    }
  }
}
