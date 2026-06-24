package combattourpartourjava.Application.Classes;

import combattourpartourjava.Domain.IClasseHeros;

public class Mage implements IClasseHeros {
    @Override
    public String getNom() {
        return "Mage";
    }

    @Override
    public int getPvParDefaut() {
        return 80;
    }

    @Override
    public int getAttaqueDeBase() {
        return 12;
    }

    @Override
    public int getCooldownEnTour() {
        return 3;
    }
}
