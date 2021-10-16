package org.steven;

public class OpelAstraFactory implements CocheFactory{
    @Override
    public Motor crearMotor() {
        return new AstraMotor();
    }

    @Override
    public Carroceria crearCarroceria() {
        return new AstraCarroceria();
    }

}
