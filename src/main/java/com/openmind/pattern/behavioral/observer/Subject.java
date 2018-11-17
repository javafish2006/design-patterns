package com.openmind.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标
 */
public class Subject {

    private List<ObServer> observers = new ArrayList();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;

        notifyAllObserver();
    }

    public void attach(ObServer obs){
        observers.add(obs);
    }

    public void notifyAllObserver(){
        for (ObServer obServer : observers) {
            obServer.update();
        }
    }
}
