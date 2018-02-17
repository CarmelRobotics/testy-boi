/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2035.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team2035.robot.subsystems.*;
import org.usfirst.frc.team2035.robot.commands.*;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.DigitalInput;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends IterativeRobot {
	//Subsystems
	public static DriveTrain driver;
	
	public static OI oi;
	public static DigitalInput oneSwitch;
	public static DigitalInput twoSwitch;
	public static int prevCheck;
	
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		oi = new OI();
		driver = new DriveTrain();
		oneSwitch = new DigitalInput(RobotMap.ONE_SWITCH);
		twoSwitch = new DigitalInput(RobotMap.TWO_SWITCH);
		prevCheck = -1;
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {

	}

	
	@Override
	public void autonomousInit() {


		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */

		// schedule the autonomous command (example)
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() { //this is the repeated code during autonomous
	}  

	@Override
	public void teleopInit() { 
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override 
	public void teleopPeriodic() {
		Scheduler.getInstance().run();//This line is what causes teleop to loop through multiple times
		driver.arcadeDrive();
		if(!oneSwitch.get()&&!twoSwitch.get()) //SWITCH IS WIRED HIGH ON TEST BOT AS OF 2/10/18 IF COMMENT IS NOT REMOVED IT STILL IS.
		{
			System.out.println("Both True, this should not happen"); 
		}
		else if(!oneSwitch.get())
		{
			System.out.println("Switch one true.");
		}
		else if(!twoSwitch.get()) 
		{
			System.out.println("Switch two true");
		}
		else 
		{
			System.out.println("Both False"); 
		}
	}
 
	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
	public static DriveTrain getDriveTrain() { //method to return the drive train as a drive train.
		return driver;
	}
}