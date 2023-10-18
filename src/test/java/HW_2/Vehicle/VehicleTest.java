package HW_2.Vehicle;

import HW_2.Vehicle.Car;
import HW_2.Vehicle.Motorcycle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;
    @BeforeEach
    public void setUp(){
        car = new Car("Lada", "X-Ray", 2015);
        motorcycle = new Motorcycle("Honda", "CBR600RR", 2015);
    }
    @Test
    @DisplayName("Автомобиль является экземпляром Транспортного средства")
    public void carIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    @DisplayName("Автомобиль имеет четыре колеса")
    public void carHasFourWheels() {
        assertEquals(4, car.getNumWheels());
    }

    @Test
    @DisplayName("Мотоцикл имеет два колеса")
    public void motorcycleHasTwoWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    @DisplayName("Скорость тестовой поездки автомобиля составляет 60")
    public void carTestDriveSpeed() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    @DisplayName("Скорость тестовой поездки мотоцикла составляет 75")
    public void motorcycleTestDriveSpeed() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    @DisplayName("Скорость парковки автомобиля равна 0")
    public void carParkSpeed() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    @DisplayName("Скорость парковки мотоцикла равна 0")
    public void motorcycleParkSpeed() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}