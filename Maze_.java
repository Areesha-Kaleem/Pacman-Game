package pacman_game;

class Maze_ {
    protected static int m;
    protected static int n;
    public void setlevel(String choice){
        switch (choice) {
            case "easy":
                this.m = 15;
                this.n = 15;
                break;
            case "medium":
                this.m = 20;
                this.n = 20;
                break;
            case "hard":
                this.m = 30;
                this.n = 30;
                break;
            default:
                System.out.println("Invalid option choosen");
                break;
        }

    }

    public static String[][] bound;


    @Override
    public String toString() {
        return "Maze Loaded";
    }

    public void setMaze() {
        bound = new String[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) //i statements for top and bottom border
// j statements for left and right border
                {
                    bound[i][j] = "⛓"; //outer wall
                }
//Inner walls
                else if (i == 3 && j > 5 && j < 25) //third row
                {
                    bound[i][j] = "⛓";
                } else if (i == 16 && j > 5 && j < 25) //third last row
                {
                    bound[i][j] = "⛓";
                } else if (i == 2 && j == 6) {
                    bound[i][j] = "⛓";
                } else if (i == 2 && j == 24) {
                    bound[i][j] = "⛓";
                } else if (i == 17 && j == 6) {
                    bound[i][j] = "⛓";
                } else if (i == 17 && j == 24) {
                    bound[i][j] = "⛓";
                } else if (i > 3 && i < 16 && j == 2) {
                    bound[i][j] = "⛓";
                } else if (i > 3 && i < 16 && j == 27) {
                    bound[i][j] = "⛓";
                } else if (i > 5 && i < 14 && j == 5) {
                    bound[i][j] = "⛓";
                } else if (i > 5 && i < 14 && j == 25) // vertical left
                {
                    bound[i][j] = "⛓";
                } else if (i == 17 && j > 2 && j < 4) //vertical right
                {
                    bound[i][j] = "⛓";
                } else if (i == 17 && j > 2 && j < 4) {
                    bound[i][j] = "⛓";
                } else if (i == 7 && j > 6 && j < 11) {
                    bound[i][j] = "⛓";
                } else if (i > 7 && i < 12 && j == 10) {
                    bound[i][j] = "⛓";
                } else if (i == 11 && j > 10 && j < 16) {
                    bound[i][j] = "⛓";
                } else if (i == 14 && j > 6 && j < 10) {
                    bound[i][j] = "⛓";
                } else if (i == 13 && j == 9) {
                    bound[i][j] = "⛓";
                } else if (j == 7 && i < 13 && i > 8) {
                    bound[i][j] = "⛓";
                } else if (j == 13 && i > 5 && i < 9) {
                    bound[i][j] = "⛓";
                } else if (i == 8 && j > 13 && j < 18) {
                    bound[i][j] = "⛓";
                } else if (j == 17 && i > 8 && i < 15) {
                    bound[i][j] = "⛓";
                } else if (i == 14 && j > 17 && j < 23) {
                    bound[i][j] = "⛓";
                } else if (j == 19 && i > 8 && i < 12) {
                    bound[i][j] = "⛓";
                } else if (j > 19 && j < 25 && i == 6) {
                    bound[i][j] = "⛓";
                } else if (j > 14 && j < 19 && i == 5) {
                    bound[i][j] = "⛓";
                } else // Food
                {
                    bound[i][j] = "🍦"; //inner food
                }
            }

        }
    }

    public void draw(Pacman_ p, Enemy e) {
        bound[p.x][p.y] = p.symbol;
        bound[e.x][e.y] = e.symbol;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(bound[i][j] + " ");
            }
            System.out.println();
        }
    }
}
