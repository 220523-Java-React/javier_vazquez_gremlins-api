package com.gremlins.repository;

import com.gremlins.model.Gremlin;
import com.gremlins.util.ConnectionUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GremlinRepository implements DAO<Gremlin> {

    @Override
    public List<Gremlin> getAll() {

        List<Gremlin> gremlins = new ArrayList<>();
        String sql = "select * from gremlins";

        try (Connection connection = ConnectionUtility.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet results = stmt.executeQuery();

            while(results.next()) {
                  gremlins.add(
                       new Gremlin()
                            .setGremlinId(results.getInt("gremlin_id"))
                            .setName(results.getString("name"))
                            .setAge(results.getInt("age"))
                            .setColor(results.getString("color"))
                            .setEvil(results.getBoolean("is_evil"))
                  );
            };
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return gremlins;
    };

    @Override
    public boolean create(Gremlin gremlin) {

        String sql = "insert into gremlins(name, age, color, is_evil) values(?, ?, ?, ?)";

        try(Connection connection = ConnectionUtility.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, gremlin.getName());
            stmt.setInt(2, gremlin.getAge());
            stmt.setString(3, gremlin.getColor());
            stmt.setBoolean(4, gremlin.getEvil());

            int success = stmt.executeUpdate();

            if (success != 0) {
                return true;
            }

        }
        catch(SQLException e) {
            e.printStackTrace();
        }

        return false;
    };
};
