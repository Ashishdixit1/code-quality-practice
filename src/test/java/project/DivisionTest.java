package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionTest {
    @Test
    public void division(){
        ArithmaticOperation arithmaticOperation =new ArithmaticOperation();
        Integer actual =  arithmaticOperation.division(50, 10);
        Integer expected =5;
        assertEquals(actual,expected);
    }
}
