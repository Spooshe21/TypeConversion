/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  ExplicitTypeConversion.java
 *   Project:  Type Conversion Example
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

/**
 * This class demonstrates explicit type conversion in Java.
 */
package typeconvert;
public class ExplicitType {

    /**
     * The main method to demonstrate explicit type conversion.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Define a double value
        double d = 195.78;

        // Explicit type conversion from double to long
        long l = (long)d;

        // Explicit type conversion from long to int
        int i = (int)l;

        // Print the values
        System.out.println("Double value: " + d); // Global variable comment: Print the double value
        System.out.println("Long value: " + l);   // Global variable comment: Print the long value
        System.out.println("Int value: " + i);    // Global variable comment: Print the int value
    }
}
