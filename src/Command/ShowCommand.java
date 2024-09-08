package Command;

import App.App;
import CollectionObjects.LabWork;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;

public class ShowCommand extends AbstractCommand implements Command {

    @Override
    public void Handle(List<String> a) {
//        System.out.println(a);
//        this.app.getCommands().forEach( < String > (commandName, command) -> System.out.println(commandName + " - " + command.getDescription()))
        for (LabWork labWorkTreeSet : this.app.labWorks) {
            System.out.println(labWorkTreeSet);
        }

    }

    public ShowCommand(App app) {
        super(app);
    }

    public String getDescription(){
        return "Элементы коллекции";
    }
}

