/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6161.robot.subsystems;

import org.usfirst.frc.team6161.robot.*;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class DoubleBase extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

private DoubleSolenoid Solenoid;

	public void init(){
		Solenoid = RobotMap.exampleDouble;
		
		
		
	}
  


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
public void InSole(){
  Solenoid.set(DoubleSolenoid.Value.kForward);
  

}

public void OutSole(){
  
Solenoid.set(DoubleSolenoid.Value.kReverse);
}

public void OffSole(){
  Solenoid.set(DoubleSolenoid.Value.kOff);
}

}
