// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.dsr6884.cannon;

import org.dsr6884.cannon.Settings.Drive;
import org.dsr6884.cannon.commands.DefaultDrive;
import org.dsr6884.cannon.subsystems.DriveSubsystem;
import org.dsr6884.cannon.subsystems.MecanumSubsystem;
import org.dsr6884.cannon.subsystems.TankSubsystem;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;

public class RobotContainer {
  private XboxController m_controller = new XboxController(0);

  private DriveSubsystem m_driveSubsystem;

  private DefaultDrive m_defaultDriveCommand = new DefaultDrive(m_driveSubsystem, m_controller);

  public RobotContainer() {
    if (Settings.DRIVE_MODE == Drive.TANK) {
      m_driveSubsystem = new TankSubsystem();
    } else {
      m_driveSubsystem = new MecanumSubsystem();
    }

    m_driveSubsystem.setDefaultCommand(m_defaultDriveCommand);

    configureBindings();
  }

  private void configureBindings() {}

  public Command getAutonomousCommand() {
    return null;
  }
}
