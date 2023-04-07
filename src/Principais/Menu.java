
package Principais;

import Admin.MenuAdmin;
import Conexoes.ConexaoCondominios;
import Conexoes.ConexaoMoradores;
import Conexoes.ConexaoTerceiros;
import Conexoes.ConexaoUsuarios;
import Propriedades.Condominio;
import Propriedades.Morador;
import Propriedades.Terceiros;
import Propriedades.Usuario;
import Secundarias.CaixaDeEntrada;
import Secundarias.ConsultaEntradas;
import Secundarias.NotasVersao;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;



public class Menu extends javax.swing.JFrame {
    

    ImageIcon ii;
    public Menu() {
       initComponents();
       setExtendedState(MAXIMIZED_BOTH);
       this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon.png")).getImage());
       mostrarCond();
       frameImagens.setVisible(false);
       pImagens.setVisible(false);
       desejaSair.setVisible(false);
       fTrocarUser.setVisible(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pMenuMBEC = new javax.swing.JTabbedPane();
        pMoradores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMoradores = new javax.swing.JTable();
        btPesquisarApto = new javax.swing.JButton();
        txtApto = new javax.swing.JTextField();
        pM = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btAbrirInfoMorador = new javax.swing.JButton();
        btCorrespondencia = new javax.swing.JButton();
        painelMorador = new javax.swing.JPanel();
        imgFace = new javax.swing.JLabel();
        btNota = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        pBuscar = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbBusca = new javax.swing.JTable();
        pBM = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btBuscarNome = new javax.swing.JButton();
        pEntrada = new javax.swing.JPanel();
        obsTerceiro = new javax.swing.JTextField();
        txtNomeTerceiro = new javax.swing.JTextField();
        txtRgTerceiro = new javax.swing.JFormattedTextField();
        txtCpfTerceiro = new javax.swing.JFormattedTextField();
        comboTerceiro = new javax.swing.JComboBox<>();
        placaTerceiro = new javax.swing.JTextField();
        veiculoTerceiro = new javax.swing.JTextField();
        txtDataVisitante = new javax.swing.JLabel();
        txtHoraVisitante = new javax.swing.JLabel();
        aptoTerceiro = new javax.swing.JTextField();
        btRegistrar = new javax.swing.JButton();
        btCancelarRegistro = new javax.swing.JButton();
        pRE = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        desejaSair = new javax.swing.JInternalFrame();
        jPanel6 = new javax.swing.JPanel();
        btSim = new javax.swing.JButton();
        btNão = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pImagens = new javax.swing.JPanel();
        txt = new javax.swing.JLabel();
        frameImagens = new javax.swing.JInternalFrame();
        jSeparator2 = new javax.swing.JSeparator();
        btFecharImgs = new javax.swing.JButton();
        painelTeste = new javax.swing.JPanel();
        painelTeste1 = new javax.swing.JPanel();
        painelTeste2 = new javax.swing.JPanel();
        painelTeste3 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        pCDES = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbEntradas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btLimparEntradas = new javax.swing.JButton();
        fTrocarUser = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        btSairSis = new javax.swing.JButton();
        btTrocar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        condEscolha = new javax.swing.JComboBox();
        txtId = new javax.swing.JLabel();
        txtbv = new javax.swing.JLabel();
        btOk = new javax.swing.JButton();
        ip = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        btMax = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        btMin = new javax.swing.JButton();
        key = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        mailbox = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        cam = new javax.swing.JLabel();
        sync = new javax.swing.JLabel();
        usericon = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIGILANTE | Sua segurança realmente importa!  - / Sua licença expira em: 01/01/2024 às 00:01 \\  -  BETA 0.1.18 rev0.4");
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        pMenuMBEC.setBackground(new java.awt.Color(1, 3, 73));
        pMenuMBEC.setForeground(new java.awt.Color(255, 255, 255));
        pMenuMBEC.setToolTipText("");
        pMenuMBEC.setFont(new java.awt.Font("Myanmar Text", 1, 12)); // NOI18N

        pMoradores.setBackground(new java.awt.Color(255, 255, 255));
        pMoradores.setToolTipText("MORADORES");

        tbMoradores.setAutoCreateRowSorter(true);
        tbMoradores.setBackground(new java.awt.Color(1, 3, 73));
        tbMoradores.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tbMoradores.setForeground(new java.awt.Color(204, 204, 204));
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
        tbMoradores.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tbMoradores.setSelectionForeground(new java.awt.Color(1, 3, 73));
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
            tbMoradores.getColumnModel().getColumn(1).setPreferredWidth(170);
        }

        btPesquisarApto.setBackground(new java.awt.Color(0, 153, 0));
        btPesquisarApto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btPesquisarApto.setForeground(new java.awt.Color(0, 0, 0));
        btPesquisarApto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/magnifier.png"))); // NOI18N
        btPesquisarApto.setToolTipText("BUSCAR");
        btPesquisarApto.setBorder(null);
        btPesquisarApto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarAptoActionPerformed(evt);
            }
        });

        txtApto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtApto.setForeground(new java.awt.Color(0, 0, 0));
        txtApto.setToolTipText("DIGITE O APARTAMENTO");
        txtApto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APARTAMENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        pM.setBackground(new java.awt.Color(0, 153, 0));
        pM.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MORADORES");
        pM.add(jLabel7);
        jLabel7.setBounds(140, 0, 94, 21);

        btAbrirInfoMorador.setBackground(new java.awt.Color(153, 153, 153));
        btAbrirInfoMorador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pencil.png"))); // NOI18N
        btAbrirInfoMorador.setToolTipText("INFORMAÇÕES");
        btAbrirInfoMorador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        btAbrirInfoMorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirInfoMoradorActionPerformed(evt);
            }
        });

        btCorrespondencia.setBackground(new java.awt.Color(102, 102, 102));
        btCorrespondencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/email.png"))); // NOI18N
        btCorrespondencia.setToolTipText("NOVA CORRESPONDÊNCIA");
        btCorrespondencia.setFocusPainted(false);
        btCorrespondencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCorrespondenciaActionPerformed(evt);
            }
        });

        painelMorador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        imgFace.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        imgFace.setForeground(new java.awt.Color(0, 0, 102));
        imgFace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout painelMoradorLayout = new javax.swing.GroupLayout(painelMorador);
        painelMorador.setLayout(painelMoradorLayout);
        painelMoradorLayout.setHorizontalGroup(
            painelMoradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgFace, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelMoradorLayout.setVerticalGroup(
            painelMoradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgFace, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btNota.setBackground(new java.awt.Color(153, 153, 0));
        btNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/note.png"))); // NOI18N
        btNota.setToolTipText("INSERIR NOTA");
        btNota.setFocusPainted(false);
        btNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNotaActionPerformed(evt);
            }
        });

        lbNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNome.setForeground(new java.awt.Color(0, 0, 102));
        lbNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pMoradoresLayout = new javax.swing.GroupLayout(pMoradores);
        pMoradores.setLayout(pMoradoresLayout);
        pMoradoresLayout.setHorizontalGroup(
            pMoradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMoradoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pMoradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pMoradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                        .addComponent(pM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pMoradoresLayout.createSequentialGroup()
                            .addGroup(pMoradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pMoradoresLayout.createSequentialGroup()
                                    .addComponent(txtApto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btPesquisarApto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pMoradoresLayout.createSequentialGroup()
                                    .addComponent(btCorrespondencia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btNota, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelMorador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btAbrirInfoMorador, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pMoradoresLayout.setVerticalGroup(
            pMoradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMoradoresLayout.createSequentialGroup()
                .addGroup(pMoradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pMoradoresLayout.createSequentialGroup()
                        .addGroup(pMoradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pMoradoresLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtApto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pMoradoresLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btPesquisarApto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pMoradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCorrespondencia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNota, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pMoradoresLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pMoradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAbrirInfoMorador)
                            .addComponent(painelMorador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNome, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pM, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pMenuMBEC.addTab("MORADORES", new javax.swing.ImageIcon(getClass().getResource("/Imagens/grupoImg.png")), pMoradores); // NOI18N

        pBuscar.setBackground(new java.awt.Color(255, 255, 255));
        pBuscar.setToolTipText("BUSCAR");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setToolTipText("DIGITE O NOME");
        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIGITE O NOME", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        tbBusca.setBackground(new java.awt.Color(1, 3, 73));
        tbBusca.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tbBusca.setForeground(new java.awt.Color(204, 204, 204));
        tbBusca.setModel(new javax.swing.table.DefaultTableModel(
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
        tbBusca.setRowHeight(23);
        tbBusca.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tbBusca.setSelectionForeground(new java.awt.Color(1, 3, 73));
        tbBusca.setShowHorizontalLines(true);
        tbBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBuscaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbBusca);
        if (tbBusca.getColumnModel().getColumnCount() > 0) {
            tbBusca.getColumnModel().getColumn(0).setResizable(false);
            tbBusca.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbBusca.getColumnModel().getColumn(1).setResizable(false);
            tbBusca.getColumnModel().getColumn(1).setPreferredWidth(170);
        }

        pBM.setBackground(new java.awt.Color(204, 204, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("BUSCA DE MORADORES");

        javax.swing.GroupLayout pBMLayout = new javax.swing.GroupLayout(pBM);
        pBM.setLayout(pBMLayout);
        pBMLayout.setHorizontalGroup(
            pBMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBMLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel6)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        pBMLayout.setVerticalGroup(
            pBMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        btBuscarNome.setBackground(new java.awt.Color(0, 153, 0));
        btBuscarNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/magnifier.png"))); // NOI18N
        btBuscarNome.setToolTipText("BUSCAR");
        btBuscarNome.setBorder(null);
        btBuscarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBuscarLayout = new javax.swing.GroupLayout(pBuscar);
        pBuscar.setLayout(pBuscarLayout);
        pBuscarLayout.setHorizontalGroup(
            pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pBuscarLayout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pBM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pBuscarLayout.setVerticalGroup(
            pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(pBM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pMenuMBEC.addTab("BUSCAR", new javax.swing.ImageIcon(getClass().getResource("/Imagens/magnifier.png")), pBuscar); // NOI18N

        pEntrada.setBackground(new java.awt.Color(255, 255, 255));
        pEntrada.setToolTipText("REGISTRAR ENTRADA");

        obsTerceiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        obsTerceiro.setForeground(new java.awt.Color(0, 0, 0));
        obsTerceiro.setToolTipText("OBSERVAÇÕES");
        obsTerceiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OBSERVAÇÕES", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        txtNomeTerceiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNomeTerceiro.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeTerceiro.setToolTipText("DIGITE O NOME");
        txtNomeTerceiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIGITE O NOME", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        txtRgTerceiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        txtRgTerceiro.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtRgTerceiro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRgTerceiro.setToolTipText("RG");
        txtRgTerceiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtCpfTerceiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        txtCpfTerceiro.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCpfTerceiro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfTerceiro.setToolTipText("CPF");
        txtCpfTerceiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        comboTerceiro.setBackground(new java.awt.Color(255, 255, 255));
        comboTerceiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboTerceiro.setForeground(new java.awt.Color(0, 0, 0));
        comboTerceiro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "01 - PRESTADOR(A)", "02 - VISITANTE", "03 - DIARISTA", "04 - AGENTE DE SAÚDE", "05 - BABÁ", "06 - JARDINEIRO(A)", "07 - CORRETOR(A)", "08 - CONDOMÍNIO" }));
        comboTerceiro.setToolTipText("SELECIONE O TIPO DE ENTRADA");
        comboTerceiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SELECIONE O TIPO DE ENTRADA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        placaTerceiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        placaTerceiro.setForeground(new java.awt.Color(0, 0, 0));
        placaTerceiro.setToolTipText("PLACA");
        placaTerceiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PLACA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        veiculoTerceiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        veiculoTerceiro.setForeground(new java.awt.Color(0, 0, 0));
        veiculoTerceiro.setToolTipText("VEÍCULO");
        veiculoTerceiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VEÍCULO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        txtDataVisitante.setBackground(new java.awt.Color(255, 255, 255));
        txtDataVisitante.setForeground(new java.awt.Color(255, 255, 255));
        txtDataVisitante.setText("data/hora");

        txtHoraVisitante.setBackground(new java.awt.Color(255, 255, 255));
        txtHoraVisitante.setForeground(new java.awt.Color(255, 255, 255));
        txtHoraVisitante.setText("data/hora");

        aptoTerceiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aptoTerceiro.setForeground(new java.awt.Color(0, 0, 0));
        aptoTerceiro.setToolTipText("DIGITE O APARTAMENTO");
        aptoTerceiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APARTAMENTO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        btRegistrar.setBackground(new java.awt.Color(0, 153, 0));
        btRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btRegistrar.setText("REGISTRAR");
        btRegistrar.setToolTipText("REGISTRAR");
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });

        btCancelarRegistro.setBackground(new java.awt.Color(153, 0, 0));
        btCancelarRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCancelarRegistro.setForeground(new java.awt.Color(0, 0, 0));
        btCancelarRegistro.setText("CANCELAR");
        btCancelarRegistro.setToolTipText("CANCELAR");

        pRE.setBackground(new java.awt.Color(0, 51, 153));
        pRE.setForeground(new java.awt.Color(0, 0, 153));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("REGISTRAR ENTRADA");

        javax.swing.GroupLayout pRELayout = new javax.swing.GroupLayout(pRE);
        pRE.setLayout(pRELayout);
        pRELayout.setHorizontalGroup(
            pRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRELayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel8)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        pRELayout.setVerticalGroup(
            pRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRELayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        javax.swing.GroupLayout pEntradaLayout = new javax.swing.GroupLayout(pEntrada);
        pEntrada.setLayout(pEntradaLayout);
        pEntradaLayout.setHorizontalGroup(
            pEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pEntradaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btCancelarRegistro)
                                .addComponent(btRegistrar))
                            .addGroup(pEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pEntradaLayout.createSequentialGroup()
                                    .addComponent(txtHoraVisitante)
                                    .addGap(36, 36, 36)
                                    .addComponent(txtDataVisitante))
                                .addGroup(pEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomeTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pEntradaLayout.createSequentialGroup()
                                        .addComponent(txtRgTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCpfTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pEntradaLayout.createSequentialGroup()
                                    .addComponent(comboTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(aptoTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pEntradaLayout.createSequentialGroup()
                                        .addComponent(veiculoTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(placaTerceiro))
                                    .addComponent(obsTerceiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pEntradaLayout.setVerticalGroup(
            pEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEntradaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(pRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRgTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpfTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aptoTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(placaTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veiculoTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(obsTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRegistrar)
                .addGap(17, 17, 17)
                .addComponent(btCancelarRegistro)
                .addGap(62, 62, 62)
                .addGroup(pEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataVisitante)
                    .addComponent(txtHoraVisitante))
                .addGap(21, 21, 21))
        );

        pMenuMBEC.addTab("REGISTRAR ENTRADA", new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png")), pEntrada); // NOI18N

        getContentPane().add(pMenuMBEC);
        pMenuMBEC.setBounds(0, 490, 410, 590);
        pMenuMBEC.getAccessibleContext().setAccessibleName("");

        desejaSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        desejaSair.setTitle("VIGILANTE | SAIR DO SISTEMA?");
        desejaSair.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/exclamation.png"))); // NOI18N
        desejaSair.setVisible(true);
        desejaSair.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                desejaSairComponentMoved(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(1, 3, 73));

        btSim.setBackground(new java.awt.Color(0, 153, 0));
        btSim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSim.setForeground(new java.awt.Color(255, 255, 255));
        btSim.setText("SIM");
        btSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimActionPerformed(evt);
            }
        });

        btNão.setBackground(new java.awt.Color(153, 0, 0));
        btNão.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btNão.setForeground(new java.awt.Color(255, 255, 255));
        btNão.setText("NÃO");
        btNão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNãoActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 0, 0));
        jLabel19.setText("DESEJA SAIR DO SISTEMA?");
        jLabel19.setToolTipText("");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("APÓS SAIR O SISTEMA SERÁ FECHADO !");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(0, 63, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(77, 77, Short.MAX_VALUE)
                            .addComponent(jLabel19)
                            .addGap(22, 22, 22))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(btSim)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                            .addComponent(btNão)))
                    .addGap(53, 53, 53)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel20)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btSim)
                        .addComponent(btNão))
                    .addContainerGap(34, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout desejaSairLayout = new javax.swing.GroupLayout(desejaSair.getContentPane());
        desejaSair.getContentPane().setLayout(desejaSairLayout);
        desejaSairLayout.setHorizontalGroup(
            desejaSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desejaSairLayout.setVerticalGroup(
            desejaSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(desejaSair);
        desejaSair.setBounds(420, 220, 340, 160);

        pImagens.setBackground(new java.awt.Color(0, 153, 153));
        pImagens.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txt.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txt.setForeground(new java.awt.Color(255, 255, 255));
        txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt.setText("CÂMERAS");
        txt.setMaximumSize(new java.awt.Dimension(71, 18));
        txt.setMinimumSize(new java.awt.Dimension(71, 18));
        txt.setPreferredSize(new java.awt.Dimension(71, 18));

        javax.swing.GroupLayout pImagensLayout = new javax.swing.GroupLayout(pImagens);
        pImagens.setLayout(pImagensLayout);
        pImagensLayout.setHorizontalGroup(
            pImagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, 1078, Short.MAX_VALUE)
        );
        pImagensLayout.setVerticalGroup(
            pImagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pImagens);
        pImagens.setBounds(810, 190, 1080, 20);

        frameImagens.setBackground(new java.awt.Color(255, 255, 255));
        frameImagens.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        frameImagens.setForeground(new java.awt.Color(0, 0, 0));
        frameImagens.setToolTipText("");
        frameImagens.setEnabled(false);
        frameImagens.setFocusable(false);
        frameImagens.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cameraLogo.png"))); // NOI18N
        frameImagens.setRequestFocusEnabled(false);
        frameImagens.setVisible(true);
        frameImagens.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                frameImagensComponentMoved(evt);
            }
        });
        frameImagens.getContentPane().setLayout(null);

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        frameImagens.getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 260, 1460, 3);

        btFecharImgs.setBackground(new java.awt.Color(153, 0, 0));
        btFecharImgs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel.png"))); // NOI18N
        btFecharImgs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharImgsActionPerformed(evt);
            }
        });
        frameImagens.getContentPane().add(btFecharImgs);
        btFecharImgs.setBounds(1050, 10, 22, 23);

        javax.swing.GroupLayout painelTesteLayout = new javax.swing.GroupLayout(painelTeste);
        painelTeste.setLayout(painelTesteLayout);
        painelTesteLayout.setHorizontalGroup(
            painelTesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        painelTesteLayout.setVerticalGroup(
            painelTesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        frameImagens.getContentPane().add(painelTeste);
        painelTeste.setBounds(0, 0, 540, 260);

        javax.swing.GroupLayout painelTeste1Layout = new javax.swing.GroupLayout(painelTeste1);
        painelTeste1.setLayout(painelTeste1Layout);
        painelTeste1Layout.setHorizontalGroup(
            painelTeste1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        painelTeste1Layout.setVerticalGroup(
            painelTeste1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        frameImagens.getContentPane().add(painelTeste1);
        painelTeste1.setBounds(0, 260, 540, 275);

        javax.swing.GroupLayout painelTeste2Layout = new javax.swing.GroupLayout(painelTeste2);
        painelTeste2.setLayout(painelTeste2Layout);
        painelTeste2Layout.setHorizontalGroup(
            painelTeste2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        painelTeste2Layout.setVerticalGroup(
            painelTeste2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        frameImagens.getContentPane().add(painelTeste2);
        painelTeste2.setBounds(542, 0, 540, 260);

        javax.swing.GroupLayout painelTeste3Layout = new javax.swing.GroupLayout(painelTeste3);
        painelTeste3.setLayout(painelTeste3Layout);
        painelTeste3Layout.setHorizontalGroup(
            painelTeste3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        painelTeste3Layout.setVerticalGroup(
            painelTeste3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        frameImagens.getContentPane().add(painelTeste3);
        painelTeste3.setBounds(542, 260, 540, 275);

        jSeparator3.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        frameImagens.getContentPane().add(jSeparator3);
        jSeparator3.setBounds(540, 0, 20, 537);

        getContentPane().add(frameImagens);
        frameImagens.setBounds(810, 210, 1080, 560);

        pCDES.setBackground(new java.awt.Color(153, 51, 0));

        tbEntradas.setAutoCreateRowSorter(true);
        tbEntradas.setBackground(new java.awt.Color(0, 153, 0));
        tbEntradas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbEntradas.setForeground(new java.awt.Color(0, 0, 0));
        tbEntradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "APTO.", "NOME/TIPO", "DATA/HORA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbEntradas.setToolTipText("");
        tbEntradas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tbEntradas.setRowHeight(22);
        tbEntradas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbEntradas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbEntradas.setShowGrid(false);
        tbEntradas.getTableHeader().setResizingAllowed(false);
        tbEntradas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbEntradas);
        if (tbEntradas.getColumnModel().getColumnCount() > 0) {
            tbEntradas.getColumnModel().getColumn(0).setResizable(false);
            tbEntradas.getColumnModel().getColumn(0).setPreferredWidth(3);
            tbEntradas.getColumnModel().getColumn(1).setResizable(false);
            tbEntradas.getColumnModel().getColumn(1).setPreferredWidth(110);
            tbEntradas.getColumnModel().getColumn(2).setResizable(false);
            tbEntradas.getColumnModel().getColumn(2).setPreferredWidth(40);
        }

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CONTROLE DE ENTRADAS/SAÍDAS");
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout pCDESLayout = new javax.swing.GroupLayout(pCDES);
        pCDES.setLayout(pCDESLayout);
        pCDESLayout.setHorizontalGroup(
            pCDESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCDESLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(77, 77, 77))
        );
        pCDESLayout.setVerticalGroup(
            pCDESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCDESLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pCDES);
        pCDES.setBounds(410, 660, 380, 420);

        btLimparEntradas.setBackground(new java.awt.Color(1, 3, 73));
        btLimparEntradas.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btLimparEntradas.setForeground(new java.awt.Color(255, 255, 255));
        btLimparEntradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/exclamation.png"))); // NOI18N
        btLimparEntradas.setText("LIMPAR ENTRADAS");
        btLimparEntradas.setToolTipText("LIMPAR ENTRADAS");
        btLimparEntradas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btLimparEntradas.setFocusable(false);
        btLimparEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparEntradasActionPerformed(evt);
            }
        });
        getContentPane().add(btLimparEntradas);
        btLimparEntradas.setBounds(411, 630, 170, 30);

        fTrocarUser.setBackground(new java.awt.Color(1, 3, 73));
        fTrocarUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        fTrocarUser.setForeground(new java.awt.Color(1, 3, 73));
        fTrocarUser.setTitle("VIGILANTE | TROCAR USUÁRIO?");
        fTrocarUser.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_gray.png"))); // NOI18N
        fTrocarUser.setVisible(true);
        fTrocarUser.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                fTrocarUserComponentMoved(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(1, 3, 73));

        btSairSis.setBackground(new java.awt.Color(153, 0, 0));
        btSairSis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSairSis.setForeground(new java.awt.Color(255, 255, 255));
        btSairSis.setText("SAIR");
        btSairSis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairSisActionPerformed(evt);
            }
        });

        btTrocar.setBackground(new java.awt.Color(0, 153, 0));
        btTrocar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btTrocar.setForeground(new java.awt.Color(255, 255, 255));
        btTrocar.setText("TROCAR USUÁRIO");
        btTrocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTrocarActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 0));
        jLabel21.setText("TROCAR USUÁRIO OU SAIR DO SISTEMA?");
        jLabel21.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(btTrocar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btSairSis))
                        .addComponent(jLabel21))
                    .addContainerGap(32, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btTrocar)
                        .addComponent(btSairSis))
                    .addContainerGap(41, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout fTrocarUserLayout = new javax.swing.GroupLayout(fTrocarUser.getContentPane());
        fTrocarUser.getContentPane().setLayout(fTrocarUserLayout);
        fTrocarUserLayout.setHorizontalGroup(
            fTrocarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fTrocarUserLayout.setVerticalGroup(
            fTrocarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(fTrocarUser);
        fTrocarUser.setBounds(20, 190, 350, 160);

        condEscolha.setBackground(new java.awt.Color(1, 3, 73));
        condEscolha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        condEscolha.setForeground(new java.awt.Color(255, 255, 255));
        condEscolha.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE O CONDOMÍNIO" }));
        condEscolha.setToolTipText("SELECIONE O CONDOMÍNIO");
        condEscolha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        condEscolha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                condEscolhaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                condEscolhaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                condEscolhaKeyTyped(evt);
            }
        });
        getContentPane().add(condEscolha);
        condEscolha.setBounds(810, 62, 280, 30);

        txtId.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtId);
        txtId.setBounds(130, 800, 0, 0);

        txtbv.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        txtbv.setForeground(new java.awt.Color(0, 153, 204));
        txtbv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbv.setText("nome usuário");
        getContentPane().add(txtbv);
        txtbv.setBounds(10, 50, 280, 30);

        btOk.setBackground(new java.awt.Color(1, 3, 73));
        btOk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btOk.setForeground(new java.awt.Color(255, 255, 255));
        btOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/accept.png"))); // NOI18N
        btOk.setToolTipText("CONFIRMAR");
        btOk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btOk.setFocusPainted(false);
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });
        getContentPane().add(btOk);
        btOk.setBounds(1100, 62, 40, 29);

        ip.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        ip.setForeground(new java.awt.Color(204, 204, 204));
        ip.setText("IP: ");
        ip.setToolTipText("");
        getContentPane().add(ip);
        ip.setBounds(22, 90, 180, 20);

        txtData.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        txtData.setForeground(new java.awt.Color(204, 204, 204));
        txtData.setText("DATA:");
        txtData.setToolTipText("");
        getContentPane().add(txtData);
        txtData.setBounds(22, 110, 200, 20);

        txtHora.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        txtHora.setForeground(new java.awt.Color(204, 204, 204));
        txtHora.setText("HORA:");
        getContentPane().add(txtHora);
        txtHora.setBounds(22, 130, 200, 20);

        btMax.setToolTipText("MAXIMIZAR");
        btMax.setBorderPainted(false);
        btMax.setContentAreaFilled(false);
        btMax.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btMax.setFocusPainted(false);
        btMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMaxActionPerformed(evt);
            }
        });
        getContentPane().add(btMax);
        btMax.setBounds(1864, 0, 15, 20);

        btExit.setToolTipText("FECHAR");
        btExit.setBorderPainted(false);
        btExit.setContentAreaFilled(false);
        btExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExit.setFocusPainted(false);
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        getContentPane().add(btExit);
        btExit.setBounds(1883, 0, 16, 20);

        btMin.setToolTipText("MINIMIZAR");
        btMin.setBorderPainted(false);
        btMin.setContentAreaFilled(false);
        btMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btMin.setFocusPainted(false);
        btMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMinActionPerformed(evt);
            }
        });
        getContentPane().add(btMin);
        btMin.setBounds(1840, 3, 20, 20);

        key.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        key.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/key white.png"))); // NOI18N
        key.setToolTipText("ACIONAMENTOS");
        key.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        key.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                keyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                keyMouseExited(evt);
            }
        });
        getContentPane().add(key);
        key.setBounds(1230, 30, 30, 30);

        info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/info.png"))); // NOI18N
        info.setToolTipText("INFORMAÇÕES");
        info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoMouseExited(evt);
            }
        });
        getContentPane().add(info);
        info.setBounds(1580, 30, 30, 30);

        mailbox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mailbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/mailbox.png"))); // NOI18N
        mailbox.setToolTipText("CORRESPONDÊNCIAS");
        mailbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mailbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mailboxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mailboxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mailboxMouseExited(evt);
            }
        });
        getContentPane().add(mailbox);
        mailbox.setBounds(1440, 30, 30, 30);

        settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/settings.png"))); // NOI18N
        settings.setToolTipText("CONFIGURAÇÕES");
        settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });
        getContentPane().add(settings);
        settings.setBounds(1720, 30, 30, 30);

        search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search.png"))); // NOI18N
        search.setToolTipText("ENTRADAS/SAÍDAS");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(1510, 30, 30, 30);

        cam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cam view.png"))); // NOI18N
        cam.setToolTipText("IMAGENS");
        cam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                camMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                camMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                camMouseExited(evt);
            }
        });
        getContentPane().add(cam);
        cam.setBounds(1370, 30, 30, 30);

        sync.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sync.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sync.png"))); // NOI18N
        sync.setToolTipText("ATUALIZAR");
        sync.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sync.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                syncMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                syncMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                syncMouseExited(evt);
            }
        });
        getContentPane().add(sync);
        sync.setBounds(1650, 30, 30, 30);

        usericon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user.png"))); // NOI18N
        usericon.setToolTipText("ADMINISTRADOR");
        usericon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usericon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usericonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usericonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usericonMouseExited(evt);
            }
        });
        getContentPane().add(usericon);
        usericon.setBounds(1300, 30, 30, 30);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/background_1.png"))); // NOI18N
        fundo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(fundo);
        fundo.setBounds(0, -20, 1920, 1120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        // quando formulário abrir vai mostrar a data local e o IP da máquina.
        Date dataAtual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        txtData.setText("DATA: "+formato.format(dataAtual));
        txtData.setToolTipText("DATA: "+formato.format(dataAtual));
        txtDataVisitante.setText(formato.format(dataAtual));
        Timer timer = new Timer(0, new hora());
        timer.start();   
        
        try {
            String ipPc = InetAddress.getLocalHost().getHostAddress();
            ip.setText("IP: " +ipPc);
            ip.setToolTipText("IP: " +ipPc);
        } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(null, "Não encontramos o IP LOCAL.");
        }
    }//GEN-LAST:event_formWindowOpened

    private void condEscolhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_condEscolhaKeyPressed

    }//GEN-LAST:event_condEscolhaKeyPressed

    private void condEscolhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_condEscolhaKeyReleased
               mostrarMoradores();
    }//GEN-LAST:event_condEscolhaKeyReleased

    private void condEscolhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_condEscolhaKeyTyped
                mostrarMoradores();
    }//GEN-LAST:event_condEscolhaKeyTyped

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
                if (condicao() == true){
                    
                   DefaultTableModel modeloTabela = (DefaultTableModel) tbMoradores.getModel();;
                   modeloTabela.setNumRows(0);
                   DefaultTableModel modelo = (DefaultTableModel) tbEntradas.getModel();;
                   modelo.setNumRows(0);
                   DefaultTableModel modeloB = (DefaultTableModel) tbBusca.getModel();;
                   modeloB.setNumRows(0);
                   txtId.setText("0");
                   imgFace.setIcon(null);
                   lbNome.setText("");
                   JOptionPane.showMessageDialog(null, "Selecione o condomínio");

                } else{ 
                mostrarMoradores();
                iniciarObs();
                }
    }//GEN-LAST:event_btOkActionPerformed

    private void tbMoradoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMoradoresMouseClicked

        mostrarImg();
        //buscarMoradores();
    }//GEN-LAST:event_tbMoradoresMouseClicked

    private void btPesquisarAptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarAptoActionPerformed
        if(txtApto.getText().isEmpty()){
            mostrarMoradores();
        }else{
                  buscarMoradoresPeloApto();  
        }

    }//GEN-LAST:event_btPesquisarAptoActionPerformed

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
             buscarAp();
    }//GEN-LAST:event_btRegistrarActionPerformed

    private void frameImagensComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_frameImagensComponentMoved
        frameImagens.setLocation(810, 210);
    }//GEN-LAST:event_frameImagensComponentMoved

    private void btFecharImgsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharImgsActionPerformed
        frameImagens.setVisible(false);
        pImagens.setVisible(false);
        painelTeste1.setVisible(false);
        painelTeste.setVisible(false);
        painelTeste2.setVisible(false);
        painelTeste3.setVisible(false);
    }//GEN-LAST:event_btFecharImgsActionPerformed

    private void btSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimActionPerformed

        fTrocarUser.setVisible(true);
        desejaSair.setVisible(false);

    }//GEN-LAST:event_btSimActionPerformed

    private void btNãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNãoActionPerformed
        desejaSair.setVisible(false);
    }//GEN-LAST:event_btNãoActionPerformed

    private void desejaSairComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_desejaSairComponentMoved
        desejaSair.setLocation(800, 330);
    }//GEN-LAST:event_desejaSairComponentMoved

    private void btAbrirInfoMoradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirInfoMoradorActionPerformed
        buscarMoradores();
    }//GEN-LAST:event_btAbrirInfoMoradorActionPerformed

    private void btLimparEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparEntradasActionPerformed

        registrarSaída();
    }//GEN-LAST:event_btLimparEntradasActionPerformed

    private void btCorrespondenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCorrespondenciaActionPerformed
        String cond = condEscolha.getSelectedItem().toString();
            if(condicao() == true){
                JOptionPane.showMessageDialog(null, "Selecione o condomínio");
        }else {
            mostrarCorrespondencias();
            }
    }//GEN-LAST:event_btCorrespondenciaActionPerformed

    private void btTrocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTrocarActionPerformed
        this.dispose();
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_btTrocarActionPerformed

    private void btSairSisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairSisActionPerformed
                System.exit(0);
    }//GEN-LAST:event_btSairSisActionPerformed

    private void fTrocarUserComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_fTrocarUserComponentMoved
                fTrocarUser.setLocation(800, 330);
    }//GEN-LAST:event_fTrocarUserComponentMoved

    private void btMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMaxActionPerformed
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_btMaxActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
      desejaSair.setVisible(true);
    }//GEN-LAST:event_btExitActionPerformed

    private void btMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMinActionPerformed

        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btMinActionPerformed

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        ii = new ImageIcon(getClass().getResource("/Imagens/settings black.png"));
        settings.setIcon(ii);
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        ii = new ImageIcon(getClass().getResource("/Imagens/settings.png"));
        settings.setIcon(ii);
    }//GEN-LAST:event_settingsMouseExited

    private void infoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseEntered
        ii = new ImageIcon(getClass().getResource("/Imagens/info black.png"));
        info.setIcon(ii);
    }//GEN-LAST:event_infoMouseEntered

    private void infoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseExited
        ii = new ImageIcon(getClass().getResource("/Imagens/info.png"));
        info.setIcon(ii);
    }//GEN-LAST:event_infoMouseExited

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        ii = new ImageIcon(getClass().getResource("/Imagens/search black.png"));
        search.setIcon(ii);
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        ii = new ImageIcon(getClass().getResource("/Imagens/search.png"));
        search.setIcon(ii);
    }//GEN-LAST:event_searchMouseExited

    private void mailboxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailboxMouseEntered
        ii = new ImageIcon(getClass().getResource("/Imagens/mailbox black.png"));
        mailbox.setIcon(ii);
    }//GEN-LAST:event_mailboxMouseEntered

    private void mailboxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailboxMouseExited
        ii = new ImageIcon(getClass().getResource("/Imagens/mailbox.png"));
        mailbox.setIcon(ii);
    }//GEN-LAST:event_mailboxMouseExited

    private void keyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keyMouseEntered
        ii = new ImageIcon(getClass().getResource("/Imagens/key black.png"));
        key.setIcon(ii);
    }//GEN-LAST:event_keyMouseEntered

    private void keyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keyMouseExited
        ii = new ImageIcon(getClass().getResource("/Imagens/key white.png"));
        key.setIcon(ii);
    }//GEN-LAST:event_keyMouseExited

    private void camMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_camMouseEntered
        ii = new ImageIcon(getClass().getResource("/Imagens/cam view black.png"));
        cam.setIcon(ii);
    }//GEN-LAST:event_camMouseEntered

    private void camMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_camMouseExited
        ii = new ImageIcon(getClass().getResource("/Imagens/cam view.png"));
        cam.setIcon(ii);
    }//GEN-LAST:event_camMouseExited

    private void camMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_camMouseClicked
      String c = condEscolha.getSelectedItem().toString();
        
            if(condicao() == true){
                JOptionPane.showMessageDialog(null, "Selecione o condomínio");
        }     
        else if (frameImagens.isVisible()){
            
            JOptionPane.showMessageDialog(null, "Câmeras já estão abertas");
            
        }else{frameImagens.setTitle("CÂMERAS DO " + c);
        frameImagens.setVisible(true);
               pImagens.setVisible(true);
               testeCameras();
        }        
    }//GEN-LAST:event_camMouseClicked

    private void syncMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syncMouseEntered
       ii = new ImageIcon(getClass().getResource("/Imagens/sync black.png"));
        sync.setIcon(ii);
    }//GEN-LAST:event_syncMouseEntered

    private void syncMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syncMouseExited
       ii = new ImageIcon(getClass().getResource("/Imagens/sync.png"));
       sync.setIcon(ii);
    }//GEN-LAST:event_syncMouseExited

    private void syncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_syncMouseClicked
        this.dispose();
        mostrarCond();
        limparTabelas();
        this.setVisible(true);
        imgFace.setIcon(null);
        lbNome.setText(""); 
    }//GEN-LAST:event_syncMouseClicked

    private void mailboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailboxMouseClicked
         mostrarCorrespondencias();
    }//GEN-LAST:event_mailboxMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        mostrarEntradas();
    }//GEN-LAST:event_searchMouseClicked

    private void usericonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usericonMouseEntered
       ii = new ImageIcon(getClass().getResource("/Imagens/user black.png"));
       usericon.setIcon(ii);
    }//GEN-LAST:event_usericonMouseEntered

    private void usericonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usericonMouseExited
       ii = new ImageIcon(getClass().getResource("/Imagens/user.png"));
       usericon.setIcon(ii);
    }//GEN-LAST:event_usericonMouseExited

    private void usericonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usericonMouseClicked
         verificarAdmin();
    }//GEN-LAST:event_usericonMouseClicked

    private void infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseClicked

        NotasVersao nv = new NotasVersao();
        nv.setVisible(true);
    }//GEN-LAST:event_infoMouseClicked

    private void btBuscarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarNomeActionPerformed
        buscarMoradoresPeloNome();
    }//GEN-LAST:event_btBuscarNomeActionPerformed

    private void tbBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBuscaMouseClicked
       buscarMoradorNome();
    }//GEN-LAST:event_tbBuscaMouseClicked

    private void btNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNotaActionPerformed

        Obs obs = new Obs();
        obs.setVisible(true);
    }//GEN-LAST:event_btNotaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aptoTerceiro;
    private javax.swing.JButton btAbrirInfoMorador;
    private javax.swing.JButton btBuscarNome;
    private javax.swing.JButton btCancelarRegistro;
    private javax.swing.JButton btCorrespondencia;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btFecharImgs;
    private javax.swing.JButton btLimparEntradas;
    private javax.swing.JButton btMax;
    private javax.swing.JButton btMin;
    private javax.swing.JButton btNota;
    private javax.swing.JButton btNão;
    private javax.swing.JButton btOk;
    private javax.swing.JButton btPesquisarApto;
    private javax.swing.JButton btRegistrar;
    private javax.swing.JButton btSairSis;
    private javax.swing.JButton btSim;
    private javax.swing.JButton btTrocar;
    private javax.swing.JLabel cam;
    private javax.swing.JComboBox<String> comboTerceiro;
    private javax.swing.JComboBox condEscolha;
    private javax.swing.JInternalFrame desejaSair;
    private javax.swing.JInternalFrame fTrocarUser;
    private javax.swing.JInternalFrame frameImagens;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel imgFace;
    private javax.swing.JLabel info;
    private javax.swing.JLabel ip;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel key;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel mailbox;
    private javax.swing.JTextField obsTerceiro;
    private javax.swing.JPanel pBM;
    private javax.swing.JPanel pBuscar;
    private javax.swing.JPanel pCDES;
    private javax.swing.JPanel pEntrada;
    private javax.swing.JPanel pImagens;
    private javax.swing.JPanel pM;
    private javax.swing.JTabbedPane pMenuMBEC;
    private javax.swing.JPanel pMoradores;
    private javax.swing.JPanel pRE;
    private javax.swing.JPanel painelMorador;
    private javax.swing.JPanel painelTeste;
    private javax.swing.JPanel painelTeste1;
    private javax.swing.JPanel painelTeste2;
    private javax.swing.JPanel painelTeste3;
    private javax.swing.JTextField placaTerceiro;
    private javax.swing.JLabel search;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel sync;
    private javax.swing.JTable tbBusca;
    private javax.swing.JTable tbEntradas;
    private javax.swing.JTable tbMoradores;
    private javax.swing.JLabel txt;
    private javax.swing.JTextField txtApto;
    private javax.swing.JFormattedTextField txtCpfTerceiro;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtDataVisitante;
    private javax.swing.JLabel txtHora;
    private javax.swing.JLabel txtHoraVisitante;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeTerceiro;
    private javax.swing.JFormattedTextField txtRgTerceiro;
    private javax.swing.JLabel txtbv;
    private javax.swing.JLabel usericon;
    private javax.swing.JTextField veiculoTerceiro;
    // End of variables declaration//GEN-END:variables
       
    
    // inicializando e executando contador de horas, e formatando.
    public class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            txtHora.setText("HORA: "+String.format("%1$tH:%1$tM:%1$tS", now));
            txtHora.setToolTipText("HORA: "+String.format("%1$tH:%1$tM:%1$tS", now));
            txtHoraVisitante.setText(String.format("%1$tH:%1$tM", now));
        }
    }
         
         // informando o nome do usuário que está autenticado
    public void inicializar(String u) {
        String user = u;
        txtbv.setText(user);
        txtbv.setToolTipText("USUÁRIO: "+user);
               
           }

    
    
        // listando os condomínios no combobox.
        private void mostrarCond(){
        condEscolha.removeAllItems();
        condEscolha.addItem("SELECIONE O CONDOMÍNIO");
        ConexaoCondominios cond = new ConexaoCondominios();
        List<Condominio> lista = cond.ListarCondominiosCombo();
        for(Condominio c: lista){
            String nome = c.getNomeCond();
            int id = c.getIdCond();
            condEscolha.addItem(nome);
        }
    }
        
        //verificando se o usuário é administrador
        private void verificarAdmin(){
        ConexaoUsuarios c = new ConexaoUsuarios();
        Usuario user = new Usuario();
        user.setUsuario(txtbv.getText());   
                try {
                    ResultSet resultado = c.verificarNivelUsuario(user);
                    while(resultado.next()){
                        try {
                            user.setNivel(resultado.getInt("nivel"));
                             if(user.getNivel() == 2){
                             JOptionPane.showMessageDialog(null, "USUÁRIO SEM PERMISSÃO.", "VIGILANTE | USUÁRIO SEM PERMISSÃO", JOptionPane.ERROR_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/exclamation.png")));
                             } else{
                             JOptionPane.showMessageDialog(null, "Bem-Vindo(a), " + txtbv.getText(), "VIGILANTE | (ADMIN)", JOptionPane.ERROR_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/Icon.png")));
                              MenuAdmin m = new MenuAdmin();
                              m.setVisible(true);
                             } 
                        } catch (SQLException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }       }catch (SQLException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
        
        // buscando/mostrando moradores pelo condomínio
        private void mostrarMoradores(){
            int id;
            String mostrarId = "";
            
            ConexaoCondominios c = new ConexaoCondominios();
            String verificarId = condEscolha.getSelectedItem().toString();
            condEscolha.setToolTipText(verificarId);
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
                   "APTO. " + m.getApto()+ " > " , m.getNome()
               });

                }
                
               DefaultTableModel entradas = (DefaultTableModel) tbEntradas.getModel(); 
                // mostrando entradas de terceiros
                tbEntradas.removeAll();
                entradas.setNumRows(0);
                ConexaoTerceiros ct = new ConexaoTerceiros();
                
                for(Terceiros t: ct.listarTerceiros(id)){
                    String tipo = "";
                    if(t.getNivel() == 1){
                        tipo = "PRESTADOR(A)";
                    }if(t.getNivel() == 2){
                       tipo = "VISITANTE";
                    }
                    if(t.getNivel() == 3){
                        tipo = "DIARISTA";
                    }if(t.getNivel() == 4){
                       tipo = "AGENTE DE SAÚDE";
                    }
                     if(t.getNivel() == 5){
                        tipo = "BABÁ";
                    }if(t.getNivel() == 6){
                       tipo = "JARDINEIRO(A)";
                    }
                    if(t.getNivel() == 7){
                        tipo = "CORRETOR(A)";
                    }if(t.getNivel() == 8){
                       tipo = "CONDOMÍNIO";
                    }
                    
                entradas.addRow(new Object[]{
                   "APTO. " + t.getApto() + " > " , t.getNome() + " > " + tipo, t.getData() + " - " + t.getHora()
         
               });
                }
                TableRowSorter tableSorter = new TableRowSorter(entradas);
                tbEntradas.setRowSorter(tableSorter);
                tableSorter.toggleSortOrder(2);
                
            }
        }catch (SQLException ex) {
     }
            
}
        
        // abrindo informações do morador ao clicar no nome na tabela de busca por apartamento
    public void buscarMoradores(){      
        int id;
        int linha = tbMoradores.getSelectedRow();
        String mostrarId = "";
        ConexaoCondominios c = new ConexaoCondominios();
        String verificarId = condEscolha.getSelectedItem().toString();  
        ResultSet result = c.verificarIdCond(verificarId);     
        try {
            while(result.next()){
                id = result.getInt("idcond");
                PainelMorador p = new PainelMorador();              
                p.mostrarResult(tbMoradores.getModel().getValueAt(linha, 1).toString(), id);
               p.setVisible(true);
            }  
        } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "Menu: buscarMoradores:" + erro);
        }
     }
    
         // abrindo informações do morador ao clicar no nome na tabela de busca por nome
        public void buscarMoradorNome(){      
        int id;
        int linha = tbBusca.getSelectedRow();
        String mostrarId = "";
        ConexaoCondominios c = new ConexaoCondominios();
        String verificarId = condEscolha.getSelectedItem().toString();  
        ResultSet result = c.verificarIdCond(verificarId);     
        try {
            while(result.next()){
                id = result.getInt("idcond");
                PainelMorador p = new PainelMorador();              
                p.mostrarResult(tbBusca.getModel().getValueAt(linha, 1).toString(), id);
               p.setVisible(true);
            }  
        } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "Menu: buscarMoradorNome:" + erro);
        }
     }
    
    
        // registrando entrada de pessoas ao condomínio
        private void registrarAcesso(){
            Terceiros terceiros = new Terceiros();
            String escolha = comboTerceiro.getSelectedItem().toString();
            int nivel = 0;                    
                if(escolha.equals("01 - PRESTADOR(A)")){
                    nivel = 1;
                }
                
                if(escolha.equals("02 - VISITANTE")){
                    nivel = 2;
                }
                if(escolha.equals("03 - DIARISTA")){
                    nivel = 3;
                }
                
                if(escolha.equals("04 - AGENTE DE SAÚDE")){
                    nivel = 4;
                }
                if(escolha.equals("05 - BABÁ")){
                    nivel = 5;
                }
                
                if(escolha.equals("06 - JARDINEIRO(A)")){
                    nivel = 6;
                }
                if(escolha.equals("07 - CORRETOR(A)")){
                    nivel = 7;
                }
                
                if(escolha.equals("08 - CONDOMÍNIO")){
                    nivel = 8;
                }
             if(condicao() == true){
                    JOptionPane.showMessageDialog(null, "Selecione o condomínio");                
            } else{        
               
                    String id = aptoTerceiro.getText();
                    String cond = txtId.getText();
                    terceiros.setNivel(nivel);
                    terceiros.setApto(Integer.parseInt(id));
                    terceiros.setNome(txtNomeTerceiro.getText().toUpperCase());
                    terceiros.setObs(obsTerceiro.getText().toUpperCase());
                    terceiros.setCondID(Integer.parseInt(cond));
                    terceiros.setRg(txtRgTerceiro.getText());
                    terceiros.setCpf(txtCpfTerceiro.getText());
                    terceiros.setVeiculo(veiculoTerceiro.getText().toUpperCase());
                    terceiros.setPlaca(placaTerceiro.getText());
                    terceiros.setData(txtDataVisitante.getText());
                    terceiros.setHora(txtHoraVisitante.getText());
                    terceiros.setStatus(1);
                    ConexaoTerceiros ct = new ConexaoTerceiros();
                    ct.registrarEntrada(terceiros);
                    aptoTerceiro.setText("");
                    txtNomeTerceiro.setText("");
                    obsTerceiro.setText("");
                    txtRgTerceiro.setText("");
                    txtCpfTerceiro.setText("");
                    veiculoTerceiro.setText("");
                    placaTerceiro.setText("");
                    comboTerceiro.setSelectedIndex(0);
                    DefaultTableModel modeloTabela = (DefaultTableModel) tbEntradas.getModel();
                    tbEntradas.removeAll();
                    modeloTabela.setNumRows(0);;
                    mostrarMoradores();
                    
                }
        }
    
        
        // busca os moradores pelo apartamento
          public void buscarMoradoresPeloApto(){
            String busca = txtApto.getText();
            String idcond = txtId.getText();
            int ap = Integer.parseInt(busca);
            int id = Integer.parseInt(idcond);
            if(txtApto.getText().isEmpty()){
               mostrarMoradores();
            }else{
            ConexaoMoradores cm = new ConexaoMoradores();
            DefaultTableModel modeloTabela = (DefaultTableModel) tbMoradores.getModel();
            tbMoradores.removeAll();
            modeloTabela.setNumRows(0);
            try {
                ResultSet result = cm.buscarMoradores(ap, id);     
                while(result.next()){
                Morador m = new Morador();
                m.setApto(result.getInt("aptomorador"));
                m.setNome(result.getString("nomemorador"));
                modeloTabela.addRow(new Object[]{
                   "APTO. " + m.getApto()+ " > " , m.getNome()
               });
            }
                
                
                if(tbMoradores.getRowCount() == 0){
                   JOptionPane.showMessageDialog(null, "Apartamento não localizado.");
                   tbMoradores.removeAll();
                   txtApto.setText("");
                } 
            }
            
            
            catch (Exception e) {
            }
            }
        }
          // busca os moradores pelo nome
          public void buscarMoradoresPeloNome(){
            String busca = txtNome.getText();
            String idcond = txtId.getText();
            int id = Integer.parseInt(idcond);
            if(txtNome.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Digite o nome de algum morador.");
            }else{
            ConexaoMoradores cm = new ConexaoMoradores();
            DefaultTableModel modeloTabela = (DefaultTableModel) tbBusca.getModel();
            tbBusca.removeAll();
            modeloTabela.setNumRows(0);
            try {
                ResultSet result = cm.buscarMoradoresNome(busca, id);     
                while(result.next()){
                Morador m = new Morador();
                m.setApto(result.getInt("aptomorador"));
                m.setNome(result.getString("nomemorador"));
                modeloTabela.addRow(new Object[]{
                   "APTO. " + m.getApto()+ " > " , m.getNome()
               });
            }
                
                
                if(tbBusca.getRowCount() == 0){
                   JOptionPane.showMessageDialog(null, "Morador não localizado.");
                   tbBusca.removeAll();
                   txtNome.setText("");
                } 
            }
            
            
            catch (Exception e) {
            }
            }
        }
            
            
        // limpar tabelas
        private void limparTabelas(){
        DefaultTableModel modeloTabela = (DefaultTableModel) tbMoradores.getModel();
        tbMoradores.removeAll();
        modeloTabela.setNumRows(0);;
        DefaultTableModel tabelaEntradas = (DefaultTableModel) tbEntradas.getModel();
        tbEntradas.removeAll();
        tabelaEntradas.setNumRows(0);;
        }
        
        
        
        // mostrando a imagem do morador e seus dados
        public void mostrarImg(){
            
        try {
            String id = txtId.getText();
            int linha = tbMoradores.getSelectedRow();
            String nome = tbMoradores.getModel().getValueAt(linha, 1).toString();
            ConexaoMoradores moradores = new ConexaoMoradores();
            ResultSet result = moradores.mostrarMorador(nome, Integer.parseInt(id));
            while(result.next()){
                Morador morador = new Morador();
                morador.setFace(result.getBytes("face"));
                lbNome.setText(nome);
                byte [] img = (morador.getFace());
                ImageIcon icone = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(painelMorador.getWidth() , painelMorador.getHeight(), 100));
                imgFace.setIcon(icone);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        // iniciar as observaçoes dos condomínios
        public void iniciarObs(){
            
            String id = txtId.getText();
            String escolha = condEscolha.getSelectedItem().toString();
            
            if(condicao() == true){
                JOptionPane.showMessageDialog(null, "Selecione o condomínio");
            }else{
            Obs obs = new Obs();
            obs.buscarObs(Integer.parseInt(id));
            obs.setVisible(true);
            }
        }
        
        
        // registrar as saídas
        public void registrarSaída(){
            String id = txtId.getText();
            String escolha = condEscolha.getSelectedItem().toString();
            
            if(condicao() == true){
                JOptionPane.showMessageDialog(null, "Selecione o condomínio");
            }else{
            String idcond = txtId.getText();
            ConexaoTerceiros cn = new ConexaoTerceiros();
            cn.deletarAcessos(Integer.parseInt(idcond));
            mostrarMoradores();
            }
            
        }
        
        // mostrar as entradas no condomínio
        public void mostrarEntradas(){
            String condid = txtId.getText();
            ConsultaEntradas ce = new ConsultaEntradas();
            String cond = condEscolha.getSelectedItem().toString();
            
            if(condicao() == true){
                JOptionPane.showMessageDialog(null, "Selecione o condomínio");
            }else {
            ce.setVisible(true);
            ce.setTitle("CONSULTA DE ENTRADAS/SAÍDAS - " + cond);
            ce.mostrarEntradasSaidas(Integer.parseInt(condid));
        }
}
        
        
        
        // mostrar correspondências
        private void mostrarCorrespondencias(){
            String condid = txtId.getText();
            CaixaDeEntrada ce = new CaixaDeEntrada();
            String cond = condEscolha.getSelectedItem().toString();
            if(condicao() == true){
                JOptionPane.showMessageDialog(null, "Selecione o condomínio");
            }else {
            ce.setVisible(true);
            ce.setTitle("CORRESPONDÊNCIAS DO " + cond);
            ce.mostrarCorrespondencias(Integer.parseInt(condid));
        }
            
        }  
        
        
        // condição pra abrir as coisas
        private boolean condicao(){
        String cond = condEscolha.getSelectedItem().toString();
        boolean verificar = cond.equals("SELECIONE O CONDOMÍNIO");       
        return verificar;
  }    
     
        
        // exibindo câmeras
        private void testeCameras(){
        if(NativeInterface.isInProcess()){
            NativeInterface.runEventPump();
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                NativeInterface.close();
            }
        }));
        }else{
        NativeInterface.open();  
        JWebBrowser net = new JWebBrowser(JWebBrowser.destroyOnFinalization());
        this.painelTeste.setLayout(new BorderLayout());
        net.navigate("https://www.google.com.br");
        net.setBarsVisible(false);
        this.painelTeste.add(net);
        JWebBrowser net2 = new JWebBrowser(JWebBrowser.destroyOnFinalization());
        this.painelTeste1.setLayout(new BorderLayout());
        net2.navigate("https://www.google.com.br");
        net2.setBarsVisible(false);
        this.painelTeste1.add(net2);
        JWebBrowser net3 = new JWebBrowser(JWebBrowser.destroyOnFinalization());
        this.painelTeste2.setLayout(new BorderLayout());
        net3.navigate("https://www.google.com.br");
        net3.setBarsVisible(false); 
        this.painelTeste2.add(net3);
        JWebBrowser net4 = new JWebBrowser(JWebBrowser.destroyOnFinalization());
        this.painelTeste3.setLayout(new BorderLayout());
        net4.navigate("https://www.youtube.com/watch_popup?v=VR8Ir-HyipQ");
        net4.setBarsVisible(false); 
        this.painelTeste3.add(net4);
        painelTeste1.setVisible(true);
        painelTeste.setVisible(true);
        painelTeste2.setVisible(true);
        painelTeste3.setVisible(true);
        }
        }
 
        
        
        private void buscarAp(){
            if(txtNomeTerceiro.getText().isEmpty() || comboTerceiro.equals("-") || aptoTerceiro.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Digite em todos os campos.");   
            }  
            String ap = aptoTerceiro.getText();
            String idcond = txtId.getText();
            int busca = Integer.parseInt(ap);
            int id = Integer.parseInt(idcond);
            ConexaoMoradores cm = new ConexaoMoradores();
            try {
                ResultSet result = cm.buscarAptos(busca, id);     
                if(result.next()){
                    registrarAcesso();
            } else{
                    JOptionPane.showMessageDialog(null, "Apartamento não localizado.");
                    aptoTerceiro.setText("");
                }
               
            }
            
            catch (Exception e) {
            }
        }
}
