import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ViewTest {

    private View view;
    private String inputText;
    private Integer inputNumber;

    @Before
    public void setup() {
        this.view = new View();
        inputText = "ITCLiNicAl";
        inputNumber = 2;
    }

    @Test
    public void userStringInputTest() {
        InputStream in = new ByteArrayInputStream(inputText.getBytes());
        System.setIn(in);

        assertEquals(inputText, view.getUserStringInput());
    }

    @Test
    public void userNumberInputTest() {
        InputStream in = new ByteArrayInputStream(inputNumber.toString().getBytes());
        System.setIn(in);

        assertEquals(inputNumber, view.getUserNumberInput());
    }

    @Test
    public void showResultTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        StringFilter stringFilter = new StringFilter();
        String result = stringFilter.createNewString(inputText, inputNumber);
        view.showResult(result);
        String expectedString = "Your filtered text is TLN";

        assertEquals(expectedString, outContent.toString().trim());
    }

}
