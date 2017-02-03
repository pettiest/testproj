package com.mycompany.app;

import org.apache.log4j.Logger;

/**
 * Created by arthi on 2/2/17.
 */
public class MyTest {
    final static Logger logger = Logger.getLogger(MyTest.class);

    public static void main(String[] args) {
        System.out.println("Value"+MyTest.class);
        logger.debug("This is debug : " );


    }

}
