package com.travelc.kata.example;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class KataExampleTest {

    @Test
    void some_example() {
        assertThat(new KataExample().getExample(), Matchers.is("Hello World!"));
    }

}
