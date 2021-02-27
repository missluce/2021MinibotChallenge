// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousDistance extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutonomousDistance(Drivetrain drivetrain) {
    addCommands(
        new DriveDistance(0.5, 5, drivetrain),
        new TurnDegrees(-0.5, 20, drivetrain),
        new DriveDistance(0.5, 17, drivetrain),
        new TurnDegrees(-0.5, 45, drivetrain),
        new DriveDistance(0.5, 14, drivetrain),
        new TurnDegrees(0.5, 220, drivetrain),
        new DriveDistance(0.5, 35, drivetrain),
        new TurnDegrees(0.5, 100, drivetrain),
        new DriveDistance(0.5, 24, drivetrain),
        new TurnDegrees(0.5, 80, drivetrain),
        new DriveDistance(0.5, 16, drivetrain));
        
  }
}
