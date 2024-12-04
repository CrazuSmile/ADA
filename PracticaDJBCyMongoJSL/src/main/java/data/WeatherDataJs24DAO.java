/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import domain.WeatherDataJs24;
import java.io.IOException;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static data.ConexionMySQL.getConnection;

/**
 *
 * @author jojosl
 */
public class WeatherDataJs24DAO {
    private static final String SQL_SELECT = "SELECT record_id, city, date, temperature_celsius FROM WeatherData_js24";
    private static final String SQL_SELECTONE = "SELECT record_id, city, date, temperature_celsius FROM WeatherData_js24 where record_id = ?";
    private static final String SQL_INSERT = "insert into WeatherData_js24(city, date, temperature_celsius) values (?, curdate(), ?)";
    private static final String SQL_UPDATE = "update WeatherData_js24 set city=?, date = curdate(), temperature_celsius=? where record_id = ?;";
    private static final String SQL_DELETE = "delete from WeatherData_js24 where record_id = ?";
    
    public List<WeatherDataJs24> seleccionar() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        WeatherDataJs24 weather = null;
        List<WeatherDataJs24> weatherDatajs24 = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int recordId = rs.getInt("record_id");
                String city = rs.getString("city");
                String date = rs.getString("date");
                int temperatureCelsius = rs.getInt("temperature_celsius");
                weather = new WeatherDataJs24(recordId, city, date, temperatureCelsius);
                weatherDatajs24.add(weather);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionMySQL.close(conn);
            ConexionMySQL.close(rs);
            ConexionMySQL.close(stmt);
        }

        return weatherDatajs24;
    }

    public List<WeatherDataJs24> seleccionarOne(WeatherDataJs24 recordId) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        WeatherDataJs24 weather = null;
        List<WeatherDataJs24> weatherData = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECTONE);
            stmt.setInt(1, recordId.getRecordId());
            rs = stmt.executeQuery();

            while (rs.next()) {
                int record = rs.getInt("record_id");
                String city = rs.getString("city");
                String date = rs.getString("date");
                int temperatureCelsius = rs.getInt("temperature_celsius");
                weather = new WeatherDataJs24(record, city, date, temperatureCelsius);
                weatherData.add(weather);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionMySQL.close(conn);
            ConexionMySQL.close(rs);
            ConexionMySQL.close(stmt);
        }

        return weatherData;
    }

    public int insertar(WeatherDataJs24 weather) {
        Connection conn = null;
        PreparedStatement stmt = null;

        int registros = 0;

        try {
            conn = ConexionMySQL.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, weather.getCity());
            stmt.setInt(2, weather.getTemperatureCelsius());
            registros = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                ConexionMySQL.close(stmt);
                ConexionMySQL.close(conn);

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int update(WeatherDataJs24 weatherId, WeatherDataJs24 weather) {
        Connection conn = null;
        PreparedStatement stmt = null;

        int registros = 0;

        try {
            conn = ConexionMySQL.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, weather.getCity());
            stmt.setInt(2, weather.getTemperatureCelsius());
            stmt
            registros = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                ConexionMySQL.close(stmt);
                ConexionMySQL.close(conn);

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int delete(WeatherDataJs24 articuloId) {
        Connection conn = null;
        PreparedStatement stmt = null;

        int registros = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, articuloId.getIdArticulo());
            registros = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
}
