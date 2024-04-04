package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01_01_PrintNameDateOfBirtMobileNbTest {
    @Test
    public void personDetails() {

        String name = "Diana-Lavinia";
        String dateOfBirth = "16.09.1989";
        String number = "0730......";
        String person = C01_01_PrintNameDateOfBirtMobileNb.personDetails(name, dateOfBirth, number);
        String expected = "Name: Diana-Lavinia, Date of Birth: 16.09.1989, Mobile Number: 0730......";
        assertEquals(expected, person);
    }

    }

