package pl.com.stelmach.gameprison.person.prisoner;

public interface Behevior {
    boolean sexbehavior(int sexRate);

    boolean suicide(int suicideRate);

    boolean selfmutalation(int mutalationRate);

    boolean inmateattack(int attackRate);

    boolean inmateRape(int rapeRate);

    boolean guardattack(int guardattackRate);

    boolean courtcomplain(int courtcomplainRate);

    boolean mediacomplain(int mediacomplainRate);

    boolean sendtreat(int treatRate);


}
