/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3268.robot.commands.complex;

import org.usfirst.frc.team3268.robot.commands.pneumatic.MoveShooterCommand;
import org.usfirst.frc.team3268.robot.commands.shooter.ChargeShooterTopCommand;
import org.usfirst.frc.team3268.robot.commands.shooter.FireShooterCommand;
import org.usfirst.frc.team3268.robot.commands.shooter.StopShooterCommand;
import org.usfirst.frc.team3268.robot.subsystems.Position;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * An example command.  You can replace me with your own command.
 */
public class FireUpCommandGroup extends CommandGroup {
	
	public FireUpCommandGroup() {
		addSequential(new MoveShooterCommand(Position.UP));
		addSequential(new ChargeShooterTopCommand());
		addSequential(new MoveShooterCommand(Position.DOWN));
		addSequential(new FireShooterCommand());
		addSequential(new StopShooterCommand());
	}
	
}
