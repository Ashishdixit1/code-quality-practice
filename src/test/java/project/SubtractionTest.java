package project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractionTest {
    @Autowired
    ArithmaticOperation arithmaticOperation;
    @Test
    public void sub(){
        int actual= arithmaticOperation.subtract(50,20);
        int expected = 30;

        assertEquals(actual,expected);

    }
}
