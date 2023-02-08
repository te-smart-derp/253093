// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.Supplier;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ArcadeDriveByMe extends CommandBase {
  private final Drivetrain m_drivetrain;
  private final Supplier<Double> m_xaxisSpeedSupplier;
  private final Supplier<Double> m_zaxisRotateSupplier;
  private final Supplier<Double> m_yaxisGrowASupplier;
  private final Supplier<Double> m_yaxisGrowBSupplier;
  private final Supplier<Double> m_speedSwitchSupplier;

  /** Creates a new ArcadeDriveByMe. */
  public ArcadeDriveByMe(
      Drivetrain drivetrain,
      Supplier<Double> xaxisSpeedSupplier,
      Supplier<Double> zaxisRotateSupplier,
      Supplier<Double> yaxisGrowASupplier,
      Supplier<Double> yaxisGrowBSupplier,
      Supplier<Double> speedSwitchSupplier){
    m_drivetrain = drivetrain;
    m_xaxisSpeedSupplier = xaxisSpeedSupplier;
    m_zaxisRotateSupplier = zaxisRotateSupplier;
    m_yaxisGrowASupplier = yaxisGrowASupplier;
    m_yaxisGrowBSupplier = yaxisGrowBSupplier;
    m_speedSwitchSupplier = speedSwitchSupplier;
    addRequirements(drivetrain);
    // Pictures
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}
  // image.png
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (speedSwitchSupplier = true)
    m_drivetrain.arcadeDrive(m_xaxisSpeedSupplier.get(), m_zaxisRotateSupplier.get());
    m_drivetrain.arcadeDrive(m_yaxisGrowASupplier.get(),m_yaxisGrowBSupplier.get());
  }
  // Called once the command ends or is interrupted.
  @Override
  // m_drivetrain.arcadeDrive(m_xaxisSpeedSupplier.get(), m_zaxisRotateSupplier.get());
// }
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
