package snakeGame;

import javax.swing.*; //swing is the framework that makes desktop based application

public class SnakeGame extends JFrame { //To make frame we use JFrame, which is a class that imports from swing package
    SnakeGame(){
    super("Snake Game");
    add(new Board());
    pack(); //refresh the frame so that changes can be reflected

    setSize(300,300);
    setLocationRelativeTo(null);
    setVisible(true);

    }
}
