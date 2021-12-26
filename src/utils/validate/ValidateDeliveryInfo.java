package utils.validate;

public class ValidateDeliveryInfo {
	public static boolean validatePhoneNumber(String phoneNumber) {
		if(phoneNumber == null || phoneNumber.isBlank()) {
    		return false;
    	}
    	// Pham Trung Hieu - 20183535
    	// Kiem tra do dai 10 chu so
    	if(phoneNumber.length() != 10) {
    		return false;
    	}
    	
    	// Kiem tra bat dau bang ky tu "0"
    	if(!phoneNumber.startsWith("0")) {
    		return false;
    	}
    	
    	// Kiem tra chi chua so
    	try {
			Integer.parseInt(phoneNumber);
		} catch (NumberFormatException e) {
			return false;
		}
    	
    	return true;
    }
    
    public static boolean validateName(String name) {
    	// Pham Trung Hieu - 20183535
    	// Kiem tra khac null, khac blank
    	if(name == null || name.isBlank()) {
    		return false;
    	}
    	
    	// Kiem tra chi chua ky tu chu cai
    	return name.matches("[a-zA-Z]+");
    }
    
    public static boolean validateAddress(String address) {
    	// Pham Trung Hieu - 20183535
    	// Kiem tra khac null, khac blank
    	if(address == null || address.isBlank()) {
    		return false;
    	}
    	
    	// Kiem tra khong chua ky tu dac biet
    	return address.matches("[0-9a-zA-Z ]+");
    }
}
