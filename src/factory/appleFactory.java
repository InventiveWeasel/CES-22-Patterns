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
public class appleFactory implements fruitFactory{
    
    @Override
    public apple createFruit(){
        return new apple();
    }

    
}
