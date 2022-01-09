import java.lang.String;

public class StringFilter {

    public String getChar(String text, Integer n) {
        return String.valueOf(text.charAt(n));
    }

    public String createNewString(String text, Integer n) {
        String result = "";
        if (n == 0) return text;

        for (int i = n - 1; i < text.length(); i = i+n) {
            if (Character.isUpperCase(text.charAt(i)))
                result += text.charAt(i);
        }
        return result;
    }

}
