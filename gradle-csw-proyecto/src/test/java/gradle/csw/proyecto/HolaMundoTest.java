package gradle.csw.proyecto;

import static org.junit.Assert.*;

import org.junit.Test;

public class HolaMundoTest {

	@Test
	public void test() {
		HolaMundo app = new HolaMundo();
		assertNotNull("Success", app.sayHola());
	}

}
