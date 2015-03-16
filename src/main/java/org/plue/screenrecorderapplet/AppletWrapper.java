package org.plue.screenrecorderapplet;

import java.applet.Applet;

/**
 * @author p.cortis@sinossi.it
 */
public class AppletWrapper
{
	private Applet applet;

	public AppletWrapper(Applet applet)
	{
		this.applet = applet;
	}

	public String getParameter(String name)
	{
		return applet.getParameter(name);
	}
}
