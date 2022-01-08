import java.lang.String;

public class StringFilter {

    public String getChar(String text, Integer n) {
        return String.valueOf(text.charAt(n));
    }


    public String createNewString(String text, Integer n) {
        String result = "";
        for (int i = n - 1; i < text.length(); i = i+n) {
            result += String.valueOf(text.charAt(i));
        }

        return result;
    }

}
