package ToXML;
import CollectionObjects.LabWork;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.TreeSet;

public class LabWorkSaver {

    public void saveToXML(TreeSet<LabWork> labWorks, String filePath) {
        try (FileOutputStream fos = new FileOutputStream(filePath);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             PrintWriter writer = new PrintWriter(osw)) {

            writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            writer.println("<LabWorks>");

            for (LabWork labWork : labWorks) {
                writer.println("    <LabWork>");
                writer.printf("        <Name>%s</Name>%n", labWork.getName());
                writer.printf("        <Id>%d</Id>%n", labWork.getId());
                writer.println("    </LabWork>");
            }

            writer.println("</LabWorks>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

