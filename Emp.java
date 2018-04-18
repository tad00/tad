/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sup_kw4;

/**
 *
 * @author thean
 */
public class Emp extends Person{
    float salary;

    Emp(int id, String name, float salary){
        super(id, name);
        this.salary = salary;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
    
}
