public class Controller {

    public void init() {
        StringFilter stringFilter = new StringFilter();
        View view = new View();

        String result = stringFilter.createNewString(view.getUserStringInput(), view.getUserNumberInput());
        view.showResult(result);

        String charCount = stringFilter.charCount(result);
        view.showCount(charCount);
    }
}
