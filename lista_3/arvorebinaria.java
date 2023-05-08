public class arvorebinaria {
  
}

class Node {
  int valor;
  Node esquerda, direita;

  public Node(int valor) {
    this.valor = valor;
    esquerda = direita = null;
  }
}

class BinarySearchTree {
  Node raiz;

  public BinarySearchTree() {
    raiz = null;
  }

  public Node busca(Node node, int valorBuscado) {
    if (node == null || node.valor == valorBuscado) {
      return node;
    }

    if (node.valor > valorBuscado) {
      return busca(node.esquerda, valorBuscado);
    }

    return busca(node.direita, valorBuscado);
  }

  public void insere(int valor) {
    raiz = insereRec(raiz, valor);
  }

  private Node insereRec(Node node, int valor) {
    if (node == null) {
      node = new Node(valor);
      return node;
    }

    if (valor < node.valor) {
      node.esquerda = insereRec(node.esquerda, valor);
    } else if (valor > node.valor) {
      node.direita = insereRec(node.direita, valor);
    }

    return node;
  }

  public void remove(int valor) {
    raiz = removeRec(raiz, valor);
  }

  private Node removeRec(Node node, int valor) {
        if (node == null) {
            return node;
        }

        if (valor < node.valor) {
            node.esquerda = removeRec(node.esquerda, valor);
        } else if (valor > node.valor) {
            node.direita = removeRec(node.direita, valor);
        } else {
            if (node.esquerda == null) {
                return node.direita;
            } else if (node.direita == null) {
                return node.esquerda;
            }

            

            node.direita = removeRec(node.direita, node.valor);
        }

        return node;
    }
  }

