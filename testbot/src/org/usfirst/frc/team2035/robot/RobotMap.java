/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2035.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	/**
	 * Motor/Speed Controller PWMs
	 * Number for each of these needs to be the corresponding PWM slot
	 */
	public static final int F_LEFT_MOTOR_PWM = 0;
	public static final int M_LEFT_MOTOR_PWM = 1;
	public static final int B_LEFT_MOTOR_PWM = 2;
	public static final int F_RIGHT_MOTOR_PWM = 3; 
	public static final int M_RIGHT_MOTOR_PWM = 4;
	public static final int B_RIGHT_MOTOR_PWM = 5;

	
	/*
	 * Joysticks and Joystick Buttons	
	 */
	public static final int JOYSTICK1_USB_NUM = 0;
	public static final Joystick JOYSTICK1 = new Joystick(JOYSTICK1_USB_NUM);
		public static final JoystickButton EXAMPLE = new JoystickButton(JOYSTICK1, 1);
		

}