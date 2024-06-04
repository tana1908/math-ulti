
package com.microsoft.mathutil.main;

import com.microsoft.mathutil.core.MathUtility;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class MathUlti {
  //Cách 1:
//    public static void main(String[] args) {
//       //test case 01
//       // N = 0, EX Value = 1, Actual value = ? Status: Passed or Failed
//       int n = 0;
//       long expectedValue = 1;
//       long actualValue; // = ? chờ hàm trả về
//       actualValue = MathUtility.getFactorial(n);
//        System.out.println("0! | Expected: " + expectedValue + " | Actual value:: " + actualValue);
//        
//        //test case 02
//       // N = 1, EX Value = 1, Actual value = ? Status: Passed or Failed
//        n = 1;
//        expectedValue = 1;
//        actualValue = MathUtility.getFactorial(n); // = ? chờ hàm trả về
//        System.out.println("1! | Expected: " + expectedValue + " | Actual value:: " + actualValue);
//        //test case 03
//       // N = , EX Value = 120, Actual value = ? Status: Passed or Failed
//        n = 5;
//        expectedValue = 120;
//        actualValue = MathUtility.getFactorial(n); // = ? chờ hàm trả về
//        System.out.println("5! | Expected: " + expectedValue + " | Actual value:: " + actualValue);
//        
//        
//        
//        //test case 4
//       // N = 11, EX Value = Ngoại lệ, Actual value = ? Status: Passed or Failed
//        System.out.println("Check if the Illegal Argument Exception is thrown");
//         n = -1;
//        //expectedValue = 120;
//        actualValue = MathUtility.getFactorial(n); // = ? chờ hàm trả về
//        System.out.println("-1! | Actual value:: " + actualValue);
//        
//        
//    }
    //Cách 2: Test hàm = cách POPUP
    public static void main(String[] args) {
        int n = 0;
       long expectedValue = 1;
       long actualValue; // = ? chờ hàm trả về
       actualValue = MathUtility.getFactorial(n);
       
       String result = n + "! | Expected: " + expectedValue + " |Actual " + actualValue;
       
       JOptionPane.showMessageDialog(null, result);
    }
    
}
