package model;

import java.util.ArrayList;
import java.util.Random;

public class Position {
    private static Random random= new Random();
    private static ArrayList<Coordinate>total= new ArrayList<>();
    
    
    public static ArrayList<Coordinate> generatePositions(int width, int height, int count, int distance){
        ArrayList<Coordinate>resp= new ArrayList<>();
        for(int i=0;i<count;i++){
            resp.add(generateCoordinate(width-50,height-50, distance));
        }
        return resp;
    }
    
    private static Coordinate generateCoordinate(int width, int height, int distance){
        int x,y;
        Coordinate c;
        do{
             c= new Coordinate(random.nextInt(width),random.nextInt(height));
        }while( verifyCoordinate(c,distance));
        
        return c;
    }
    
    private static Boolean verifyCoordinate( Coordinate c, int distance){
        for(Coordinate p: total){
            if(c.compare(p.getX(), p.getY(),distance))return true;
        }
        return false;
    }
    
    public static void reset(){
        total= new ArrayList<>();
    }
    
    
}
