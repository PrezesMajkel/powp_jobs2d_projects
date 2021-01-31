package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.features.MacroFeature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectStartMacroListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!MacroFeature.isRecording()) {
            MacroFeature.setIsRecording(true);

        }
    }
}
