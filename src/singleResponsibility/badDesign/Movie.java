package singleResponsibility.badDesign;

import java.sql.*;

//>>>> THIS CLASS BREAKS THE SINGLE RESPONSIBILITY PRINCIPLE SINCE IT HAS TWO PURPOSES
// WHICH ARE GET THE TOTAL HOURS OF MOVIES STREAMED AND ANOTHER PURPOSE OF SAVING
// THE MOVIES TO THE DATABASE WHICH SHOULD HAVE BEEN IMPLEMENTED IN A DIFFERENT CLASS. >>>>
public class Movie {
    private String title;
    private String Actors;
    private int likes;
    private int views;
    private int length;


    //THIS METHOD IS USED TO GET THE TOTAL HOURS Of Streams
    public double getTotalHoursStreamed(){
        return (length / 3600.0) * views;
    }



    //THIS METHOD IS USED TO SAVE EACH MOVIE TO THE DATABASE
    public void  persistMovies() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/netflix";
        Connection connection = DriverManager.getConnection(url,"root","");
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO Movies (Title,Actors,likes,views,length)VALUES ("+ title + ","+ Actors +","+ likes + views + ","+ length +")";
        statement.executeUpdate(sql);
    }
    public String getActors() {
        return Actors;
    }

    public void setActors(String actors) {
        Actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
