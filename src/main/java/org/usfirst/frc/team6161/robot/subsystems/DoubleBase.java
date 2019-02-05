/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6161.robot.subsystems;

import org.usfirst.frc.team6161.robot.*;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class DoubleBase extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

private DoubleSolenoid firstSolenoid;

	public void init(){
		firstSolenoid = RobotMap.pvcSolenoid;
		firstSolenoid.set(Value.kOff);
		
		
	}
  


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
public void InSole(){
  firstSolenoid.set(Value.kForward);
  

}

public void OutSole(){
  
firstSolenoid.set(Value.kReverse);
}

public void OffSole(){
  firstSolenoid.set(Value.kOff);
}

}
