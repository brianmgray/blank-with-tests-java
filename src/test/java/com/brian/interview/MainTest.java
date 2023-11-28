package com.brian.interview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {

    Main main;

    @BeforeEach
    public void setUp() throws Exception {
        main = new Main();
    }

    @Test
    public void testHello() {
        assertThat(main.hello(), is("hello"));
    }
}