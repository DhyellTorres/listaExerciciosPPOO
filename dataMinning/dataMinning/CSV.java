package dataMinning.dataMinning;

public class CSV extends DataTemplate {
    private String path;

    public CSV(String path) {
        this.path = path;
    }

    @Override
    void open() {
        System.out.println("CSV file was opened" + " " + path);
    }

    @Override
    void close() {
        System.out.println("CSV file was closed" + " " + path);
    }

    @Override
    void extract() {
        System.out.println("CSV file was extracted");
    }

    @Override
    void convert() {
        System.out.println("CSV file was converted");
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
