/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.b2Laptrinhmangthread;

/**
 *
 * @author Admin
 */
public class TinhTongMang {
    public static void main(String[] args) {
        //khai bao mang so nguyen
        int[] array={1,2,3,4,5,6,7,8,9,10};
        //so luong luong
        int numThread=2;
        //mang luong
        Thread[] ths=new Thread[numThread];
        //2 luong tuong ung voi 2 Runanble
        SumCaculator[] cals = new SumCaculator[numThread];
        //chay cac luong
        for (int i = 0; i < numThread; i++) {
            cals[i]= new SumCaculator(array, i, numThread);
            ths[i] = new Thread(cals[i]);
            ths[i].start();//bat dau luong
        }
        for (int i = 0; i < numThread; i++) {
            try{
                ths[i].join();//cho luong ket thuc
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        //tinh tong ket thuc
        int totalSum=0;
        for (SumCaculator cal : cals) {
            totalSum += cal.getTong1Phan();
        }
        //in ra
        System.out.println("Tong mang la:"+totalSum);
     }
}
class SumCaculator implements  Runnable{
    private int[] array;
    private int startIndex;
    private int chia;
    private int tong1phan;

    public SumCaculator(int[] array, int startIndex, int chia) {
        this.array = array;
        this.startIndex = startIndex;
        this.chia = chia;
        this.tong1phan = 0;
    }
    
    @Override
    public void run() {
        //tinh tong cua cac phan tu mang dua tren index
        for (int i = startIndex; i < array.length; i+=chia) {
            tong1phan += array[i];
        }
    }
    public int getTong1Phan(){
        return tong1phan;
    }
}