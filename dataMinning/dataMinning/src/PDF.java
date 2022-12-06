public class PDF extends DataTemplate {
    private String path;

    public PDF(String path) {
        this.path = path;
    }

    @Override
    void open() {
        System.out.println("PDF file was opened" + " " + path);
    }

    @Override
    void close() {
        System.out.println("PDF file was closed" + " " + path);
    }

    @Override
    void extract() {
        System.out.println("PDF file was extracted");
    }

    @Override
    void convert() {
        System.out.println("PDF file was converted");
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
