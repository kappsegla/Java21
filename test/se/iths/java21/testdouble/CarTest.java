package se.iths.java21.testdouble;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void callingOutSideTempShouldReturnTemperatureFromMonitor() {
        Car car = new Car(new StubMonitor());

        var result = car.getOutsideTemp();
        assertEquals(8,result,"Temperature should be 8 degrees.");
    }

    @Test
    void callingOutsideTempShouldForwardCallToMonitor() {
        var monitor = new SpyMonitor();
        Car car = new Car(monitor);

        var result = car.getOutsideTemp();

        assertEquals(8,result);
        assertTrue(monitor.getTemperatureCalled);
    }

    @Test
    void outSideTempUsingMockito() {
        Monitor mockedMontior = Mockito.mock(Monitor.class);
        Car car = new Car(mockedMontior);
        Mockito.when(mockedMontior.getTemperature()).thenReturn(8);

        assertEquals(8, car.getOutsideTemp());
        Mockito.verify(mockedMontior, Mockito.atLeast(1)).getTemperature();
    }

}