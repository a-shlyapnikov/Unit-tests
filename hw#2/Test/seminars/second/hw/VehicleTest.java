package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    public static Car createCar() {
        return new Car("Lambo", "Urus", 19);
    }

    public static Motorcycle createMotocyle() {
        return new Motorcycle("Yamaha", "YZF-R1", 20);
    }

    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setup() {
        car = createCar();
        motorcycle = createMotocyle();
    }


    //Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    void carIsInstanceOfVehicle() {
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    //- Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void carHasFourWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    //- Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void motorcycleHasTwoWheels() {
        assertEquals(2, motorcycle.getNumWheels());
    }

    //- Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void carSpeedTest() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    //- Проверить, что объект Motorcycle развивает скорость 75
    // в режиме тестового вождения (используя метод testDrive()).
    @Test
    void motorcycleSpeedTest() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    //- Проверить, что в режиме парковки (сначала testDrive,
    // потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    void carParkingSpeedTest() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    //- Проверить, что в режиме парковки (сначала testDrive,
    // потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).

    @Test
    void motocycleParkingSpeedTest() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}