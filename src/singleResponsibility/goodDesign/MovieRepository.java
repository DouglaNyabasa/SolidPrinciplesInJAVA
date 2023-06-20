package singleResponsibility.goodDesign;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MovieRepository {

    public void  persistMovies(Movie movie) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/netflix";
        Connection connection = DriverManager.getConnection(url,"root","");
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO Movies (Title,Actors,likes,views,length)VALUES ("+ movie.getTitle() + ","+ movie.getActors() +","+ movie.getLikes() + movie.getViews() + ","+ movie.getLength() +")";
        statement.executeUpdate(sql);
    }
}
