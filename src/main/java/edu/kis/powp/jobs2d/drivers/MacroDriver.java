package edu.kis.powp.jobs2d.drivers;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

import java.util.ArrayList;

public class MacroDriver implements Job2dDriver {
    private ArrayList<DriverCommand> macro = new ArrayList<>();
    private Job2dDriver job2dDriver;

    @Override
    public void operateTo(int x, int y) {
        macro.add(new SetPositionCommand(x, y));
    }

    @Override
    public void setPosition(int x, int y) {
        macro.add((new OperateToCommand(x, y)));
    }

    public ArrayList<DriverCommand> getMacro(){
        return macro;
    }

    public void clearMacro(){
        if(macro.size()>0) {
            macro.clear();
        }
    }

    public void setJob2dDriver(Job2dDriver driver){
        job2dDriver = driver;
    }

    public Job2dDriver getJob2dDriver(){
        return job2dDriver;
    }
}
