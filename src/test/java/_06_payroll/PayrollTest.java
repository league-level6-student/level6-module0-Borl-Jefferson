package _06_payroll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayrollTest {

    Payroll payroll = new Payroll();

    @Test
    void itShouldCalculatePaycheck() {
        //given
int hours = 5;
int wage = 20;
double expected = 100;
        //when
double actual = payroll.calculatePaycheck(wage, hours);
        //then
        assertEquals(actual, expected);
    }

    @Test
    void itShouldCalculateMileageReimbursement() {
        //given\
int miles = 10;
double expected = 5.75;
        //when
double actual = payroll.calculateMileageReimbursement(miles);
        //then
        assertEquals(actual, expected);
    }

    @Test
    void itShouldCreateOfferLetter() {
        //given
String name = "James";
double wage = 20;
String expected = "Hello James, We are pleased to offer you an hourly wage of 20.0";
        //when
String actual = payroll.createOfferLetter(name, wage);
        //then
        assertEquals(expected, actual);
    }

}