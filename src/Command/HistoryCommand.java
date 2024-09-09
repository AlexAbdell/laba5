package Command;

import App.App;

import java.util.List;
import java.util.Map;

public class HistoryCommand extends AbstractCommand implements Command {
    public HistoryCommand(App app) {
        super(app);
    }

    @Override
    public void Handle(List<String> a) throws Exception {
        System.out.println("Последние использованные команды:");
        for (String command : this.app.historyCommand) {
            System.out.println(command);
        }
        System.out.println("Вывод команд закончен");
    }

    @Override
    public String getDescription() {
        return "Вывод 15 последних команд без их аргументов";
    }
}
