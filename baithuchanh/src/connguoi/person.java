package connguoi;

import java.util.Scanner;

public class person {
    public String hoten;
    public int tuoi;
    public String namsinh;

    public void nhapthongtin() { 
    Scanner sc = new Scanner(System.in);
    System.out.println("hoten: ");
    hoten = sc.nextLine();
    System.out.println("tuoi: ");
    tuoi = sc.nextInt();
    System.out.println("namsinh: ");
    namsinh = sc.nextLine();

    sc.close();
    }
    public void inthongtin(){
    
        System.out.println("tuoi " + tuoi);
        System.out.println("hoten " + hoten);
        System.out.println("namsinh " + namsinh);
    }
}

