package pl.com.stelmach.gameprison.person.prisoner.prisonerbehavior;

public interface Behavior {
    boolean sex(int sexRate);

    boolean suicide(int suicideRate);

    boolean selfMutilation(int mutilationRate);

    boolean inmateAttack(int attackRate);

    boolean inmateRape(int rapeRate);

    boolean guardAttack(int guardAttackRate);

    boolean courtComplain(int courtComplainRate);

    boolean mediaComplain(int mediaComplainRate);

    boolean sendTreat(int treatRate);

    boolean vandalism(int vandalismRate);


}
