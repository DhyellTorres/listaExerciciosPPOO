package dataMinning.dataMinning;

public abstract class DataTemplate {
    abstract void open();

    abstract void close();

    abstract void extract();

    abstract void convert();

    public String analyze() {
        return "Document and this data was analyzed";
    }

    public String reports() {
        return "This data was reported";
    }

    public final void process() {
        open();
        extract();
        convert();
        analyze();
        reports();
        close();
    }

}
