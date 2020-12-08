package app;

import utils.PuzzleReader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class Day1App {

    public static final void main(String args[])  {
        try {
            partOne();
            partTwo();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static void partTwo() throws IOException, URISyntaxException {
        List<String> puzzle = PuzzleReader.readPuzzle("input1.txt");

        String puzzleLine = puzzle.get(0);

        int floor = 0;
        int counter = 0;
        for(char input : puzzleLine.toCharArray()) {
            if(input == '(') floor++;
            else if(input == ')') floor--;
            if(floor == -1) System.out.println(counter);
            counter++;
        }
        //System.out.println(floor);

    }

    public static void partOne() throws IOException, URISyntaxException {
        List<String> puzzle = PuzzleReader.readPuzzle("input1.txt");

        String puzzleLine = puzzle.get(0);

        int floor = 0;

        for(char input : puzzleLine.toCharArray()) {
            if(input == '(') floor++;
            else if(input == ')') floor--;
        }
        System.out.println(floor);
    }
}
