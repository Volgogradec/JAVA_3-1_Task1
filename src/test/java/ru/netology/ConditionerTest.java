package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void increaseCurrentTemperatureTest(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature(20);
        assertEquals(21, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(40);
        conditioner.increaseCurrentTemperature(40);
        assertEquals(40, conditioner.getCurrentTemperature());
    }

}