import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void shouldReturnHelloWorld(){
        Person marcus = new Person();
        assertEquals("Hello world", marcus.helloWorld());
    }
}
