// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.dsr6884.cannon;

import org.dsr6884.cannon.subsystems.DriveSubsystem;
import org.dsr6884.cannon.subsystems.TankSubsystem;

import edu.wpi.first.wpilibj2.command.Command;

public class RobotContainer {
  DriveSubsystem driveSubsystem = new TankSubsystem();

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {}

  public Command getAutonomousCommand() {
    return null;
  }
}
