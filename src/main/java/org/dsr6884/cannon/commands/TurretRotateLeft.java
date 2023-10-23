// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.dsr6884.cannon.commands;

import org.dsr6884.cannon.subsystems.TurretSubsystem;

import edu.wpi.first.wpilibj2.command.CommandBase;



public class TurretRotateLeft extends CommandBase {
  TurretSubsystem m_turretSubsystem;

  /** Creates a new TurretRotate. */
  public TurretRotateLeft(TurretSubsystem turretSubsystem) {
    m_turretSubsystem = turretSubsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(turretSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_turretSubsystem.turretNoNod(true);
    
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