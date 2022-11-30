// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ElevatorSubsystem extends SubsystemBase {
  Constants constants = new Constants();

  // motor definitions :)
  VictorSP elevatorTopMotor = new VictorSP(constants.elevatorTopMotorChannel);
  //VictorSP elevatorBottomMotor = new VictorSP(constants.elevatorBottomMotorChannel);

  /** Creates a new ElevatorSubsystem. */
  public ElevatorSubsystem() {}

  public void moveElevator(double input)
  {
    if (input == 0)
      elevatorTopMotor.stopMotor();
    else
      elevatorTopMotor.set(input);
    //elevatorBottomMotor.set(input);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
