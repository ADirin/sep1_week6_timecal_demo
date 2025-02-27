import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeCalTest {

    @Test
    void timeCalulator() {
        assertEquals(1.0, TimeCal.timeCalulator(100.0, 100.0), 0.0001);

    }
}