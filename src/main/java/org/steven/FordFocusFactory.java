package org.steven;

public class FordFocusFactory implements CocheFactory{
    @Override
    public Motor crearMotor() {
        return new FocusMotor();
    }

    @Override
    public Carroceria crearCarroceria() {
        return new FocusCarroceria();
    }
}
