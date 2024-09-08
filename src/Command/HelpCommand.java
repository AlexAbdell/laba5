package Command;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import App.*;

public class HelpCommand extends AbstractCommand implements Command {

    @Override
    public void Handle(List<String> a) {
//        System.out.println(a);
//        this.app.getCommands().forEach( < String > (commandName, command) -> System.out.println(commandName + " - " + command.getDescription()))
        for (Map.Entry<String, Command> entry : this.app.commands.entrySet()) {
            String commandName = entry.getKey();
            Command command = entry.getValue();
            System.out.println(commandName + " - " + command.getDescription());
        }

    }

    public HelpCommand(App app) {
        super(app);
    }

    public String getDescription(){
        return "Описание доступных команд";
    }
}

