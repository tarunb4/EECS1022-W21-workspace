
public class BMI {
//	
//	Input Parameters:
//	     *    - unitOfWeight    : either "pound" or "kilogram"
//	     *    - valueOfWeight    : the weight value
//	     *    - unitOfHeight    : either "foot" or "inch"
//	     *    - valueOfHeight    : the height value
//	     *
//	     *    Error conditions (in order of priority):
//	     *    1. When the unitOfWeight is neither "pound" nor "kilogram" (case sensitive).
//	     *    2. When the unitOfHeight is neither "foot" nor "inch" (case sensitive).
//	     *    3. When not both weight value and height value are positive.
//	     *    If multiple error conditions hold, return a message related to the error with the highest priority.
//	     *    e.g., invoking getBMIReport("Pounds", -154.3, "Inches", -66.92) has all inputs invalid,
//	     *            but only an error message about weight unit is returned.
//	     *
//	     *  What to return?
//	     *  - Return an error message if there is any error.
//	     *  - Otherwise, calculate the Body Mass Index (BMI) by: weight (in kilogram) divided by the square of height (in meters).
//	     *      + Use the following conversion rates (when needed):
//	     *          1 inch is 0.0254 meter             (use it when unitOfHeight is "inch")
//	     *          1 foot is 0.3048 meter
//	     *          1 pound is 0.453592 kilogram
//	     *      + The calculation result must be formatted with 2 digits after the decimal:
//	     *          Use String.format("%.2f", someNumber)
//	     *      + Also, include an interpretation message (case sensitive) according to the following scheme:
//	     *          BMI < 18.5             means "Underweight"
//	     *             18.5 <= BMI < 25.0     means "Normal"
//	     *             25.0 <= BMI < 30.0     means "Overweight"
//	     *             30.0 <= BMI         means "Obese"
//	     *
	
	public static String getBMIReport(String unitOfWeight, double valueOfWeight, String unitOfHeight, double valueOfHeight) {
        String result = "";
        
        if (unitOfWeight != "pound" || unitOfWeight != "kilogram" ) {
        	result = "Error";
        }
        else if (unitOfHeight != "foot" || unitOfHeight != "inch") {
        	result = "Error";
        }
        else if (valueOfWeight < 0 && valueOfHeight < 0) {
        	result = "Error";
        }
        
        if (unitOfWeight == "pound") {
        	if(unitOfHeight == "foot") {
        		double kilo = valueOfWeight *  0.453592;
        		double meteres = valueOfHeight * 0.3048;
        		double BMI = kilo / (meteres * meteres);
        		String BMIs = String.format(".2f", BMI);
        		if (BMI < 18.5) {
        			result = "Underweight";
        		}
        		
        		else if (18.5 <= BMI && BMI < 25.0) {
        			result = "Normal";
        		}
        		
        		else if (25.0 <= BMI && BMI < 30.0) {
        			result = "Overweight";
        		}
        		
        		else if (30 <= BMI) {
        			result = "Obese";
        		}
        	}
        	
        	else if (unitOfHeight == "inch") {
        		double kilo = valueOfWeight *  0.453592;
        		double meteres = valueOfHeight * 0.0254;
        		double BMI = kilo / (meteres * meteres);
        		String BMIs = String.format(".2f", BMI);
        		if (BMI < 18.5) {
        			result = "Underweight";
        		}
        		
        		else if (18.5 <= BMI && BMI < 25.0) {
        			result = "Normal";
        		}
        		
        		else if (25.0 <= BMI && BMI < 30.0) {
        			result = "Overweight";
        		}
        		
        		else if (30 <= BMI) {
        			result = "Obese";
        		}
        		
        	}
        }
        
        else if (unitOfWeight == "kilogram") {
        	if(unitOfHeight == "foot") {
        		double kilo = valueOfWeight;
        		double meteres = valueOfHeight * 0.3048;
        		double BMI = kilo / (meteres * meteres);
        		String BMIs = String.format(".2f", BMI);
        		if (BMI < 18.5) {
        			result = "Underweight";
        		}
        		
        		else if (18.5 <= BMI && BMI < 25.0) {
        			result = "Normal";
        		}
        		
        		else if (25.0 <= BMI && BMI < 30.0) {
        			result = "Overweight";
        		}
        		
        		else if (30 <= BMI) {
        			result = "Obese";
        		}
        	}
        	
        	else if (unitOfHeight == "inch") {
        		double kilo = valueOfWeight;
        		double meteres = valueOfHeight * 0.0254;
        		double BMI = kilo / (meteres * meteres);
        		String BMIs = String.format(".2f", BMI);
        		if (BMI < 18.5) {
        			result = "Underweight";
        		}
        		
        		else if (18.5 <= BMI && BMI < 25.0) {
        			result = "Normal";
        		}
        		
        		else if (25.0 <= BMI && BMI < 30.0) {
        			result = "Overweight";
        		}
        		
        		else if (30 <= BMI) {
        			result = "Obese";
        		}
        		
        	}
        	
        }
        
        
        return result;

	}
}
