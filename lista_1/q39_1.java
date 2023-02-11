import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class q39_1{
  //Codificador
  public static void main(String[] args){
    String path = "temp/pCodificar.csv";
    String path2 = "temp/pCodificar2.csv";
    String textoOutput;
    String lido;
    try {
      textoOutput = leitor(path);
      //System.out.print(textoOutput);
      lido = textoOutput;
      System.out.println(lido);

      char vet[] = new char[20];
      vet = lido.toCharArray();

      for(int i = 0 ; i<vet.length; i++){
        if(vet[i] == 'z')
          vet[i] = 'p';

        if(vet[i] == 'e')
          vet[i] = 'o';

        if (vet[i] == 'n')
          vet[i] = 'l';

        if (vet[i] == 'i')
          vet[i] = 'a';
        
        if (vet[i] == 't')
          vet[i] = 'r';

        System.out.print(vet[i]);
      }
      String textoInput = String.copyValueOf(vet);
      try {
        escritor(path2, textoInput);
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