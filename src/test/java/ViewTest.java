import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class ViewTest {

    private String inputText;

    @Before
    public void setup() {
        inputText = "ITCLiNicAl";
    }

    @Test
    public void userInputTest() {
        View view = new View();
        InputStream in = new ByteArrayInputStream(inputText.getBytes());
        System.setIn(in);

        assertEquals(inputText, view.getUserInput());
    }

}
