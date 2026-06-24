package combattourpartourjava.Application.Factory;

import combattourpartourjava.Domain.IClasseHeros;

public class HerosFactory {

    public static IClasseHeros creer(String type)
    {
        return ClasseType.valueOf(type.toUpperCase()).creer();
    }
}
