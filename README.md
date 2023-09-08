# Find the Tallest Mountain Game

This is a simple Kotlin program that finds the tallest mountain among a list of 8 mountains. The player inputs the mountain heights, and the program prints the index of the tallest mountain after each input.

## How It Works

1. The program starts an infinite loop representing the game.
2. During each iteration of the loop, the player inputs the height of each of the 8 mountains.
3. The heights are stored in a list called `mountainHeights`.
4. After the heights are input, the program finds the maximum height using the `maxOrNull()` function on the `mountainHeights` list.
5. Next, the program uses the `indexOf()` function to find the index of the maximum height in the `mountainHeights` list.
6. The index of the tallest mountain is printed as the program's output.
7. The loop continues until the program is manually terminated.

## How to Use

To run the program on your machine, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/DiegoOliveiraa/ChallengeTheDescent
