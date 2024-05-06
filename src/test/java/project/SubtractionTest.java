package project;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractionTest {
    public void sub(){
        ArithmaticOperation arithmaticOperation =new ArithmaticOperation();
        int actual= arithmaticOperation.subtract(50,20);
        int expected = 30;

        assertEquals(actual,expected);

    }
}
