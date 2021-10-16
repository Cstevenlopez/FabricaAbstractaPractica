package org.steven;

public class AstraMotor extends Motor{
    @Override
    public String pmotor() {
        System.out.println("características motor:\n");
        String mtor="Posición del motor: Anterior, transversalmente\nCapacidad del motor: 1998 cm3\nPotencia máxima en: 5200 rpm\nTorsión: 170/2400 Nm\nSistema de combustible: Inyección multipunto\nNúmero de cilindros: 4";
        return mtor;
    }
}
