public class Main {

  public static void main(String[] args) {

  }

  public static String splitTextIntoWords(String text) {
    String[] words = text.split("[ ,.]");
    String output = "";
    for (int i = 0; i < words.length; i++){
      output += words[i] + System.lineSeparator();
    }
    System.out.println(output);
    return output;
  }

}