import java.util.Scanner;

public class View {

    public String getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();
        System.out.print("You have entered: " + text);
        return text;
    }




}
