import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class q40_dec {
  public static void main(String[] args) {
    String path = "temp/pCodificar.csv";
    String path2 = "temp/pCodificar2.csv";
    String textoOutput;
    String lido;
    try {
      textoOutput = leitor(path2);
      // System.out.print(textoOutput);
      lido = textoOutput;
      System.out.println(lido);

      char vet[] = new char[20];
      vet = lido.toCharArray();

      for (int i = 0; i < vet.length; i++) {
        if (vet[i] == 'p')
          vet[i] = 'z';

        if (vet[i] == 'o')
          vet[i] = 'e';

        if (vet[i] == 'l')
          vet[i] = 'n';

        if (vet[i] == 'a')
          vet[i] = 'i';

        if (vet[i] == 'r')
          vet[i] = 't';

        System.out.print(vet[i]);
      }
      String textoInput = String.copyValueOf(vet);
      try {
        escritor(path, textoInput);
      } catch (IOException e) {
        System.out.println("Erro na escrita");
        e.printStackTrace();
      } catch (Exception e) {
        System.out.println("Pane geral!");
        e.printStackTrace();
      }

    } catch (IOException e) {
      System.out.println("Erro na leitura");
      e.printStackTrace();
    } catch (Exception e) {
      System.out.println("Pane geral!");
      e.printStackTrace();
    }
  }
  
  public static String leitor(String path) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

    StringBuffer sbResult = new StringBuffer();
    String linha = "";

    while (linha != null) {
      sbResult.append(linha);
      linha = bufferedReader.readLine();

    }
    bufferedReader.close();

    return sbResult.toString();
  }

  public static void escritor(String path, String texto) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
    bufferedWriter.append(texto);
    bufferedWriter.close();
  }
}
