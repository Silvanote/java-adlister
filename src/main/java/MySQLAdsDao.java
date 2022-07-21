import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection = null;

    public MySQLAdsDao(Config config) {
        try {
//            Config config = new Config();
            // STEP ONE: Register Driver
            DriverManager.registerDriver(new Driver());
            // STEP TWO: Create connection
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch(SQLException e) {
            throw new RuntimeException("Error connecting to database.", e);
        }
    }


    @Override
    public List<Ad> all() {
        try {
            // STEP THREE: Create Statement object
            Statement stmt = connection.createStatement();
            // ResultSet needs to be handled, so we create an instance.
            // STEP FOUR: Execute statement
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
            List <Ad> ads = new ArrayList<>();
            while (rs.next()) {
                // STEP FIVE: Interpret ResultSet
                ads.add(new Ad(
                        rs.getLong("id"),
                        rs.getInt("user_id_"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
            }
            return ads;

        } catch(SQLException e) {
            throw new RuntimeException("Error connecting to database.", e);
        }
    }

    @Override
    public Long insert(Ad ad) {
        try {
            Statement stmt = connection.createStatement();
            String query = "INSERT INTO ads (user, id, title, description) VALUES( '"
                            + ad.getUserId() + "','"
                            + ad.getTitle() + "','"
                            + ad.getDescription() + "')";

            int stmtReturn = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                System.out.println("New record added to database" + rs.getLong(1));
            }
            return (long) stmtReturn;
        } catch (SQLException e) {
            throw new RuntimeException("Error", e);
        }
    }

    public static void main(String[] args) {
    }
    }
