package com.mashibing.jmh;

import org.junit.jupiter.api.Timeout;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

public class PSTest2 {
    @Benchmark
    @Warmup(iterations = 3, time = 1,timeUnit = TimeUnit.SECONDS)
    @Fork(3)
    @Timeout(1)
    @Threads(3)
    @BenchmarkMode(Mode.Throughput)
    @Measurement(iterations = 1,time = 2)
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void testForEach() {
        PS.foreach();
    }
}