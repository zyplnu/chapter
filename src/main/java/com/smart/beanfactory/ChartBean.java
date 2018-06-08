package com.smart.beanfactory;

import javax.swing.*;

import static javax.swing.SwingConstants.CENTER;

public class ChartBean extends JPanel {

    private int titlePosition = CENTER;

    private boolean inverse;

    public int getTitlePosition() {
        return titlePosition;
    }

    public void setTitlePosition(int titlePosition) {
        this.titlePosition = titlePosition;
    }

    public boolean isInverse() {
        return inverse;
    }

    public void setInverse(boolean inverse) {
        this.inverse = inverse;
    }
}
