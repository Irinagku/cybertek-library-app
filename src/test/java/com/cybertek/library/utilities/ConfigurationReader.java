package com.cybertek.library.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {



    //#1. Create properties object
    private static Properties properties = new Properties();

    static {
        //#2. Load the file into FileInputStream
        try {
            //#3. Load properties object with the file
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyWord) {
        return properties.getProperty(keyWord);
    }
}


