// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.dsr6884.cannon.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.MecanumDrive;

import static org.dsr6884.cannon.Constants.Drive.*;

public class MecanumSubsystem extends DriveSubsystem {
  CANSparkMax leftFrontMotor = new CANSparkMax(FRONT_LEFT_ID, MotorType.kBrushless);
  CANSparkMax leftBackMotor = new CANSparkMax(BACK_LEFT_ID, MotorType.kBrushless);
  CANSparkMax rightFrontMotor = new CANSparkMax(FRONT_RIGHT_ID, MotorType.kBrushless);
  CANSparkMax rightBackMotor = new CANSparkMax(BACK_RIGHT_ID, MotorType.kBrushless);
  
  MecanumDrive mecanumDrive = new MecanumDrive(leftFrontMotor, leftBackMotor, rightFrontMotor, rightBackMotor);
  /** Creates a new MecanumSubsystem. */
  public MecanumSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void drive(double xSpeed, double ySpeed, double zRotation) {
    mecanumDrive.driveCartesian(xSpeed, ySpeed, zRotation);
  }
}
