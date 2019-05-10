/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchdemo;

/**
 *
 * @author Patrick
 */
public class Food {
    String Food;
    int Oz;
    Food(String f, int o){
        Food = f;
        Oz = o;
    }
    
    public String getFood(){
        return Food;
    }
    public int getOz(){
        return Oz;
    }
}
