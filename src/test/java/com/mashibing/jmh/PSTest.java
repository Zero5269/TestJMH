package com.mashibing.jmh;

import org.junit.jupiter.api.Timeout;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class PSTest {

    @Benchmark
    @Warmup(iterations = 3, time = 1,timeUnit = TimeUnit.SECONDS)
    @Fork(3)
    @Timeout(1)
    @Threads(4)
    @BenchmarkMode(Mode.AverageTime)
    @Measurement(iterations = 2, time = 1)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void testForEach() {
        PS.foreach();
    }
}