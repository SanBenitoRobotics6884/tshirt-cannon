package org.dsr6884.cannon;

/**
 * Constants should be declared as public static final. When you are using your constants in a
 * subsystem, you should use a static import.
 * <p>
 * E.g.
 * <p>
 * {@code import static org.dsr6884.cannon.Constants.Drive.*;}
 */
public final class Constants {
  
  public static final class Drive {
    public static final int FRONT_LEFT_ID = 1;
    public static final int BACK_LEFT_ID = 2;
    public static final int FRONT_RIGHT_ID = 3;
    public static final int BACK_RIGHT_ID = 4;
  }

  public static final class Shooter {

  }

  public static final class Turret {

  }

}
