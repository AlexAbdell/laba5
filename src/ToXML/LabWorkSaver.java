package ToXML;

import CollectionObjects.LabWork;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.TreeSet;

public class LabWorkSaver {

    public void saveToXML(TreeSet<LabWork> labWorks, String filePath) {
        try (FileOutputStream fos = new FileOutputStream(filePath);) {

            fos.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n".getBytes());
            fos.write("<LabWorks>\n".getBytes());

            for (LabWork labWork : labWorks) {
                String for_name = "        <name>" + labWork.getName() + "</name>\n";
                String for_ = "    <LabWork>\n";
                String for_id = "        <id>"+labWork.getId().toString()+"</id>\n";
                String for_creationDate = "        <creationDate>" + labWork.getCreationDate().toString() + "</creationDate\n";
                String for_coordinates = "        <coordinates>" + labWork.getCoordinates().toString() + "</coordinates>\n";
                String for_difficulty = "        <difficulty>" + labWork.getDifficulty().toString() + "</difficulty>\n";
                String for_discipline = "        <discipline>" + labWork.getDiscipline().toString() + "</discipline>\n";
                String for_minimalPoint = "        <minimalPoint>" + labWork.getMinimalPoint().toString() + "</minimalPoint>\n";
                String for_tunedInWork= "        <tunedInWorks>" + labWork.getTunedInWorks().toString() + "</tunedInWorks>\n";
                fos.write(for_.getBytes());
                fos.write(for_id.getBytes());
                fos.write(for_name.getBytes());
                fos.write(for_creationDate.getBytes());
                fos.write(for_coordinates.getBytes());
                fos.write(for_difficulty.getBytes());
                fos.write(for_discipline.getBytes());
                fos.write(for_minimalPoint.getBytes());
                fos.write(for_tunedInWork.getBytes());
                fos.write("    </LabWork>\n".getBytes());
            }

            fos.write("</LabWorks>".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

