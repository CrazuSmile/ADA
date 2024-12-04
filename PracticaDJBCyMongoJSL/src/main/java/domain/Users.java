/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author jojosl
 */
public class Users {
    private String dni;
    private String name;
    private String lastName;
    private String city;
     public Users(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Users(String dni) {
        this.dni = dni;
    }

    public Users(String dni, String name, String lastName, String city) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.city = city;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Users{" + "dni=" + dni + ", name=" + name + ", lastName=" + lastName + ", city=" + city + '}';
    }
    
    

   
}
