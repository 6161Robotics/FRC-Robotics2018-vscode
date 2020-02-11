/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.team6161.robot;


import frc.team6161.robot.Gamepad;
import frc.team6161.robot.commands.*;

import frc.team6161.robot.RobotMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());

	public JoystickButton joyBackIn;
	public JoystickButton joyBackOut;
	public JoystickButton joyFrontIn;
	public JoystickButton joyFrontOut;
	public JoystickButton joyPvcOut;
	public JoystickButton joyPvcIn;
	public AxisButton joySliderOut;
	public AxisButton joySliderIn;
	public AxisButton joyDpadUp;
	public AxisButton joyDpadDwn;

	public Joystick theXbox;
	public Joystick theJoystick;

	public OI() {
		theXbox = new Joystick(0);
		theJoystick = new Joystick(1);
		

	/*	joySlideBackwards = new JoystickButton(theXbox, /);
        joySlideBackwards.whenPressed(new /());
		
        joySlideForwards = new JoystickButton(theXbox, /);
        joySlideForwards.whenPressed(new /());  
	  */  
	  
        joyPvcIn = new JoystickButton(theXbox, 5);
        joyPvcIn.whenPressed(new Defense());
        //incline boi
        joyPvcOut = new JoystickButton(theXbox, 6);
		joyPvcOut.whenPressed(new SliderSolenoid());
		//incline boi
		
        //joySliderOut = new AxisButton(theXbox, Gamepad.Axes.RIGHT_TRIGGER.getNumber(), Constants.AXIS_BUTTON_THRESHHOLD);
		//joySliderOut.whileActive(new SliderSolenoid());
		//joySliderOut.whenPressed(new SliderSolenoid());
        
       //joySliderIn = new AxisButton(theXbox, Gamepad.Axes.LEFT_TRIGGER.getNumber(), Constants.AXIS_BUTTON_THRESHHOLD);
		//joySliderIn.whenPressed(new Defense());
		






















		//TODO: what is this 
		//joyDpadUp = new AxisButton(theXbox, Gamepad.Axes.D_PAD_VERTICAL.getNumber(), 1);
		//joyDpadUp.whenPressed(new SliderSolenoid());
		//joyDpadDwn = new AxisButton(theXbox, Gamepad.Axes.D_PAD_VERTICAL.getNumber(), -1);























        joyBackIn = new JoystickButton(theXbox, 4);
        joyBackIn.whenPressed(new Oof());
		
        //joyBackOut = new JoystickButton(theXbox, 3);
		//joyBackOut.whenPressed(new BackOut());
		

		
        //joyFrontIn = new JoystickButton(theXbox, 7);
		//joyFrontIn.whenPressed(new FrontIn());
		
		//joyFrontOut = new JoystickButton(theXbox, 8);
		//joyFrontOut.whenPressed(new FrontOut());

        
	}

	//a method for the joystick
	public Joystick getTheJoystick() {
        return theXbox;
    }
}
