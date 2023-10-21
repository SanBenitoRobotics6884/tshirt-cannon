// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.dsr6884.cannon.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

import static org.dsr6884.cannon.Constants.Drive.*;

public class TankSubsystem extends DriveSubsystem {
  CANSparkMax leftFrontMotor = new CANSparkMax(FRONT_LEFT_ID, MotorType.kBrushless);
  CANSparkMax leftBackMotor = new CANSparkMax(BACK_LEFT_ID, MotorType.kBrushless);
  CANSparkMax rightFrontMotor = new CANSparkMax(FRONT_RIGHT_ID, MotorType.kBrushless);
  CANSparkMax rightBackMotor = new CANSparkMax(BACK_RIGHT_ID, MotorType.kBrushless);
  
  MotorControllerGroup leftMotors = new MotorControllerGroup(leftBackMotor, leftFrontMotor);
  MotorControllerGroup rightMotors = new MotorControllerGroup(rightBackMotor, rightFrontMotor);

  DifferentialDrive myDrive = new DifferentialDrive(leftMotors, rightMotors);

  /** Creates a new TankSubsystem. */
  public TankSubsystem() {
    rightMotors.setInverted(true);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void drive(double xSpeed, double ySpeed, double zRotation) {
    myDrive.arcadeDrive(xSpeed, zRotation);
  }
}
