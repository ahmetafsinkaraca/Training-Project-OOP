/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training;

/**
 *
 * @author ahmet
 */
public class Program {
    
    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squad_sayisi;

    public Program(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squad_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squad_sayisi = squad_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public void setSquad_sayisi(int squad_sayisi) {
        this.squad_sayisi = squad_sayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public int getSquad_sayisi() {
        return squad_sayisi;
    }
    
    public void hareketyap(String hareket_turu, int sayı){
        if(hareket_turu.equals("Burpee")) {
            
           burpeeyap(sayı);
        }
        else if(hareket_turu.equals("Pushup")){
            
            pushupyap(sayı);
        }
        else if(hareket_turu.equals("Situp")){
            
            situpyap(sayı);
        }
        else if(hareket_turu.equals("Squad")){
            
            squadyap(sayı);
        }
        else
            System.out.println("işlem yapılamaz");
    }
    
    public void burpeeyap(int sayı){
        
        if(burpee_sayisi - sayı == 0){
            System.out.println("işlem tamam");
        }
        else if(burpee_sayisi - sayı < 0){
            System.out.println("fazladan çalışıldı");
            burpee_sayisi = 0;
            System.out.println("kalan sayı " + burpee_sayisi);
        }
        else{
            System.out.println("işlem daha bitmedi");
            burpee_sayisi -= sayı;
            System.out.println("kalan sayıııııı " + burpee_sayisi);
        }
    }
     
        public void pushupyap(int sayı){
        
        if(pushup_sayisi - sayı== 0){
            System.out.println("işlem tamam");
        }
        else if(pushup_sayisi - sayı < 0){
            System.out.println("fazladan çalışıldı");
            pushup_sayisi = 0;
            System.out.println("kalan sayı " + pushup_sayisi);
        }
        else{
            System.out.println("işlem daha bitmedi");
            pushup_sayisi -= sayı;
            System.out.println("kalan sayı " + pushup_sayisi);
        }
    }
        
        public void situpyap(int sayı){
        
        if(situp_sayisi - sayı == 0){
            System.out.println("işlem tamam");
        }
        else if(situp_sayisi - sayı < 0){
            System.out.println("fazladan çalışıldı");
            situp_sayisi = 0;
            System.out.println("kalan sayı " + situp_sayisi);
        }
        else{
            System.out.println("işlem daha bitmedi");
            situp_sayisi -= sayı;
            System.out.println("kalan sayı " + situp_sayisi);
        }
    }
        
        public void squadyap(int sayı){
        
        if(squad_sayisi - sayı == 0){
            System.out.println("işlem tamam");
        }
        else if(squad_sayisi - sayı < 0){
            System.out.println("fazladan çalışıldı");
            squad_sayisi = 0;
            System.out.println("kalan sayı " + squad_sayisi);
        }
        else{
            System.out.println("işlem daha bitmedi");
            squad_sayisi -= sayı;
            System.out.println("kalan sayı " + squad_sayisi);
        }
    }
        
        public boolean işlembittimi(){
            return((burpee_sayisi == 0) && (pushup_sayisi == 0) && (situp_sayisi == 0) && (squad_sayisi == 0));
        }
            
}
