/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3268.robot.subsystems;

import org.usfirst.frc.team3268.robot.Robot;
import org.usfirst.frc.team3268.robot.RobotMap;
import org.usfirst.frc.team3268.robot.commands.DrivingCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrainSubsystem extends Subsystem {
	Talon driveLeftFront;
	Talon driveLeftBack;
	Talon driveRightFront;
	Talon driveRightBack;
	SpeedControllerGroup driveLeft;
	SpeedControllerGroup driveRight;
	public DifferentialDrive drive;
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public DriveTrainSubsystem()
	{
		driveLeftFront 	= new Talon(RobotMap.PWM_driveLeftFront);
		driveLeftBack 	= new Talon(RobotMap.PWM_driveLeftBack);
		driveRightFront	= new Talon(RobotMap.PWM_driveRightFront);
		driveRightBack 	= new Talon(RobotMap.PWM_driveRightBack);
		driveLeft	= new SpeedControllerGroup(driveLeftFront, driveLeftBack);
		driveRight	= new SpeedControllerGroup(driveRightFront, driveRightBack);
		driveLeft.setInverted(true);
		driveRight.setInverted(true);
		drive = new DifferentialDrive(driveLeft, driveRight);
	}
	public void tankDrive(Joystick joy) {
		drive.tankDrive(joy.getY(), joy.getRawAxis(4));
	}

	/**
	 * Tank drive using individual joystick axes.
	 *
	 * @param leftAxis Left sides value
	 * @param rightAxis Right sides value
	 */
	public void tankDrive(double leftAxis, double rightAxis) {
		drive.tankDrive(leftAxis, rightAxis);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new DrivingCommand());
	}
}
