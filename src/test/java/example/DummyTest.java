package example;

import org.junit.jupiter.api.Test;

class DummyTest {

    @Test
    void failingTest() {
        assert (false);
    }

    @Test
    void passingTest() {
        assert (true);
    }
}
