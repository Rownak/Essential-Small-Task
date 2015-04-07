/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doubletostring;

import java.io.File;

/**
 *
 * @author Rownak
 */
public class DoubleToString {
    public static void main(String[] args) {
        double total = 44.96893;
        String total2 = String.valueOf(total);
        System.out.println("String :" +total2);
        double total3 = Double.parseDouble(total2);
        System.out.println("Double : " +total3);
        System.out.println(File.separator);
    }
    
}
