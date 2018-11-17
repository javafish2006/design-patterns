package com.openmind.pattern.behavioral.observer;

public class HexaObserver extends ObServer {


    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("HexaObservet get the subject state:" + subject.getState());
    }
}
