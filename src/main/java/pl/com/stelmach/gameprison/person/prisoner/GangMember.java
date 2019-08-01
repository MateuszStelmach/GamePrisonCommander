package pl.com.stelmach.gameprison.person.prisoner;

public class GangMember  implements Behavior {
    @Override
    public boolean sex(int sexRate) {
        return false;
    }

    @Override
    public boolean suicide(int suicideRate) {
        return false;
    }

    @Override
    public boolean selfMutilation(int mutilationRate) {
        return false;
    }

    @Override
    public boolean inmateAttack(int attackRate) {
        return false;
    }

    @Override
    public boolean inmateRape(int rapeRate) {
        return false;
    }

    @Override
    public boolean guardAttack(int guardAttackRate) {
        return false;
    }

    @Override
    public boolean courtComplain(int courtComplainRate) {
        return false;
    }

    @Override
    public boolean mediaComplain(int mediaComplainRate) {
        return false;
    }

    @Override
    public boolean sendTreat(int treatRate) {
        return false;
    }

    @Override
    public boolean vandalism(int vandalismRate) {
        return false;
    }
}
