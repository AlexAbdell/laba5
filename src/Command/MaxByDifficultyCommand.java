package Command;

import App.App;

import java.util.List;

public class MaxByDifficultyCommand extends AbstractCommand implements {
    public MaxByDifficultyCommand(App app) {
        super(app);
    }

    @Override
    public void Handle(List<String> a) throws Exception {

    }

    @Override
    public String getDescription() {
        return "";
    }
}
