package Controlador;

import Modelo.Conexion;
import Modelo.Ciudad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CiudadOperaciones {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Ciudad c = new Ciudad();
    
    //Consultar por nombre de la ciudad
    public List<Ciudad> ConsultarCiudad(String nombre) {
        List<Ciudad> ciudades = new ArrayList<>();
        String sql = "select * from ciudad where nombreCiudad = ?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Ciudad ciudad = new Ciudad();
                ciudad.setIdCiudad(rs.getInt("idCiudad"));
                ciudad.setNombreCiudad(rs.getString("nombreCiudad"));
                ciudad.setPoblacionCiudad(rs.getInt("poblacionCiudad"));
                ciudad.setCodigoPais(rs.getString("codigoPais"));
                ciudad.setDistrito(rs.getString("distrito"));
                
                ciudades.add(ciudad);
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar la ciudad: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return ciudades;
    }
    
    //Consultar por el pais seleccionado en el ComboBox(ComboPais)
    public List<Ciudad> ConsultarPorPais(String nombrePais) {
    List<Ciudad> ciudades = new ArrayList<>();
    String sql;

    if (nombrePais.isEmpty()) {
        sql = "SELECT * FROM ciudad";
    } else {
        sql = "SELECT c.* FROM ciudad c JOIN pais p ON c.codigoPais = p.codigoPais WHERE p.nombrePais = ?";
    }
    try (Connection con = conectar.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
        
        if (!nombrePais.isEmpty()) {
            ps.setString(1, nombrePais);
        }
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Ciudad ciudad = new Ciudad();
            ciudad.setIdCiudad(rs.getInt("idCiudad"));
            ciudad.setNombreCiudad(rs.getString("nombreCiudad"));
            ciudad.setPoblacionCiudad(rs.getInt("poblacionCiudad"));
            ciudad.setCodigoPais(rs.getString("codigoPais"));
            ciudad.setDistrito(rs.getString("distrito"));
            ciudades.add(ciudad);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al consultar ciudades: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    return ciudades;
    }
}
