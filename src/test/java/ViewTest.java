import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class ViewTest {

    private String inputText;
    private Integer inputNumber;

    @Before
    public void setup() {
        inputText = "ITCLiNicAl";
        inputNumber = 2;
    }

    @Test
    public void userStringInputTest() {
        View view = new View();
        InputStream in = new ByteArrayInputStream(inputText.getBytes());
        System.setIn(in);

        assertEquals(inputText, view.getUserStringInput());
    }

    @Test
    public void userNumberInputTest() {
        View view = new View();
        InputStream in = new ByteArrayInputStream(inputNumber.toString().getBytes());
        System.setIn(in);

        assertEquals(inputNumber, view.getUserNumberInput());
    }



}
