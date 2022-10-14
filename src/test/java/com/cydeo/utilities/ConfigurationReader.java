package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1st step, create object of properties class
    // we need properties class to use methods coming from class like load(), getProperties()
    //it is static because we are using it in static method
    //it is private because i will be using only in this class
    private static Properties properties = new Properties();

    //we want to open the properties file and load to properies object only once before reading
    //we are using static block because it runs once before everything
    static { // we need to put try catch in the block in order to get rid of the error
        try {
            //2nd step, create object of FileInputStream, we need it in order to open file as stream in Java memory
            FileInputStream file = new FileInputStream("configuration.properties");

            //3rd step , load the properties object using FileInputStream object
            //Load properties object with the file we opened using FileInputStream
            properties.load(file);

            //closing the file right away, java memory utilization
            file.close();
        } catch (IOException e) {

        }
    }
    public static String getProperty(String keyword){//will return value

        return properties.getProperty(keyword);
    }
}
