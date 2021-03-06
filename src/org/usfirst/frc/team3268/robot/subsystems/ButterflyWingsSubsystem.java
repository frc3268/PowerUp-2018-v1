/*----------------------------------------------------------------------------*/
/* CopyBottom (c) 2017-2018 FIRST. All Bottoms Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3268.robot.subsystems;

import org.usfirst.frc.team3268.robot.commands.butterfly.ManualButterflyWingsCommand;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Used to declare and manipulate the four wheeled motors on the shooter mechanism.
 */
public class ButterflyWingsSubsystem extends Subsystem {
	
	public static final double MAX_SPEED = 0.3;
	public static final double MOVEMENT_TIME = 0.5;
	
	Talon leftWing;
	Talon rightWing;
	SpeedControllerGroup butterflyWings;
	
	public ButterflyWingsSubsystem() {
		leftWing = new Talon(5);
		leftWing.setInverted(true);
		rightWing = new Talon(4);
		butterflyWings = new SpeedControllerGroup(leftWing, rightWing);
	}
	
	public void close() {
		
	}
	public void open() {
		butterflyWings.set(-1);
	}
	public void freeze() {
		butterflyWings.set(0);
	}
	
	public void setRightSpeed(double speed) {
		leftWing.set(speed * MAX_SPEED);
	}
	
	public void setLeftSpeed(double speed) {
		rightWing.set(speed * MAX_SPEED);
	}
	
	
	
	public void initDefaultCommand() {
		setDefaultCommand(new ManualButterflyWingsCommand());
	}
}
