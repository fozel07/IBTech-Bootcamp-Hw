package com.fatih.player.database.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.fatih.player.database.manager.*;
import com.fatih.player.entity.Player;

public class PlayerManager extends BaseManager<Player> {

	public Player find(long playerId) throws Exception {
		Player player = null;
		connect();

		String sql = "SELECT * FROM employee WHERE playerId=?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setLong(1, playerId);
		ResultSet resultSet = statement.executeQuery();
		if (resultSet.next()) {
			player = parse(resultSet);
		}
		disconnect();
		return player;
	}

	public List<Player> list() throws Exception {
		connect();
		String sql = "SELECT * FROM player";
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet resultSet = statement.executeQuery();
		List<Player> playerList = parseList(resultSet);
		disconnect();
		return playerList;
	}

	protected Player parse(ResultSet resultSet) throws Exception {

		long playerId = resultSet.getLong("playerId");
		String playerName = resultSet.getString("playerName");
		double averageScore = resultSet.getDouble("averageScore");

		Player employee = new Player(playerId, playerName, averageScore);

		return employee;
	}

	public boolean insert(Player player) throws Exception {
		connect();
		String sql = "INSERT INTO player(playerName,averageScore) VALUES(?,?)";

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, player.getPlayerName());
		statement.setDouble(2, player.getAverageScore());

		int affected = statement.executeUpdate();
		disconnect();

		return affected > 0;

	}

	public boolean update(Player player) throws Exception {

		connect();

		String sql = "update Product set playerName=?, averageScore=? where playerId=?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, player.getPlayerName());
		statement.setDouble(2, player.getAverageScore());
		statement.setDouble(3, player.getPlayerId());
		int affected = statement.executeUpdate();
		disconnect();

		return affected > 0;

	}
	public boolean delete(long playerId) throws Exception {
		connect();

		String sql = "DELETE FROM player WHERE playerId=?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setLong(1, playerId);

		int affected = statement.executeUpdate();
		disconnect();

		return affected > 0;
	}
	

}
