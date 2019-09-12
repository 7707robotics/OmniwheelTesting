/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * Add your docs here.
 */
public class RobotMap {
    //Speed Controllers
    public static final int frontLeftMotor = 1;    //PWM
    public static final int backLeftMotor = 2;     //PWM
    public static final int frontRightMotor = 3;   //PWM
    public static final int backRightMotor = 4;    //PWM

    //Driver Input
    public static final int joystick = 0; 

    //Drive Style
    public static enum DriveStyle {
        DIFFERENTIAL, MECANUM
    }
}
