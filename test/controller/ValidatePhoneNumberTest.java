package controller;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidatePhoneNumberTest {

	// Pham Trung Hieu - 20183535
	private PlaceOrderController placeOrderController;
	
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}

	@ParameterizedTest
	@CsvSource({
		"0123456789, true",
		"01234, false",
		"1234567890, false",
		"pthieu20183535, false",
	})

	@DisplayName("validate phone number")
	public void test(String phoneNumber, boolean expected) {
		boolean isValid = placeOrderController.validatePhoneNumber(phoneNumber);
		assertEquals(expected, isValid);
	}

}
