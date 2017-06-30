package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by bulat15g on 6/30/17.
 */
public class Map {
   public static final int DimentionX=3,DimentionY=3;

   public ArrayList<ArrayList<Integer>> map=new ArrayList<>();

   public void setMap(){
       for (int i = 0; i < DimentionX; i++) {
           map.add(new ArrayList<Integer>());
           for (int j = 0; j < DimentionY; j++) {
               map.get(i).add(0);
           }
       }
   }

   public void show(){
       for (int i = 0; i < DimentionX; i++) {
           for (int j = 0; j < DimentionY; j++) {
               System.out.print(map.get(i).get(j)+"  ");
           }
           System.out.print("\n");
       }
   }



}
