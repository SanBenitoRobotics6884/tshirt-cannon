// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.dsr6884.cannon.commands;

import org.dsr6884.cannon.subsystems.DriveSubsystem;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class DefaultDrive extends CommandBase {
  private DriveSubsystem m_driveSubsystem;
  private XboxController m_controller;
  
  /** Creates a new DefaultDrive. */
  public DefaultDrive(DriveSubsystem driveSubsystem, XboxController controller) {
    m_driveSubsystem = driveSubsystem;
    m_controller = controller;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double xSpeed = m_controller.getLeftY();
    double ySpeed = -m_controller.getLeftX();
    double zRotation = m_controller.getRightX();

    m_driveSubsystem.drive(xSpeed, ySpeed, zRotation);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
