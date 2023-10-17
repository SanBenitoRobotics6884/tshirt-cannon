// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.dsr6884.cannon.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.MecanumDrive;

public class MecanumSubsystem extends DriveSubsystem {
  CANSparkMax leftFrontMotor = new CANSparkMax(1, MotorType.kBrushless);
  CANSparkMax leftBackMotor = new CANSparkMax(2, MotorType.kBrushless);
  CANSparkMax rightFrontMotor = new CANSparkMax(3, MotorType.kBrushless);
  CANSparkMax rightBackMotor = new CANSparkMax(4, MotorType.kBrushless);
  
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
