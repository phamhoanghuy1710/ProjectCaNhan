/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

/**
 *
 * @author HUY
 */
import java.io.Serializable;
public class customerInfo implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String birth;
    private String like;
    private String contact;
    private String heared;
    private String respond;
    
    
    public customerInfo (){
        firstName = "";
        lastName = "";
        email  = "";
        birth = "";
        contact = "";
        like = "";
        respond = "";
    }
    
    public customerInfo (String firstName, String lastName, String email, String birth, String like, String contact, String respond, String heared){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email  = email;
        this.birth = birth;
        this.like = like;
        this.contact = contact;
        this.heared = heared;
        if (respond == null){
            this. respond = "Thanks for your interest in our company";
        }
        else{
            this.respond = respond;
        }
    }
    
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail (String email){
        this.email = email;
    }
    public String getBirth(){
        return birth;
    }
    public void setBirth (String birth){
        this.birth = birth;
    }
    public String getRespond(){
        return respond;
    }
    public void setRespond (String respond){
        this.respond = respond;
    }
    public String getHeared(){
        return heared;
    }
    public void setHeared(String heared){
        this.heared = heared;
    }
    public String getLike(){
        return like;
    }
    public void setLike(String like){
        this.like = like;
    }
    public String getContact(){
        return contact;
    }
    public void setContact (String contact){
        this.contact = contact;
    }
}
