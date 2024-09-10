package Command;

import App.App;
import CollectionObjects.Difficulty;
import CollectionObjects.LabWork;

import java.util.List;
import java.util.TreeSet;

public class FilterGreaterThanDifficultyCommand extends AbstractCommand implements Command{
    public FilterGreaterThanDifficultyCommand(App app) {
        super(app);
    }

    @Override
    public void Handle(List<String> a) throws Exception {
        String line = a.get(0);
        Difficulty min_difficulty = Difficulty.valueOf(line.toUpperCase());
        TreeSet<Difficulty> treeSet = (TreeSet<Difficulty>) this.app.difficulties.tailSet(min_difficulty);
        treeSet.remove(treeSet.first());
        for (LabWork lab : this.app.labWorks){
            if (treeSet.contains(lab.getDifficulty())){
                System.out.println(lab);
            }
        }
    }

    @Override
    public String getDescription() {
        return "Вывод элементов, значение поля difficulty которых больше заданного";
    }
}
