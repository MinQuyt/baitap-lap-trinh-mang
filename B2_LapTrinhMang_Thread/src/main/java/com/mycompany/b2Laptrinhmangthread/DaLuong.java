/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.b2Laptrinhmangthread;

import java.io.IOException;
import java.nio.CharBuffer;

/**
 *
 * @author Admin
 */
public class DaLuong {
    public static void main(String[] args) {
        //goi luong
        Thread th1 = new Thread((Runnable) new DNRunable("Luong 1"));
        th1.start();
        Thread th2 = new Thread((Runnable) new DNRunable("Luong 2"));
        th2.start();
    }
}
class DNRunable implements Runnable{
    private String threadName;//quan li theo ten
    //ham khoi tao
    public DNRunable(String name){
        this.threadName=name;
    }
    @Override
       public void run(){
        System.out.println("Bat dau thuc hien cong viec trong "+threadName);
        //thuc hien cong viec cua luong
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + "; buoc "+i);
            try{
            Thread.sleep(1000);//nghỉ trong 1s
            }catch(Exception e){
                e.printStackTrace();
            }
            }
        System.out.println("Ket thuc cong viec cua "+threadName);
    }
    }


    
    
    
    
