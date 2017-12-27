package com.github.leddict;
/*
FSTColor is a shorthand for "First Second Third - Color".
It represent a single color, exactly as it will be transmitted on the wire to the addressable pixel chip.
The ws2812 protocol and similar enable a controller to transmit color data to each of the pixels in the string.
The colors are transmitted serially, setting 3 byte values for each of the 'red', 'green', and 'blue' diodes in each
pixel, which is 24 bits in total per pixel.
Unfortunately, the order of the red green and blue in this 24 bits is not standardized, leaving each manufacture to
implement it as he like.
In the ledburn protocol, the controller is not aware of the actual pixel hardware that is connected to it.
It receives the data and transmit it to the leds "as is", without any manipulations.
It is the responsibility of the sender to perform any corrections, so the actual color on the pixel will be as required.

This class is called FST, to emphasize that the RGB order should not be assumed automatically by the sender,
and that it is his job to understand the correct order for each pixel.

The 6 possible arrangements are: RGB, GRB, RBG, GBR, BRG, BGR.
I'v only seen RGB and GRB on real hardware.
 */
public class FSTColor {
    public byte first;
    public byte second;
    public byte third;
}
