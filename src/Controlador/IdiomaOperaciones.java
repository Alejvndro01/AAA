/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Idioma;
import Vista.Ventana;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class IdiomaOperaciones {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Idioma i = new Idioma();
    Ventana vista = new Ventana();

    //filtrar por Paises
    public List<Idioma> ConsultarPorPais(String nombrePais) {
    List<Idioma> idiomas = new ArrayList<>();
    String sql;
    if (nombrePais.isEmpty()) {
        sql = "SELECT * FROM idioma";
    } else {
        sql = "SELECT i.* FROM idioma i JOIN pais p ON i.codigoPais = p.codigoPais WHERE p.nombrePais = ?";
    }
    try (Connection con = conectar.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
        if (!nombrePais.isEmpty()) {
            ps.setString(1, nombrePais);
        }
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Idioma idioma = new Idioma();
            idioma.setIdIdioma(rs.getInt("idIdioma"));
            idioma.setNombreIdioma(rs.getString("nombreIdioma"));
            idioma.setOficial(rs.getInt("oficial"));
            idioma.setCodigoPais(rs.getString("codigoPais"));
            idioma.setPorcentaje(rs.getInt("porcentaje"));
            idiomas.add(idioma);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al consultar idiomas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    return idiomas;
}

}
