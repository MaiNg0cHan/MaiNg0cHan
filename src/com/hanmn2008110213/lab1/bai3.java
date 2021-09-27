package com.hanmn2008110213.lab1;

public class bai3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        System.out.print("Cạnh của một khối lập phương là: ");
        double canh = scanner.nextDouble();
        double theTich = Math.pow(canh, 3);
        System.out.println("Thể tích của khối lập phương là: " +theTich);
    }
}