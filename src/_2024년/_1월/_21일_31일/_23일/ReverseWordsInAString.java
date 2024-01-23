package _2024년._1월._21일_31일._23일;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] splited = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = splited.length - 1; i >= 0; i--) {
            if (splited[i] == "") continue;
            sb.append(" " + splited[i]);
        }
        sb.delete(0, 1);
        return sb.toString();
    }
}
