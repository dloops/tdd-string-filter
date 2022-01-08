import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringFilterTest {

    @Before
    public void setup() {

    }

    @Test
    public void stringCharSelectionTest() {
        String text = "ITCLiNicAl";
        int n = 1;
        String result;
        StringFilter stringFilter = new StringFilter();
        result = stringFilter.getChar(text, n);
        assertEquals("T", result);
    }
    

}
