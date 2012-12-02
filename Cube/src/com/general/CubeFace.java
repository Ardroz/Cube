
package com.general;

public class CubeFace {
    
    String [][] cubieFace;
    char color;
    int i;
    int j;
    int counter;

    CubeFace(char newColor){
    
        cubieFace =  new String [3][3];
        color = newColor;
        counter = 0;

        for (i = 0;i < 3;i++){
            for (j = 0;j < 3;j++){
                counter++;
                cubieFace[i][j] = String.valueOf(counter).concat(String.valueOf(color).concat("1"));       
            }
        }
    }
        
    void printFace(){

  for (i = 0;i < 3;i++){
            for (j = 0;j < 3;j++){
                System.out.print(cubieFace[i][j] +" ");
            }
            
            System.out.println("");
        }
    }
    
    String up(String left,String center,String right){
        
        String lostPieces = "";
        
        
        lostPieces = this.cubieFace[0][0].concat(this.cubieFace[0][1].concat(this.cubieFace[0][2]));
        
        this.cubieFace[0][0] = left;
        this.cubieFace[0][1] = center;
        this.cubieFace[0][2] = right;  
        
        return lostPieces;
    }
    
    String down(String left,String center,String right){        
        
        String lostPieces = "";
        
        
        lostPieces = this.cubieFace[2][0].concat(this.cubieFace[2][1].concat(this.cubieFace[2][2]));
        
        this.cubieFace[2][0] = left;
        this.cubieFace[2][1] = center;
        this.cubieFace[2][2] = right;
        
        return lostPieces;
        
    }
    
    String right(String up,String center,String down){        
        
        String lostPieces = "";
        
        
        lostPieces = this.cubieFace[0][2].concat(this.cubieFace[1][2].concat(this.cubieFace[2][2]));
        
        this.cubieFace[0][2] = up;
        this.cubieFace[1][2] = center;
        this.cubieFace[2][2] = down;
        
        return lostPieces;
    }
    
    String left(String up,String center,String down){        
        
        String lostPieces = "";
        
        
        lostPieces = this.cubieFace[0][0].concat(this.cubieFace[1][0].concat(this.cubieFace[2][0]));
        
        this.cubieFace[0][0] = up;
        this.cubieFace[1][0] = center;
        this.cubieFace[2][0] = down;
        
        return lostPieces;
    }
    
    void rightSpin(){
        
        String [] positions = new String[9];
        int k;
        int i = 0;        
        
         for ( k = 0; k < 3; k++) {
            for (int j = 0; j < 3; j++) {                  
                positions[i] = this.cubieFace[k][j];
                i++;
            }
        } 
        
        int temporal = 9;
        
        for (i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.cubieFace[i][j] = positions[(temporal - 3)];
                temporal = temporal - 3;
            }
            temporal = temporal + 10;
        }
        
        String spin, newSpin;        
        
        for (i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                spin = String.valueOf(this.cubieFace[i][j].charAt(2));
                temporal = Integer.parseInt(spin);
                newSpin = String.valueOf(temporal + 1);
                
                if(newSpin.equals("5")){
                    newSpin = "1";
                }
                
                this.cubieFace[i][j] = this.cubieFace[i][j].substring(0, 2).concat(newSpin);
            }
        }
    }
    
    void leftSpin(){
         String [] positions = new String[9];
        int k;
        int i = 0;        
        
         for ( k = 0; k < 3; k++) {
            for (int j = 0; j < 3; j++) {                  
                positions[i] = this.cubieFace[k][j];
                i++;
            }
        }
        
        int temporal = -1;
        
        for (i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.cubieFace[i][j] = positions[(temporal + 3)];
                temporal = temporal + 3;
            }
            temporal = temporal - 10;
        }
        
        String spin, newSpin;        
        
        for (i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                spin = String.valueOf(this.cubieFace[i][j].charAt(2));
                temporal = Integer.parseInt(spin);
                newSpin = String.valueOf(temporal - 1);
                
                if(newSpin.equals("1")){
                    newSpin = "4";
                }
                
                this.cubieFace[i][j] = this.cubieFace[i][j].substring(0, 2).concat(newSpin);
            }
        }
    }

    void ninetyDegreesTurnToRight(){
        
        String spin, newSpin; 
        int temporal;
        
        for (i = 0; i < 3; i++) {
            
            spin = String.valueOf(this.cubieFace[i][2].charAt(2));
            temporal = Integer.parseInt(spin);
            newSpin = String.valueOf(temporal + 1);
                
            if(newSpin.equals("5")){
                newSpin = "1";
            }
                
            this.cubieFace[i][2] = this.cubieFace[i][2].substring(0, 2).concat(newSpin);
        }
    }
    
    void ninetyDegreesTurnToLeft(){
        
        String spin, newSpin; 
        int temporal;
        
        for (i = 0; i < 3; i++) {
            
            spin = String.valueOf(this.cubieFace[i][0].charAt(2));
            temporal = Integer.parseInt(spin);
            newSpin = String.valueOf(temporal + 1);
                
            if(newSpin.equals("5")){
                newSpin = "1";
            }
                
            this.cubieFace[i][0] = this.cubieFace[i][0].substring(0, 2).concat(newSpin);
        }
    }   
    
    void ninetyDegreesTurnToUp(){
        
        String spin, newSpin; 
        int temporal;
        
        for (i = 0; i < 3; i++) {
            
            spin = String.valueOf(this.cubieFace[0][i].charAt(2));
            temporal = Integer.parseInt(spin);
            newSpin = String.valueOf(temporal + 1);
                
            if(newSpin.equals("5")){
                newSpin = "1";
            }
                
            this.cubieFace[0][i] = this.cubieFace[0][i].substring(0, 2).concat(newSpin);
        }
    }
    
    void ninetyDegreesTurnToDown(){
        
        String spin, newSpin; 
        int temporal;
        
        for (i = 0; i < 3; i++) {
            
            spin = String.valueOf(this.cubieFace[2][i].charAt(2));
            temporal = Integer.parseInt(spin);
            newSpin = String.valueOf(temporal + 1);
                
            if(newSpin.equals("5")){
                newSpin = "1";
            }
                
            this.cubieFace[2][i] = this.cubieFace[2][i].substring(0, 2).concat(newSpin);
        }
    }
    
    void ninetyDegreesTurnToNegativeRight(){
        
        String spin, newSpin; 
        int temporal;
        
        for (i = 0; i < 3; i++) {
            
            spin = String.valueOf(this.cubieFace[i][2].charAt(2));
            temporal = Integer.parseInt(spin);
            newSpin = String.valueOf(temporal - 1);
                
            if(newSpin.equals("0")){
                newSpin = "4";
            }
                
            this.cubieFace[i][2] = this.cubieFace[i][2].substring(0, 2).concat(newSpin);
        }
    }
    
    void ninetyDegreesTurnToNegativeLeft(){
        
        String spin, newSpin; 
        int temporal;
        
        for (i = 0; i < 3; i++) {
            
            spin = String.valueOf(this.cubieFace[i][0].charAt(2));
            temporal = Integer.parseInt(spin);
            newSpin = String.valueOf(temporal - 1);
                
            if(newSpin.equals("0")){
                newSpin = "4";
            }
                
            this.cubieFace[i][0] = this.cubieFace[i][0].substring(0, 2).concat(newSpin);
        }
    }   
    
    void ninetyDegreesTurnToNegativeUp(){
        
        String spin, newSpin; 
        int temporal;
        
        for (i = 0; i < 3; i++) {
            
            spin = String.valueOf(this.cubieFace[0][i].charAt(2));
            temporal = Integer.parseInt(spin);
            newSpin = String.valueOf(temporal - 1);
                
            if(newSpin.equals("0")){
                newSpin = "4";
            }
                
            this.cubieFace[0][i] = this.cubieFace[0][i].substring(0, 2).concat(newSpin);
        }
    }
    
    void ninetyDegreesTurnToNegativeDown(){
        
        String spin, newSpin; 
        int temporal;
        
        for (i = 0; i < 3; i++) {
            
            spin = String.valueOf(this.cubieFace[2][i].charAt(2));
            temporal = Integer.parseInt(spin);
            newSpin = String.valueOf(temporal - 1);
                
            if(newSpin.equals("0")){
                newSpin = "4";
            }
                
            this.cubieFace[2][i] = this.cubieFace[2][i].substring(0, 2).concat(newSpin);
        }
    }
}