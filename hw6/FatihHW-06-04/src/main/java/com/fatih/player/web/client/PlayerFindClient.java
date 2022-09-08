package com.fatih.player.web.client;

import java.io.InputStream;

import org.w3c.dom.Document;

import com.fatih.core.utils.WebHelper;
import com.fatih.core.utils.XmlHelper;
import com.fatih.player.entity.Player;
import com.fatih.player.xml.PlayerXml;

public class PlayerFindClient {
	
	public static void main(String[] args) throws Exception {
		long productId=123;
		String address=String.format("http://localhost:8080/player/find=id=%d", productId);
		
		InputStream in=WebHelper.get(address);
		
		Document document=XmlHelper.parse(in);
		
		Player player=PlayerXml.parse(document);
		
		System.out.println(player.getPlayerId()+" "+
				player.getPlayerName()+" "
				+player.getAverageScore());
		
		
	}
	
	
	

}
