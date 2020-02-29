 package MavenProject.Maven;

import java.io.IOException;

import org.testng.annotations.Test;

import resource.base;

public class HomePage extends base{

	@Test
	public void basePageNavigation() throws IOException
	{
		driver =initializeDriver();
		driver.get("http://google.com/");
	}
	
}
