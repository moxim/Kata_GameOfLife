package com.pdg.software.kata.gameoflife;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Game Of Life Kata!");
        System.out.println("""
                The Game of Life is a cellular automaton devised by the British mathematician John Horton Conway in 1970.
                The game is a zero-player game, meaning that its evolution is determined by its initial state, requiring no further input.

                Rules:
                1. Any live cell with fewer than two live neighbours dies, as if by underpopulation.
                2. Any live cell with two or three live neighbours lives on to the next generation.
                3. Any live cell with more than three live neighbours dies, as if by overpopulation.
                4. Any dead cell with exactly three live neighbours becomes a live cell.

                You should write a program that can accept an arbitrary grid of cells, and will output a similar grid showing the next generation.
                """);
    }
}
