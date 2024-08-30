import java.util.*;

public class ex2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String input = sc.next().toLowerCase();


    char character = 'a';
    int count = 0;

    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == character) {
        count++;
      }
    }

    System.out.println("O caractere '" + character + "' aparece " + count + " vezes na string.");
  }


  }
