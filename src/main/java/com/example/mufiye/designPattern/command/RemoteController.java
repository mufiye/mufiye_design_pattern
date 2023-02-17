package com.example.mufiye.designPattern.command;

public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    // 初始化
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for(Command command : onCommands) {
            command = new NoCommand();
        }
        for(Command command : offCommands) {
            command = new NoCommand();
        }
    }

    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    public void onButtonWasPushed(int no) {
        onCommands[no].execute();
        undoCommand = onCommands[no];
    }

    public void offButtonWasPushed(int no) {
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
