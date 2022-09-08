package com.fatih.player.xml;

import static com.fatih.core.utils.XmlHelper.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.fatih.core.utils.XmlHelper;
import com.fatih.player.entity.Player;

public class PlayerXml {

	public static Document format(Player player) throws Exception {
		Document document = create("Player");
		Element pl = document.getDocumentElement();
		pl.setAttribute("id", Long.toString(player.getPlayerId()));

		addSingleElementText(document, pl, "Name", player.getPlayerName());
		addSingleElementText(document, pl, "AverageScore", player.getAverageScore());
		return document;
	}

	public static Player parsePlayerXml(InputStream in) throws ParserConfigurationException, SAXException, IOException {
		Document document = XmlHelper.parse(in);
		Element players = document.getDocumentElement();
		long playerId = XmlHelper.getAttribute(players, "id", 0);
		String playerName = XmlHelper.getSingleElementText(players, "Name", "");
		double averageScore = XmlHelper.getSingleElementText(players, "AverageScore", 0);
		Player player = new Player(playerId, playerName, averageScore);
		return player;

	}
	public static Player parse(Document document) throws ParserConfigurationException, SAXException, IOException {
		Element players = document.getDocumentElement();
		long playerId = XmlHelper.getAttribute(players, "id", 0);
		String playerName = XmlHelper.getSingleElementText(players, "Name", "");
		double averageScore = XmlHelper.getSingleElementText(players, "AverageScore", 0);
		Player player = new Player(playerId, playerName, averageScore);
		return player;

	}

}
