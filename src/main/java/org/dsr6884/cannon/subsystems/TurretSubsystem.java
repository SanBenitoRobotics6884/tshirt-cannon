// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.dsr6884.cannon.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TurretSubsystem extends SubsystemBase {
  private CANSparkMax m_horizontalMotor = 
  new CANSparkMax(0, MotorType.kBrushless);
  private CANSparkMax m_verticalMotor = 
  new CANSparkMax(0, MotorType.kBrushless);
  
  MotorController m_horizontalcontroller = new MotorControllerGroup(m_horizontalMotor);

  /** Creates a new TurretSubsystem. */
  public TurretSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public  void turretYesNod(boolean up) {
    double speed;
    if (up) speed = 0.1;
    else speed = -0.1;
    m_verticalMotor.set(speed);
  }
  
  public void turretNoNod(boolean left) {
    double speed;
    if (left) speed = 0.1;
    else speed = -0.1;
    m_horizontalMotor.set(speed);
  }

  public void turretNoMove() {
    m_verticalMotor.set(0);
    m_horizontalMotor.set(0);
  }

  public Command getDefaultCommand() {
    return run(this::turretNoMove);
  }

}
