
package Admin;

import Conexoes.ConexaoCondominios;
import Conexoes.ConexaoMoradores;
import Propriedades.Condominio;
import Propriedades.Morador;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.w3c.dom.css.RGBColor;


public class MenuMorador extends javax.swing.JFrame {

    private File imagem;
 
    public MenuMorador() {
        initComponents();
        mostrarCond();
        desejaExluir.setVisible(false);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeAdmin.png")).getImage());
        txtNome.setBackground(Color.getHSBColor(204, 6, 29));
        btEditar.setVisible(false);
        cadImg.setVisible(false);
        btNovaFoto.setVisible(false);
        btSalvarImagem.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btDel = new javax.swing.JButton();
        btCad = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        cadImg = new javax.swing.JInternalFrame();
        btCancelar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btSelecionar = new javax.swing.JButton();
        painelNovo = new javax.swing.JPanel();
        face = new javax.swing.JLabel();
        desejaExluir = new javax.swing.JInternalFrame();
        btSim = new javax.swing.JButton();
        btNão = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMoradores = new javax.swing.JTable();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        txtNome = new javax.swing.JTextField();
        txtApto = new javax.swing.JTextField();
        txtCarro1 = new javax.swing.JTextField();
        txtCarro2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPlaca2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPlaca1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comboCond = new javax.swing.JComboBox();
        txtMetodos = new javax.swing.JTextField();
        comboMetodos = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtRg = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtTel1 = new javax.swing.JFormattedTextField();
        txtTel2 = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox();
        btSalvar = new javax.swing.JButton();
        btSalvarImagem = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        btOk = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        txtFace = new javax.swing.JLabel();
        btInserirImg = new javax.swing.JButton();
        btNovaFoto = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VIGILANTE (ADMIN) | MORADORES");
        setMinimumSize(new java.awt.Dimension(1025, 663));
        setResizable(false);
        getContentPane().setLayout(null);

        btDel.setBackground(new java.awt.Color(153, 0, 0));
        btDel.setForeground(new java.awt.Color(153, 0, 0));
        btDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/group_delete.png"))); // NOI18N
        btDel.setFocusable(false);
        btDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelActionPerformed(evt);
            }
        });
        getContentPane().add(btDel);
        btDel.setBounds(170, 10, 50, 50);

        btCad.setBackground(new java.awt.Color(0, 153, 0));
        btCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/group_add.png"))); // NOI18N
        btCad.setFocusable(false);
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });
        getContentPane().add(btCad);
        btCad.setBounds(30, 10, 50, 50);

        btEdit.setBackground(new java.awt.Color(153, 153, 0));
        btEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/group_edit.png"))); // NOI18N
        btEdit.setFocusable(false);
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });
        getContentPane().add(btEdit);
        btEdit.setBounds(100, 10, 50, 50);

        cadImg.setTitle("VIGILANTE | CADASTRO DE IMAGEM");
        cadImg.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/camera_small.png"))); // NOI18N
        cadImg.setVisible(true);

        btCancelar.setBackground(new java.awt.Color(153, 0, 0));
        btCancelar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("CANCELAR");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btCadastrar.setBackground(new java.awt.Color(0, 153, 0));
        btCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btSelecionar.setBackground(new java.awt.Color(153, 153, 0));
        btSelecionar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSelecionar.setForeground(new java.awt.Color(0, 0, 0));
        btSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder_image.png"))); // NOI18N
        btSelecionar.setText("SELECIONAR IMAGEM");
        btSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionarActionPerformed(evt);
            }
        });

        painelNovo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        javax.swing.GroupLayout painelNovoLayout = new javax.swing.GroupLayout(painelNovo);
        painelNovo.setLayout(painelNovoLayout);
        painelNovoLayout.setHorizontalGroup(
            painelNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(face, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelNovoLayout.setVerticalGroup(
            painelNovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(face, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout cadImgLayout = new javax.swing.GroupLayout(cadImg.getContentPane());
        cadImg.getContentPane().setLayout(cadImgLayout);
        cadImgLayout.setHorizontalGroup(
            cadImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadImgLayout.createSequentialGroup()
                .addGroup(cadImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadImgLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadImgLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadImgLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btSelecionar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(cadImgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        cadImgLayout.setVerticalGroup(
            cadImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadImgLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(painelNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btSelecionar)
                .addGap(38, 38, 38)
                .addComponent(btCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCancelar)
                .addGap(26, 26, 26))
        );

        getContentPane().add(cadImg);
        cadImg.setBounds(320, 60, 390, 530);

        desejaExluir.setTitle("VIGILANTE | EXCLUIR MORADOR?");
        desejaExluir.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/exclamation.png"))); // NOI18N
        desejaExluir.setVisible(true);
        desejaExluir.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                desejaExluirComponentMoved(evt);
            }
        });

        btSim.setBackground(new java.awt.Color(0, 153, 0));
        btSim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSim.setText("SIM");
        btSim.setFocusable(false);
        btSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimActionPerformed(evt);
            }
        });

        btNão.setBackground(new java.awt.Color(153, 0, 0));
        btNão.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btNão.setText("NÃO");
        btNão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNãoActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("DESEJA EXCLUIR ESSE MORADOR(A)?");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 0));
        jLabel19.setText("LEMBRANDO QUE É PERMANENTEMENTE.");

        javax.swing.GroupLayout desejaExluirLayout = new javax.swing.GroupLayout(desejaExluir.getContentPane());
        desejaExluir.getContentPane().setLayout(desejaExluirLayout);
        desejaExluirLayout.setHorizontalGroup(
            desejaExluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desejaExluirLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(desejaExluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desejaExluirLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(desejaExluirLayout.createSequentialGroup()
                        .addComponent(btSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btNão)
                        .addGap(53, 53, 53))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desejaExluirLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(40, 40, 40))
        );
        desejaExluirLayout.setVerticalGroup(
            desejaExluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desejaExluirLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(desejaExluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNão)
                    .addComponent(btSim))
                .addGap(30, 30, 30))
        );

        getContentPane().add(desejaExluir);
        desejaExluir.setBounds(340, 230, 340, 160);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MORADORES");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(550, 50, 310, 60);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("MORADORES");
        jPanel1.add(jLabel16);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 190, 390, 30);

        tbMoradores.setBackground(new java.awt.Color(204, 102, 0));
        tbMoradores.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tbMoradores.setForeground(new java.awt.Color(0, 0, 0));
        tbMoradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbMoradores.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tbMoradores.setRowHeight(23);
        tbMoradores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbMoradores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbMoradores.setShowGrid(false);
        tbMoradores.setShowHorizontalLines(true);
        tbMoradores.getTableHeader().setResizingAllowed(false);
        tbMoradores.getTableHeader().setReorderingAllowed(false);
        tbMoradores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMoradoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMoradores);
        if (tbMoradores.getColumnModel().getColumnCount() > 0) {
            tbMoradores.getColumnModel().getColumn(0).setResizable(false);
            tbMoradores.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbMoradores.getColumnModel().getColumn(1).setResizable(false);
            tbMoradores.getColumnModel().getColumn(1).setPreferredWidth(160);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 220, 390, 320);

        jSeparator12.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator12);
        jSeparator12.setBounds(430, 540, 552, 10);

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(750, 150, 230, 10);

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(430, 150, 10, 390);

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(980, 150, 20, 390);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("MORADOR");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(670, 140, 80, 20);

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(430, 150, 230, 10);

        jSeparator13.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator13.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator13);
        jSeparator13.setBounds(760, 150, 160, 10);

        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setToolTipText("NOME DO MORADOR");
        txtNome.setEnabled(false);
        getContentPane().add(txtNome);
        txtNome.setBounds(550, 190, 240, 28);

        txtApto.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtApto.setForeground(new java.awt.Color(0, 0, 0));
        txtApto.setToolTipText("APARTAMENTO");
        txtApto.setEnabled(false);
        getContentPane().add(txtApto);
        txtApto.setBounds(450, 190, 90, 28);

        txtCarro1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtCarro1.setForeground(new java.awt.Color(0, 0, 0));
        txtCarro1.setToolTipText("VEÍCULO 1 (MARCA/MODELO)");
        txtCarro1.setEnabled(false);
        getContentPane().add(txtCarro1);
        txtCarro1.setBounds(450, 410, 230, 28);

        txtCarro2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtCarro2.setForeground(new java.awt.Color(0, 0, 0));
        txtCarro2.setToolTipText("VEÍCULO 2 (MARCA/MODELO)");
        txtCarro2.setEnabled(false);
        getContentPane().add(txtCarro2);
        txtCarro2.setBounds(450, 480, 230, 28);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Apartamento");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(450, 170, 100, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("RG");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 270, 19, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CPF");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(620, 270, 25, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nome do morador");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(550, 170, 140, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Veículo 2 (Marca/Modelo)");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 460, 180, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Veículo 1 (Marca/Modelo)");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(450, 390, 190, 20);

        txtPlaca2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtPlaca2.setForeground(new java.awt.Color(0, 0, 0));
        txtPlaca2.setToolTipText("PLACA VEÍCULO 2");
        txtPlaca2.setEnabled(false);
        getContentPane().add(txtPlaca2);
        txtPlaca2.setBounds(700, 480, 110, 28);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Placa veículo 2");
        jLabel8.setToolTipText("");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(700, 460, 110, 20);

        txtPlaca1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtPlaca1.setForeground(new java.awt.Color(0, 0, 0));
        txtPlaca1.setToolTipText("PLACA VEÍCULO 1");
        txtPlaca1.setEnabled(false);
        getContentPane().add(txtPlaca1);
        txtPlaca1.setBounds(700, 410, 110, 28);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Placa veículo 1");
        jLabel9.setToolTipText("");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(700, 390, 110, 20);

        comboCond.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        comboCond.setForeground(new java.awt.Color(0, 0, 0));
        comboCond.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE O CONDOMÍNIO" }));
        comboCond.setToolTipText("SELECIONE O CONDOMÍNIO");
        getContentPane().add(comboCond);
        comboCond.setBounds(30, 90, 330, 28);

        txtMetodos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtMetodos.setToolTipText("PESQUISAR");
        getContentPane().add(txtMetodos);
        txtMetodos.setBounds(220, 150, 200, 28);

        comboMetodos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        comboMetodos.setForeground(new java.awt.Color(0, 0, 0));
        comboMetodos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "APARTAMENTO", "NOME" }));
        comboMetodos.setToolTipText("SELECIONE");
        getContentPane().add(comboMetodos);
        comboMetodos.setBounds(30, 150, 180, 28);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        jLabel11.setText("SELECIONE O CONDOMÍNIO");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 70, 190, 20);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Telefone 1");
        jLabel12.setToolTipText("");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(450, 330, 80, 20);

        jLabel13.setBackground(new java.awt.Color(255, 255, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Tipo");
        jLabel13.setToolTipText("");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(450, 220, 30, 20);

        txtRg.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRg.setToolTipText("RG");
        txtRg.setEnabled(false);
        txtRg.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        getContentPane().add(txtRg);
        txtRg.setBounds(450, 290, 140, 28);

        txtCpf.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setToolTipText("CPF");
        txtCpf.setEnabled(false);
        txtCpf.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        getContentPane().add(txtCpf);
        txtCpf.setBounds(620, 290, 140, 28);

        txtTel1.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtTel1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTel1.setToolTipText("TELEFONE 1");
        txtTel1.setEnabled(false);
        txtTel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        getContentPane().add(txtTel1);
        txtTel1.setBounds(450, 350, 140, 28);

        txtTel2.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtTel2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTel2.setToolTipText("TELEFONE 2");
        txtTel2.setEnabled(false);
        txtTel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        getContentPane().add(txtTel2);
        txtTel2.setBounds(620, 350, 140, 28);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Telefone 2");
        jLabel14.setToolTipText("");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(620, 330, 70, 20);

        comboTipo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        comboTipo.setForeground(new java.awt.Color(0, 0, 0));
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "01 - PROPRIETÁRIO(A)", "02 - MORADOR(A)", "03 - AUTORIZADO(A)", "04 - FILHO(A)", "05 - DIARISTA", "06 - ZELADOR(A)", "07 - PORTEIRO(A)", "08 - CÔNJUGE" }));
        comboTipo.setToolTipText("SELECIONE");
        comboTipo.setEnabled(false);
        getContentPane().add(comboTipo);
        comboTipo.setBounds(450, 240, 200, 28);

        btSalvar.setBackground(new java.awt.Color(0, 153, 0));
        btSalvar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("SALVAR");
        btSalvar.setEnabled(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar);
        btSalvar.setBounds(800, 550, 180, 29);

        btSalvarImagem.setBackground(new java.awt.Color(0, 0, 102));
        btSalvarImagem.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btSalvarImagem.setForeground(new java.awt.Color(255, 255, 255));
        btSalvarImagem.setText("SALVAR");
        btSalvarImagem.setEnabled(false);
        btSalvarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarImagemActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvarImagem);
        btSalvarImagem.setBounds(800, 550, 180, 29);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("MÉTODO DE BUSCA");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 130, 150, 20);

        txtId.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 0, 0));
        txtId.setText("id");
        getContentPane().add(txtId);
        txtId.setBounds(930, 20, 60, 20);

        btOk.setBackground(new java.awt.Color(0, 102, 0));
        btOk.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/accept.png"))); // NOI18N
        btOk.setFocusPainted(false);
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });
        getContentPane().add(btOk);
        btOk.setBounds(370, 90, 40, 30);

        btEditar.setBackground(new java.awt.Color(204, 204, 0));
        btEditar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btEditar.setForeground(new java.awt.Color(255, 255, 255));
        btEditar.setText("SALVAR");
        btEditar.setEnabled(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar);
        btEditar.setBounds(800, 550, 180, 29);

        painelImg.setBackground(new java.awt.Color(51, 51, 51));
        painelImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtFace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/usuario.png"))); // NOI18N
        txtFace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFaceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelImgLayout = new javax.swing.GroupLayout(painelImg);
        painelImg.setLayout(painelImgLayout);
        painelImgLayout.setHorizontalGroup(
            painelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtFace, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelImgLayout.setVerticalGroup(
            painelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtFace, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(painelImg);
        painelImg.setBounds(810, 170, 160, 190);

        btInserirImg.setBackground(new java.awt.Color(0, 102, 0));
        btInserirImg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btInserirImg.setForeground(new java.awt.Color(255, 255, 255));
        btInserirImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder_image.png"))); // NOI18N
        btInserirImg.setText("INSERIR");
        btInserirImg.setEnabled(false);
        btInserirImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirImgActionPerformed(evt);
            }
        });
        getContentPane().add(btInserirImg);
        btInserirImg.setBounds(830, 370, 120, 27);

        btNovaFoto.setBackground(new java.awt.Color(0, 0, 102));
        btNovaFoto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btNovaFoto.setForeground(new java.awt.Color(255, 255, 255));
        btNovaFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/folder_image.png"))); // NOI18N
        btNovaFoto.setText("INSERIR");
        btNovaFoto.setEnabled(false);
        btNovaFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovaFotoActionPerformed(evt);
            }
        });
        getContentPane().add(btNovaFoto);
        btNovaFoto.setBounds(830, 370, 120, 27);

        btExcluir.setBackground(new java.awt.Color(153, 0, 0));
        btExcluir.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir.setText("EXCLUIR");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(800, 550, 180, 29);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/background.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 1030, 840);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
 
        mostrarMoradores();
    }//GEN-LAST:event_btOkActionPerformed

    private void tbMoradoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMoradoresMouseClicked
        buscarMoradores();
    }//GEN-LAST:event_tbMoradoresMouseClicked

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        String escolha = comboTipo.getSelectedItem().toString();
        String cond = comboCond.getSelectedItem().toString();
        if(txtNome.getText().isEmpty() || txtApto.getText().isEmpty() || escolha.equals("-") || cond.equals("SELECIONE O CONDOMÍNIO")){
                JOptionPane.showMessageDialog(null, "Dados inválidos. Selecione o condomínio, digite o nome do morador, número do apartamento e tipo de morador para cadastrar.", "VIGILANTE | ERRO AO CADASTRAR MORADOR", JOptionPane.ERROR_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/exclamation.png")));
        }
        else{
        
        condicaoPraSalvar();
        limparCampos();
        limparTabela();
        mostrarMoradores();
        desabilitarCampos();
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        editarMorador();
        limparCampos();
        limparTabela();
        mostrarMoradores();
        desabilitarCampos();
    }//GEN-LAST:event_btEditarActionPerformed

    private void btInserirImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirImgActionPerformed
        cadImg.setVisible(true);
        /*
        imagem = salvarImagem();
        abrirImg(imagem);
        */
    }//GEN-LAST:event_btInserirImgActionPerformed

    private void txtFaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFaceMouseClicked

    }//GEN-LAST:event_txtFaceMouseClicked

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        desejaExluir.setVisible(true);
    }//GEN-LAST:event_btExcluirActionPerformed

    private void desejaExluirComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_desejaExluirComponentMoved
        desejaExluir.setLocation(340, 230);
    }//GEN-LAST:event_desejaExluirComponentMoved

    private void btSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimActionPerformed
        excluirMorador();
        desejaExluir.setVisible(false);
        limparCampos();
        limparTabela();
        mostrarMoradores();
        desabilitarCampos();
    }//GEN-LAST:event_btSimActionPerformed

    private void btNãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNãoActionPerformed
        desejaExluir.setVisible(false);
        desabilitarCampos();
        limparCampos();
        limparTabela();
        mostrarMoradores();
    }//GEN-LAST:event_btNãoActionPerformed

    private void btSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionarActionPerformed
        imagem = salvarImagem();
        abrirImg(imagem);
    }//GEN-LAST:event_btSelecionarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        abrirImg(imagem);
        cadImg.setVisible(false);
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
             cadImg.setVisible(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btNovaFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovaFotoActionPerformed
        cadImg.setVisible(true);
        habilitarCampos();
        btSalvarImagem.setVisible(true);
        btEditar.setVisible(false);
        btSalvar.setVisible(false);
        btInserirImg.setVisible(false);
    }//GEN-LAST:event_btNovaFotoActionPerformed

    private void btSalvarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarImagemActionPerformed
        editarMoradorComFoto();
        limparCampos();
        limparTabela();
        mostrarMoradores();
        desabilitarCampos();
        btSalvarImagem.setVisible(false);
        btSalvar.setVisible(true);
    }//GEN-LAST:event_btSalvarImagemActionPerformed

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
        String escolha = comboCond.getSelectedItem().toString();
        if(escolha.equals("SELECIONE O CONDOMÍNIO")){
            JOptionPane.showMessageDialog(null, "Selecione um condomínio");
        }else{
        limparCampos();
       habilitarCampos();
       btSalvar.setVisible(true);
       btEditar.setVisible(false);
       btExcluir.setVisible(false);
       btNovaFoto.setVisible(false);
       btSalvarImagem.setVisible(false);
       btInserirImg.setVisible(true);
        }
    }//GEN-LAST:event_btCadActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        String escolha = comboCond.getSelectedItem().toString();
        if(escolha.equals("SELECIONE O CONDOMÍNIO")){
            JOptionPane.showMessageDialog(null, "Selecione um condomínio");
        }else{
        
       habilitarCampos();
       btSalvar.setVisible(false);
       btEditar.setVisible(true);
       btExcluir.setVisible(false);
       btInserirImg.setVisible(false);
       btNovaFoto.setVisible(true);
        }
    }//GEN-LAST:event_btEditActionPerformed

    private void btDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelActionPerformed
        String escolha = comboCond.getSelectedItem().toString();
        if(escolha.equals("SELECIONE O CONDOMÍNIO")){
            JOptionPane.showMessageDialog(null, "Selecione um condomínio");
        }else{
        desabilitarCampos();
        btExcluir.setVisible(true);
        btExcluir.setEnabled(true);
        btSalvar.setVisible(false);
        btEditar.setVisible(false);
        btInserirImg.setEnabled(false);
        btSalvarImagem.setVisible(false);
        btNovaFoto.setVisible(false);
        }
    }//GEN-LAST:event_btDelActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMorador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCad;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDel;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserirImg;
    private javax.swing.JButton btNovaFoto;
    private javax.swing.JButton btNão;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSalvarImagem;
    private javax.swing.JButton btSelecionar;
    private javax.swing.JButton btSim;
    private javax.swing.JInternalFrame cadImg;
    private javax.swing.JComboBox comboCond;
    private javax.swing.JComboBox<String> comboMetodos;
    private javax.swing.JComboBox comboTipo;
    private javax.swing.JInternalFrame desejaExluir;
    private javax.swing.JLabel face;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private final javax.swing.JPanel painelImg = new javax.swing.JPanel();
    private javax.swing.JPanel painelNovo;
    private javax.swing.JTable tbMoradores;
    private javax.swing.JTextField txtApto;
    private javax.swing.JTextField txtCarro1;
    private javax.swing.JTextField txtCarro2;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JLabel txtFace;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtMetodos;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPlaca1;
    private javax.swing.JTextField txtPlaca2;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JFormattedTextField txtTel1;
    private javax.swing.JFormattedTextField txtTel2;
    // End of variables declaration//GEN-END:variables
        
    
        // mostrando todos os condomínios
        private void mostrarCond(){
        comboCond.removeAllItems();
        comboCond.addItem("SELECIONE O CONDOMÍNIO");
        ConexaoCondominios cond = new ConexaoCondominios();
        List<Condominio> lista = cond.ListarCondominiosCombo();
        for(Condominio c: lista){
            String nome = c.getNomeCond();
            int id = c.getIdCond();
            comboCond.addItem(nome);
        }
    }  
                  
           
        // mostrando os moradores após selecionar o condomínio
        private void mostrarMoradores(){
            int id;
            String mostrarId = "";
            
            ConexaoCondominios c = new ConexaoCondominios();
            String verificarId = comboCond.getSelectedItem().toString();  
            ResultSet result = c.verificarIdCond(verificarId);     
        try {
            while(result.next()){
                id = result.getInt("idcond");
                mostrarId = String.valueOf(id);
                txtId.setText(mostrarId);
                DefaultTableModel modeloTabela = (DefaultTableModel) tbMoradores.getModel(); 
                tbMoradores.removeAll();
                ConexaoMoradores con = new ConexaoMoradores();
                modeloTabela.setNumRows(0);              
                for(Morador m: con.listarMoradores(id)){
                modeloTabela.addRow(new Object[]{
                   "APTO. " + m.getApto()+ " > ",
                   m.getNome()
         
               });
        }
                
                
            }
        } catch (SQLException ex) {
        }
            
            
        }
        
       
        // pegando resultado da tabela e puxando do banco de dados.
        // setando o resultado nas caixas de texto.
        public void mostrarResult(String s, int i) throws SQLException{ 
        String name = s;
        int id = i;
        ConexaoMoradores moradores = new ConexaoMoradores();
        try{
        ResultSet result = moradores.mostrarMorador(name, id);
        while(result.next()){
        Morador morador = new Morador();
        morador.setApto(result.getInt("aptomorador"));
        morador.setRg(result.getString("rg"));
        morador.setCpf(result.getString("cpf"));
        morador.setTel1(result.getString("telefone1"));
        morador.setTel2(result.getString("telefone2"));
        morador.setVeiculo1(result.getString("veiculo1"));
        morador.setVeiculo2(result.getString("veiculo2"));
        morador.setPlaca1(result.getString("placa1"));
        morador.setPlaca2(result.getString("placa2"));
        morador.setNivel(result.getInt("nivel"));
        morador.setPertence(result.getInt("idpertence"));
        morador.setFace(result.getBytes("face"));
        int ap = morador.getApto();
        int nivel = morador.getNivel();
        int idpertence = morador.getPertence();
        String nomemorador = name;
        String apto = String.valueOf(ap);
        String telefone1 = morador.getTel1();
        String telefone2= morador.getTel2();
        String rg= morador.getRg();
        String cpf= morador.getCpf();
        String veiculo1 = morador.getVeiculo1();
        String veiculo2 = morador.getVeiculo2();    
        String placa1 = morador.getPlaca1();
        String placa2 = morador.getPlaca2();
        limparCampos();
        txtRg.setText(rg);
        txtCpf.setText(cpf);
        txtTel1.setText(telefone1);
        txtTel2.setText(telefone2);
        txtApto.setText(apto);
        txtNome.setText(nomemorador);
        txtCarro1.setText(veiculo1);
        txtCarro2.setText(veiculo2);
        txtPlaca1.setText(placa1);
        txtPlaca2.setText(placa2);
        txtNome.setBackground(Color.GREEN.darker().darker());
        txtNome.setForeground(Color.BLACK);
        byte [] img = (morador.getFace());
        ImageIcon icone = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(painelImg.getWidth()-2 , painelImg.getHeight()-1, 100));
        /*ImageIcon icone = new ImageIcon(morador.getFace());
        icone.setImage(icone.getImage().getScaledInstance(painelImg.getWidth()-2 , painelImg.getHeight()-1, 100)); */
        txtFace.setIcon(icone);
        
        // decidindo qual tipo de morador
         switch (nivel){
             
             // PROPRIETÁRIO(A)
             case 1:
             comboTipo.setSelectedIndex(1);
             break;
              // MORADOR(A)
             case 2:
             comboTipo.setSelectedIndex(2);
             break;
             // AUTORIZADO(A)
             case 3:
             comboTipo.setSelectedIndex(3);
             break;   
             //FILHO(A)
             case 4:
             comboTipo.setSelectedIndex(4);
             break;
             // DIARISTA
             case 5:
             comboTipo.setSelectedIndex(5);
             break;
             //ZELADOR(A) 
             case 6:
             comboTipo.setSelectedIndex(6);
             break;
             // PORTEIRO(A)
             case 7:
             comboTipo.setSelectedIndex(7);
             break;
             // CÔNJUGE
             case 8:
             comboTipo.setSelectedIndex(8);
             break;

         }
             }   
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "MenuMorador: mostrarResult:" + erro);
        }
            
        }
        
        // buscando o resultado da tabela
        public void buscarMoradores(){      
        int id;
        int linha = tbMoradores.getSelectedRow();
        String mostrarId = "";
        ConexaoCondominios c = new ConexaoCondominios();
        String verificarId = comboCond.getSelectedItem().toString();  
        ResultSet result = c.verificarIdCond(verificarId);     
        try {
            while(result.next()){
                id = result.getInt("idcond");
                mostrarResult(tbMoradores.getModel().getValueAt(linha, 1).toString(), id);
            }  
        } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "MenuMorador: buscarMoradores:" + erro);
        }
        }
        
        
        public void habilitarCampos(){
            txtApto.setEnabled(true);
            txtNome.setEnabled(true);
            txtCarro1.setEnabled(true);
            txtCarro2.setEnabled(true);
            txtCpf.setEnabled(true);
            txtPlaca1.setEnabled(true);
            txtPlaca2.setEnabled(true);
            txtRg.setEnabled(true);
            txtTel1.setEnabled(true);
            txtTel2.setEnabled(true);
            btSalvar.setEnabled(true);
            comboTipo.setEnabled(true);
            btExcluir.setEnabled(true);
            btSalvarImagem.setEnabled(true);
            btNovaFoto.setEnabled(true);
            btEditar.setEnabled(true);
            btInserirImg.setEnabled(true);
        }
        
        public void desabilitarCampos(){
            txtApto.setEnabled(false);
            txtNome.setEnabled(false);
            txtCarro1.setEnabled(false);
            txtCarro2.setEnabled(false);
            txtCpf.setEnabled(false);
            txtPlaca1.setEnabled(false);
            txtPlaca2.setEnabled(false);
            txtRg.setEnabled(false);
            txtTel1.setEnabled(false);
            txtTel2.setEnabled(false);
            btSalvar.setEnabled(false);
            comboTipo.setEnabled(false);
            btEditar.setEnabled(false);
            btInserirImg.setEnabled(false);
            btSalvarImagem.setEnabled(false);
            btNovaFoto.setEnabled(false);
            btExcluir.setEnabled(false);
        }
        
        // cadastrar morador
        public void cadastrarMorador(){
        Morador up = new Morador();  
        String escolha = comboTipo.getSelectedItem().toString();
        String cond = comboCond.getSelectedItem().toString();
        if(txtNome.getText().isEmpty() || txtApto.getText().isEmpty() || escolha.equals("-") || cond.equals("SELECIONE O CONDOMÍNIO")){
                JOptionPane.showMessageDialog(null, "Dados inválidos. Selecione o condomínio, digite o nome do morador, número do apartamento e tipo de morador para cadastrar.", "VIGILANTE | ERRO AO CADASTRAR MORADOR", JOptionPane.ERROR_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/exclamation.png")));
        } else{      
        String ap = txtApto.getText();
        String id = txtId.getText();
        int nivel = 0;  
        
        
            if(escolha.equals("-")){
                JOptionPane.showMessageDialog(null, "Escolha o tipo de morador");
            }
            if (escolha.equals("01 - PROPRIETÁRIO(A)")) {
                nivel = 1;
            }
            if (escolha.equals("02 - MORADOR(A)")) {
                nivel = 2;
            }
            if (escolha.equals("03 - AUTORIZADO(A)")) {
                nivel = 3;
            }
                if (escolha.equals("04 - FILHO(A)")) {
                    nivel = 4;
                }
                if (escolha.equals("05 - DIARISTA")) {
                    nivel = 5;
                }
                    if (escolha.equals("06 - ZELADOR(A)")) {
                        nivel = 6;
                    }
                    if (escolha.equals("07 - PORTEIRO(A)")) {
                        nivel = 7;
                    }
                        if (escolha.equals("08 - CÔNJUGE")) {
                            nivel = 8;
        }
                        
        up.setApto(Integer.parseInt(ap));
        up.setNome(txtNome.getText());
        up.setRg(txtRg.getText());
        up.setCpf(txtCpf.getText());
        up.setTel1(txtTel1.getText());
        up.setTel2(txtTel2.getText());
        up.setVeiculo1(txtCarro1.getText());
        up.setVeiculo2(txtCarro2.getText());
        up.setPlaca1(txtPlaca1.getText());
        up.setPlaca2(txtPlaca2.getText());
        up.setNivel(nivel);
        up.setFace(getFace());
        up.setPertence(Integer.parseInt(id));
        
        ConexaoMoradores cadastro = new ConexaoMoradores();
        cadastro.criarMorador(up);
        limparTabela();
        }
            
        }
        
        // editar morador sem foto
        public void editarMorador(){
        Morador up = new Morador();
        String escolha = comboTipo.getSelectedItem().toString();
        String cond = comboCond.getSelectedItem().toString();
        if(txtNome.getText().isEmpty() || txtApto.getText().isEmpty() || escolha.equals("-") || cond.equals("SELECIONE O CONDOMÍNIO")){
                JOptionPane.showMessageDialog(null, "Dados inválidos. Selecione o condomínio, digite o nome do morador, número do apartamento e tipo de morador para editar.", "VIGILANTE | ERRO AO CADASTRAR MORADOR", JOptionPane.ERROR_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/exclamation.png")));
        } else{      
        String ap = txtApto.getText();
        String id = txtId.getText();
        int nivel = 0;  
        
        
            if(escolha.equals("-")){
                JOptionPane.showMessageDialog(null, "Escolha o tipo de morador");
            }
            if (escolha.equals("01 - PROPRIETÁRIO(A)")) {
                nivel = 1;
            }
            if (escolha.equals("02 - MORADOR(A)")) {
                nivel = 2;
            }
            if (escolha.equals("03 - AUTORIZADO(A)")) {
                nivel = 3;
            }
                if (escolha.equals("04 - FILHO(A)")) {
                    nivel = 4;
                }
                if (escolha.equals("05 - DIARISTA")) {
                    nivel = 5;
                }
                    if (escolha.equals("06 - ZELADOR(A)")) {
                        nivel = 6;
                    }
                    if (escolha.equals("07 - PORTEIRO(A)")) {
                        nivel = 7;
                    }
                        if (escolha.equals("08 - CÔNJUGE")) {
                            nivel = 8;
        }
                        
        up.setApto(Integer.parseInt(ap));
        up.setNome(txtNome.getText());
        up.setRg(txtRg.getText());
        up.setCpf(txtCpf.getText());
        up.setTel1(txtTel1.getText());
        up.setTel2(txtTel2.getText());
        up.setVeiculo1(txtCarro1.getText());
        up.setVeiculo2(txtCarro2.getText());
        up.setPlaca1(txtPlaca1.getText());
        up.setPlaca2(txtPlaca2.getText());
        up.setNivel(nivel);
        up.setPertence(Integer.parseInt(id)); 
        ConexaoMoradores editar = new ConexaoMoradores();
        editar.editarMorador(up);
        limparTabela();
        }
    }
        
        
        // excluir morador
        
        public void excluirMorador(){
           
            
            
            
           Morador up = new Morador();
           String ap = txtApto.getText();
           String id = txtId.getText();
           String escolha = comboTipo.getSelectedItem().toString();
           String cond = comboCond.getSelectedItem().toString();
           
            if(txtNome.getText().isEmpty() || txtApto.getText().isEmpty() || escolha.equals("-") || cond.equals("SELECIONE O CONDOMÍNIO")){
                JOptionPane.showMessageDialog(null, "Dados inválidos. Selecione o condomínio e algum morador para excluir.");
                desejaExluir.setVisible(false);
            } else{      
           up.setNome(txtNome.getText());
           up.setApto(Integer.parseInt(ap));
           up.setPertence(Integer.parseInt(id));
           ConexaoMoradores excluir = new ConexaoMoradores();
           excluir.excluirMoradores(up);
        }
        }
        
        // limpando a tabela
        public void limparTabela() {
        DefaultTableModel modeloTabela = (DefaultTableModel) tbMoradores.getModel();
        tbMoradores.removeAll();
        modeloTabela.setNumRows(0);
        
             }
        
        // condição pra cadastrar o morador / verificar se ele não existe já naquele apartamento
        private void condicaoPraSalvar(){
        try {
            Morador morador = new Morador();
            String ap = txtApto.getText();
            String id = txtId.getText();
            morador.setNome(txtNome.getText());
            morador.setApto(Integer.parseInt(ap));
            morador.setPertence(Integer.parseInt(id));
            ConexaoMoradores con = new ConexaoMoradores();
            ResultSet resultadologin = con.verificarMorador(morador);
            if(resultadologin.next()){
                JOptionPane.showMessageDialog(null, "Morador já cadastrado . Por favor, tente outro nome de morador.", "VIGILANTE | ERRO AO CADASTRAR MORADOR", JOptionPane.ERROR_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/exclamation.png")));
            
        }else {
                this.dispose();
                cadastrarMorador();
                }

        } catch (SQLException ex) {
        }
        
       
    }
        
        public void limparCampos(){
            txtApto.setText("");
            txtNome.setText("");
            txtCarro1.setText("");
            txtCarro2.setText("");
            txtCpf.setText("");
            txtRg.setText("");
            txtPlaca1.setText("");
            txtPlaca2.setText("");
            txtTel1.setText("");
            txtTel2.setText("");
            comboTipo.setSelectedIndex(0);
            txtNome.setBackground(Color.getHSBColor(204, 6, 29));
        }
        
        
        public File salvarImagem(){
            JFileChooser escolher = new JFileChooser();
            FileNameExtensionFilter filtro =  new FileNameExtensionFilter("Imagens em JPEG e PNG", "jpg","png");
            escolher.addChoosableFileFilter(filtro);
            escolher.setAcceptAllFileFilterUsed(false);
            escolher.setDialogType(JFileChooser.OPEN_DIALOG);
            escolher.setCurrentDirectory(new File("C:"));
            escolher.showOpenDialog(this);
            
            return escolher.getSelectedFile();
        }
        
        private byte[] getFace(){
            boolean isPng = false;
            if(imagem != null){
                isPng = imagem.getName().endsWith("png");
                
                try {
                    BufferedImage image = ImageIO.read(imagem);
                    ByteArrayOutputStream out = new ByteArrayOutputStream();
                    int tipo = BufferedImage.TYPE_INT_RGB;
                    
                    
                    if(isPng){
                        tipo = BufferedImage.BITMASK;
                    }
                    
                    BufferedImage nova = new BufferedImage(painelNovo.getWidth() -2 , painelNovo.getHeight(), tipo);
                    Graphics2D g = nova.createGraphics();
                    g.setComposite(AlphaComposite.Src);
                    g.drawImage(image, 0, 0, painelNovo.getWidth() -2, painelNovo.getHeight(), null);
                    
                    if(isPng){
                       ImageIO.write(nova, "png", out);
                } else{
                        ImageIO.write(nova, "jpg", out);
                    }
                    
                    out.flush();
                    byte[] byteArray = out.toByteArray();
                    out.close();
                    return byteArray;
                    
                } catch (IOException ex) {
                }
                
            }
        return null;
        }
        
        
        private void abrirImg(Object source){
            if(source instanceof File){
                
                ImageIcon icon = new ImageIcon(imagem.getAbsolutePath());
                icon.setImage(icon.getImage().getScaledInstance(painelNovo.getWidth() , painelNovo.getHeight(), 100));
                face.setIcon(icon);
                txtFace.setIcon(icon);
                
            } else if(source instanceof byte[]){
                Morador morador = new Morador();
                byte [] img = (morador.getFace());
                ImageIcon icone = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(painelNovo.getWidth() , painelNovo.getHeight(), 100));
                //ImageIcon icon = new ImageIcon(morador.getFace());
                //icon.setImage(icon.getImage().getScaledInstance(painelImg.getWidth() -2, painelImg.getHeight(), 100));
                face.setIcon(icone);
            }
        }
        
        public void editarMoradorComFoto(){
        Morador up = new Morador();
        String escolha = comboTipo.getSelectedItem().toString();
        String cond = comboCond.getSelectedItem().toString();
        if(txtNome.getText().isEmpty() || txtApto.getText().isEmpty() || escolha.equals("-") || cond.equals("SELECIONE O CONDOMÍNIO")){
                JOptionPane.showMessageDialog(null, "Dados inválidos. Selecione o condomínio, digite o nome do morador, número do apartamento e tipo de morador para editar.", "VIGILANTE | ERRO AO CADASTRAR MORADOR", JOptionPane.ERROR_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/exclamation.png")));
        } else{      
        String ap = txtApto.getText();
        String id = txtId.getText();
        int nivel = 0;  
        
        
            if(escolha.equals("-")){
                JOptionPane.showMessageDialog(null, "Escolha o tipo de morador");
            }
            if (escolha.equals("01 - PROPRIETÁRIO(A)")) {
                nivel = 1;
            }
            if (escolha.equals("02 - MORADOR(A)")) {
                nivel = 2;
            }
            if (escolha.equals("03 - AUTORIZADO(A)")) {
                nivel = 3;
            }
                if (escolha.equals("04 - FILHO(A)")) {
                    nivel = 4;
                }
                if (escolha.equals("05 - DIARISTA")) {
                    nivel = 5;
                }
                    if (escolha.equals("06 - ZELADOR(A)")) {
                        nivel = 6;
                    }
                    if (escolha.equals("07 - PORTEIRO(A)")) {
                        nivel = 7;
                    }
                        if (escolha.equals("08 - CÔNJUGE")) {
                            nivel = 8;
        }
                        
        up.setApto(Integer.parseInt(ap));
        up.setNome(txtNome.getText());
        up.setRg(txtRg.getText());
        up.setCpf(txtCpf.getText());
        up.setTel1(txtTel1.getText());
        up.setTel2(txtTel2.getText());
        up.setVeiculo1(txtCarro1.getText());
        up.setVeiculo2(txtCarro2.getText());
        up.setPlaca1(txtPlaca1.getText());
        up.setPlaca2(txtPlaca2.getText());
        up.setFace(getFace());
        up.setNivel(nivel);
        up.setPertence(Integer.parseInt(id)); 
        ConexaoMoradores editar = new ConexaoMoradores();
        editar.editarMoradorComFoto(up);
        limparTabela();
        }
    }
       
    }       
        



