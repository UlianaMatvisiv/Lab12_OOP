package ua.ucu.edu.apps.taskone;

public class Main {
    private static final int AMOUNT = 756;
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.process(AMOUNT);
    }
}