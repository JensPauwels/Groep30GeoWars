package testFunctions;

import application.DbConnection;
import org.junit.Test;


public class TestFunctions {
    private DbConnection db = new DbConnection();
    private String username = "test";

    @Test
    public void basicTest() {
        Boolean x = true;
        if (!x) {
            System.err.print("basictest");
        }
    }

    @Test
    public void duplicatedUsers() throws Exception {
        String query = "select * from users where username like '" + username + "'";
        if (!db.controle(query)) {
            System.err.println("duplicatedUser");
        }
    }

    @Test
    public void controlOnLogin() throws Exception {
        String query = "select * from users where username like '" + username + "' and password like 'test123'";
        if (!db.controle(query)) {
            System.err.println("controleLogin");
        }
    }
}
