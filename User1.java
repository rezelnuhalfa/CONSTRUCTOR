/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.user1;

/**
 *
 * @author rezel
 */

    


public class User1 {

    private String username;
    private String password;
    
    public User1(){
        System.out.println("eksekusi method constractor");     
    }
    
    public void setUsername(String username){
    
        this.username = username;
    }
    
    public void setPassword(String password ){
    
        this.password = password;        
    }
    
    public String getUsername(){
    
        return this.username;
    }
    
    public String getPassword(){
    
        return this.password;
    }
    
    
}

