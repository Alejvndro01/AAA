package Controlador;

import Modelo.Ciudad;
import Modelo.Conexion;
import Modelo.Idioma;
import Modelo.Pais;
import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Controlador implements ActionListener {

    PaisOperaciones paisOp = new PaisOperaciones();
    CiudadOperaciones CiuOp = new CiudadOperaciones();
    IdiomaOperaciones IdioOp = new IdiomaOperaciones();
    Pais p = new Pais();
    Ventana vista = new Ventana();
    DefaultTableModel modelo = new DefaultTableModel();

    public Controlador(Ventana v) {
        this.vista = v;
        //btns Pais
        this.vista.btnConsultar.addActionListener(this);
        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
        this.vista.ComboContinente.addActionListener(this);
        this.vista.ComboComparar1.addActionListener(this);
        this.vista.ComboComparar2.addActionListener(this);
        this.vista.btnComparar.addActionListener(this);
        this.vista.ComboOrdenar.addActionListener(this);

        //btns Ciudad
        this.vista.btnAgregarC.addActionListener(this);
        this.vista.btnConsultarC.addActionListener(this);
        this.vista.btnModificarC.addActionListener(this);
        this.vista.btnGuardarC.addActionListener(this);
        this.vista.btnLimpiarC.addActionListener(this);
        this.vista.btnEliminarC.addActionListener(this);
        this.vista.ComboPais.addActionListener(this);
        //btns Idioma
        this.vista.btnAgregarI.addActionListener(this);
        this.vista.btnConsultarI.addActionListener(this);
        this.vista.btnModificarI.addActionListener(this);
        this.vista.btnGuardarI.addActionListener(this);
        this.vista.btnLimpiarI.addActionListener(this);
        this.vista.btnEliminarI.addActionListener(this);
        this.vista.ComboIdioma.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//btns Pais
        if (e.getSource() == vista.ComboOrdenar) {
            ordenarAñoIndependencia();
        }

        if (e.getSource() == vista.btnComparar) {
            Comparar();
        }

        if (e.getSource() == vista.ComboContinente) {
            filtrarPorContinente();
        }
        if (e.getSource() == vista.btnAgregar) {
            agregar();
            limpiar();
        }
        if (e.getSource() == vista.btnModificar) {
          
        }
        if (e.getSource() == vista.btnGuardar) {
          
        }
        if (e.getSource() == vista.btnEliminar) {
           
        }
        if (e.getSource() == vista.btnLimpiar) {
            limpiar();
        }
//btns Ciudad
        if (e.getSource() == vista.btnConsultarC) {
            ConsultarCiudad();
        }
        if (e.getSource() == vista.btnAgregarC) {
            agregar();
            limpiar();
        }
        if (e.getSource() == vista.btnModificarC) {
          
        }
        if (e.getSource() == vista.btnGuardarC) {
          
        }
        if (e.getSource() == vista.btnEliminarC) {
           
        }
        if (e.getSource() == vista.btnLimpiarC) {
            limpiar();
        }
        if (e.getSource() == vista.ComboPais) {
            filtrarPorPais();
        }
        
//btns Idioma
if (e.getSource() == vista.btnConsultarC) {
            ConsultarCiudad();
        }
        if (e.getSource() == vista.btnAgregarI) {
        }
        if (e.getSource() == vista.btnModificarI) {      
        }
        if (e.getSource() == vista.btnGuardarI) {      
        }
        if (e.getSource() == vista.btnEliminarI) {        
        }
        if (e.getSource() == vista.btnLimpiarI) {
        }
        if (e.getSource() == vista.ComboIdioma) {
            filtrarIdiomasPorPais();
        }
    }

    void limpiar() {
        vista.txtNombrePais.setText("");
        vista.txtCodigoPais.setText("");
        vista.txtPoblacionPais.setText("");
        vista.ComboContinente.setSelectedIndex(0);
        vista.txtCodigoPais.requestFocus();
    }

   //ventana Pais
    public void agregar() {
        String codigo = vista.txtCodigoPais.getText();
        String nombre = vista.txtNombrePais.getText();
        String continente = String.valueOf(vista.ComboContinente.getSelectedItem());
        int poblacion = Integer.parseInt(vista.txtPoblacionPais.getText());
        p.setCodigoPais(codigo);
        p.setNombrePais(nombre);
        p.setContinentePais(continente);
        p.setPoblacionPais(poblacion);
        int r = paisOp.agregar(p);
        if (r == 1) {
            JOptionPane.showMessageDialog(vista, "Pais agregado con éxito.");
        } else {
            JOptionPane.showMessageDialog(vista, "Error");
        }
        limpiarTabla();
    }
    
    //Filtrar por continente
    private void filtrarPorContinente() {
        String continenteSeleccionado = String.valueOf(vista.ComboContinente.getSelectedItem());
        if("Seleccione un continente".equals(continenteSeleccionado)) {
            mostrarPaises();
        }else {
            List<Pais> paises = paisOp.ConsultarPorContinente(continenteSeleccionado);
            actualizarTabla(paises);
        }
    }
    
    private void mostrarPaises() {
        List<Pais> paises = paisOp.ConsultarPorContinente("");
        actualizarTabla(paises);
    }
    
    private void actualizarTabla(List<Pais> paises) {
        DefaultTableModel model = (DefaultTableModel) vista.jTablePais.getModel();
        model.setRowCount(0);
        
        for (Pais pais : paises) {
            Object[] row = new Object[13];
            row[0] = pais.getCodigoPais();
            row[1] = pais.getNombrePais();
            row[2] = pais.getContinentePais();
            row[3] = pais.getPoblacionPais();
            row[4] = pais.getTipoGobierno();
            row[5] = pais.getRegion();
            row[6] = pais.getSuperficie();
            row[7] = pais.getAñoIndependencia();
            row[8] = pais.getExpectativaVida();
            row[9] = pais.getPnb();
            row[10] = pais.getJefeEstado();
            row[11] = pais.getCiudadCapital();
            row[12] = pais.getIdiomaPais();

            model.addRow(row); 
    }
}
    
    //Comparar Paises
    private void Comparar() {
    String pais1 = (String) vista.ComboComparar1.getSelectedItem();
    String pais2 = (String) vista.ComboComparar2.getSelectedItem();

    if (pais1.equals("Selecciona un país:") || pais2.equals("Selecciona un país:")) {
        JOptionPane.showMessageDialog(null, "Por favor selecciona ambos países para comparar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (pais1.equals(pais2)) {
        JOptionPane.showMessageDialog(null, "No se puede comparar el mismo país. Por favor selecciona dos países diferentes.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String sql = "SELECT * FROM pais WHERE nombrePais IN (?, ?)";
    try {
        Conexion con = new Conexion();
        Connection conexion = con.getConnection();
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, pais1);
        ps.setString(2, pais2);
        
        ResultSet rs = ps.executeQuery();
        
        DefaultTableModel model = (DefaultTableModel) vista.jTablePais.getModel();
        model.setRowCount(0); // Limpiar tabla

        while (rs.next()) {
            String[] datos = new String[13];
            datos[0] = rs.getString("codigoPais");
            datos[1] = rs.getString("nombrePais");
            datos[2] = rs.getString("continentePais");
            datos[3] = rs.getString("poblacionPais");
            datos[4] = rs.getString("tipoGobierno");
            datos[5] = rs.getString("region");
            datos[6] = rs.getString("superficie");
            datos[7] = rs.getString("añoIndependencia");
            datos[8] = rs.getString("expectativaVida");
            datos[9] = rs.getString("pnb");
            datos[10] = rs.getString("jefeEstado");
            datos[11] = rs.getString("ciudadCapital");
            datos[12] = rs.getString("idiomaPais");
            
            model.addRow(datos);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al comparar países: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    //Ordenar por año independencia
    private void ordenarAñoIndependencia() {
    String criterio = (String) vista.ComboOrdenar.getSelectedItem();
    if ("Seleccione una opción:".equals(criterio)) {
        // Aquí puedes llamar a mostrarTodosLosPaises() o mostrarDatos() para mostrar todos los datos
        vista.mostrarDatos();// Muestra todos los países sin filtro
    }
    else if  (criterio.equals("Año Independencia")) {
        String sql = "SELECT * FROM pais ORDER BY añoIndependencia";
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            // Limpiar la tabla antes de agregar nuevos datos
            DefaultTableModel model = (DefaultTableModel) vista.jTablePais.getModel();
            model.setRowCount(0); // Limpiar tabla

            while (rs.next()) {
                String[] datos = new String[13];
                datos[0] = rs.getString("codigoPais");
                datos[1] = rs.getString("nombrePais");
                datos[2] = rs.getString("continentePais");
                datos[3] = rs.getString("poblacionPais");
                datos[4] = rs.getString("tipoGobierno");
                datos[5] = rs.getString("region");
                datos[6] = rs.getString("superficie");
                datos[7] = rs.getString("añoIndependencia");
                datos[8] = rs.getString("expectativaVida");
                datos[9] = rs.getString("pnb");
                datos[10] = rs.getString("jefeEstado");
                datos[11] = rs.getString("ciudadCapital");
                datos[12] = rs.getString("idiomaPais");
                
                model.addRow(datos); // Agregar fila a la tabla
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ordenar países: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

    
    //ventana Ciudad
    
    //Consultar Por Nombre
    public void ConsultarCiudad() {
        String nombre = vista.txtNombreC.getText();
        if (nombre.isEmpty()){
            JOptionPane.showMessageDialog(vista, "Porfavor ingresa el nombre", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        DefaultTableModel modelC = (DefaultTableModel) vista.jTableCiudad.getModel();
        modelC.setRowCount(0);
        
        List<Ciudad> ciudades = CiuOp.ConsultarCiudad(nombre);
        if (ciudades.isEmpty()) { 
        JOptionPane.showMessageDialog(vista, "No hay una ciudad con el nombre: " + nombre, "INFO", JOptionPane.INFORMATION_MESSAGE);
    }
        else {
            for (Ciudad ciudad : ciudades) {
                Object[] row = new Object[5];
                row[0] =ciudad.getIdCiudad();
                row[1] =ciudad.getNombreCiudad();
                row[2] =ciudad.getPoblacionCiudad();
                row[3] =ciudad.getCodigoPais();
                row[4] =ciudad.getDistrito();
                
                modelC.addRow(row);
            }
        }
    }
    
    //Filtrar por Pais
    
    private void filtrarPorPais() {
    String paisSeleccionado = String.valueOf(vista.ComboPais.getSelectedItem());

    if ("Selecciona un país:".equals(paisSeleccionado)) {
        mostrarCiudades(); // Muestra todas las ciudades cuando se selecciona la opción por defecto
    } else {
        List<Ciudad> ciudades = CiuOp.ConsultarPorPais(paisSeleccionado);
        actualizarTablaCiudades(ciudades); // Actualiza la tabla con las ciudades del país seleccionado
    }
}

   private void mostrarCiudades() {
    List<Ciudad> ciudades = CiuOp.ConsultarPorPais(""); // Asumiendo que este método recupera todas las ciudades
    actualizarTablaCiudades(ciudades); // Actualiza la tabla con todas las ciudades
}

    private void actualizarTablaCiudades(List<Ciudad> ciudades) {
    DefaultTableModel modelC = (DefaultTableModel) vista.jTableCiudad.getModel();
    modelC.setRowCount(0); // Limpiar la tabla

    for (Ciudad ciudad : ciudades) {
        Object[] row = new Object[5]; // Asegúrate de que el tamaño del arreglo coincida con el número de columnas
        row[0] = ciudad.getIdCiudad();
        row[1] = ciudad.getNombreCiudad();
        row[2] = ciudad.getPoblacionCiudad();
        row[3] = ciudad.getCodigoPais();
        row[4] = ciudad.getDistrito();

        modelC.addRow(row); // Agregar la nueva fila al modelo de la tabla
    }
}
   //Ventana Idioma
    
    //Filtrar por Pais
    private void filtrarIdiomasPorPais() {
    String paisSeleccionado = String.valueOf(vista.ComboIdioma.getSelectedItem());

    if ("Selecciona un país:".equals(paisSeleccionado)) {
        mostrarTodosLosIdiomas(); 
    } else {
        List<Idioma> idiomas = IdioOp.ConsultarPorPais(paisSeleccionado);
        actualizarTablaIdiomas(idiomas);
    }
}

    private void mostrarTodosLosIdiomas() {
        List<Idioma> idiomas = IdioOp.ConsultarPorPais(""); 
        actualizarTablaIdiomas(idiomas);
    }

    private void actualizarTablaIdiomas(List<Idioma> idiomas) {
        DefaultTableModel modelI = (DefaultTableModel) vista.jTableIdioma.getModel();
        modelI.setRowCount(0); 
            for (Idioma idioma : idiomas) {
                Object[] row = new Object[5];
                row[0] = idioma.getIdIdioma();
                row[1] = idioma.getNombreIdioma();
                row[2] = idioma.getOficial();
                row[3] = idioma.getCodigoPais();
                row[4] = idioma.getPorcentaje();

                modelI.addRow(row);
            }
    }

    void centrarCeldas(JTable tabla) {
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < vista.jTablePais.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }

    void limpiarTabla() {
        for (int i = 0; i < vista.jTablePais.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
}
