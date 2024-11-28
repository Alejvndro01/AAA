package Controlador;

import Modelo.Conexion;
import Modelo.Pais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PaisOperaciones {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Pais p = new Pais();

    public int agregar(Pais pais) {  
        int r=0;
        String sql="insert into pais(codigoPais,nombrePais,continentePais,poblacionPais, tipoGobierno)values(?,?,?,?,1)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);            
            ps.setString(1,pais.getCodigoPais());
            ps.setString(2,pais.getNombrePais());
            ps.setString(3,pais.getContinentePais());
            ps.setInt(4,pais.getPoblacionPais());
            r=ps.executeUpdate();    
            if(r==1){
                return 1;
            }
            else{
                return 0;
            }
        } catch (Exception e) {
        }  
        return r;
    }
    
    public List<Pais> ConsultarPorContinente(String continente) {
        List<Pais> paises = new ArrayList<>();
        String sql;
            if (continente.isEmpty()) {
                sql = "SELECT * FROM pais"; 
            } else {
                sql = "SELECT * FROM pais WHERE continentePais = ?";
            }
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            if (!continente.isEmpty()) {
                ps.setString(1, continente);
            }
            rs = ps.executeQuery();
                while (rs.next()) {
                    Pais pais = new Pais();
                    pais.setCodigoPais(rs.getString("codigoPais"));
                    pais.setNombrePais(rs.getString("nombrePais"));
                    pais.setContinentePais(rs.getString("continentePais"));
                    pais.setPoblacionPais(rs.getInt("poblacionPais"));
                    pais.setTipoGobierno(rs.getInt("tipoGobierno"));
                    pais.setRegion(rs.getString("region"));
                    pais.setSuperficie(rs.getInt("superficie"));
                    pais.setAñoIndependencia(rs.getInt("añoIndependencia"));
                    pais.setExpectativaVida(rs.getInt("expectativaVida"));
                    pais.setPnb(rs.getFloat("pnb"));
                    pais.setJefeEstado(rs.getString("jefeEstado"));
                    pais.setCiudadCapital(rs.getInt("ciudadCapital")); 
                    pais.setIdiomaPais(rs.getString("idiomaPais"));
                    
                    paises.add(pais);
                }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al consultar los países: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return paises;
    }
    
    public int modificar(Pais pais) {  
        int r=0;
        return r;
    }
    public int eliminar(String codigo){
        int r=0;
        return r;
    }
}
