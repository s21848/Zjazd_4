

public class Admin extends Prac {
    String[] tab = new String[1];

    @Override
    void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    String getNazwisko() {
        return this.nazwisko;
    }

    @Override
    void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    String getImie() {
        return this.imie;
    }

    @Override
    void setId(int id) {
        this.id = id;
    }

    @Override
    int getId() {
        return this.id;
    }

    public String[] getTab() {
        return tab;
    }

    public void setTab(String[] tab) {
        this.tab = tab;
    }
}