package Command;

import App.App;
import CollectionObjects.Difficulty;
import CollectionObjects.LabWork;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class MaxByDifficultyCommand extends AbstractCommand implements Command {
    public MaxByDifficultyCommand(App app) {
        super(app);
    }

    @Override
    public void Handle(List<String> a) throws Exception {

    }

    @Override
    public String getDescription() {
        return "Вывод любого объекта из коллекции, значение поля difficulty которого является максимальным";
    }
}
