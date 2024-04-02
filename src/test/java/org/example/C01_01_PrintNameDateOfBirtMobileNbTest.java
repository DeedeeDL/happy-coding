package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01_01_PrintNameDateOfBirtMobileNbTest {
    @Test
    public void name() {

        String nume1 = "Diana-Lavinia";
        String names = C01_01_PrintNameDateOfBirtMobileNb.names(nume1);
        assertEquals("Diana-Lavinia", names);


    }

}