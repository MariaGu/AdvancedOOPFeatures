public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

    int start = 0, end = 0, sum=0;
    String rub = "руб";

    for (int i=0; i<3; i++){
      end = text.indexOf(rub, end+rub.length())-1;
      for (int j = end-1; text.charAt(j) != ' '; j--){
        start = j;
      }
      sum += Integer.parseInt(text.substring(start, end));
    }
    System.out.println(sum);
  }
}


