package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    private MainHW hw;
    @BeforeEach
    void setup(){
        hw = new MainHW();
    }
    @Test
    void evenOddNumberTrue() {
        assertTrue(hw.evenOddNumber(2));
    }
    @Test
    void evenOddNumberFalse(){
        assertFalse(hw.evenOddNumber(15));

    }

    @Test
    void numberInIntervalTrue() {
        assertTrue(hw.numberInInterval(26));
    }
    @Test
    void numberInIntervalFalse() {
        assertFalse(hw.evenOddNumber(25));
    }
}