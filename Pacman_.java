package pacman_game;

import java.util.Scanner;

public class Pacman_ {
    Enemy e = new Enemy();
    Maze_ mm = new Maze_();
    protected int food_counter = 0;
    private int warnings = 5;
    private int win_condition = 333;
    protected String symbol = "🦸🏻‍♂️";
    protected String move;
    protected int x = 1;
    protected int y = 1;
    protected int temp_px = x;
    protected int temp_py = y;
    Scanner sc = new Scanner(System.in);

    @Override
    public String toString() {
        return "Pacman is ready🦸🏻‍♂️!!";
    }

    public void Pacman_movement() {
            System.out.print("Where you wanna move (F= forward, B= backward ,D= downward, U= upward): ");
            this.move = sc.next();

            switch (this.move.toUpperCase()) {
                case "F":
                    y++;
                    break;
                case "B":
                    y--;
                    break;
                case "D":
                    x++;
                    break;
                case "U":
                    x--;
                    break;
                default:
                    System.out.println("Invalid move. Try again.");
                    break;
            }

            this.pacman_pointer();
        }


    public void pacman_pointer() {
        Maze_.bound[temp_px][temp_py] = " ";
        for (int i = 0; i < mm.m; i++) {
            for (int j = 0; j < mm.n; j++) {
                if (i == x && j == y) {
                    if (mm.bound[i][j] == "🍦") {
                        mm.bound[i][j] = symbol;
                        temp_px = i;
                        temp_py = j;
                        food_counter++;
                    } else if (mm.bound[i][j] == "⛓") {
                        System.out.println("Hurdle🤕");
                        warnings--;
                        this.y = temp_py;
                        this.x = temp_px;

                    } else if (Maze_.bound[i][j] == "👾") {
                        System.out.println("Attacked by enemy 😥");
                        System.out.println("Game over💣");
                        System.exit(0);
                    } else if (Maze_.bound[i][j] == " ") {
                        mm.bound[i][j] = symbol;
                        temp_px = i;
                        temp_py = j;
                    }
                }
            }
        }
    }
    public void result_director(){
        if (food_counter == win_condition) {
            System.out.println("Pacman Won🎉!");
            System.exit(0);
        } else if (warnings == 0) {
            System.out.println("Game over💣");
            System.exit(0);
        }
    }
}

