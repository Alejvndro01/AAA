package Vista;
import Controlador.Controlador;
import Modelo.Conexion;
import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame{
    public Ventana() {
        initComponents();
        mostrarDatos();
        mostrarDatosC();
        mostrarDatosI();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtNombrePais = new javax.swing.JTextField();
        txtCodigoPais = new javax.swing.JTextField();
        txtPoblacionPais = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ComboContinente = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTablePais = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnComparar = new javax.swing.JButton();
        ComboComparar1 = new javax.swing.JComboBox<>();
        ComboComparar2 = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        ComboOrdenar = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        JScrollPane = new javax.swing.JScrollPane();
        jTableCiudad = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        ComboPais = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        btnAgregarC = new javax.swing.JButton();
        btnConsultarC = new javax.swing.JButton();
        btnModificarC = new javax.swing.JButton();
        btnGuardarC = new javax.swing.JButton();
        btnLimpiarC = new javax.swing.JButton();
        btnEliminarC = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableIdioma = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPorcentaje = new javax.swing.JTextField();
        txtOficial = new javax.swing.JTextField();
        txtIdioma = new javax.swing.JTextField();
        ComboIdioma = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        btnAgregarI = new javax.swing.JButton();
        btnConsultarI = new javax.swing.JButton();
        btnModificarI = new javax.swing.JButton();
        btnGuardarI = new javax.swing.JButton();
        btnLimpiarI = new javax.swing.JButton();
        btnEliminarI = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Poblacional Internacional", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txtNombrePais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCodigoPais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPoblacionPais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setText("Código");

        jLabel2.setText("Nombre");

        jLabel3.setText("Continente");

        jLabel4.setText("Población");

        ComboContinente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un continente", "Europa", "América", "Oceanía", "América del Norte", "Asia", "América del Sur", "África" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPoblacionPais, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(txtCodigoPais, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombrePais)
                    .addComponent(ComboContinente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoPais, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombrePais, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ComboContinente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPoblacionPais, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Base de Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTablePais = new javax.swing.JTable(){
            public boolean isCellEditable(int fila,int col){
                return false;
            }
        };
        jTablePais.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTablePais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Continente", "Población"
            }
        ));
        jTablePais.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTablePais.setFocusable(false);
        jTablePais.setRowMargin(4);
        jTablePais.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jTablePais);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/add.png"))); // NOI18N
        btnAgregar.setText("Agregar");

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/list.png"))); // NOI18N
        btnConsultar.setText("Consultar");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/update.png"))); // NOI18N
        btnGuardar.setText("Guardar");

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/edit.png"))); // NOI18N
        btnModificar.setText("Modificar");

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config/nuevo.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnEliminar)))
        );

        jLabel13.setText("Pais 1");

        jLabel14.setText("Pais 2");

        btnComparar.setText("Comparar");

        ComboComparar1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un país:", "Andorra", "Argentina", "Australia", "Austria", "Bélgica", "Brasil", "Canadá", "Suiza", "Chile", "China", "Colombia", "República Checa", "Alemania", "Dinamarca", "Egipto", "España", "Finlandia", "Francia", "Reino Unido", "Hungría", "Islandia", "India", "Italia", "Japón", "Kenia", "Luxemburgo", "México", "Mónaco", "Nigeria", "Países Bajos", "Noruega", "Nueva Zelanda", "Perú", "Papúa Nueva Guinea", "Polonia", "Portugal", "Rusia", "Eslovaquia", "Suecia", "Sudáfrica" }));

        ComboComparar2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un país:", "Andorra", "Argentina", "Australia", "Austria", "Bélgica", "Brasil", "Canadá", "Suiza", "Chile", "China", "Colombia", "República Checa", "Alemania", "Dinamarca", "Egipto", "España", "Finlandia", "Francia", "Reino Unido", "Hungría", "Islandia", "India", "Italia", "Japón", "Kenia", "Luxemburgo", "México", "Mónaco", "Nigeria", "Países Bajos", "Noruega", "Nueva Zelanda", "Perú", "Papúa Nueva Guinea", "Polonia", "Portugal", "Rusia", "Eslovaquia", "Suecia", "Sudáfrica" }));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboComparar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboComparar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnComparar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(ComboComparar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(ComboComparar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnComparar)
                .addContainerGap())
        );

        jLabel15.setText("Ordenar por");

        ComboOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción:", "Año Independencia", "Ciudades mas pobladas", "Idioma mas hablado" }));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(ComboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Paises", jPanel3);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jTableCiudad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Población", "País", "Distrito"
            }
        ));
        JScrollPane.setViewportView(jTableCiudad);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setText("Nombre ciudad");

        jLabel6.setText("País");

        jLabel7.setText("Distrito");

        jLabel8.setText("Población");

        ComboPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un país:", "Andorra", "Argentina", "Australia", "Austria", "Bélgica", "Brasil", "Canadá", "Suiza", "Chile", "China", "Colombia", "República Checa", "Alemania", "Dinamarca", "Egipto", "España", "Finlandia", "Francia", "Reino Unido", "Hungría", "Islandia", "India", "Italia", "Japón", "Kenia", "Luxemburgo", "México", "Mónaco", "Nigeria", "Países Bajos", "Noruega", "Nueva Zelanda", "Perú", "Papúa Nueva Guinea", "Polonia", "Portugal", "Rusia", "Eslovaquia", "Suecia", "Sudáfrica" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreC, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addComponent(ComboPais, 0, 1, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ComboPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgregarC.setText("Agregar");

        btnConsultarC.setText("Consultar");

        btnModificarC.setText("Modificar");

        btnGuardarC.setText("Guardar");

        btnLimpiarC.setText("Limpiar");

        btnEliminarC.setText("Eliminar");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnAgregarC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultarC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarC))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnGuardarC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiarC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarC)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarC)
                    .addComponent(btnConsultarC)
                    .addComponent(btnModificarC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarC)
                    .addComponent(btnLimpiarC)
                    .addComponent(btnEliminarC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ciudades", jPanel1);

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        jTableIdioma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Oficial", "País", "Porcentaje"
            }
        ));
        jScrollPane1.setViewportView(jTableIdioma);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel9.setText("Nombre");

        jLabel10.setText("Oficial");

        jLabel11.setText("Porcentaje");

        jLabel12.setText("País");

        ComboIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un país:", "Andorra", "Argentina", "Australia", "Austria", "Bélgica", "Brasil", "Canadá", "Suiza", "Chile", "China", "Colombia", "República Checa", "Alemania", "Dinamarca", "Egipto", "España", "Finlandia", "Francia", "Reino Unido", "Hungría", "Islandia", "India", "Italia", "Japón", "Kenia", "Luxemburgo", "México", "Mónaco", "Nigeria", "Países Bajos", "Noruega", "Nueva Zelanda", "Perú", "Papúa Nueva Guinea", "Polonia", "Portugal", "Rusia", "Eslovaquia", "Suecia", "Sudáfrica" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOficial)
                            .addComponent(txtIdioma)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPorcentaje)
                            .addComponent(ComboIdioma, 0, 151, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtOficial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ComboIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgregarI.setText("Agregar");

        btnConsultarI.setText("Consultar");

        btnModificarI.setText("Modificar");

        btnGuardarI.setText("Guardar");

        btnLimpiarI.setText("Limpiar");

        btnEliminarI.setText("Eliminar");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(btnAgregarI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultarI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarI))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(btnGuardarI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiarI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarI)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarI)
                    .addComponent(btnConsultarI)
                    .addComponent(btnModificarI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarI)
                    .addComponent(btnLimpiarI)
                    .addComponent(btnEliminarI))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Idiomas", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Mostrar Datos Pais
    public void mostrarDatos() {
        String sql = "SELECT * FROM pais";
        Statement st; 
        Conexion con = new Conexion();
        Connection conexion = con.getConnection();

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Cod.");
            model.addColumn("Nombre");
            model.addColumn("Continente");
            model.addColumn("Población");
            model.addColumn("Gob.");
            model.addColumn("Región");
            model.addColumn("Superficie");
            model.addColumn("Año I.");
            model.addColumn("Exp V.");
            model.addColumn("PNB");
            model.addColumn("Jefe Estado");
            model.addColumn("C. Capital");
            model.addColumn("Idioma");

            jTablePais.setModel(model);

            String[] datos = new String[13]; 
            try {
                st = conexion.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
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
                JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
    }  
    
    //Mostrar Datos Ciudades
    public void mostrarDatosC(){
        String sql = "select * from ciudad";
        Statement st;
        Conexion con = new Conexion();
        Connection conexion = con.getConnection();
        
        DefaultTableModel modelC = new DefaultTableModel();
        modelC.addColumn("ID");
        modelC.addColumn("Nombre");
        modelC.addColumn("Población");
        modelC.addColumn("País");
        modelC.addColumn("Distrito");
        jTableCiudad.setModel(modelC);
        
        String[] datos = new String[5];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelC.addRow(datos);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } 
    }
    
    //Mostrar Datos Idiomas
    public void mostrarDatosI(){
        String sql = "select * from idioma";
        Statement st; 
        Conexion con = new Conexion();
        Connection conexion = con.getConnection();
        
        DefaultTableModel ModelIdio = new DefaultTableModel();
        ModelIdio.addColumn("ID");
        ModelIdio.addColumn("Idioma");
        ModelIdio.addColumn("Oficial");
        ModelIdio.addColumn("Codigo Pais");
        ModelIdio.addColumn("Porcentaje");
        jTableIdioma.setModel(ModelIdio);
        
        String[] datos = new String[6];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                ModelIdio.addRow(datos); 
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        }
}
    
    public static void main(String args[]) {
        Ventana ventana=new Ventana();
        Controlador con=new Controlador(ventana);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);        
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> ComboComparar1;
    public javax.swing.JComboBox<String> ComboComparar2;
    public javax.swing.JComboBox<String> ComboContinente;
    public javax.swing.JComboBox<String> ComboIdioma;
    public javax.swing.JComboBox<String> ComboOrdenar;
    public javax.swing.JComboBox<String> ComboPais;
    public javax.swing.JScrollPane JScrollPane;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnAgregarC;
    public javax.swing.JButton btnAgregarI;
    public javax.swing.JButton btnComparar;
    public javax.swing.JButton btnConsultar;
    public javax.swing.JButton btnConsultarC;
    public javax.swing.JButton btnConsultarI;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnEliminarC;
    public javax.swing.JButton btnEliminarI;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnGuardarC;
    public javax.swing.JButton btnGuardarI;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnLimpiarC;
    public javax.swing.JButton btnLimpiarI;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnModificarC;
    public javax.swing.JButton btnModificarI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTableCiudad;
    public javax.swing.JTable jTableIdioma;
    public javax.swing.JTable jTablePais;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    public javax.swing.JTextField txtCodigoPais;
    public javax.swing.JTextField txtIdioma;
    public javax.swing.JTextField txtNombreC;
    public javax.swing.JTextField txtNombrePais;
    public javax.swing.JTextField txtOficial;
    public javax.swing.JTextField txtPoblacionPais;
    public javax.swing.JTextField txtPorcentaje;
    // End of variables declaration//GEN-END:variables
}
