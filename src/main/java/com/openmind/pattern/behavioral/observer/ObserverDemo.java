package com.openmind.pattern.behavioral.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexaObserver(subject);

        subject.setState(1024);

        System.out.println();

        subject.setState(128);
    }
}
