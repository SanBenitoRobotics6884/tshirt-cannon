package org.dsr6884.cannon;

public final class Settings {
  public enum Drive {
    MECANUM,
    TANK;
  }

  public static final Drive DRIVE_MODE = Drive.MECANUM;

}
