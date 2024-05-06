package project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionTest {
    @Autowired
    ArithmaticOperation a;
    @Test
    public void division(){
        Integer actual =  a.division(50, 10);
        Integer expected =5;
        assertEquals(actual,expected);
    }
}
