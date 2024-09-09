package Command;

import App.App;
import CollectionObjects.Difficulty;
import CollectionObjects.LabWork;

import java.util.List;
import java.util.Map;

public class MaxByDifficultyCommand extends AbstractCommand implements Command {
    private Difficulty[] difficulties = {Difficulty.HOPELESS, Difficulty.INSANE, Difficulty.IMPOSSIBLE, Difficulty.NORMAL, Difficulty.EASY};
    public MaxByDifficultyCommand(App app) {
        super(app);
    }

    @Override
    public void Handle(List<String> a) throws Exception {
        for (Difficulty elem: difficulties){
            for (LabWork labWork: this.app.labWorks){
                if (labWork.getDifficulty() == elem){
                    System.out.println(labWork);
                    return;
                }
            }
        }
    }

    @Override
    public String getDescription() {
        return "Вывод любого объекта из коллекции, значение поля difficulty которого является максимальным";
    }
}
