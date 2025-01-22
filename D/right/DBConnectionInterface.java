package D.right;

public interface DBConnectionInterface {
    public void connect();
}

class MySQLConnection implements DBConnectionInterface {
    public void connect() {}
}

class OracleConnection implements DBConnectionInterface {
    public void connect() {}
}

class SQLServer implements DBConnectionInterface {
    public void  connect() {}
}

class PasswordReminder {
    private dbConnection;

    public PasswordReminder(DBConnectionInterface dbConnection) {
        this.dbConnection = dbConnection;
    }
}