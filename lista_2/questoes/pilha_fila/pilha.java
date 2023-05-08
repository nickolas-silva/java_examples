package questoes.pilha_fila;

import exception.MyException;

public class pilha <T>{
  int size;
  int top;
  private Object[] array;

  public pilha(int size){
      this.top = -1;
      this.size = size;
      this.array = new Object[size];
    }

  public void push(T valor) {
    System.out.println("Empilhar");
    // if (top == size - 1) {
    //   throw new MyException("Pilha Cheia");
    // }
    top = top + 1;
    array[top] = valor;

  }

  @SuppressWarnings("unchecked")
  public T pop(){
    System.out.println("\nDesempilhar...\n");

    T retorno;

    // if (top == -1) {
    //   throw new MyException("\nERRO: pilha vazia!!!\n");
    // }

    retorno = (T) array[top];
    top = top - 1;

    return retorno;
  }

  @SuppressWarnings("unchecked")
  public T peek(){
    System.out.println("\nConsultar o Topo...\n");

    T retorno;

    // if (top == -1) {
    //   throw new MyException("\nERRO: pilha vazia!!!\n");
    // }

    retorno = (T) array[top];

    return retorno;
  }

  public boolean isFull() {
    if (top == size - 1) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isEmpty() {
    if (top == -1) {
      return true;
    } else {
      return false;
    }
  }

  public void show() {
    int i;

    System.out.println("\nExibindo...\n");

    for (i = 0; i <= top; i++) {
      System.out.println("posicao " + i + " = " + array[i] + "\n");
    }
    System.out.println("topo index = " + top + "\n");
  }

}
