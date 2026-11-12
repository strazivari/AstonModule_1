import org.example.Address;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {
    @Test
    void shouldChangeCity() {
        Address address = new Address("Moscow");

        address.setCity("Saratov");

        assertEquals(
                "Saratov",
                address.getCity()
        );
    }

    @Test
    void ShouldCreateIndependentCopy() {
        Address original = new Address("Moscow");

        Address copy = new Address(original);

        original.setCity("Saint-Petersburg");

        assertEquals("Moscow", copy.getCity());
        assertNotSame(original, copy);
    }

    @Test
    void shouldDeclineNullCity() {
        assertThrows(NullPointerException.class, () ->
                new Address((String) null)
        );
    }

    @Test
    void shouldDeclineBlankCity() {
        assertThrows(IllegalArgumentException.class, () ->
                new Address(
                        "   ")
        );
    }

    @Test
    void shouldDeclineNullInCopyConstructor() {
        assertThrows(NullPointerException.class, () ->
                new Address((Address) null)
        );
    }
}
