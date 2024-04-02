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
    @Test
    public void name2() {

        String dateOfBirth = "16.09.1989";
        String names = C01_01_PrintNameDateOfBirtMobileNb.birthdates(dateOfBirth);
        assertEquals("16.09.1989", dateOfBirth);


    }
    @Test
    public void phonenb() {

        int phonenumb = 07;
        int phone = C01_01_PrintNameDateOfBirtMobileNb.phone(phonenumb);
        assertEquals(07, phone);


    }

}