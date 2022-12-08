// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class defaultDrive extends CommandBase {

  private final Drivetrain sub_Drivetrain;
  double leftAxis;
  double rightAxis;

  public defaultDrive(Drivetrain Drivetrain, double leftAxis, double rightAxis) {
    sub_Drivetrain = Drivetrain;
    addRequirements(sub_Drivetrain);
  }

  @Override
  public void execute() {
    sub_Drivetrain.setSpeeds(leftAxis, rightAxis);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
