/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b2Laptrinhmangthread;

/**
 *
 * @author Admin
 */
public class B2_LapTrinhMang_Thread extends Thread{

    //tạo luongz
    @Override
    public void run(){
        System.out.println("Luong dang chay");
    }
    public static void main(String[] args) {
        B2_LapTrinhMang_Thread th=new B2_LapTrinhMang_Thread();
        //chay luong
        th.start();
    }
}
