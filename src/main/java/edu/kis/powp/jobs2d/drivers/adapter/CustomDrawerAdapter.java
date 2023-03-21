package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.line.CustomLine;

import java.awt.*;

public class CustomDrawerAdapter extends DrawPanelController implements Job2dDriver {
    private int startX = 0, startY = 0;

    public CustomDrawerAdapter() {
        super();
    }


    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        ILine line = new CustomLine(Color.RED,0.3F,true);
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        setPosition(x,y);
        drawLine(line);
        DrawerFeature.getDrawerController().drawLine(line);
    }

    @Override
    public String toString() {
        return "DrawerAdapter";
    }
}
