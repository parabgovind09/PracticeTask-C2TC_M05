package Basics;
//parameterized test
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SixthProgramTest {
	@ParameterizedTest
	@ValueSource(ints = {1,2,3})
	/*will fail as int is required
	 * void withalueSource(String number) {
		assertNotNull(number);
	}
	 */
	void withalueSource(int number) {
		assertNotNull(number);
	}
}
