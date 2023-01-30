import java.util.ArrayList;

class Letra {
  char caractere;
  int qtd = 1;

  Letra(char ch) {
    this.caractere = ch;
  }

  public void incrementar() {
    this.qtd++;
  }
}

class LetraList {
  private ArrayList<Letra> letralist = new ArrayList<Letra>();

  public Letra findLetra(char ch) {
    for (Letra letraitem : this.letralist) {
      if (letraitem.caractere == ch) {
        return letraitem;
      }
    }
    return null;
  }

  public void add(Letra letra) {
    this.letralist.add(letra);
  }

  public ArrayList<Letra> getItems() {
    return this.letralist;
  }

}

public class questTrintatres {

  public static void main(String[] args) {
    final String palavra = "casa";

    LetraList letralist = new LetraList();

    for (char ch : palavra.toCharArray()) {
      final Letra tempLetra = letralist.findLetra(ch);
      if (tempLetra == null) {
        letralist.add(new Letra(ch));
        continue;
      }
      tempLetra.incrementar();
    }

    for (Letra letraitem : letralist.getItems()) {
      System.out.println(letraitem.caractere + " qtd=" + letraitem.qtd);
    }

  }
}