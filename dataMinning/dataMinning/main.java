package dataMinning.dataMinning;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<DataTemplate> docs = new ArrayList<>();
        docs.add(new PDF("c:\\myPdf.pdf"));
        docs.add(new CSV("d:\\myCsv.csv"));
        docs.add(new DOC("e:\\myDoc.doc"));

        for (DataTemplate doc : docs) {
            doc.process();
            System.out.println("\n");
        }
    }
}
