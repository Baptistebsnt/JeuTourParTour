package combattourpartourjava.Domain;

public class Hero implements IPersonnage {
    private String Nom;
    private final int PvMax;
    private int PvActuels;
    private int Attaque;
    private int Cooldown;
    public boolean estVivant() {
        return PvActuels > 0;
    }

    public Hero(String nom, IClasseHeros classe) {
        this.Nom = nom;
        this.PvMax = classe.getPvParDefaut();
        this.PvActuels = classe.getPvParDefaut();
        this.Attaque = classe.getAttaqueDeBase();
        this.Cooldown = classe.getCooldownEnTour();
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public int getPvMax() {
        return PvMax;
    }

    public int getPvActuels() {
        return PvActuels;
    }

    public void setPvActuels(int pvActuels) {
        PvActuels = pvActuels;
    }

    public int getAttaque() {
        return Attaque;
    }

    public void setAttaque(int attaque) {
        Attaque = attaque;
    }

    public int getCooldown() {
        return Cooldown;
    }

    public void setCooldown(int cooldown) {
        Cooldown = cooldown;
    }
}

