package org.plue.screenrecorderapplet;

import java.io.File;

/**
 * @author paolo86@altervista.org
 */
public interface AfterRecording
{
	void onRecordComplete(File video);
}
