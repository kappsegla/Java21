package se.iths.java21.testdouble;

public class Monitor {
    public int getTemperature(){
        //Not working outside cars computer
        throw new RuntimeException("No sensors found");
    }
}
