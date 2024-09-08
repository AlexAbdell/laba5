package Command;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import App.*;
import CollectionObjects.GetLabWork;
import CollectionObjects.LabWork;

public class RemoveByIdCommand extends AbstractCommand implements Command {
    public void Handle(List<String> a) {
        System.out.println("Введите id объекта коллекции");
        long id = this.app.scanner.nextLong();
        for (LabWork lab : this.app.labWorks) {
            if (lab.getId() == id) {
                this.app.labWorks.remove(lab);
                System.out.println("Объект коллекции был успешно удален");
                return;
            }
        }
        System.out.println("Объект коллекции не найден");
    }

    public String getDescription() {
        return "Удаление объекта коллекции по id";
    }

    public RemoveByIdCommand(App app) {
        super(app);
    }
}
