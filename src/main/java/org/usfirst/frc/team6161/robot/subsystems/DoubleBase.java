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

  // You should lower case the instance name;
  // A 'Solenoid' instance name can be confused
  // with the Solenoid class in the WPI library.
  private DoubleSolenoid solenoid;

  /**
   * This is the constructor. Constructors are always guaranteed to get called
   * first so it'a good place to initialize objects used in the class.
   */
  public DoubleBase() {
    // solenoid = RobotMap.exampleDouble;
    // this (below) is a better way to instantiate
    // the object.
    solenoid = new DoubleSolenoid(4, 2);
  }

  // init() never gets called because it
  // is not part of the wpilibj libary; in
  // other words, System does not have a init().
  // public void init() {
  // Solenoid = RobotMap.exampleDouble;

  // }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void InSole() {
    solenoid.set(DoubleSolenoid.Value.kForward);

  }

  public void OutSole() {
    // *** A NullPointerException occurred here
    // The Selenoid object has not been instantiated
    // (set to a new DoubleSeleoid(<args here>)).
    // The best way to do that is in the constructor (see above)
    solenoid.set(DoubleSolenoid.Value.kReverse);
  }

  public void OffSole() {
    solenoid.set(DoubleSolenoid.Value.kOff);
  }

}
