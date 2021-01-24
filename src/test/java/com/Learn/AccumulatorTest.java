package com.Learn;

import com.Learn.Planes.Airline;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccumulatorTest {
    Airline base = new Airline();
    Accumulator s = new Accumulator(base);
    @BeforeEach
    void setUp() {
    }

    @Test
    void chooseCommandType(){
        s.chooseCommandType();
    }
}

