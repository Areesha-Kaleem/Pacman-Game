package pacman_game;

import java.util.Random;
import java.util.Scanner;

public class Enemy {
    Maze_ mm = new Maze_();
    protected String symbol = "👾";
    protected int move;
    protected int x = 3;
    protected int y = 1;
    protected int temp_Ex = x;
    protected int temp_Ey = y;

    @Override
    public String toString() {
        return "Enemy is here️👾!!";
    }
    public void Enemy_movement() {
        Random rn = new Random();
        this.move = rn.nextInt(4) + 1;
            switch (this.move) {
                case 1:
                    y++;
                    break;
                case 2:
                    y--;
                    break;
                case 3:
                    x++;
                    break;
                case 4:
                    x--;
                    break;
                default:
                    System.out.println("Invalid move. Try again.");
                    break;
            }
            this.enemy_pointer();
    }
    public void enemy_pointer() {
        Maze_.bound[temp_Ex][temp_Ey]="🍦";
        for (int i = 0; i < mm.m; i++) {
            for (int j = 0; j < mm.n; j++) {
                if (i == x && j == y) {
                    if (mm.bound[i][j] == "🍦") {
                        mm.bound[i][j] = symbol;
                        temp_Ex = i;
                        temp_Ey = j;
                    } else if (mm.bound[i][j] == "⛓") {
                        this.y = temp_Ey;
                        this.x = temp_Ex;
                    } else if (Maze_.bound[i][j] == " ") {
                        mm.bound[i][j] = symbol;
                        temp_Ex = i;
                        temp_Ey = j;
                    }
                }
            }
        }
    }
}
