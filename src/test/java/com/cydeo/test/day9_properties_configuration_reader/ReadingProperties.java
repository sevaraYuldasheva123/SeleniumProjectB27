package com.cydeo.test.day9_properties_configuration_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file_test() throws IOException {

        //1st step, create object of properties class
        Properties properties = new Properties();

        //2nd step, create object of FileInputStream, we need it in order to open file as stream in Java memory
        FileInputStream file = new FileInputStream("configuration.properties");

        //3rd step , load the properties object using FileInputStream object
        //Load properties object with the file we opened using FileInputStream
        properties.load(file);

        properties.getProperty("browser");
    }
}
