package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.features.DriverFeature;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FiguresJaneAdapter extends AbstractDriver implements ActionListener {


    public FiguresJaneAdapter(int x, int y) {
        super(x, y);
    }

    @Override
    public void operateTo(int i, int i1) {
        DriverFeature.getDriverManager().getCurrentDriver().operateTo(i,i1);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        FiguresJane.figureScript(this);
    }
}
