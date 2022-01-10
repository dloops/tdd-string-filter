import java.util.Scanner;

public class View {

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
        System.out.print("You have entered: " + number + "\n");
        return number;
    }

    public void showResult(String result) {
        System.out.println("Your filtered text is " + result);
    }

    public void showCount(String result) {
        System.out.println(result);
    }
}