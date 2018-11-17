package com.openmind.pattern.behavioral.observer;

public class BinaryObserver extends ObServer {


    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {

        System.out.println("BinaryObserver get the subject state:" + subject.getState());
    }
}
