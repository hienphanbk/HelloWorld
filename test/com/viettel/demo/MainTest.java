package com.viettel.demo;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hienpt on 3/12/16.
 */
public class MainTest extends TestCase {

    @Test
    public void testF2c() throws Exception {
        assertEquals(45.5, Main.f2c(62.5));
    }
}