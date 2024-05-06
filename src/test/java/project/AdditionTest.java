package project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionTest {
    @Test
    public void add(){
        ArithmaticOperation addition =new ArithmaticOperation();
        addition.add(1,2);
        int expected =3;
        int actual = addition.add(1,2);
        assertEquals(expected,actual);
    }


}
