package model;

import java.util.ArrayList;
import java.util.HashMap;
import library.IBuilder;
import library.Character;


public class Stage {
   
    private String image;
    private String name;
    private HashMap<Character,ArrayList<Coordinate>> characters;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Stage() {
    }

    public Stage(String image, String name, HashMap<Character, ArrayList<Coordinate>> characters) {
        this.image = image;
        this.name = name;
        this.characters = characters;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Character, ArrayList<Coordinate>> getCharacters() {
        return characters;
    }

    public void setCharacters(HashMap<Character, ArrayList<Coordinate>> characters) {
        this.characters = characters;
    }
    
    public void addCharacter(Character c, ArrayList<Coordinate> cr){
        this.characters.put(c, cr);
    }    
    
    public static class StageBuilder implements IBuilder<Stage>{
        private String image="";
        private String name="";
        private HashMap<Character,ArrayList<Coordinate>> characters= new HashMap<>();

        public StageBuilder() {
        }
        
        
        
        public StageBuilder addName(String name){
            this.name= name;
            return this;
        }
        
        public StageBuilder addImage(String image){
            this.image= image;
            return this;
        }
        
        public StageBuilder addCharacter(Character c, ArrayList<Coordinate> cr){
            this.characters.put(c, cr);
            return this;
        }
        
        @Override
        public Stage build(){
            return new Stage(name,image,characters);
        }
    }
    
}
