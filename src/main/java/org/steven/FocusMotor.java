package org.steven;

public class FocusMotor extends Motor{
    @Override
    public String pmotor() {
        System.out.println("características motor:\n");
        String mtor="Código del motor: Ecoboost M1DA\nCapacidad: 998 (cc)\nTipo de distribución: Correa de distribución\nNúmero de cilindros: 3\nVálvulas por cilindro: 4\nDistancia entre bujías: 0,7 (mm)\nBoquilla: 0,24 – 0,30 (mm)\n";
        return mtor;

    }

}
