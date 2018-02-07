package org.usfirst.frc.team2035.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import org.usfirst.frc.team2035.robot.RobotMap;

/**
 * drive train for the test bot.
 * @author Robbie Paul 
 */
public class DriveTrain extends Subsystem {

    private static Joystick stick;
    private SpeedController motorFLeft;
    private SpeedController motorMLeft;
    private SpeedController motorBLeft;
    private SpeedController motorFRight;
    private SpeedController motorMRight;
    private SpeedController motorBRight;
    private SpeedControllerGroup motorLeft;
    private SpeedControllerGroup motorRight;
    private DifferentialDrive drive;
        
    public DriveTrain() {
    	super("Drive Train");
    	stick = new Joystick(RobotMap.JOYSTICK1_USB_NUM);
    	motorFLeft = new VictorSP(RobotMap.F_LEFT_MOTOR_PWM);
    	motorMLeft = new VictorSP(RobotMap.M_LEFT_MOTOR_PWM);
    	motorBLeft = new VictorSP(RobotMap.B_LEFT_MOTOR_PWM);
    	motorFRight = new VictorSP(RobotMap.F_RIGHT_MOTOR_PWM);
    	motorMRight= new VictorSP(RobotMap.M_RIGHT_MOTOR_PWM);
    	motorBRight = new VictorSP(RobotMap.B_RIGHT_MOTOR_PWM);
    	
    	motorLeft = new SpeedControllerGroup(motorFLeft, motorMLeft, motorBLeft);
    	motorRight = new SpeedControllerGroup(motorFRight, motorMRight, motorBRight);
    	
    	drive = new DifferentialDrive(motorLeft, motorRight);
    	
    }

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	public void arcadeDrive() {
		drive.arcadeDrive(-stick.getY(), -stick.getX(), true);
	}
	public void arcadeDrive(int val1, int val2)
	{
		drive.arcadeDrive(val1, val2, true);
	}
    
}
