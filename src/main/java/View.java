import java.util.Scanner;

public class View {

    public void init() {
        getUserStringInput();
        getUserNumberInput();
    }

    public String getUserStringInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();
        System.out.print("You have entered: " + text + "\n");
        return text;
    }

    public Integer getUserNumberInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        Integer number = input.nextInt();
        System.out.print("You have entered: " + number);
        return number;
    }


}
