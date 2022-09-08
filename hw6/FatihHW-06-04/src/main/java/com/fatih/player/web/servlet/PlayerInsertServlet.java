package com.fatih.player.web.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fatih.core.utils.StreamUtilities;
import com.fatih.player.database.manager.PlayerManager;
import com.fatih.player.entity.Player;
import com.fatih.player.xml.PlayerXml;

@WebServlet("/player/insert")
public class PlayerInsertServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			Player player = PlayerXml.parsePlayerXml(request.getInputStream());
			PlayerManager playerManager = new PlayerManager();
			boolean inserted;
			inserted = playerManager.insert(player);
			String result=inserted
					?"Eklendi"
					:"Eklenmedi";
			StreamUtilities.write(response.getOutputStream(),result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
