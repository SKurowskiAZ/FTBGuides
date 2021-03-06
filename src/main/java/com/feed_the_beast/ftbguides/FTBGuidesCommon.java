package com.feed_the_beast.ftbguides;

import com.feed_the_beast.ftbguides.net.FTBGuidesNetHandler;
import com.feed_the_beast.ftblib.lib.io.DataReader;
import com.feed_the_beast.ftblib.lib.util.CommonUtils;
import com.google.gson.JsonElement;

import java.io.File;

public class FTBGuidesCommon
{
	public static JsonElement serverGuide = null;

	public void preInit()
	{
		FTBGuidesConfig.sync();
		FTBGuidesNetHandler.init();
	}

	public void postInit()
	{
	}

	public static JsonElement getServerGuide()
	{
		if (serverGuide == null)
		{
			serverGuide = DataReader.get(new File(CommonUtils.folderLocal, "server_guide.json")).safeJson();
		}

		return serverGuide;
	}
}