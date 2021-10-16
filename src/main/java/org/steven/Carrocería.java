package org.steven;

public abstract class Carrocería {
    private String Carroceria;

    public abstract String lcarroceria();

    public String getCarroceria(){
        return Carroceria;
    }

    public void setCarroceria(String Carroceria){
        this.Carroceria=Carroceria;
    }
}
