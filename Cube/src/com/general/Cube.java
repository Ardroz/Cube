
package com.general;

  public class Cube {
      
    CubeFace [] Cubeface = new CubeFace[6];

    Cube(){
      Cubeface[0] = new CubeFace('B');
      Cubeface[1] = new CubeFace('R');
      Cubeface[2] = new CubeFace('G');
      Cubeface[3] = new CubeFace('O');
      Cubeface[4] = new CubeFace('Y');
      Cubeface[5] = new CubeFace('W');
    }
    
    public void printCube(){
      Cubeface[4].printFace();
      
      
      
      
      System.out.print("\n");
      
      for (int l = 0; l < 3; l++) {
        for (int i = 0; i < 4; i++) {                
          for (int j = 0; j < 3; j++) {                
            System.out.print(Cubeface[i].cubieFace[l][j]+ " ");
          }
          System.out.print("\t");
        }
        System.out.print("\n");
      }
     
      
      System.out.println("\n");
      Cubeface[5].printFace();
      System.out.print("\n//////////////////////////////////////////\n");
    }
    
    public void f(int faceToTurn) {
        
      String lostPieces;
      int faceToRight = 0, faceToLeft = 0;
      
      lostPieces = "";
      
      Cubeface[faceToTurn].rightSpin();
      
      faceToRight = faceToTurn + 1;   
      faceToLeft = faceToTurn - 1;
      
      if(faceToRight == 4){
        faceToRight = 0;
      }
      
      if(faceToLeft == -1){
        faceToLeft = 3;
      }
        
      switch(faceToTurn){
        case 0: // F move
          lostPieces = Cubeface[faceToRight].left(Cubeface[4].cubieFace[2][0],Cubeface[4].cubieFace[2][1],Cubeface[4].cubieFace[2][2]);
          Cubeface[faceToRight].ninetyDegreesTurnToLeft();
          
          lostPieces = Cubeface[5].up(lostPieces.substring(6,9), lostPieces.substring(3, 6), lostPieces.substring(0,3));
          Cubeface[5].ninetyDegreesTurnToUp();
          
          lostPieces = Cubeface[faceToLeft].right(lostPieces.substring(0, 3), lostPieces.substring(3, 6), lostPieces.substring(6,9));
          Cubeface[faceToLeft].ninetyDegreesTurnToRight();
          
          lostPieces = Cubeface[4].down(lostPieces.substring(6, 9), lostPieces.substring(3, 6), lostPieces.substring(0,3));
          Cubeface[4].ninetyDegreesTurnToDown();
        break;
            
        case 1: // R move
          lostPieces = Cubeface[faceToRight].left(Cubeface[4].cubieFace[2][2],Cubeface[4].cubieFace[1][2],Cubeface[4].cubieFace[0][2]);
          Cubeface[faceToRight].ninetyDegreesTurnToLeft();
          Cubeface[faceToRight].ninetyDegreesTurnToLeft();
          
          lostPieces = Cubeface[5].right(lostPieces.substring(6,9), lostPieces.substring(3, 6), lostPieces.substring(0,3));
          Cubeface[5].ninetyDegreesTurnToRight();
          Cubeface[5].ninetyDegreesTurnToRight();
          
          lostPieces = Cubeface[faceToLeft].right(lostPieces.substring(0, 3), lostPieces.substring(3, 6), lostPieces.substring(6,9));
          
          lostPieces = Cubeface[4].right(lostPieces.substring(0, 3), lostPieces.substring(3, 6), lostPieces.substring(6,9));
        break;
            
        case 2: // B move
          lostPieces = Cubeface[faceToRight].left(Cubeface[4].cubieFace[0][2],Cubeface[4].cubieFace[0][1],Cubeface[4].cubieFace[0][0]);
          Cubeface[faceToRight].ninetyDegreesTurnToNegativeLeft();
          
          lostPieces = Cubeface[5].down(lostPieces.substring(0,3), lostPieces.substring(3, 6), lostPieces.substring(6,9));
          Cubeface[5].ninetyDegreesTurnToNegativeDown();
          
          lostPieces = Cubeface[faceToLeft].right(lostPieces.substring(6,9), lostPieces.substring(3, 6), lostPieces.substring(0,3));
          Cubeface[faceToLeft].ninetyDegreesTurnToNegativeRight();
          
          lostPieces = Cubeface[4].up(lostPieces.substring(0,3), lostPieces.substring(3, 6), lostPieces.substring(6,9));
          Cubeface[4].ninetyDegreesTurnToNegativeUp();
        break;
            
        case 3: // L
          lostPieces = Cubeface[faceToRight].left(Cubeface[4].cubieFace[0][0],Cubeface[4].cubieFace[1][0],Cubeface[4].cubieFace[2][0]);
          
          lostPieces = Cubeface[5].left(lostPieces.substring(0,3), lostPieces.substring(3, 6), lostPieces.substring(6,9));
          
          lostPieces = Cubeface[faceToLeft].right(lostPieces.substring(6,9), lostPieces.substring(3, 6), lostPieces.substring(0,3));
          Cubeface[faceToLeft].ninetyDegreesTurnToRight();
          Cubeface[faceToLeft].ninetyDegreesTurnToRight();
          
          lostPieces = Cubeface[4].left(lostPieces.substring(6,9), lostPieces.substring(3,6), lostPieces.substring(0,3));
          Cubeface[4].ninetyDegreesTurnToLeft();
          Cubeface[4].ninetyDegreesTurnToLeft();            
        break;
            
        case 4: //U move              
          lostPieces = Cubeface[0].up(Cubeface[1].cubieFace[0][0], Cubeface[1].cubieFace[0][1], Cubeface[1].cubieFace[0][2]);
          lostPieces = Cubeface[3].up(lostPieces.substring(0,3), lostPieces.substring(3, 6), lostPieces.substring(6,9));
          lostPieces = Cubeface[2].up(lostPieces.substring(0,3), lostPieces.substring(3, 6), lostPieces.substring(6,9));
          lostPieces = Cubeface[1].up(lostPieces.substring(0,3), lostPieces.substring(3, 6), lostPieces.substring(6,9));
        break;
            
        case 5: //D move                
          lostPieces = Cubeface[0].down(Cubeface[3].cubieFace[2][0], Cubeface[3].cubieFace[2][1], Cubeface[3].cubieFace[2][2]);
          lostPieces = Cubeface[1].down(lostPieces.substring(0,3), lostPieces.substring(3, 6), lostPieces.substring(6,9));
          lostPieces = Cubeface[2].down(lostPieces.substring(0,3), lostPieces.substring(3, 6), lostPieces.substring(6,9));
          lostPieces = Cubeface[3].down(lostPieces.substring(0,3), lostPieces.substring(3, 6), lostPieces.substring(6,9));
        break;
      }
    }
  }