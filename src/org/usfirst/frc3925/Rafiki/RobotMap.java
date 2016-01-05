// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3925.Rafiki;
    
import org.usfirst.frc3925.Rafiki.subsystems.Elevator;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainMotorRight;
    public static SpeedController driveTrainMotorLeft;
    public static RobotDrive driveTrainRobotDrive;
    public static Encoder driveTrainEncoderRight;
    public static Encoder driveTrainEncoderLeft;
    public static Encoder elevatorEncoderElevator;
    public static SpeedController elevatorMotorElevatorA;
    public static PIDController elevatorElevatorPID;
    public static SpeedController elevatorMotorElevatorB;
    public static DigitalInput elevatorElevatorSwitch;
    public static SpeedController intakeUpperLeft;
    public static SpeedController intakeUpperRight;
    public static SpeedController intakeLowerLeft;
    public static SpeedController intakeLowerRight;
    public static DoubleSolenoid intakeSolenoidLeft;
    public static DoubleSolenoid intakeSolenoidRight;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainMotorRight = new Talon(1);
        LiveWindow.addActuator("DriveTrain", "MotorRight", (Talon) driveTrainMotorRight);
        
        driveTrainMotorLeft = new Talon(0);
        LiveWindow.addActuator("DriveTrain", "MotorLeft", (Talon) driveTrainMotorLeft);
        
        driveTrainRobotDrive = new RobotDrive(driveTrainMotorLeft, driveTrainMotorRight);
        
        driveTrainRobotDrive.setSafetyEnabled(true);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.5);
        driveTrainRobotDrive.setMaxOutput(1.0);
        

        driveTrainEncoderRight = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveTrain", "EncoderRight", driveTrainEncoderRight);
        driveTrainEncoderRight.setDistancePerPulse(1.0);
        driveTrainEncoderRight.setPIDSourceParameter(PIDSourceParameter.kRate);
        driveTrainEncoderLeft = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveTrain", "EncoderLeft", driveTrainEncoderLeft);
        driveTrainEncoderLeft.setDistancePerPulse(1.0);
        driveTrainEncoderLeft.setPIDSourceParameter(PIDSourceParameter.kRate);
        elevatorEncoderElevator = new Encoder(4, 5, false, EncodingType.k4X);
        LiveWindow.addSensor("Elevator", "EncoderElevator", elevatorEncoderElevator);
        elevatorEncoderElevator.setDistancePerPulse(1.0);
        elevatorEncoderElevator.setPIDSourceParameter(PIDSourceParameter.kRate);
        elevatorMotorElevatorA = new Talon(2);
        LiveWindow.addActuator("Elevator", "MotorElevatorA", (Talon) elevatorMotorElevatorA);
/*        
      	elevatorElevatorPID = new PIDController(1.0, 0.0, 0.0, 0.0, elevatorEncoderElevator, elevatorMotorElevatorA, 0.02);
        LiveWindow.addActuator("Elevator", "ElevatorPID", elevatorElevatorPID);
        elevatorElevatorPID.setContinuous(false); elevatorElevatorPID.setAbsoluteTolerance(0.2); 
        elevatorElevatorPID.setOutputRange(-1.0, 1.0);        //*/

        elevatorMotorElevatorB = new Talon(3);
        LiveWindow.addActuator("Elevator", "MotorElevatorB", (Talon) elevatorMotorElevatorB);
        
        elevatorElevatorSwitch = new DigitalInput(8);
        LiveWindow.addSensor("Elevator", "ElevatorSwitch", elevatorElevatorSwitch);
        
        intakeUpperLeft = new Victor(7);
        LiveWindow.addActuator("Intake", "UpperLeft", (Victor) intakeUpperLeft);
        
        intakeUpperRight = new Victor(8);
        LiveWindow.addActuator("Intake", "UpperRight", (Victor) intakeUpperRight);
        
        intakeLowerLeft = new Victor(9);
        LiveWindow.addActuator("Intake", "LowerLeft", (Victor) intakeLowerLeft);
        
        intakeLowerRight = new Victor(6);
        LiveWindow.addActuator("Intake", "LowerRight", (Victor) intakeLowerRight);
        
        intakeSolenoidLeft = new DoubleSolenoid(0, 0, 1);      
        LiveWindow.addActuator("Intake", "SolenoidLeft", intakeSolenoidLeft);
        
        intakeSolenoidRight = new DoubleSolenoid(0, 2, 3);      
        LiveWindow.addActuator("Intake", "SolenoidRight", intakeSolenoidRight);
        
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    public static void initPIDElevator(Elevator elevator) {
    	elevatorElevatorPID = new PIDController(1.0, 0.0, 0.0, 0.0, elevatorEncoderElevator, elevator, 0.02);
    	LiveWindow.addActuator("Elevator", "ElevatorPID", elevatorElevatorPID);
    	elevatorElevatorPID.setContinuous(false); elevatorElevatorPID.setAbsoluteTolerance(0.2); 
    	elevatorElevatorPID.setOutputRange(-1.0, 1.0);
    	DriverStation.reportError("Success Making Elevator PID\n", false);
    }
}
