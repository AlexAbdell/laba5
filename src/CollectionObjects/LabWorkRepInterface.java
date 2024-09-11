package CollectionObjects;

public interface LabWorkRepInterface {
    public void add(LabWork labWork);
    public void delete(int id);
    public void update(int id, LabWork labWork);
    public void clear();
    public void save();
    public void addIfMin(LabWork labWork);
    public void removeGreater(LabWork labWork);
    public LabWork maxByDifficulty();
    public void filterLessThanMinDiscipline(String name);
    public void filterGreaterThanDifficulty(String name);
    public void loadFromFile();
    public LabWork lastLabwork();
}
