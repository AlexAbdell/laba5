package Command;

import App.App;
import CollectionObjects.LabWork;
import java.util.List;


public class UpdateCommand extends AbstractCommand implements Command{
    public void Handle(List<String> a) throws Exception {
        System.out.println("Введите id объекта коллекции");
        long id = this.app.scanner.nextLong();
        System.out.println("Введите поле элемента коллекции");
        String po = this.app.scanner.nextLine();
        for (LabWork lab : this.app.labWorks) {
            if (lab.getId() == id){
                if (po == "name"){
                    System.out.println("Введите название лабораторной работы");
                    lab.setName(this.app.scanner.nextLine());
                    return;
                }
            }
        }
        System.out.println("Объект коллекции не найден");
    }

    public String getDescription() {
        return "Обновить значение элемента коллекции по id";
    }

    public UpdateCommand(App app){
        super(app);
    }
}