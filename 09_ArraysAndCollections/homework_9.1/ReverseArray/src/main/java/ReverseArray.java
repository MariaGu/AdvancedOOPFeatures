public class ReverseArray {

    public static String[] reverse (String[] strings){
        for (int i = 0; i < strings.length/2; i++){
            String temp = strings[strings.length - i -1];
            strings[strings.length - i -1] = strings[i];
            strings[i] = temp;
        }
        return strings;
    }
}