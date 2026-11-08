package mate.academy;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Connection connection = ConnectionUtil.getConnection()) {
            System.out.println("Connected successfully!");
        }
    }
}