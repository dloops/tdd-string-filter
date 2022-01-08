import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringFilterTest {

    private StringFilter stringFilter;
    private String text;

    @Before
    public void setup() {
        this.stringFilter = new StringFilter();
        text = "ITCLiNicAl";
    }

    @Test
    public void stringCharSelectionTest() {
        int n = 1;
        String result;
        result = stringFilter.getChar(text, n);
        assertEquals("T", result);
    }

    @Test
    public void createStringFromEveryNthCharacterTest() {
        int n = 2;
        String result;
        result = stringFilter.createNewString(text, n);
        assertEquals("FAIL", result);
    }

}
