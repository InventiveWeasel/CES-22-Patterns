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
public class peachFactory implements fruitFactory{
    @Override
    public peach createFruit(){
        return new peach();
    }
    
}
