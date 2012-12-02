package com.general.cube;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

  public class SolveCube {

    public static void main(String[] args) throws IOException {
                
      Cube cube;
      String option;
      int die = 0;
        
      cube = new Cube();    
      cube.printCube();
        
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
      do{
        System.out.println("Type your desired move = R,B,L,F,U,D,R',B',L',F',U',D' or 'die' to end");
        option = bufferedReader.readLine();
            
        if(option.equals("R")){
          cube.f(1);
        }            
        if(option.equals("B")){
          cube.f(2);
        }
        if(option.equals("L")){
          cube.f(3);
        }
        if(option.equals("F")){
          cube.f(0);
        }
        if(option.equals("U")){
          cube.f(4);
        }
        if(option.equals("D")){
          cube.f(5);
        }
        if(option.equals("R'")){
          cube.f(1);
          cube.f(1);
          cube.f(1);
        }            
        if(option.equals("B'")){
          cube.f(2);
          cube.f(2);
          cube.f(2);
        }
        if(option.equals("L'")){
          cube.f(3);
          cube.f(3);
          cube.f(3);
        }
        if(option.equals("F'")){
          cube.f(0);
          cube.f(0);
          cube.f(0);
        }
        if(option.equals("U'")){
          cube.f(4);
          cube.f(4);
          cube.f(4);
        }
        if(option.equals("D'")){
          cube.f(5);
          cube.f(5);
          cube.f(5);
        }
        cube.imprimirCubo();
        
        if(option.equals("die")){
          die = 1;
        }
      }while(die != 1);
    }
  }