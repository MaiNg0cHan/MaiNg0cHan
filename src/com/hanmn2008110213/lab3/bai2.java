package com.hanmn2008110213.lab3;

public class bai2 {
    public class bai2BangCuuChuong {
        public static void main(String[] args) {
            System.out.println("Bang cuu chuong");
            for(int i = 1; i <= 10;i++){
                System.out.printf("\nBANG NHAN %d\n", i);
                for(int j = 0; j < 10; j++){
                    System.out.printf("\t%d x %d = %d\n", i, j, i*j);
                }
            }
        }
}
