package App;

import CollectionObjects.LabWork;
import Command.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.*;

public class App {
    public List<String> historyCommand = new ArrayList<String>();
    ;
    public Scanner scanner = new Scanner(System.in);
    public Map<String, Command> commands = new HashMap<String, Command>();
    public TreeSet<LabWork> labWorks = new TreeSet<LabWork>();

    public App() {
        System.out.println("");
        commands.put("help", new HelpCommand(this));
        commands.put("info", new InfoCommand(this));
        commands.put("show", new ShowCommand(this));
        commands.put("add", new AddLabWorkCommand(this));
        commands.put("clear", new ClearCommand(this));
        commands.put("remove_by_id", new RemoveByIdCommand(this));
        commands.put("update", new UpdateCommand(this));
        commands.put("history", new HistoryCommand(this));
    }

    public void run() {
        try {
            while (true) {
                System.out.println("Please input a line");
                String line = this.scanner.nextLine();
                List<String> commandArgs = new ArrayList<String>(Arrays.asList(line.split(" ")));
                String commandName = commandArgs.get(0);
                commandArgs.remove(0);
                Command command = commands.get(commandName);
                if (command == null) {
                    System.out.println("Команда не найдена");
                    continue;
                }
                command.Handle(commandArgs);
                if (historyCommand.size() < 15) {
                    historyCommand.add(commandName);
                } else {
                    historyCommand.remove(0);
                    historyCommand.add(commandName);
                }
            }
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }

    public LabWork getLastLabwork() {
        if (labWorks.size() == 0) {
            return null;
        }
        return this.labWorks.last();
    }


}
