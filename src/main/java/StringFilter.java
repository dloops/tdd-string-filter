import java.lang.String;
import java.util.HashMap;

public class StringFilter {

    public HashMap<String, Integer> charCountMap;
    private String text;

    public String init() {
        View view = new View();
        return createNewString(view.getUserStringInput(), view.getUserNumberInput());
    }


    public String createNewString(String text, Integer n) {
        String result = "";
        int counter = 0;

        if (n == 0) return text;
        if (n < 0) return "";

        for (int i = n - 1; i < text.length(); i = i + n) {
            if (!Character.isLowerCase(text.charAt(i)))
                result += text.charAt(i);
        }

        return result;
    }

}
