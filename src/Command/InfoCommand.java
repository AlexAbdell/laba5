package Command;

import App.App;

import java.util.List;
import java.util.Map;

public class InfoCommand extends AbstractCommand implements Command {

    @Override
    public void Handle(List<String> a) {
        System.out.println("Тип коллекции: " + this.app.labWorks.getClass());
        System.out.println("Размер коллекци: " + this.app.labWorks.size());
        if (this.app.labWorks.size() == 0) {
            System.out.println("Дата инициализации: отсутствует");
        } else {
            System.out.println("Дата инициализации: " + this.app.labWorks.first().getCreationDate());
        }

    }


    public InfoCommand(App app) {
        super(app);
    }

    public String getDescription() {
        return "Информация о колекции";
    }
}

