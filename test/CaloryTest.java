/*
* File: CaloryTest.java
* Author: Katona Valentin
* Copyright: 2022, Katona Valentin
* Group: Szoft II/N
* Date: 2022-01-20
* Github: https://github.com/djvalee/
* Licenc: GNU GPL
*/

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


public class CaloryTest {
    Calory calory;

    @BeforeEach
    void setUp(){
        this.calory = new Calory();
    }


    @Test
    @DisplayName("Calory calculate woman")
    void calcCalcoryWomanTest(){
        double weight = 60;
        double height = 175;
        int age = 25;
        double expectedCalory = 1436.312;
        double actualCalory = this.calory.calcWoman(weight, height, age);

        assertEquals(expectedCalory, actualCalory, 0.001);
    }

    @Test
    @DisplayName("Calory calculate man")
    void calcCalcoryManTest(){
        double weight = 90;
        double height = 190;
        int age = 30;
        double expectedCalory = 2035.892;
        double actualCalory = this.calory.calcMan(weight, height, age);

        assertEquals(expectedCalory, actualCalory, 0.001);
    }

    @Test
    @DisplayName("testing woman")
    void testExceptedExceptionWoman() {
 
        assertThrows(IllegalArgumentException.class, ()->{
            this.calory.calcWoman(-10, 50, 50);
        });
    }

    @Test
    @DisplayName("testing man")
    void testExceptedExceptionMan() {
 
        assertThrows(IllegalArgumentException.class, ()->{
            this.calory.calcMan(-10, 50, 50);
        });
    }

        
}

