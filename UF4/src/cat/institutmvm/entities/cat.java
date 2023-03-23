/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.entities;

/**
 *
 * @author alumne_1r
 */
public class cat extends moviment {
    private String name, breed, favoriteFood;
    private int age;
    //fcom tabular
    
    public String getName(){
        return name;
    }
    public void setName(String name){
    this.name=name;
    }
    
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
    this.breed=breed;
    }
    
    public String getFavoriteFood(){
        return favoriteFood;
    }
    public void setFavoriteFood(String favoriteFood){
    this.favoriteFood=favoriteFood;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
    this.age=age;
    }
    
    public cat(String name, String breed, String favoriteFood, int age){
    name=this.getName();
    breed=this.getBreed();
    favoriteFood=this.getFavoriteFood();
    age=this.getAge();   
    }
    
    public static void sound(){
        System.out.println("miau");
    }
    
    public static void play(){
        System.out.println("jugamos");
    }
    public static void wash(){
        System.out.println("Lavame");
    }
    public static void eat(){
        System.out.println("ñam");
    }
    public static void hunt(){
        System.out.println("hunt");
    }

    @Override
    public void tipusMoviment() {
        System.out.println("potes");
    }
    
}