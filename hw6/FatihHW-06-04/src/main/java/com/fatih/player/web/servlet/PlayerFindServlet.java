package com.fatih.player.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.w3c.dom.Document;

import com.fatih.core.utils.XmlHelper;
import com.fatih.player.database.manager.PlayerManager;
import com.fatih.player.entity.Player;
import com.fatih.player.xml.PlayerXml;

// htttp://localhost:8080/player/find?id=123;
@WebServlet("/player/find")
public class PlayerFindServlet extends HttpServlet {
	
	@Override
	protected void doGet (HttpServletRequest request , HttpServletResponse response)
	throws ServletException, IOException
	{
		long playerId=Long.parseLong(request.getParameter("player"));
		PlayerManager playerManager=new PlayerManager();
		Player player;
		try {
			player = playerManager.find(playerId);
			Document document=PlayerXml.format(player);
			
			response.setContentType("application/xml; charset=UTF-8");
			XmlHelper.dump(document, response.getOutputStream());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	
		
		
	}

}
