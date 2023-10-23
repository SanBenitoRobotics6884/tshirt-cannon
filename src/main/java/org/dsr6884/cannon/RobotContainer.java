// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.dsr6884.cannon;

import org.dsr6884.cannon.commands.TurretRotateUp;
import org.dsr6884.cannon.Settings.Drive;
import org.dsr6884.cannon.commands.DefaultDrive;
import org.dsr6884.cannon.commands.TurretRotateDown;
import org.dsr6884.cannon.commands.TurretRotateLeft;
import org.dsr6884.cannon.commands.TurretRotateRight;
import org.dsr6884.cannon.subsystems.DriveSubsystem;
import org.dsr6884.cannon.subsystems.MecanumSubsystem;
import org.dsr6884.cannon.subsystems.TankSubsystem;
import org.dsr6884.cannon.subsystems.TurretSubsystem;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;

public class RobotContainer {
  private CommandJoystick m_joystick = new CommandJoystick(0);
  private XboxController m_controller = new XboxController(0);

  private DriveSubsystem m_driveSubsystem = new TankSubsystem();
  private TurretSubsystem m_turretSubsystem = new TurretSubsystem();

  private DefaultDrive m_defaultDriveCommand = new DefaultDrive(m_driveSubsystem, m_controller);

  public RobotContainer() {
    m_turretSubsystem.setDefaultCommand(m_turretSubsystem.getDefaultCommand());

    if (Settings.DRIVE_MODE == Drive.TANK) {
      m_driveSubsystem = new TankSubsystem();
    } else {
      m_driveSubsystem = new MecanumSubsystem();
    }

    m_driveSubsystem.setDefaultCommand(m_defaultDriveCommand);

    configureBindings();
  }
  
  private void configureBindings() {
    m_joystick.povUp().onTrue(new TurretRotateUp(m_turretSubsystem));
    m_joystick.povDown().onTrue(new TurretRotateDown(m_turretSubsystem));
    m_joystick.povLeft().onTrue(new TurretRotateLeft(m_turretSubsystem));
    m_joystick.povRight().onTrue(new TurretRotateRight(m_turretSubsystem));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
