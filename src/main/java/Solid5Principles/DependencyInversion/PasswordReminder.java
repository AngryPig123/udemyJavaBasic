package Solid5Principles.DependencyInversion;

public class PasswordReminder {

    private DBConnectionInterface dbConnection;

    public PasswordReminder(DBConnectionInterface dbConnection) {
        this.dbConnection = dbConnection;
    }

}

interface DBConnectionInterface {
    int connect();
}

class MySqlConnection implements DBConnectionInterface {
    @Override
    public int connect() {
        return 1;
    }

}