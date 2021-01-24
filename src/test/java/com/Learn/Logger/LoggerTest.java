package com.Learn.Logger;

import com.Learn.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoggerTest {

    @BeforeEach
    void setUp() {
    }
    @Test
    void sendMessage() {
        Main.logger.sendMessage("Test must be succesfull");
    }

    @Test
    void log() {
        Main.logger.log("Test must be succesfull");
    }
}