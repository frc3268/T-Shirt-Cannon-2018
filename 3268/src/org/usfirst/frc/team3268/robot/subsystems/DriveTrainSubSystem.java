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

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrainSubSystem extends Subsystem {
	Talon LeftMotor;
	Talon RightMotor;
	public DifferentialDrive drive;
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public DriveTrainSubSystem()
	{
		LeftMotor = new Talon(RobotMap.LeftMotor);
		RightMotor = new Talon(RobotMap.RightMotor);
		drive = new DifferentialDrive(LeftMotor,RightMotor);
	}
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new DrivingCommand());
	}
}
