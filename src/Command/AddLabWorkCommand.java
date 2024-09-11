package Command;

import App.App;
import CollectionObjects.GetLabWork;
import CollectionObjects.LabWork;

import java.util.List;

public class AddLabWorkCommand extends AbstractCommand implements Command {

    @Override
    public void Handle(List<String> a) throws Exception {
        LabWork lastLabWork = this.app.getLastLabwork();
        long id = 1;
        if (lastLabWork != null) {
            id = (lastLabWork.getId() + 1);
        }


        GetLabWork builder = new GetLabWork(this.app.scanner);
        LabWork labWork = builder.build(id);
        if (labWork == null) {
            System.out.println("Не удалось создать объект");
            return;
        }
        this.app.labWorks.add(labWork);
    }


    public AddLabWorkCommand(App app) {
        super(app);
    }

    public String getDescription() {
        return "Добавить новый элемент в коллекцию";
    }
}

