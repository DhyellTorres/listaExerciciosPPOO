import java.io.File;

/**
 * Launch the web-search example
 */
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Source file (in the project's data/ folder)
        final File inputTextFile = new File("./data/Hamlet.txt");

        // Build object graph
        WebSearchModel model = new WebSearchModel(inputTextFile);
        Snooper snoop = new Snooper(model);

        // Execute
        model.pretendToSearch();
    }
}
