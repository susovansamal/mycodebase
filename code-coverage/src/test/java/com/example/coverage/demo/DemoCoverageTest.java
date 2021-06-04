package com.example.coverage.demo;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class DemoCoverageTest {

    @Spy
    private DemoCoverage demoCoverage;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getCurrentStateOfDay() {
        String currentStateOfDay = demoCoverage.getCurrentStateOfDay(11);
        Assert.assertEquals("Good Morning", currentStateOfDay);

    }
}