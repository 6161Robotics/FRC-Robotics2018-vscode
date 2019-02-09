/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6161.robot.subsystems;

import org.usfirst.frc.team6161.robot.*;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
  public class SolenoidBase extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
private Compressor compressor;
private Solenoid firstSolenoid;
private Solenoid secondSolenoid;

  public void init() {
    
    firstSolenoid = new Solenoid(0);
    secondSolenoid = new Solenoid(1);

    //firstSolenoid.set(Value.kOff);
    compressor = new Compressor(0);
    compressor.setClosedLoopControl(true);
		
  }

  @Override
  public void initDefaultCommand() {
    //c.setClosedLoopControl(true);
    
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
public void pvcInSole(){
  firstSolenoid.set(true);
  

}

public void pvcOutSole(){
  
firstSolenoid.set(false);
}

/*public void OffSole(){
*firstSolenoid.set(Value.kOff);
}*/

public void sliderInSole(){
  secondSolenoid.set(false);
}

public void sliderOutSole(){
  secondSolenoid.set(true);
}

}
