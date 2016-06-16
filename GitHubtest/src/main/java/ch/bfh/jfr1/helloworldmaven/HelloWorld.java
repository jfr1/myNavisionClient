/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bfh.jfr1.helloworldmaven;

/**
 *
 * @author rjfr1
 */
public class HelloWorld {

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        
        System.err.println(hello.sayHello());
    }
    
    public String sayHello(){
        return "Hello World"; 
    }

}
