package yokra9.log4jna_sample;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LoggingTest {

    private Logging l = new Logging();

    @Test
    public void fatal() {
        l.fatal("fatal");
        assertTrue(true);
    }

    @Test
    public void error() {
        l.error("error");
        assertTrue(true);
    }

    @Test
    public void warn() {
        l.warn("warn");
        assertTrue(true);
    }

    @Test
    public void info() {
        l.info("info");
        assertTrue(true);
    }

    @Test
    public void debug() {
        l.debug("debug");
        assertTrue(true);
    }

    @Test
    public void trace() {
        l.trace("trace");
        assertTrue(true);
    }
}
