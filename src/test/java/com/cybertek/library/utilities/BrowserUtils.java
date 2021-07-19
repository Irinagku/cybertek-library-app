package com.cybertek.library.utilities;

public class BrowserUtils {

    // copy what we have previously in this class

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
