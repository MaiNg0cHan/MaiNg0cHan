package com.hanmn2008110213.lab2;

public class bai1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập hệ số b: ");
        int b = scanner.nextInt();
        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình có vô số nghiệm");
            } 
            else{
                 System.out.println("Phương trình vô nghiệm");
        
            }
         }   
         else{
              double nghiem = (double)-b/a;
              System.out.println("Phương trình có nghiệm x = " +nghiem);
            
        }     
    
    
    }
}
