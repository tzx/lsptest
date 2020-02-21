package lsptest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class FoobarTest {
    @Test
    public void testSum() {
       assertEquals(5+5, Foobar.add(5, 5));
    }
}
