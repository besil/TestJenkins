package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by besil on 10/03/2016.
 */
public class FooTest {

    @org.junit.Test
    public void testBar() throws Exception {
        Foo foo = new Foo();
        assertEquals("bar", foo.bar());
    }

    @Test
    public void testFoo() {
        Foo foo = new Foo();
        assertEquals("foo", foo.foo());
    }
}