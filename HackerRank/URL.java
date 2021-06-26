// Java Program to Open Input URL in
// System Default Browser in Windows

import java.awt.Desktop;
import java.io.*;
import java.net.URI;

class URL {
	public static void main(String[] args)
			throws Exception
	{
		Desktop desk = Desktop.getDesktop();
		
		// now we enter our URL that we want to open in our
		// default browser
		desk.browse(new URI("http://localhost:8080/MyFirstWebApp1/Searchpage.jsp"));
	}
}
