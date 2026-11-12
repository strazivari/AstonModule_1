import org.example.Address;
import org.example.ImmutableOrder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ImmutableOrderTest {

    @Test
    void shouldKeepOriginalAddress(){
        Address address = new Address("Moscow");

        ImmutableOrder order = new ImmutableOrder(
                "Vlad",
                "88005553535",
                address);

        address.setCity("Magadan");

        assertEquals("Moscow", order.getAddress().getCity());
    }

    @Test
    void ProtectFromGet() {
        ImmutableOrder order = new ImmutableOrder(
                "Vlad",
                "88005553535",
                new Address ("Moscow"));

        Address received = order.getAddress();
        received.setCity("Saint-Petersburg");

        assertEquals("Moscow", order.getAddress().getCity());
    }

    @Test
    void shouldBeDifferent() {
        ImmutableOrder order = new ImmutableOrder(
                "Vlad",
                "88005553535",
                new Address("Moscow")
        );

        Address first = order.getAddress();
        Address second = order.getAddress();

        assertNotSame(first, second);
    }

    @Test
    void shouldStoreCorrectData() {
        ImmutableOrder order = new ImmutableOrder(
                "Vlad",
                "88005553535",
                new Address("Moscow")
        );

        assertEquals(
                "Vlad",
                order.getName()
        );
        assertEquals(
                "88005553535",
                order.getPhone()
        );
        assertEquals(
                "Moscow",
                order.getAddress().getCity()
        );

    }

    @Test
    void shouldDeclineNullAddress() {
        assertThrows(NullPointerException.class, () ->
                new ImmutableOrder(
                        "Vlad",
                        "88005553535",
                        null
                ));
    }

    @Test
    void shouldDeclineBlankName() {
        assertThrows(NullPointerException.class, () ->
                new ImmutableOrder(
                        "Vlad",
                        null,
                        new Address("Moscow")
                ));
    }
}
