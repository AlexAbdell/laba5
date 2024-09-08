package Command;
import App.*;
import java.util.Scanner;


public abstract class AbstractCommand implements Command {
    protected App app;
    public AbstractCommand(App app){
        this.app = app;
    }
    public abstract String getDescription();
}
