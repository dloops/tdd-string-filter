import java.lang.String;

public class StringFilter {

    private View view;

    public String getChar(String text, Integer n) {
        return String.valueOf(text.charAt(n));
    }

    public String createNewString(Integer n) {
        String text = view.getUserInput();
        String result = "";
        if (n == 0) return text;
        if (n < 0) return "";

        for (int i = n - 1; i < text.length(); i = i + n) {
            if (Character.isUpperCase(text.charAt(i)))
                result += text.charAt(i);
        }

        return result;
    }

}
