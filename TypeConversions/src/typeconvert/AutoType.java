/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  AutomaticTypeConversion.java file
 *   Project:  Type Conversion Example
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

/**
 * This class demonstrates automatic type conversion in Java.
 */
package typeconvert;
public class AutoType {

    /**
     * The main method to demonstrate automatic type conversion.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Initialize an integer value
        int i = 156;

        // Automatic type conversion
        // Integer to long type
        long l = i;

        // Automatic type conversion
        // long to float type
        float f = l;

        // Print the values
        System.out.println("Int value: " + i); // Global variable comment: Print the integer value
        System.out.println("Long value: " + l); // Global variable comment: Print the long value
        System.out.println("Float value: " + f); // Global variable comment: Print the float value
    }
}



