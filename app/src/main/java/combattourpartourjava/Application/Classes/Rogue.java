package combattourpartourjava.Application.Classes;

import combattourpartourjava.Domain.IClasseHeros;

import java.util.Random;

public class Rogue implements IClasseHeros {
    @Override
    public String getNom() {
        return "Rogue";
    }

    @Override
    public int getPvParDefaut() {
        return 90;
    }

    @Override
    public int getAttaqueDeBase() {
        return 14;
    }

    @Override
    public int getCooldownEnTour() {
        return 2;
    }

    private final double CHANCE_DE_CRITIQUE = 0.30;
    private static final Random rng = new Random();

    public int calculerDegatsCritique(int attaqueDeBase)
    {
        boolean estCritique = rng.nextDouble() < CHANCE_DE_CRITIQUE;
        return estCritique ? attaqueDeBase * 2 : attaqueDeBase;
    }
}
