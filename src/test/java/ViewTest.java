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
    private StringFilter stringFilter;
    private String inputText;
    private Integer inputNumber;

    @Before
    public void setup() {
        this.view = new View();
        this.stringFilter = new StringFilter();
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
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String result = stringFilter.createNewString(inputText, inputNumber);
        view.showResult(result);
        String expectedString = "Your filtered text is TLN";

        assertEquals(expectedString, out.toString().trim());
    }

    @Test
    public void showCharCountTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String string = "ICLINCAL";
        String result = stringFilter.charCount(string);

        String count = "A = 1" + "\n" +
                "C = 2" + "\n" +
                "I = 2" + "\n" +
                "L = 2" + "\n" +
                "N = 1";

        view.showCount(result);

        assertEquals(count, out.toString().trim());
    }


}
