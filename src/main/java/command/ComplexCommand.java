package command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    private final List<DriverCommand> commands = new ArrayList<>();

    public void add(DriverCommand command){
        commands.add(command);
    }

    public void remove(DriverCommand command){
        commands.remove(command);
    }

    public void clear() {
        commands.clear();
    }
    @Override
    public void execute() {
        for (DriverCommand child : commands) {
            child.execute();
        }
    }
}
