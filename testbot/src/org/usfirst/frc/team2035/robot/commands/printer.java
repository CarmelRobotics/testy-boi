package org.usfirst.frc.team2035.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class printer extends Command {
    public printer() {

    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    System.out.println("also yeet");
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
