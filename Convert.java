import javax.swing.JOptionPane;

public class Convert {
	Jamie jamie = new Jamie();

	@SuppressWarnings("static-access")
	void convert() {
		String convertMeasurements;
		jamie.joptionpane = "In what category does your conversion fit in? Temperature, storage space, distance, weight/mass, or liquid volume?";
		jamie.speak(jamie.joptionpane);
		convertMeasurements = JOptionPane.showInputDialog(jamie.joptionpane);
		while (!convertMeasurements.contains("temperature") && !convertMeasurements.contains("distance")
				&& !convertMeasurements.contains("storage") && !convertMeasurements.contains("weight")
				&& !convertMeasurements.contains("mass") && !convertMeasurements.contains("volume")) {
			jamie.joptionpane = "Please answer either temperature, distance, storage space, weight/mass, or liquid volume!";
			jamie.speak(jamie.joptionpane);
			convertMeasurements = JOptionPane.showInputDialog(jamie.joptionpane);
		}
		if (convertMeasurements.contains("temperature")) {
			jamie.joptionpane = "Enter the unit you would like to be converted!";
			jamie.speak(jamie.joptionpane);
			String convertingTime = JOptionPane.showInputDialog(jamie.joptionpane);
			if (convertingTime.contains("fahrenheit")) {
				jamie.joptionpane = "To which unit? Celsius or Kelvin?";
				jamie.speak(jamie.joptionpane);
				String toWhichUnit = JOptionPane.showInputDialog(jamie.joptionpane);
				if (toWhichUnit.contains("celsius") || toWhichUnit.contains("centigrade")) {
					jamie.joptionpane = "How many degrees fahrenheit would you like to convert?";
					jamie.speak(jamie.joptionpane);
					String convertStringToInt = JOptionPane.showInputDialog(jamie.joptionpane);
					while (convertStringToInt.charAt(0) != '1' && convertStringToInt.charAt(0) != '2'
							&& convertStringToInt.charAt(0) != '3' && convertStringToInt.charAt(0) != '4'
							&& convertStringToInt.charAt(0) != '5' && convertStringToInt.charAt(0) != '6'
							&& convertStringToInt.charAt(0) != '7' && convertStringToInt.charAt(0) != '8'
							&& convertStringToInt.charAt(0) != '9' && convertStringToInt.charAt(0) != '0') {
						jamie.joptionpane = "Please no letters!";
						jamie.speak(jamie.joptionpane);
						convertStringToInt = JOptionPane.showInputDialog(jamie.joptionpane);
					}
					double convertStringToIntConverted = Double.parseDouble(convertStringToInt);
					double convert1 = convertStringToIntConverted - 32;
					double convert2 = convert1 * 0.5555555555555555;
					jamie.joptionpane = "Answer: " + jamie.round(convert2, 2) + " degrees celsius!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (toWhichUnit.contains("kelvin")) {
					jamie.joptionpane = "How many degrees fahrenheit would you like to convert?";
					jamie.speak(jamie.joptionpane);
					String convertStringToInt = JOptionPane.showInputDialog(jamie.joptionpane);
					while (convertStringToInt.charAt(0) != '1' && convertStringToInt.charAt(0) != '2'
							&& convertStringToInt.charAt(0) != '3' && convertStringToInt.charAt(0) != '4'
							&& convertStringToInt.charAt(0) != '5' && convertStringToInt.charAt(0) != '6'
							&& convertStringToInt.charAt(0) != '7' && convertStringToInt.charAt(0) != '8'
							&& convertStringToInt.charAt(0) != '9' && convertStringToInt.charAt(0) != '0') {
						jamie.joptionpane = "Please no letters!";
						jamie.speak(jamie.joptionpane);
						convertStringToInt = JOptionPane.showInputDialog(jamie.joptionpane);
					}
					double convertStringToIntConverted = Double.parseDouble(convertStringToInt);
					double convert1 = convertStringToIntConverted + 459.67;
					double convert2 = convert1 * 0.5555555555555555;
					jamie.joptionpane = "Answer: " + jamie.round(convert2, 2) + " degrees kelvin!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else {
					jamie.joptionpane = "I do not know that temperature measurement!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				}
			} else if (convertingTime.contains("kelvin")) {
				jamie.joptionpane = "To which unit? Fahrenheit or Celsius?";
				jamie.speak(jamie.joptionpane);
				String toWhichUnit = JOptionPane.showInputDialog(jamie.joptionpane);
				if (toWhichUnit.contains("fahrenheit")) {
					jamie.joptionpane = "How many degrees kelvin would you like to convert?";
					jamie.speak(jamie.joptionpane);
					String convertStringToInt = JOptionPane.showInputDialog(jamie.joptionpane);
					while (convertStringToInt.charAt(0) != '1' && convertStringToInt.charAt(0) != '2'
							&& convertStringToInt.charAt(0) != '3' && convertStringToInt.charAt(0) != '4'
							&& convertStringToInt.charAt(0) != '5' && convertStringToInt.charAt(0) != '6'
							&& convertStringToInt.charAt(0) != '7' && convertStringToInt.charAt(0) != '8'
							&& convertStringToInt.charAt(0) != '9' && convertStringToInt.charAt(0) != '0') {
						jamie.joptionpane = "Please no letters!";
						jamie.speak(jamie.joptionpane);
						convertStringToInt = JOptionPane.showInputDialog(jamie.joptionpane);
					}
					double convertStringToIntConverted = Double.parseDouble(convertStringToInt);
					double convert1 = convertStringToIntConverted - 273.15;
					double convert2 = convert1 * 1.8;
					double convert3 = convert2 + 32;
					jamie.joptionpane = "Answer: " + jamie.round(convert3, 2) + " degrees fahrenheit!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (toWhichUnit.contains("celsius")) {
					jamie.joptionpane = "How many degrees kelvin would you like to convert?";
					jamie.speak(jamie.joptionpane);
					String convertStringToInt = JOptionPane.showInputDialog(jamie.joptionpane);
					while (convertStringToInt.charAt(0) != '1' && convertStringToInt.charAt(0) != '2'
							&& convertStringToInt.charAt(0) != '3' && convertStringToInt.charAt(0) != '4'
							&& convertStringToInt.charAt(0) != '5' && convertStringToInt.charAt(0) != '6'
							&& convertStringToInt.charAt(0) != '7' && convertStringToInt.charAt(0) != '8'
							&& convertStringToInt.charAt(0) != '9' && convertStringToInt.charAt(0) != '0') {
						jamie.joptionpane = "Please no letters!";
						jamie.speak(jamie.joptionpane);
						convertStringToInt = JOptionPane.showInputDialog(jamie.joptionpane);
					}
					double convertStringToIntConverted = Double.parseDouble(convertStringToInt);
					double convert1 = convertStringToIntConverted - 273.15;
					jamie.joptionpane = "Answer: " + jamie.round(convert1, 2) + " degrees celsius!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else {
					jamie.joptionpane = "I do not know that temperature measurement!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				}
			} else if (convertingTime.contains("celsius") || convertingTime.contains("centigrade")) {
				jamie.joptionpane = "To which unit? Fahrenheit or Kelvin?";
				jamie.speak(jamie.joptionpane);
				String toWhichUnit = JOptionPane.showInputDialog(jamie.joptionpane);
				if (toWhichUnit.contains("fahrenheit")) {
					jamie.joptionpane = "How many degrees celsius would you like to convert?";
					jamie.speak(jamie.joptionpane);
					String convertStringToInt = JOptionPane.showInputDialog(jamie.joptionpane);
					while (convertStringToInt.charAt(0) != '1' && convertStringToInt.charAt(0) != '2'
							&& convertStringToInt.charAt(0) != '3' && convertStringToInt.charAt(0) != '4'
							&& convertStringToInt.charAt(0) != '5' && convertStringToInt.charAt(0) != '6'
							&& convertStringToInt.charAt(0) != '7' && convertStringToInt.charAt(0) != '8'
							&& convertStringToInt.charAt(0) != '9' && convertStringToInt.charAt(0) != '0') {
						jamie.joptionpane = "Please no letters!";
						jamie.speak(jamie.joptionpane);
						convertStringToInt = JOptionPane.showInputDialog(jamie.joptionpane);
					}
					double convertStringToIntConverted = Double.parseDouble(convertStringToInt);
					double convert1 = convertStringToIntConverted * 1.8;
					double convert2 = convert1 + 32;
					jamie.joptionpane = "Answer: " + jamie.round(convert2, 2) + " degrees fahrenheit!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (toWhichUnit.contains("kelvin")) {
					jamie.joptionpane = "How many degrees celsius would you like to convert?";
					jamie.speak(jamie.joptionpane);
					String convertStringToInt = JOptionPane.showInputDialog(jamie.joptionpane);
					while (convertStringToInt.charAt(0) != '1' && convertStringToInt.charAt(0) != '2'
							&& convertStringToInt.charAt(0) != '3' && convertStringToInt.charAt(0) != '4'
							&& convertStringToInt.charAt(0) != '5' && convertStringToInt.charAt(0) != '6'
							&& convertStringToInt.charAt(0) != '7' && convertStringToInt.charAt(0) != '8'
							&& convertStringToInt.charAt(0) != '9' && convertStringToInt.charAt(0) != '0') {
						jamie.joptionpane = "Please no letters!";
						jamie.speak(jamie.joptionpane);
						convertStringToInt = JOptionPane.showInputDialog(jamie.joptionpane);
					}
					double convertStringToIntConverted = Double.parseDouble(convertStringToInt);
					double convert1 = convertStringToIntConverted + 273.15;
					jamie.joptionpane = "Answer: " + jamie.round(convert1, 2) + " degrees kelvin!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else {
					jamie.joptionpane = "I do not know that temperature measurement!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				}
			} else {
				if (convertingTime.charAt(0) == 'f') {
					jamie.joptionpane = "Remember: this is how you spell fahrenheit!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else {
					jamie.joptionpane = "I don't know how to convert that measurement! I can only convert fahrenheit, celsius, and kelvin.";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				}
			}
		} else if (convertMeasurements.contains("storage")) {
			jamie.joptionpane = "What is the unit you would like to be converted?";
			jamie.speak(jamie.joptionpane);
			String timeToConvert = JOptionPane.showInputDialog(jamie.joptionpane);
			if (timeToConvert.contains("bit")) {
				jamie.joptionpane = "8 bits = 1 byte!";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			} else if (timeToConvert.contains("kilobyte")) {
				jamie.joptionpane = "1000 kilobyte = 1 megabyte!";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			} else if (timeToConvert.contains("megabyte")) {
				jamie.joptionpane = "1000 megabytes = 1 gigabyte!";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			} else if (timeToConvert.contains("gigabyte")) {
				jamie.joptionpane = "1000 gigabytes = 1 terabyte!";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			} else if (timeToConvert.contains("terabyte")) {
				jamie.joptionpane = "1000 terabytes = 1 petabyte!";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			} else if (timeToConvert.contains("petabyte")) {
				jamie.joptionpane = "1000 petabytes = 1 exabyte!";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			} else if (timeToConvert.contains("exabyte")) {
				jamie.joptionpane = "1000 exabytes = 1 zettabyte!";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			} else if (timeToConvert.contains("zettabyte")) {
				jamie.joptionpane = "1000 zettabytes = 1 yottabyte!";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			} else if (timeToConvert.contains("yottabyte")) {
				jamie.joptionpane = "The yottabyte is the biggest unit for storing data yet!";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			} else if (timeToConvert.contains("byte")) {
				jamie.joptionpane = "1000 bytes = 1 kilobyte!";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			} else {
				jamie.joptionpane = "I don't know how to convert this type of unit! It has to be a byte type!";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			}
		} else if (convertMeasurements.contains("distance")) {
			jamie.joptionpane = "I can only convert from customary to metric or vise versa! I cannot convert within the same unit system!";
			jamie.speak(jamie.joptionpane);
			JOptionPane.showMessageDialog(null, jamie.joptionpane);
			jamie.joptionpane = "Are you going from metric to customary or customary to metric?";
			jamie.speak(jamie.joptionpane);
			String tricky = JOptionPane.showInputDialog(null, jamie.joptionpane);
			if (tricky.contains("metric")) {
				jamie.joptionpane = "What distance metric unit would you like to convert?";
				jamie.speak(jamie.joptionpane);
				String userDecides = JOptionPane.showInputDialog(null, jamie.joptionpane);
				if (userDecides.contains("decimeter") || userDecides.contains("decimeter")) {
					jamie.joptionpane = "1 decimeter = 0.328084 feet!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (userDecides.contains("centimeter") || userDecides.contains("centimeter")) {
					jamie.joptionpane = "1 centimeter = 0.393701 inches!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (userDecides.contains("kilometer") || userDecides.contains("kilometer")) {
					jamie.joptionpane = "1 kilometer = 0.621371 miles!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (userDecides.contains("meter") || userDecides.contains("meter")) {
					jamie.joptionpane = "1 meter = 1.09361 yards!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else {
					jamie.joptionpane = "I don't know that customary unit measuring system!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				}
			} else if (tricky.contains("customary")) {
				jamie.joptionpane = "What distance customary unit would you like to convert?";
				jamie.speak(jamie.joptionpane);
				String userDecides = JOptionPane.showInputDialog(null, jamie.joptionpane);
				if (userDecides.contains("inch") || userDecides.contains("inches")) {
					jamie.joptionpane = "1 inch = 2.54 centimeters!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (userDecides.contains("foot") || userDecides.contains("feet")) {
					jamie.joptionpane = "1 foot = 3.048 decimeters!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (userDecides.contains("mile") || userDecides.contains("miles")) {
					jamie.joptionpane = "1 mile = 1.60934 kilometers!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (userDecides.contains("yard") || userDecides.contains("yard")) {
					jamie.joptionpane = "1 yard = 0.9144 meters!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else {
					jamie.joptionpane = "I don't know that customary unit measuring system!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				}
			} else {
				jamie.joptionpane = "I do not know that measurement system!";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			}
		} else if (convertMeasurements.contains("volume")) {
			jamie.joptionpane = "Are you going from customary to metric or metric to customary?";
			jamie.speak(jamie.joptionpane);
			String mustomary = JOptionPane.showInputDialog(jamie.joptionpane);
			if (mustomary.contains("customary")) {
				jamie.joptionpane = "Enter your customary unit you want to convert!";
				jamie.speak(jamie.joptionpane);
				String whatUnit = JOptionPane.showInputDialog(null, jamie.joptionpane);
				if (whatUnit.contains("ounce")) {
					jamie.joptionpane = "1 fluid ounce = 2.95735 centiliters!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (whatUnit.contains("cup")) {
					jamie.joptionpane = "1 cup = 2.36588 deciliters!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (whatUnit.contains("pint")) {
					jamie.joptionpane = "There is no metric unit with liquid volumes similar to a pint!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (whatUnit.contains("quart")) {
					jamie.joptionpane = "1 quart = 0.946353 liters!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (whatUnit.contains("gallon")) {
					jamie.joptionpane = "There is no metric unit with liquid volumes similar to a gallon!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else {
					jamie.joptionpane = "I do not know how to convert that!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				}
			} else if (mustomary.contains("metric")) {
				jamie.joptionpane = "Enter your metric unit you want to convert!";
				jamie.speak(jamie.joptionpane);
				String whatUnit = JOptionPane.showInputDialog(null, jamie.joptionpane);
				if (whatUnit.contains("milliliter")) {
					jamie.joptionpane = "There is no unit in the customary system with similar liquid volume to milliliter!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (whatUnit.contains("centiliter")) {
					jamie.joptionpane = "There is no unit in the customary system with similar liquid volume to milliliter!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (whatUnit.contains("deciliter")) {
					jamie.joptionpane = "1 deciliter = 3.3814 fluid ounces!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (whatUnit.contains("decaliter")) {
					jamie.joptionpane = "There is no unit in the customary system with similar liquid volume to decaliter!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (whatUnit.contains("hectoliter")) {
					jamie.joptionpane = "There is no unit in the customary system with similar liquid volume to hectoliter!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (whatUnit.contains("kiloliter")) {
					jamie.joptionpane = "There is no unit in the customary system with similar liquid volume to kiloliter!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (whatUnit.contains("liter")) {
					jamie.joptionpane = "1 liter = 1.05669 quarts!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else {
					jamie.joptionpane = "I do not know how to convert that!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				}
			} else {
				jamie.joptionpane = "I don't know that unit system!";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			}
		} else if (convertMeasurements.contains("mass") || convertMeasurements.contains("weight")) {
			jamie.joptionpane = "Are you converting weight to mass, or mass to weight?";
			jamie.speak(jamie.joptionpane);
			String trickyElseIf = JOptionPane.showInputDialog(jamie.joptionpane);
			if (trickyElseIf.contains("weight")) {
				jamie.joptionpane = "What type of weight would you like to convert?";
				jamie.speak(jamie.joptionpane);
				String weight = JOptionPane.showInputDialog(jamie.joptionpane);
				if (weight.contains("dram")) {
					jamie.joptionpane = "1 dram = 1.77185 grams!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (weight.contains("ounce")) {
					jamie.joptionpane = "1 non fluid ounce = 2.83495 decagrams!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (weight.contains("pound")) {
					jamie.joptionpane = "1 pound = 4.53592 hectograms!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (weight.contains("hundredweight")) {
					jamie.joptionpane = "There is no unit in the metric system with similar weight/mass amounts as a hundredweight.";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (weight.contains("ton")) {
					jamie.joptionpane = "1 ton = 0.907185 metric tons!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else {
					jamie.joptionpane = "I don't know that type of measurement!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				}
			} else if (trickyElseIf.contains("mass")) {
				jamie.joptionpane = "What type of weight would you like to convert?";
				jamie.speak(jamie.joptionpane);
				String mass = JOptionPane.showInputDialog(jamie.joptionpane);
				if (mass.contains("milligram")) {
					jamie.joptionpane = "There is no unit in the customary system with similar weight/mass measurement amounts as a milligram!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (mass.contains("centigram")) {
					jamie.joptionpane = "There is no unit in the customary system with similar weight/mass measurement amounts as a centigram!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (mass.contains("decigram")) {
					jamie.joptionpane = "There is no unit in the customary system with similar weight/mass measurement amounts as a decigram!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (mass.contains("decagram")) {
					jamie.joptionpane = "1 decagram = 5.64382 drams!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (mass.contains("hectogram")) {
					jamie.joptionpane = "1 hectogram = 3.5274 non fluid ounces!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (mass.contains("kilogram")) {
					jamie.joptionpane = "1 kilogram  = 2.20462 pounds!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (mass.contains("metric ton")) {
					jamie.joptionpane = "1 metric ton = 1.10231 tons!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else if (mass.contains("gram")) {
					jamie.joptionpane = "There is no unit in the customary system with similar weight/mass measurement amounts as a gram!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				} else {
					jamie.joptionpane = "I don't know that type of measurement!";
					jamie.speak(jamie.joptionpane);
					JOptionPane.showMessageDialog(null, jamie.joptionpane);
				}
			} else {
				jamie.joptionpane = "I do not know that measuring system!";
				jamie.speak(jamie.joptionpane);
				JOptionPane.showMessageDialog(null, jamie.joptionpane);
			}
		}
	}
}