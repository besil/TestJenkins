package main;

import java.util.Properties;

/**
 * Created by besil on 10/03/2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.load(Main.class.getResourceAsStream("/environment.properties"));
        System.out.println(props.getProperty("environment.name"));
    }
}
