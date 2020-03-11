# TIC TAC TOE - Android - Kotlin Based Application
Tic Tac Toe is a 2-player game. Each player takes turn to mark a segment with X or O depending on their turn.

# Rules
- A game has nine fields in a 3x3 grid

- X always goes first.

- A player can take a field if not already taken

- A game is over when all fields in a row are taken by a player

- A game is over when all fields in a diagonal are taken by a player

- A game is over when all fields in a column are taken by a player

- A game is over when all fields are taken, If all nine squares are filled and neither player has three in a row or column or diagonal, the game is a draw

- Players take turns taking fields until the game is over

- There are two players in the game (X and O)

## Useful link
The complete description can be found here : https://github.com/WeSquad/tic-tac-toe-react

# Prerequisites
- 4 GB RAM minimum, 8 GB RAM recommended

- 2 GB of available disk space minimum, 4 GB Recommended (500 MB for IDE + 1.5 GB for Android SDK and emulator system image)
1280 x 800 minimum screen resolution

- Mac OS X 10.10 or higher

- Microsoft Windows 7/8/10 (32- or 64-bit). The Android Emulator supports 64-bit Windows only

- Android Studio

- Android SDK

- GIT Bash

- Android Emulator / Physical Device to test

# Run Application
Step-1: Open "Android studio" then choose "Check out project from Version control"

Step-2: From the options choose "Git", then provide the following url "https://github.com/2020-DEV-058/TicTacToe.git" and tap on "Clone"

Step-3: Once the checkout completes it should open up the project.

Step - 4: Click "Run App" from the toolbar to run the application on the Physical device or Emulator.

step - 5: Use touch to place "X"'s and "O"'s into the game board, Player 1 always goes "X" as first and Player 2 will have "O" to play the game. Result will be announced based on the above game rules and game will be restarted.

# Run Test Cases
Step-1: Click on "Run" option in toolbar and edit the run configure to point testcases within the application

Step-2: Please find the test class files and its path in below table:

| File Name  | File Path|
| ------------- | ------------- |
| CellTest  | "app/src/test/java/com.dev.tictactoe.model.CellTest"  |
| BoardTest  | "app/src/test/java/com.dev.tictactoe.model.BoardTest"  |
| PlayerTest  | "app/src/test/java/com.dev.tictactoe.model.PlayerTest"  |
| GameViewModelTest  | "app/src/test/java/com.dev.tictactoe.viewmodel.GameViewModelTest"  |

Step-3: You can choose to test all the cases by running the whole file or choose any particular test cases by opening it
