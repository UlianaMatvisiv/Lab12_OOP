package ua.ucu.edu.apps.taskone;

import lombok.Getter;
import lombok.Setter;


public class ATM {
    @Getter
    @Setter
    private Tray firstTray;
    public ATM() {
        Tray trayhundred = new Trayhundred();
        Tray trayfifty = new Trayfifty();
        Tray traytwo = new Traytwo();
        
        firstTray = trayhundred;
        trayhundred.setNext(trayfifty);
        trayfifty.setNext(traytwo);
    }
    public void process(int amount) {
        firstTray.process(amount);
    }
}
