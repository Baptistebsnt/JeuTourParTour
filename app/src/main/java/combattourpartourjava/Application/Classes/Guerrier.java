package combattourpartourjava.Application.Classes;

import combattourpartourjava.Domain.IClasseHeros;

public class Guerrier implements IClasseHeros {
    @Override
    public String getNom() {
        return "Guerrier";
    }

    @Override
    public int getPvParDefaut() {
        return 120;
    }

    @Override
    public int getAttaqueDeBase() {
        return 18;
    }

    @Override
    public int getCooldownEnTour() {
        return 2;
    }

    public int calculerDegatsCompétence(int attaqueDeBase)
    {
     double MUTILIPLICATEUR_FRAPPE_LOURDE = 1.5;
     return (int)(attaqueDeBase * MUTILIPLICATEUR_FRAPPE_LOURDE);
    }
}
