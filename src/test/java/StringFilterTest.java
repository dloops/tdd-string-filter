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
        StringFilter stringFilter = new StringFilter(text, n);
        assertEquals("i", stringFilter);
    }

}
