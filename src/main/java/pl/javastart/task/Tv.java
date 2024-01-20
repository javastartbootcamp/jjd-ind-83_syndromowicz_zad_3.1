package pl.javastart.task;

public class Tv {
    double displaySize;
    boolean displayOn;
    String tvProducer;

    Tv(double size, boolean power, String prd) {
        displaySize = size;
        displayOn = power;
        tvProducer = prd;
    }

    void printInfo() {
        System.out.println("Ekran włączony: " + displayOn + " " + tvProducer + " " + displaySize);
    }
}