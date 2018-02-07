package org.usfirst.frc.team2035.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import org.usfirst.frc.team2035.robot.Robot;
import org.usfirst.frc.team2035.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2035.robot.OI;

/**
 *
 */
public class StandardDrive extends Command {

	private final Joystick JOYSTICK;
    private final DifferentialDrive DRIVE;
    private final DriveTrain DRIVE_TRAIN;
    public static OI oi;
    public StandardDrive(DifferentialDrive d, Joystick j) {
        super("StandardDrive");
        DRIVE_TRAIN = Robot.getDriveTrain();
        requires(DRIVE_TRAIN);
        JOYSTICK = j;
        DRIVE = d;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    oi = new OI();
    }
    
    
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    DRIVE_TRAIN.arcadeDrive();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}