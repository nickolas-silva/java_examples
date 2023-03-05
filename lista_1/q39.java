import java.util.ArrayList;
public class q39 {
  public static void main(String[] args) {
    aux<Pessoa> list = new aux<>();
    Pessoa p1 = new Pessoa();
    p1.nome = "João";
    p1.cpf = 1234567810;
    p1.idade = 30;
    p1.altura = 1.75;
    p1.peso = 70;
    p1.calcimc(p1.peso, p1.altura, p1.nome, p1);

    list.create(p1);

    Pessoa test = list.read(0);
    System.out.println(test.toString());

    test.idade = 10;
    list.update(0, test);
    System.out.println(test.toString());

    list.delete(0);
  }
}
class aux<T>{
  private ArrayList<T> lista = new ArrayList<>();

  public void create(T obj){
    lista.add(obj);
  }
  public void delete(int ind){
    lista.remove(ind);
  }

  public T read(int ind) {
      return lista.get(ind);
    
  }

  public void update(int ind, T obj) {
    
    lista.set(ind, obj);

  }

}
