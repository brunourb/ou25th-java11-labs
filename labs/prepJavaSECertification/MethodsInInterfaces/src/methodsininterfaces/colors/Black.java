/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodsininterfaces.colors;

/**
 *
 * @author redhat
 */
public interface Black {
    default void getColor(){
        System.out.print("Black");
    }    
}
