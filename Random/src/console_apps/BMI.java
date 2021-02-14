package console_apps;

public class BMI {

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


