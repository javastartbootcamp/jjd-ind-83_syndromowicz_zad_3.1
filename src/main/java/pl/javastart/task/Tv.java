package pl.javastart.task;
//nie wiem czemu tworzac nowa klase tutaj automatycznie dodaja sie te pakiety i nic recznie nie wpisuje
//wiec pewnie dlatego w gicie widac ze to ja to tworze
public class Tv {
    double displaySize;
    boolean displayOn;
    String tvProducer;
    Tv(double size,boolean power, String prd) {
        displaySize = size;
        displayOn = power;
        tvProducer = prd;
    }
    void printInfo() {
        System.out.println("Ekran włączony: " + displayOn + " " + tvProducer + " " + displaySize);
    }
}