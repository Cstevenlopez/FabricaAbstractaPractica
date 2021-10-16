package org.steven;

public abstract class Motor {
    private String motor;

    public abstract String pmotor();
    public String getmotor(){
        return motor;
    }

    public void setmotor(String motor){
        this.motor=motor;
    }
}
