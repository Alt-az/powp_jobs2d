package command;

import edu.kis.powp.jobs2d.Job2dDriver;

 public class FiguresFactory {

    static public ComplexCommand rectangle(Job2dDriver driver){
        ComplexCommand commands = new ComplexCommand();
        DriverCommand driverCommand = new SetPositionCommand(0,0, driver);
        DriverCommand driverCommand2 = new OperateToCommand(100,0,driver);
        DriverCommand driverCommand3 = new OperateToCommand(100,100,driver);
        DriverCommand driverCommand4 = new OperateToCommand(0,100,driver);
        DriverCommand driverCommand5 = new OperateToCommand(0,0,driver);
        commands.add(driverCommand);
        commands.add(driverCommand2);
        commands.add(driverCommand3);
        commands.add(driverCommand4);
        commands.add(driverCommand5);
        return commands;
    }

     static public ComplexCommand weridFigure(Job2dDriver driver){
         ComplexCommand commands = new ComplexCommand();
         DriverCommand driverCommand = new SetPositionCommand(0,0,driver);
         DriverCommand driverCommand2 = new OperateToCommand(100,100,driver);
         DriverCommand driverCommand3 = new OperateToCommand(100,0,driver);
         DriverCommand driverCommand4 = new OperateToCommand(0,100,driver);
         DriverCommand driverCommand5 = new OperateToCommand(0,0,driver);
         commands.add(driverCommand);
         commands.add(driverCommand2);
         commands.add(driverCommand3);
         commands.add(driverCommand4);
         commands.add(driverCommand5);
         return commands;
     }
     static public ComplexCommand triangle(Job2dDriver driver){
         ComplexCommand commands = new ComplexCommand();
         DriverCommand driverCommand = new SetPositionCommand(0,0,driver);
         DriverCommand driverCommand2 = new OperateToCommand(100,100,driver);
         DriverCommand driverCommand3 = new OperateToCommand(100,0,driver);
         DriverCommand driverCommand5 = new OperateToCommand(0,0,driver);
         commands.add(driverCommand);
         commands.add(driverCommand2);
         commands.add(driverCommand3);
         commands.add(driverCommand5);
         return commands;
     }
}
