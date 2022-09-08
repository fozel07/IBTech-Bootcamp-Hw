package com.fatih.player.web.client;

import java.net.URLConnection;
import java.util.logging.StreamHandler;

import org.w3c.dom.Document;

import com.fatih.core.utils.StreamUtilities;
import com.fatih.core.utils.WebHelper;
import com.fatih.core.utils.XmlHelper;
import com.fatih.player.entity.Player;
import com.fatih.player.xml.PlayerXml;

public class PlayerInsertClient {
	public static void main(String[] args) throws Exception {
		
		String address="http://localhost:8080/player/insert";
		
		Player player=new Player(0,"Mahsuni Şerif",2.5);
		
		Document document=PlayerXml.format(player);
		
		URLConnection connection=WebHelper.connect(address);
		connection.setRequestProperty("content-type", "application/xml; charset=UTF-8");
		
		XmlHelper.dump(document, connection.getOutputStream());
		
		String  result=WebHelper.read(connection.getInputStream());
		System.out.println(result);
		
		
	}


}
