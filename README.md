# Pacman-Game
This is a simple Pacman game coded in Java where players control Pacman to eat food and avoid enemies in a maze. The game ends when Pacman eats all the food or collides with an enemy too many times.

Maze Class (Maze_): This class sets up the maze where the game takes place. It defines the size of the maze and places walls (⛓) around the borders and inside the maze. It also places food (🍦) for Pacman to eat.

Pacman Class (Pacman_): Pacman is the player-controlled character. It moves around the maze eating food and avoiding enemies. The player can move Pacman using the keyboard keys (F for forward, B for backward, D for downward, and U for upward). Pacman cannot move through walls (⛓). If Pacman hits a wall, it loses a warning, and if it loses all warnings, the game ends. If Pacman eats all the food, the player wins.

Enemy Class (Enemy): This class represents the enemy character that moves randomly around the maze. The enemy moves automatically and can also block Pacman's path. If Pacman collides with the enemy, the game ends.

Game Runner Class (Game_Runner): This is the main class that runs the game. It initializes the maze, Pacman, and the enemy. Then it allows the player to choose the difficulty level (easy, medium, or hard). After setting up everything, the game enters a loop where Pacman and the enemy take turns moving. The loop continues until either Pacman wins by eating all the food or loses by hitting the enemy too many times.

Overall, the goal of the game is to control Pacman to eat all the food while avoiding the enemy. If Pacman eats all the food, the player wins, but if Pacman hits the enemy too many times or runs out of warnings, the game ends.
