import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class q35 {
  
  public static void main(String[] args) throws IOException{
    String path = "temp/arquivo2.csv";

    //String textoInput = "A1;" + "A2;" + "\n" + "B1;" + "B2;";
    String textoOutput;

    // Entrada de dados:
    String frase = "bola casa bola";

    // Separar e contar palavras:
    String[] arrayPalavras = frase.split(" ");
    int sizePalavras = arrayPalavras.length;
    //System.out.println("sizePalavras = " + sizePalavras);

    // Inicializo dicionario
    Palavra dicionario[] = new Palavra[sizePalavras];
    for (int i = 0; i < sizePalavras; i++) {
      dicionario[i] = new Palavra();
    }

    // Variaveis de controle
    boolean flagExiste = false;
    int iExiste = 0; // indice da palavra encontrada
    int iNova = 0; // indice da palavra nova

    // PERCORRER CADA PALAVRA DA FRASE:
    for (int p = 0; p < sizePalavras; p++) {
      String palavra = arrayPalavras[p];

      flagExiste = false;

      for (iExiste = 0; iExiste < sizePalavras; iExiste++) {
        if (dicionario[iExiste].palavra.equals(palavra) == true) {
          flagExiste = true;
          break;
        }
      }

      if (flagExiste == true) {
        dicionario[iExiste].cont++;
      } else {
        dicionario[iNova].palavra = palavra;
        dicionario[iNova].cont = 1;
        iNova++;
      }

    }

    for (int i = 0; i < iNova; i++) {
      String textoInput = dicionario[i].palavra + " : " + dicionario[i].cont;
      System.out.println(textoInput);
      try{
        FileWriter fw = new FileWriter(path, true);
        BufferedWriter conexao = new BufferedWriter(fw);
        conexao.write(textoInput);
        conexao.newLine();
        conexao.close();
      } catch (Exception e){
        e.printStackTrace();
      }
      
    }
    
    
    
    try {
      textoOutput = leitor(path);
      System.out.print(textoOutput);
    } catch (IOException e) {
      System.out.println("Erro na leitura");
      e.printStackTrace();
    } catch (Exception e) {
      System.out.println("Pane geral!");
      e.printStackTrace();
    }
  }

  public static void escritor(String path, String texto) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
    bufferedWriter.append(texto);
    bufferedWriter.close();
  }



  public static String leitor(String path) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

    StringBuffer sbResult = new StringBuffer();
    String linha = "";

    while (linha != null) {
      sbResult.append(linha + "\n");
      linha = bufferedReader.readLine();

      // if (linha != null) {
      //   String[] parts = linha.split(";");
      //   for (int i = 0; i < parts.length; i++) {
      //     System.out.print("[" + parts[i] + "] ");
      //   }
      // }

    }
    bufferedReader.close();

    return sbResult.toString();
  }

  static class Palavra {
    String palavra = "";
    int cont = 0;
  }

}
