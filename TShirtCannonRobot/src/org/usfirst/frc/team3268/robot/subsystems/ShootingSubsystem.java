/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3268.robot.subsystems;

import org.usfirst.frc.team3268.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The shooter and the motor that aim it.
 */
public class ShootingSubsystem extends Subsystem {

	public Solenoid shooter;
	public Talon motor;

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public ShootingSubsystem() {
		shooter = new Solenoid(1);
		motor = new Talon(RobotMap.PWM_liftMotor);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
