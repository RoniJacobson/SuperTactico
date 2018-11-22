package com.laufer.itamar.engine;

import com.laufer.itamar.communication.server.GameServer;


public class Main {

    public static void main(String[] args){
	// write your code here
        //Todo do some tests here
        //Todo handle die of loader with safe boat
        GameServer server = new GameServer();
        server.runServer();
    }
    public static void printBoard(SuperTacticoGame game){
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                System.out.print(game.getLocTypeInLocation(new Location(i, j)));
            }
            System.out.println();
        }
    }
    public static<T> void printArr(T[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j].toString() + ',');
            }
            System.out.println();
        }
    }
}