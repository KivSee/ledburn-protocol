package com.github.leddict;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class NetworkTest 
{
    Network network = new Network();

    @Test
    public void testNetwork()
    {
        assertNotEquals(network, null);
    }
}
