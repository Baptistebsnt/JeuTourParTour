package combattourpartourjava.Application.Factory;

import combattourpartourjava.Application.Classes.Guerrier;
import combattourpartourjava.Application.Classes.Mage;
import combattourpartourjava.Application.Classes.Rogue;
import combattourpartourjava.Domain.IClasseHeros;

import java.util.function.Supplier;

public enum ClasseType {
    GUERRIER(Guerrier::new),
    MAGE(Mage::new),
    ROGUE(Rogue::new);

    private final Supplier<IClasseHeros> constructeur;

    ClasseType(Supplier<IClasseHeros> constructeur) {
        this.constructeur = constructeur;
    }

    public IClasseHeros creer() {
        return constructeur.get();
    }
}
