package se.iths.java21.testdouble;

public class SpyMonitor extends Monitor{
    boolean getTemperatureCalled = false;

    @Override
    public int getTemperature() {
        getTemperatureCalled = true;
        return 8;
    }
}
