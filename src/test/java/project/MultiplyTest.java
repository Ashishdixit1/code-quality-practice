package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MultiplyTest {
    @Test
    public void multiply(){
        ArithmaticOperation arithmaticOperation =new ArithmaticOperation();
        float actual = arithmaticOperation.multiply(2.5f, 20.00f);
        float expected= 50.0f;
        assertEquals(actual,expected);

    }
}
