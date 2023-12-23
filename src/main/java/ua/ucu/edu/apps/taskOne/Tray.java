package ua.ucu.edu.apps.taskone;

public abstract class Tray {
    private int denomination;
    private Tray next;

    public Tray(int denomination) {
        this.denomination = denomination;
    }
    public void setNext(Tray tray) {
        this.next = tray;
    }
    public void process(int amount) {
        int remainingAmount = amount % denomination;
        
        if (next != null) {
            next.process(remainingAmount);
        } else if (remainingAmount > 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("You received " + amount / denomination
        + " of denomination " + denomination);
    }
    
}
