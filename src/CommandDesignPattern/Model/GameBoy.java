package CommandDesignPattern.Model;

import CommandDesignPattern.Controller.Command;

public class GameBoy {
    private Command UpCommand, DownCommand, LeftCommand, RightCommand;

    public GameBoy(Command upCommand, Command downCommand,
                   Command leftCommand, Command rightCommand) {
        UpCommand = upCommand; // concrete Commands
        DownCommand = downCommand;
        LeftCommand = leftCommand;
        RightCommand = rightCommand;
    }

    public void arrowUp() {
        UpCommand.execute();

    }
    public void arrowDown() {
        DownCommand.execute();
    }

    public void arrowRight() {
        RightCommand.execute();
    }

    public void arrowLeft() {
        LeftCommand.execute();
    }


}
