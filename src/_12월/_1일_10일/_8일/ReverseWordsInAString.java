package _12월._1일_10일._8일;


public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] splited = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < splited.length; i++) {
            if (splited[i] == "") continue;
            sb.insert(0, " " + splited[i]);
        }
        sb.delete(0, 1);
        return sb.toString();

    }
}
