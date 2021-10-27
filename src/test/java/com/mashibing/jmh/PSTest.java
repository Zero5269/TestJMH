package com.mashibing.jmh;

import org.openjdk.jmh.annotations.*;

import static org.junit.jupiter.api.Assertions.*;

public class PSTest {
    @Benchmark
    @Warmup(iterations = 1, time = 3)
    @Fork(2)
    @BenchmarkMode(Mode.Throughput)
    @Measurement(iterations = 1, time = 3)
    public void testForEach() {
        PS.foreach();
    }

    @Benchmark
    @Warmup(iterations = 1, time = 3)
    @Fork(2)
    @BenchmarkMode(Mode.AverageTime)
    @Measurement(iterations = 1, time = 3)
    public void testForEach1() {
        PS.foreach();
    }
}