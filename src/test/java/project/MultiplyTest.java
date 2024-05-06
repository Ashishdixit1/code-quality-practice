package project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MultiplyTest {
    @Autowired
    ArithmaticOperation a;
    @Test
    public void multiply() {
        float actual = a.multiply(2.5f, 20.00f);
        float expected = 50.0f;
        assertEquals(actual, expected);

    }
}
