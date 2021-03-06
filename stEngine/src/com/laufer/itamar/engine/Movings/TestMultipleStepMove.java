package com.laufer.itamar.engine.Movings;

import com.laufer.itamar.engine.LocType;
import com.laufer.itamar.engine.Location;
import com.laufer.itamar.engine.Pieces.Piece;
import com.laufer.itamar.engine.Pieces.TourPlane;
import com.laufer.itamar.engine.Square;
import com.laufer.itamar.engine.SuperTacticoGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.laufer.itamar.engine.Location.generateLocation;
import static org.junit.jupiter.api.Assertions.*;

class TestMultipleStepMove {
    private SuperTacticoGame game;
    @Test
    public void testCanMoveSingleStep(){
        Piece multiStepper = new TourPlane(game, game.getCurrentPlayer(), generateLocation(0, 0), 0);
        assertTrue(multiStepper.canMove(generateLocation(1, 0)));
    }
    @Test
    public void testCannotMoveDiagonally(){
        Piece multiStepper = new TourPlane(game, game.getCurrentPlayer(), generateLocation(0, 0), 0);
        assertFalse(multiStepper.canMove(generateLocation(1, 1)));
    }
    @Test
    public void testCanMoveMoreThanSingleStep(){
        Piece multiStepper = new TourPlane(game, game.getCurrentPlayer(), generateLocation(0, 0), 0);
        assertTrue(multiStepper.canMove(generateLocation(8, 0)));
    }
    @Test
    public void testCannotMoveAbovePieces(){
        fail("needs to be implemented"); //todo implement
    }
    @BeforeEach
    public void init(){
        Square[][]allLandBoard = new Square[20][20];
        for(int i=0; i<allLandBoard.length; i++){
            for(int j=0;j<allLandBoard[i].length;j++){
                allLandBoard[i][j] = new Square(LocType.LAND);
            }
        }
        game = new SuperTacticoGame(allLandBoard);
    }
}