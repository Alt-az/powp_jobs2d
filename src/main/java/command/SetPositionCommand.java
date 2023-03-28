package command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {

    private final int x;
    private final int y;

    private Job2dDriver jdb;

    public SetPositionCommand(int x, int y, Job2dDriver jdb) {
        this.x = x;
        this.y = y;
        this.jdb = jdb;
    }

    public void setJdb(Job2dDriver jdb) {
        this.jdb = jdb;
    }

    @Override
    public void execute() {
        jdb.setPosition(x,y);
    }
}
