package CollectionObjects;

import java.util.TreeSet;

public class LabWorkRep implements LabWorkRepInterface{
    public TreeSet<LabWork> labWorks = new TreeSet<LabWork>();

    @Override
    public void add(LabWork labWork) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(int id, LabWork labWork) {

    }

    @Override
    public void clear() {

    }

    @Override
    public void save() {

    }

    @Override
    public void addIfMin(LabWork labWork) {

    }

    @Override
    public void removeGreater(LabWork labWork) {

    }

    @Override
    public LabWork maxByDifficulty() {
        return null;
    }

    @Override
    public void filterLessThanMinDiscipline(String name) {

    }

    @Override
    public void filterGreaterThanDifficulty(String name) {

    }

    @Override
    public void loadFromFile() {

    }

    @Override
    public LabWork lastLabwork() {
        return null;
    }
}
