package pacman_game;

import java.util.Scanner;

public class Game_Runner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Maze_ m = new Maze_();
        Pacman_ pc = new Pacman_();
        Enemy en = new Enemy();
        System.out.println("""
        Select the level:
        a) Easy
        b) Medium
        c) Hard""");
        String choice = sc.nextLine();
        switch (choice){
            case "a":
                m.setlevel("easy");
                break;
            case "b":
                m.setlevel("medium");
                break;
            case "c":
                m.setlevel("hard");
                break;
            default:
                System.out.println("Invalid option choosen");
                break;
        }
        System.out.println(m);
        System.out.println(pc);
        System.out.println(en);
        m.setMaze();
        m.draw(pc,en);
        while(true) {
            en.Enemy_movement();
            pc.Pacman_movement();
            m.draw(pc,en);
            pc.result_director();
        }
    }
}
