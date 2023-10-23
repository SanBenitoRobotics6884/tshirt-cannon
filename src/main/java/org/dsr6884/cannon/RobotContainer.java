// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.dsr6884.cannon;

import org.dsr6884.cannon.commands.TurretRotateUp;
import org.dsr6884.cannon.subsystems.DriveSubsystem;
import org.dsr6884.cannon.subsystems.TankSubsystem;
import org.dsr6884.cannon.subsystems.TurretSubsystem;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;

public class RobotContainer {
  CommandJoystick m_joystick = new CommandJoystick(0);

  DriveSubsystem m_driveSubsystem = new TankSubsystem();
  TurretSubsystem m_turretSubsystem = new TurretSubsystem();

  TurretRotateUp m_turretRotateUpCommand = new TurretRotateUp(m_turretSubsystem);


  public RobotContainer() {
    m_turretSubsystem.setDefaultCommand(m_turretSubsystem.getDefaultCommand());
    configureBindings();
  }
  
  private void configureBindings() {
    m_joystick.povUp().onTrue(m_turretRotateUpCommand);
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
