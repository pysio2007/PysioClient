package PysioClient;

import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.util.ResourceLocation;

public class serverDatafea extends ServerData{
	
	public static final ResourceLocation STAR_ICON = new ResourceLocation("PysioClient/star.png");
	
	public serverDatafea(String servername, String serverip) {
		super(servername, serverip, false);
		// TODO 自动生成的构造函数存根
	}

}
