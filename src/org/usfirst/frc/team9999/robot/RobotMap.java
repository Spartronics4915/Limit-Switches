package org.usfirst.frc.team9999.robot;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	 private static final int POT_CHANNEL = 0;
		private static final int SERVO_CHANNEL = 0;
		private static final int TALON_CHANNEL = 0;
		
		private static final double POT_SCALE = 1;

		private static final double POT_OFFSET = 0;

		public static DigitalInput limitSwitch;

	    public static Potentiometer pot;
	    
	    public static Servo exampleServo;
	    
	    //public static Talon exampleTalon = new Talon(TALON_CHANNEL);
	    
	    public static void init() {
	        limitSwitch = new DigitalInput(1);
	        
	        pot = new AnalogPotentiometer(POT_CHANNEL, POT_SCALE, POT_OFFSET);
	        
	        exampleServo = new Servo(SERVO_CHANNEL);
}
}