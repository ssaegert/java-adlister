import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection con;

        public MySQLAdsDao (Config config) {
            try {
                DriverManager.registerDriver(new Driver());

                con = DriverManager.getConnection(
                        config.getUrl(),
                        config.getUser(),
                        config.getPassword()
                );

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    @Override
    public List<Ad> all() {
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("select * from ads");
            return adsList(rs);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private List<Ad> adsList(ResultSet rs) throws SQLException{
            List<Ad> adList = new ArrayList<>();
            while (rs.next()) {
                adList.add(getAd(rs));
            }
            return adList;
    }

    private Ad getAd(ResultSet rs) throws SQLException {
            return new Ad(rs.getLong("id"), rs.getLong("user_Id"), rs.getString("title"), rs.getString("description"));
    }

    @Override
    public Long insert(Ad ad) {
        try {
            Statement statement = con.createStatement();
            statement.executeUpdate(createInsertQuery(ad), Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String createInsertQuery(Ad ad) {
        return "INSERT INTO ads(user_id, title, description) VALUES "
        + "(" + ad.getUserId() + ", "
        + "'" + ad.getTitle() +"', "
        + "'" + ad.getDescription() + "')";
        }

}