package baseTest;

import org.testng.annotations.Test;

import pageEvents.CanvasPage;

public class SampleTest {

	
	@Test
	public void sampleTest() {
		CanvasPage hp=new CanvasPage();
		hp.designInCanvas();

	}
}
 