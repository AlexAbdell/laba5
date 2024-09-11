package Command;

import App.App;
import ToXML.LabWorkSaver;

import java.util.List;

public class SaveCommand extends AbstractCommand implements Command {
    public SaveCommand(App app) {
        super(app);
    }

    @Override
    public void Handle(List<String> a) throws Exception {
        LabWorkSaver saver = new LabWorkSaver();
        saver.saveToXML(this.app.labWorks, "labworks.xml");
    }


    @Override
    public String getDescription() {
        return "Сохранение коллекции в файл";
    }
}
