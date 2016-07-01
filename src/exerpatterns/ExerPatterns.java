/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerpatterns;
import factory.*;
import factory.appleFactory;
/**
 *
 * @author Ana Cuder
 */
public class ExerPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        appleFactory aFac = new appleFactory();
        grapeFactory gFac = new grapeFactory();
        peachFactory pFac = new peachFactory();
        
        apple a;
        a = aFac.createFruit();
        
        grape g;
        g = gFac.createFruit();
        
        peach p;
        p = pFac.createFruit();
        
        
        
    }
    
}
