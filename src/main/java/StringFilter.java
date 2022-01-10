import java.lang.String;
import java.util.HashMap;
import java.util.Map;

public class StringFilter {

    private HashMap<Character, Integer> charCountMap;
    private String text;
    private String result;

    public String outputString() {
        View view = new View();
        return createNewString(view.getUserStringInput(), view.getUserNumberInput());
    }


    public String createNewString(String text, Integer n) {
        result = "";
        int counter = 0;

        if (n == 0) return text;
        if (n < 0) return "";

        for (int i = n - 1; i < text.length(); i = i + n) {
            if (!Character.isLowerCase(text.charAt(i)))
                result += text.charAt(i);
        }
        return result;
    }

    public String charCount(String text) {
        charCountMap = new HashMap<>();
        String result = "";
        char[] strArray = text.toCharArray();

        for (char c : strArray) {
            if (!charCountMap.containsKey(c)) {
                charCountMap.put(c, 1);
            } else {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
        }

        for (Map.Entry entry : charCountMap.entrySet()) {
            result += entry.getKey() + " = " + entry.getValue() + "\n";
        }
        return result.trim();
    }

    public HashMap<Character, Integer> getCharCountMap() {
        return charCountMap;
    }
}
