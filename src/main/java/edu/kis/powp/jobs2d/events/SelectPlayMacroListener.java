package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.features.DriverFeature;;
import  edu.kis.powp.jobs2d.features.CommandsFeature;
import edu.kis.powp.jobs2d.features.MacroFeature;

public class SelectPlayMacroListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        CommandsFeature.getDriverCommandManager().setCurrentCommand(MacroFeature.getMacroDriver().getMacro(), "Macro");
        DriverFeature.getDriverManager().setCurrentDriver(MacroFeature.getMacroDriver().getJob2dDriver());
    }
}
