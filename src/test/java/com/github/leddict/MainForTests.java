package com.github.leddict;

public class MainForTests {

    public static void main(String [] args) {
        Network n = new Network();
        n.configureControllerWithIp("215", "10.0.0.215");

        FSTColor colors[] = new FSTColor[100];
        for(int i=0; i<colors.length; i++) {
            colors[i] = new FSTColor();
            colors[i].first = (byte)255;
            colors[i].second = (byte)0;
            colors[i].third = (byte)0;
        }
        while(true) {
            n.addSegment("215", colors, 0, 0);
            n.send();
            try {
                Thread.sleep(1000 / 30);
            }
            catch (InterruptedException e) {
                System.out.println("exception: " + e.getMessage());
            }
        }
    }
}
