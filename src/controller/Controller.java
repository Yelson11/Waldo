/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import library.Character;
import library.CharacterFactory;
import model.Coordinate;
import model.Position;
import model.Stage;

/**
 *
 * @author Yelson
 */
public class Controller {
    private Controller controller;
    private CharacterFactory cf= new CharacterFactory();
    private ArrayList<Stage> stages= new ArrayList<>();
    
    private Controller(){
        chargeCharacters("src/datos/characters.txt");//carga los personajes
        chargeStages("src/datos/stage.txt"); //carga el escenario 1
    }
    
    public Controller getInstance(){
        if (controller == null){
            controller = new Controller();
        }
        return controller;
    }
    
    
    
    public ArrayList<Stage> getEscenarios(){
        return stages;
    }
    
    //añade un prototipo a la lista de prototipos
    private void createPrototype(String name, String image){
        Character c = new Character.CharacterBuilder()
                      .addName(name)
                      .addImage(image)
                      .build();
              cf.addPrototype(name, c);
    }
    
    //Carga de un txt los prototipos de los personajes
    private void chargeCharacters(String data){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
           // Apertura del fichero y creacion de BufferedReader para poder
           // hacer una lectura comoda (disponer del metodo readLine()).
           archivo = new File (data);
           fr = new FileReader (archivo);
           br = new BufferedReader(fr);

           // Lectura del fichero
           String linea;
          
           while((linea=br.readLine())!=null){
              String a[]= linea.split(","); 
              createPrototype(a[0],a[1]);
           }
              
        }
        catch(Exception e){
           e.printStackTrace();
        }finally{
           // En el finally cerramos el fichero, para asegurarnos
           // que se cierra tanto si todo va bien como si salta 
           // una excepcion.
           try{                    
              if( null != fr ){   
                 fr.close();     
              }                  
           }catch (Exception e2){ 
              e2.printStackTrace();
           }
        }
    }
    
    //carga un escenario desde un txt y lo guarda en la lista de escenarios
    private void chargeStages(String data){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        Stage stage;

        try {
           // Apertura del fichero y creacion de BufferedReader para poder
           // hacer una lectura comoda (disponer del metodo readLine()).
           archivo = new File (data);
           fr = new FileReader (archivo);
           br = new BufferedReader(fr);

           // Lectura del fichero
           String linea=br.readLine();
           String a[]=linea.split(",");
           stage = new Stage.StageBuilder()
                   .addName(a[0])
                   .addImage("src/images/"+a[1])
                   .build();
           while((linea=br.readLine())!=null){
              a= linea.split(","); 
              Character character= (Character) cf.getPrototype(a[0]);
              ArrayList<Coordinate> coordinates= Position.generatePositions(900, 600, Integer.parseInt(a[1]), 40);      
              stage.addCharacter(character, coordinates);
           }
           stages.add(stage);
        }
        catch(Exception e){
           e.printStackTrace();
        }finally{
           // En el finally cerramos el fichero, para asegurarnos
           // que se cierra tanto si todo va bien como si salta 
           // una excepcion.
           try{                    
              if( null != fr ){   
                 fr.close();     
              }                  
           }catch (Exception e2){ 
              e2.printStackTrace();
           }
        }
    }
}
