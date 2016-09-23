package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import sun.rmi.transport.Connection;
import utils.ConnectDatabaseUtil;

public class UserDAO {
	private ConnectDatabaseUtil mConnectDatabaseUtil;
	private Statement mStatement;
	private PreparedStatement mPreparedStatement;
	private ResultSet mResultSet;
	private Connection mConnection;

	public UserDAO() {
		super();
		mConnection = null;
		mConnectDatabaseUtil = new ConnectDatabaseUtil();
	}

}
