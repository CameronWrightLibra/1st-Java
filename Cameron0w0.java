/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cameron0w0;

import java.util.Scanner;

/**
 *
 * @author Robotics
 */
public class Cameron0w0 {
    public static void main (String[] args){
        System.out.println("Hello World!!"); 
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println(
                "Hello " 
                + name 
                + " nice to meet you");
    }

}
