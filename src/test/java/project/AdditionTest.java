package project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {
    @Autowired
    ArithmaticOperation addition;
    @Test
    public void add(){
        addition.add(1,2);
        int expected =3;
        int actual = addition.add(1,2);
        assertEquals(expected,actual);
    }


}
