package questoes.pilha_fila;

public class q2 {
  public static void main(String[] args) {
   String retorno;
   
   fila<String> fila1 = new fila<String>(3);

   fila1.add("oi");
   fila1.add("eu sou");
   fila1.add("o goku");
   retorno = fila1.peek();
   System.out.println("o primeiro elemento: " + retorno);

   fila1.show();

   fila1.remove();

   fila1.show();
  }
}
