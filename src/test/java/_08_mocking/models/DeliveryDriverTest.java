package _08_mocking.models;

import _07_intro_to_mocking.models.Car;
import _07_intro_to_mocking.models.Engine;
import _07_intro_to_mocking.models.GasTank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class DeliveryDriverTest {

    @Mock
    CellPhone cellPhone;

    @Mock
    GasTank gastank;

    @Mock
    Engine engine;

    @Mock
    DeliveryDriver driver;









    @BeforeEach
    void setUp() {
        //driver = new DeliveryDriver("James", new Car(new Engine(1.4, 4, 210, )), new CellPhone());
        MockitoAnnotations.openMocks(this);
        Car car = new Car(engine, gastank);
        driver = new DeliveryDriver("James", car, cellPhone);
    }

    @Test
    void itShouldWasteTime() {
        //given
boolean expected = true;
when(driver.cellPhone.browseCatMemes()).thenReturn(true);
        //when
boolean actual = driver.wasteTime();
        //then
        assertEquals(expected, actual);
    }

    @Test
    void itShouldRefuel() {
        //given
boolean expected = true;
        //when
when(driver.refuel(85)).thenReturn(true);
boolean actual = driver.refuel(85);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void itShouldContactCustomer() {
        //given

        //when

        //then
    }

}