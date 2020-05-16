public abstract class Prac {
    int id;
    String imie;
    String nazwisko;

    abstract void setNazwisko(String nazwisko);
    abstract String getNazwisko();
    abstract void setImie(String imie);
    abstract String getImie();
    abstract void setId(int id);
    abstract int getId();
}
