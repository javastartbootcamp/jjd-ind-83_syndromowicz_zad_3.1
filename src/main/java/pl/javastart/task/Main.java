package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Tv tv1 = new Tv();
        tv1.displayOn = true;
        tv1.displaySize = 65.0;
        tv1.tvProducer = "samsung";
        Tv tv2 = new Tv();
        tv2.displayOn = false;
        tv2.displaySize = 55.0;
        tv2.tvProducer = "LG";
        System.out.println(tv1.tvProducer + " " + tv1.displaySize + " " + "ekran włączony " + tv1.displayOn);
        System.out.println(tv2.tvProducer + " " + tv2.displaySize + " " + "ekran włączony " + tv2.displayOn);
    }
}
