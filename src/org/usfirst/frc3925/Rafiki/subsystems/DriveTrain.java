// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3925.Rafiki.subsystems;

import org.usfirst.frc3925.Rafiki.RobotMap;
import org.usfirst.frc3925.Rafiki.commands.ManualDrive;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController motorRight = RobotMap.driveTrainMotorRight;
    SpeedController motorLeft = RobotMap.driveTrainMotorLeft;
    RobotDrive robotDrive = RobotMap.driveTrainRobotDrive;
    Encoder encoderRight = RobotMap.driveTrainEncoderRight;
    Encoder encoderLeft = RobotMap.driveTrainEncoderLeft;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public void setRawSpeed(double left, double right) {
    	robotDrive.setLeftRightMotorOutputs(left, right);
    }
    
    public void inception (String s) {
    	inception("This is trippy yo " + s);
    }
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new ManualDrive());
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

