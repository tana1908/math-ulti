/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.microsoft.mathutil.core;
//quy tắc đặt tên package trong java

//.NET: chiều xuôi, chữ hoa từng đầu từ
//Microsoft.Sdk.
//
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
// Class này chứa các test case dùng để test code của class
// chính bên MathUtility
public class MathUtilityTest {
    
//Test case: là bộ data đầu vào + thoa tác nhập xuất trên app, màn hình, trên hàm
// để verify 1 hàm, màn hình, chức năng chạy đúng hay sai!!!!
//PE
    //Test case 1: Check/test getF() with n = 0
    // *Input/Given n = 0
    // *Steps/Procudure (bước test)
    // call method getFactorial(n)
    // *Expected Result : 1 (hy vọng 0! = 1)
    // *Actual Result: ??? chờ chạy hàm mới biết
    // *Status: passed | failed
     @Test //framework ép ta phải viết code theo 1 quy tắc nào đó
           // thư viện cho viết tự do, gọi hàm tự do
           // framwork là thử viện nhưng thư viện k hẳn là 1 framework
     public void testFactorialGivenRightArg0ReturnsWell() {
         assertEquals(1, MathUtility.getFactorial(0));
     }
     //Test case 2:
     public void testFactorialGivenRightArg1ReturnsWell() {
         assertEquals(1, MathUtility.getFactorial(1));
     }
     //Test case 3 :
     public void testFactorialGivenRightArg5ReturnsWell() {
         assertEquals(120, MathUtility.getFactorial(5));
     }
     public void testFactorialGivenRightArg12345ReturnsWell() {
         assertEquals(1, MathUtility.getFactorial(1));
         assertEquals(2, MathUtility.getFactorial(2));
         assertEquals(6, MathUtility.getFactorial(3));
         assertEquals(24, MathUtility.getFactorial(4));
         assertEquals(120, MathUtility.getFactorial(5));
     }
     
     
     //Thấy ngoại lệ mừng rơi nước mắt
     //Test case 5 : Check getF() with n = -1, the method throw Exception
     @Test
     public void testFactorialGivenWrongArg_1ThrowsException(){
         //MathUtility.getFactorial(-1);
         assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-1);});
     }
     

}
