public class q34 {
  
  public static void main(String[] args) {
    String frase = "estude estude estude muito";
    
    String[] arrayPalavras = frase.split(" ");
    int qnt = arrayPalavras.length;
    
    Palavra vetPalavras[] = new Palavra[qnt];
    for (int i = 0; i < qnt; i++) {
      vetPalavras[i] = new Palavra();
    }
    
    int cont = 0;
    int i =0;
    for (int p = 0; p < qnt; p++) {
      String palavra = arrayPalavras[p];

      
      for (i=0; i < qnt; ) {
        if (vetPalavras[i].palavra.equals(palavra) == true) {
          vetPalavras[i].cont++;
          break;
        }
        else{
          vetPalavras[cont].palavra = palavra;
          vetPalavras[cont].cont = 1;
          cont++;
          break;
        }
      }
      
    }
    
    for (i = 0; i < cont; i++) {
      System.out.println(vetPalavras[i].palavra + " : " + vetPalavras[i].cont);
    }
  }
  
  static class Palavra {
    String palavra = "";
    int cont = 0;
  }
}