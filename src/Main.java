public class Main {

    public static void main(String[] args) {
        //Zad1
        Admin admin = new Admin();
        admin.setImie("Marek");

        //Zad2
        //........

        //Zad3
        Vehicle v = new Vehicle();
        Car c = new Car();
        Racingcar rc = new Racingcar();

        v.display_typeOfVehicle();
        c.display_typeOfVehicle();
        rc.display_typeOfVehicle();

        //Zad4
        Browser chrome = new Chrome();
        Browser firefox = new Firefox();
        Browser opera = new Opera();

        chrome.info();
        firefox.info();
        opera.info();
    }
}