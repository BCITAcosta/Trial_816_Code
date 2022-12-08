package frc.robot.subsystems;

import frc.robot.Constants.DriveConstants;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase{
    private final DriveHalf drive_Left = new DriveHalf("Left", DriveConstants.FrontLeftSparkMaxID, DriveConstants.RearLeftSparkMaxID);
    private final DriveHalf drive_Right = new DriveHalf("Right", DriveConstants.FrontRightSparkMaxID, DriveConstants.RearRightSparkMaxID);

    public void configureDrive(){
        drive_Right.setInverted();
    }

    public void setSpeeds(double leftSpeed, double rightSpeed){
        drive_Left.setSpeed(leftSpeed);
        drive_Right.setSpeed(rightSpeed);
    }

    @Override
    public void periodic(){

    }
}