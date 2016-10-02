package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import sun.rmi.transport.Connection;
import utils.ConnectDatabaseUtil;

public abstract class BaseDAO {
	protected ConnectDatabaseUtil mConnectDatabaseUtil;
	protected Statement mStatement;
	protected PreparedStatement mPreparedStatement;
	protected ResultSet mResultSet;
	protected Connection mConnection;

	public BaseDAO() {
		super();
		mConnection = null;
		mConnectDatabaseUtil = new ConnectDatabaseUtil();
	}
}
