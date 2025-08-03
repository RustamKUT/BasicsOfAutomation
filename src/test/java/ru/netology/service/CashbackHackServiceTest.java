package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void testBoundaryValuesFirst() {
        org.junit.Assert.assertThrows(RuntimeException.class, () -> {
            service.remain(-1);
        });
    }

    @org.junit.Test
    public void testBoundaryValuesSecond() {
        org.junit.Assert.assertEquals(service.remain(0), 1000);
    }

    @org.junit.Test
    public void testBoundaryValuesThird() {
        org.junit.Assert.assertEquals(service.remain(1), 999);
    }

    @org.junit.Test
    public void testnBoundaryValuesFourth() {
        org.junit.Assert.assertEquals(service.remain(999), 1);
    }

    @org.junit.Test
    public void testBoundaryValuesFifth() {
        org.junit.Assert.assertEquals(service.remain(1000), 0);
    }

    @org.junit.Test
    public void testBoundaryValuesSixth() {
        org.junit.Assert.assertEquals(service.remain(1001), 999);
    }

    @org.junit.Test
    public void testRemainCriticalPath() {
        org.junit.Assert.assertEquals(service.remain(400), 600);
    }
}
