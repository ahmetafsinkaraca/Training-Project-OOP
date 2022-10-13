/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package training;

import java.util.Scanner;

public class Training {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("İdman yapmaya hoş geldiniz");
        String idmanlar = "Geçerli Hareketler ..... \n"
                         +"Burpee\n"
                         +"Pushup\n"
                         +"Situp\n"
                         +"Squat\n";
        System.out.println("***********************");
        
        System.out.println("idman programı oluştur");
        
        System.out.print("Burpee sayısı gir: ");
        int burpee = scan.nextInt();
        System.out.print("Pushup sayısı gir: ");
        int pushup = scan.nextInt();
        System.out.print("Situp sayısı gir: ");
        int situp = scan.nextInt();
        System.out.print("Squat sayısı gir: ");
        int squat = scan.nextInt();
        scan.nextLine();
        
        Program program = new Program(burpee, pushup, situp, squat);
        
        System.out.println("programa başlayalım");
        
        while (program.işlembittimi() == false) { 
            
            System.out.println("hareket türünü gir");
            String tur = scan.nextLine();
            System.out.println("hareket sayısı");
            int sayı = scan.nextInt();
            scan.nextLine();
            program.hareketyap(tur, sayı);
            
            
            
        }
        System.out.println("programdan çıktınız");
    }
    
}
