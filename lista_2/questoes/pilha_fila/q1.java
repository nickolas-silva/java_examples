package questoes.pilha_fila;
public class q1{
  public static void main(String[] args) {
    int retorno;
    pilha<Integer> pilha = new pilha<Integer>(4);
    pilha.push(2);
    pilha.push(67);
    pilha.push(45);
    pilha.push(10);

    retorno = pilha.peek();
    System.out.println("elemento no topo = " + retorno);

    pilha.show();

    retorno = pilha.pop();
    System.out.println("desempilhado = " + retorno);

   //   retorno = pilha.pop();
   //   System.out.println("desempilhado = " + retorno);

    // retorno = pilha.pop(); // nao vai dar certo!
    // System.out.println("desempilhado = " + retorno);

    pilha.show();

    System.out.println("full? " + pilha.isFull());

    System.out.println("empty? " + pilha.isEmpty());
  }

}