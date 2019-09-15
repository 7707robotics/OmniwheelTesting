/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * Contains static definitions of key constants involved in the robot control system. 
 * These are primarily IDs associated with hardware connected to the DriverStation or RoboRIO.
 */
public class RobotMap {
    //Speed Controllers
    public static final int FRONT_LEFT_MOTOR = 1;    //PWM
    public static final int BACK_LEFT_MOTOR = 2;     //PWM
    public static final int FRONT_RIGHT_MOTOR = 3;   //PWM
    public static final int BACK_RIGHT_MOTOR = 4;    //PWM

    //Driver Input
    public static final int JOYSTICK = 0; 

    //Drive Style
    
    public static enum DriveStyle {
        DIFFERENTIAL, 
        MECANUM_CARTESIAN,      //Takes in x, y, z inputs
        MECANUM_POLAR           //Takes in magnitude (r), angle (theta), and z input; theta is measured in degrees
    }
}
