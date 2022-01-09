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
    public void createStringFrom0Test() {
        String result;
        result = stringFilter.createNewString(text, 0);

        assertEquals("ITCLiNicAl", result);
    }

    @Test
    public void createUpperCaseStringFrom1Test() {
        String result;
        result = stringFilter.createNewString(text, 1);

        assertEquals("ITCLNA", result);
    }

    @Test
    public void createUpperCaseStringFrom2Test() {
        String result;
        result = stringFilter.createNewString(text, 2);

        assertEquals("TLN", result);
    }

    @Test
    public void createUpperCaseStringFrom3Test() {
        String result;
        result = stringFilter.createNewString(text, 3);

        assertEquals("CNA", result);
    }

    @Test
    public void createUpperCaseStringFrom100Test() {
        String result;
        result = stringFilter.createNewString(text, 100);

        assertEquals("", result);
    }

    @Test
    public void createUpperCaseStringFromNegativeTest() {
        String result;
        result = stringFilter.createNewString(text, -1);

        assertEquals("", result);
    }

}
