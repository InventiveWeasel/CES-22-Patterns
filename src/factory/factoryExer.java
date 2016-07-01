/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author Ana Cuder
 */
public class factoryExer {
    public static void main(String args[]){
        appleFactory aFac = new appleFactory();
        grapeFactory gFac = new grapeFactory();
        peachFactory pFac = new peachFactory();
        
        apple a;
        a = aFac.createFruit();
        
        grape g;
        g = gFac.createFruit();
        
        peach p;
        p = pFac.createFruit();
        
        a.showInfo();
        g.showInfo();
        p.showInfo();
    }
}
