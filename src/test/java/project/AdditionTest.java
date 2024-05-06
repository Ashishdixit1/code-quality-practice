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
    @Test
    public void sub(){
        ArithmaticOperation arithmaticOperation =new ArithmaticOperation();
         int actual= arithmaticOperation.subtract(50,20);
        int expected = 30;

        assertEquals(actual,expected);

    }

}
