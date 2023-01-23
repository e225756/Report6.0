package jp.ac.uryukyu.ie.e225756;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Uranai3Test {
    @Test
    void calcTest(){
        Uranai3 name = new Uranai3();
        int actual =  name.calc(2, 0, 0, 3, 0, 7, 1, 1);
        int expect = 5;
        assertEquals(expect, actual);
    }
}
