/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icraus.Components;

/**
 *
 * @author Shoka
 */
public class ComponentNotFoundException extends Exception {

    public ComponentNotFoundException() {
        this("Component Not Found");
    }
    public ComponentNotFoundException(String s) {
        super(s);
    }
    
}
