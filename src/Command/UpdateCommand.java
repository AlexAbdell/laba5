package Command;

import App.App;
import CollectionObjects.GetLabWork;
import CollectionObjects.LabWork;

import java.util.List;


public class UpdateCommand extends AbstractCommand implements Command {
    public void Handle(List<String> a) throws Exception {
        String id = a.get(0);
        for (LabWork lab : this.app.labWorks) {
            if (lab.getId() == Long.valueOf(id)) {
                GetLabWork builder = new GetLabWork(this.app.scanner);
                LabWork labWork = builder.build(Long.valueOf(id));
                this.app.labWorks.remove(lab);
                return;
            }
            System.out.println("Объект коллекции не найден");
        }
    }

    public String getDescription() {
        return "Обновить значение элемента коллекции по id";
    }

    public UpdateCommand(App app) {
        super(app);
    }
}