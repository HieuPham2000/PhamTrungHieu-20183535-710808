package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CheckAddressSupportRushOrderTest {
	// Phạm Trung Hiếu - 20183535

	private PlaceRushOrderController placeRushOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}

	@ParameterizedTest
	@CsvSource({
		"Hà Nội, true",
		"Hà nội, true",
		"hà nội, true",
		"hÀ nộI, true",
		", false",
		"TP Hồ Chí Minh, false",
		"HN, false",
		"hanoi, false",
	})
	
	@DisplayName("check address support rush order")
	void test(String location, boolean expected) {
		boolean isValid = placeRushOrderController.checkAddressSupportRushOrder(location);
		assertEquals(expected, isValid);
	}

}
