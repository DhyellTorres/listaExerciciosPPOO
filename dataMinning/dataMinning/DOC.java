package dataMinning.dataMinning;

public class DOC extends DataTemplate {
    private String path;

    public DOC(String path) {
        this.path = path;
    }

    @Override
    void open() {
        System.out.println("DOC file was opened" + " " + path);
    }

    @Override
    void close() {
        System.out.println("DOC file was closed" + " " + path);
    }

    @Override
    void extract() {
        System.out.println("DOC file was extracted");
    }

    @Override
    void convert() {
        System.out.println("DOC file was converted");
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
