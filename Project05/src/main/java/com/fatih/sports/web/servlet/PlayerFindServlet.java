package com.fatih.sports.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.w3c.dom.Document;

import com.fatih.sports.core.utils.DataUtilities;
import com.fatih.sports.database.entity.Player;
import com.fatih.sports.database.manager.PlayerManager;
import com.fatih.sports.xml.PlayerXml;

@WebServlet("/player/find")
public class PlayerFindServlet extends HttpServlet{
	
	
	@Override
	protected void doGet (HttpServletRequest request , HttpServletResponse response)
	throws ServletException, IOException
	{
		long playerId=Long.parseLong(request.getParameter("player"));
		PlayerManager playerManager=new PlayerManager();
		Player player=playerManager.find(playerId);
		Document document=PlayerXml.format(player);
		
		response.setContentType("application/xml; charset=UTF-8");
		DataUtilities.dump(document, response.getOutputStream());
		
		
		
		
		
		
		
	}
	

}
