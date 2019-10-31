/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Yelson
 */
public class Controller {
    private Controller controller;
    
    private Controller(){
        
    }
    
    public Controller getInstance(){
        if (controller == null){
            controller = new Controller();
        }
        return controller;
    }
}
