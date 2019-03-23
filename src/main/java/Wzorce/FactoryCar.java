package Wzorce;

public class FactoryCar {
    public enum CarType {
        benzin,
        diesel,
        electric
    }

    public static Car buildCar( CarType cart)
    {
        switch(cart){
            case benzin:
                return new BenzinCar();
            case diesel:
                return new DieselCar();
            case electric:
                return new ElectricCar();
        }
        throw new IllegalArgumentException("Typ "+cart+" jest nieznany");
    }
}
