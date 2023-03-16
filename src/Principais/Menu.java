
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
import Secundarias.QuemSomos;
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
    

    public Menu() {
       initComponents();
       setExtendedState(MAXIMIZED_BOTH);
       this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconePrincipal.png")).getImage());
       mostrarCond();
       frameImagens.setVisible(false);
       pImagens.setVisible(false);
       desejaSair.setVisible(false);
       desabilitarCampos();
       fTrocarUser.setVisible(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pInfos = new javax.swing.JPanel();
        txtIp = new javax.swing.JLabel();
        txtUser = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        ip = new javax.swing.JLabel();
        txtHora1 = new javax.swing.JLabel();
        txtData1 = new javax.swing.JLabel();
        pPrincipal = new javax.swing.JPanel();
        admin = new javax.swing.JLabel();
        txtbv = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        condEscolha = new javax.swing.JComboBox();
        btImg = new javax.swing.JButton();
        btAcionamentos = new javax.swing.JButton();
        btCaixaDeEntrada = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pMenuMBEC = new javax.swing.JTabbedPane();
        pMoradores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMoradores = new javax.swing.JTable();
        btPesquisarApto = new javax.swing.JButton();
        txtApto = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btAbrirInfoMorador = new javax.swing.JButton();
        btCorrespondencia = new javax.swing.JButton();
        painelMorador = new javax.swing.JPanel();
        imgFace = new javax.swing.JLabel();
        btNota = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        pBuscar = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbBusca = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
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
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        desejaSair = new javax.swing.JInternalFrame();
        btSim = new javax.swing.JButton();
        btNão = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        frameImagens = new javax.swing.JInternalFrame();
        jSeparator2 = new javax.swing.JSeparator();
        btFecharImgs = new javax.swing.JButton();
        painelTeste = new javax.swing.JPanel();
        painelTeste1 = new javax.swing.JPanel();
        painelTeste2 = new javax.swing.JPanel();
        painelTeste3 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        pImagens = new javax.swing.JPanel();
        txt = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbEntradas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        fTrocarUser = new javax.swing.JInternalFrame();
        jLabel21 = new javax.swing.JLabel();
        btTrocar = new javax.swing.JButton();
        btSairSis = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mPrincipal = new javax.swing.JMenu();
        mAdmin = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenuItem();
        mFerramentas = new javax.swing.JMenu();
        dataHora = new javax.swing.JMenuItem();
        EntradasSaidas = new javax.swing.JMenuItem();
        msgApp = new javax.swing.JMenuItem();
        mSobre = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        mSuporte = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIGILANTE | Sua segurança realmente importa!  - / Sua licença expira em: 01/01/2024 às 00:01 \\  -  BETA 0.1.18 rev0.4");
        setMinimumSize(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        pInfos.setBackground(new java.awt.Color(255, 255, 255));
        pInfos.setLayout(null);

        txtIp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtIp.setText("IP:");
        pInfos.add(txtIp);
        txtIp.setBounds(6, 6, 30, 16);

        txtUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUser.setText("USUÁRIO:");
        pInfos.add(txtUser);
        txtUser.setBounds(198, 6, 70, 16);

        txtData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtData.setForeground(new java.awt.Color(0, 0, 102));
        txtData.setText("DATA:");
        txtData.setToolTipText("");
        pInfos.add(txtData);
        txtData.setBounds(490, 6, 100, 16);

        txtHora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtHora.setForeground(new java.awt.Color(0, 0, 102));
        txtHora.setText("HORA:");
        pInfos.add(txtHora);
        txtHora.setBounds(707, 6, 120, 16);

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 102));
        txtUsuario.setText("user");
        pInfos.add(txtUsuario);
        txtUsuario.setBounds(257, 6, 150, 18);

        ip.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ip.setForeground(new java.awt.Color(0, 0, 102));
        ip.setText("ip");
        pInfos.add(ip);
        ip.setBounds(27, 6, 110, 16);

        txtHora1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtHora1.setText("HORA:");
        pInfos.add(txtHora1);
        txtHora1.setBounds(665, 6, 50, 16);

        txtData1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtData1.setText("DATA:");
        txtData1.setToolTipText("");
        pInfos.add(txtData1);
        txtData1.setBounds(451, 6, 50, 16);

        getContentPane().add(pInfos);
        pInfos.setBounds(0, 940, 1920, 100);

        pPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pPrincipal.setLayout(null);

        admin.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        admin.setForeground(new java.awt.Color(0, 0, 0));
        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setText("SEJA BEM VINDO(A)!");
        pPrincipal.add(admin);
        admin.setBounds(840, 20, 206, 30);

        txtbv.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        txtbv.setForeground(new java.awt.Color(0, 0, 102));
        txtbv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbv.setText("nome usuário");
        pPrincipal.add(txtbv);
        txtbv.setBounds(770, 30, 340, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 3, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("CONDOMÍNIOS");
        pPrincipal.add(jLabel12);
        jLabel12.setBounds(830, 70, 218, 36);

        condEscolha.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        condEscolha.setForeground(new java.awt.Color(0, 0, 0));
        condEscolha.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE O CONDOMÍNIO" }));
        condEscolha.setToolTipText("SELECIONE O CONDOMÍNIO");
        condEscolha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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
        pPrincipal.add(condEscolha);
        condEscolha.setBounds(760, 110, 340, 30);

        btImg.setBackground(new java.awt.Color(255, 255, 255));
        btImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/camera.png"))); // NOI18N
        btImg.setToolTipText("IMAGENS");
        btImg.setBorder(null);
        btImg.setBorderPainted(false);
        btImg.setFocusable(false);
        btImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImgActionPerformed(evt);
            }
        });
        pPrincipal.add(btImg);
        btImg.setBounds(1300, 90, 70, 60);

        btAcionamentos.setBackground(new java.awt.Color(255, 255, 255));
        btAcionamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/chave.png"))); // NOI18N
        btAcionamentos.setToolTipText("ACIONAMENTOS");
        btAcionamentos.setBorderPainted(false);
        btAcionamentos.setFocusable(false);
        btAcionamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcionamentosActionPerformed(evt);
            }
        });
        pPrincipal.add(btAcionamentos);
        btAcionamentos.setBounds(1430, 10, 70, 60);

        btCaixaDeEntrada.setBackground(new java.awt.Color(255, 255, 255));
        btCaixaDeEntrada.setForeground(new java.awt.Color(0, 0, 0));
        btCaixaDeEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/caixaentrada.png"))); // NOI18N
        btCaixaDeEntrada.setToolTipText("CAIXA DE ENTRADA");
        btCaixaDeEntrada.setBorder(null);
        btCaixaDeEntrada.setBorderPainted(false);
        btCaixaDeEntrada.setFocusable(false);
        btCaixaDeEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCaixaDeEntradaActionPerformed(evt);
            }
        });
        pPrincipal.add(btCaixaDeEntrada);
        btCaixaDeEntrada.setBounds(1300, 10, 70, 60);

        btAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/atualizar.png"))); // NOI18N
        btAtualizar.setToolTipText("ATUALIZAR");
        btAtualizar.setBorder(null);
        btAtualizar.setBorderPainted(false);
        btAtualizar.setFocusable(false);
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });
        pPrincipal.add(btAtualizar);
        btAtualizar.setBounds(1430, 90, 70, 60);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("CAIXA DE ENTRADA");
        pPrincipal.add(jLabel1);
        jLabel1.setBounds(1300, 70, 80, 10);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ACIONAMENTOS");
        pPrincipal.add(jLabel2);
        jLabel2.setBounds(1420, 70, 80, 10);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("IMAGENS");
        pPrincipal.add(jLabel3);
        jLabel3.setBounds(1310, 150, 50, 10);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ATUALIZAR");
        pPrincipal.add(jLabel4);
        jLabel4.setBounds(1430, 150, 70, 10);

        txtId.setForeground(new java.awt.Color(255, 255, 255));
        pPrincipal.add(txtId);
        txtId.setBounds(20, 20, 0, 0);

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/accept.png"))); // NOI18N
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pPrincipal.add(jButton1);
        jButton1.setBounds(1110, 110, 40, 30);

        getContentPane().add(pPrincipal);
        pPrincipal.setBounds(0, 20, 1920, 170);

        pMoradores.setBackground(new java.awt.Color(255, 255, 255));

        tbMoradores.setAutoCreateRowSorter(true);
        tbMoradores.setBackground(new java.awt.Color(0, 0, 102));
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
        tbMoradores.setSelectionForeground(new java.awt.Color(0, 0, 102));
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
        btPesquisarApto.setBorder(null);
        btPesquisarApto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarAptoActionPerformed(evt);
            }
        });

        txtApto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtApto.setForeground(new java.awt.Color(0, 0, 0));
        txtApto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APARTAMENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("MORADORES");
        jPanel1.add(jLabel7);
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pMenuMBEC.addTab("MORADORES", new javax.swing.ImageIcon(getClass().getResource("/Imagens/grupoImg.png")), pMoradores); // NOI18N

        pBuscar.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIGITE O NOME", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        tbBusca.setBackground(new java.awt.Color(0, 0, 102));
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
        tbBusca.setSelectionForeground(new java.awt.Color(0, 0, 102));
        jScrollPane3.setViewportView(tbBusca);
        if (tbBusca.getColumnModel().getColumnCount() > 0) {
            tbBusca.getColumnModel().getColumn(0).setResizable(false);
            tbBusca.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbBusca.getColumnModel().getColumn(1).setResizable(false);
            tbBusca.getColumnModel().getColumn(1).setPreferredWidth(170);
        }

        jPanel3.setBackground(new java.awt.Color(204, 204, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("BUSCA DE MORADORES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel6)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/magnifier.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/magnifier.png"))); // NOI18N

        javax.swing.GroupLayout pBuscarLayout = new javax.swing.GroupLayout(pBuscar);
        pBuscar.setLayout(pBuscarLayout);
        pBuscarLayout.setHorizontalGroup(
            pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pBuscarLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pBuscarLayout.setVerticalGroup(
            pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBuscarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addContainerGap())
        );

        pMenuMBEC.addTab("BUSCAR", new javax.swing.ImageIcon(getClass().getResource("/Imagens/magnifier.png")), pBuscar); // NOI18N

        pEntrada.setBackground(new java.awt.Color(255, 255, 255));

        obsTerceiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        obsTerceiro.setForeground(new java.awt.Color(0, 0, 0));
        obsTerceiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OBSERVAÇÕES", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        txtNomeTerceiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNomeTerceiro.setForeground(new java.awt.Color(0, 0, 0));
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
        comboTerceiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SELECIONE O TIPO DE ENTRADA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        placaTerceiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        placaTerceiro.setForeground(new java.awt.Color(0, 0, 0));
        placaTerceiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PLACA", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        veiculoTerceiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        veiculoTerceiro.setForeground(new java.awt.Color(0, 0, 0));
        veiculoTerceiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VEÍCULO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        txtDataVisitante.setBackground(new java.awt.Color(255, 255, 255));
        txtDataVisitante.setForeground(new java.awt.Color(255, 255, 255));
        txtDataVisitante.setText("data/hora");

        txtHoraVisitante.setBackground(new java.awt.Color(255, 255, 255));
        txtHoraVisitante.setForeground(new java.awt.Color(255, 255, 255));
        txtHoraVisitante.setText("data/hora");

        aptoTerceiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aptoTerceiro.setForeground(new java.awt.Color(0, 0, 0));
        aptoTerceiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APARTAMENTO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        btRegistrar.setBackground(new java.awt.Color(0, 153, 0));
        btRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btRegistrar.setText("REGISTRAR");
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });

        btCancelarRegistro.setBackground(new java.awt.Color(153, 0, 0));
        btCancelarRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCancelarRegistro.setForeground(new java.awt.Color(0, 0, 0));
        btCancelarRegistro.setText("CANCELAR");

        jPanel4.setBackground(new java.awt.Color(0, 51, 153));
        jPanel4.setForeground(new java.awt.Color(0, 0, 153));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("REGISTRAR ENTRADA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel8)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
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
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pEntradaLayout.setVerticalGroup(
            pEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEntradaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeTerceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
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
        pMenuMBEC.setBounds(0, 350, 410, 590);
        pMenuMBEC.getAccessibleContext().setAccessibleName("");

        desejaSair.setTitle("VIGILANTE | SAIR DO SISTEMA?");
        desejaSair.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/exclamation.png"))); // NOI18N
        desejaSair.setVisible(true);
        desejaSair.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                desejaSairComponentMoved(evt);
            }
        });

        btSim.setBackground(new java.awt.Color(0, 153, 0));
        btSim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSim.setText("SIM");
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

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("DESEJA SAIR DO SISTEMA?");
        jLabel19.setToolTipText("");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 102));
        jLabel20.setText("APÓS SAIR O SISTEMA SERÁ FECHADO !");

        javax.swing.GroupLayout desejaSairLayout = new javax.swing.GroupLayout(desejaSair.getContentPane());
        desejaSair.getContentPane().setLayout(desejaSairLayout);
        desejaSairLayout.setHorizontalGroup(
            desejaSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desejaSairLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desejaSairLayout.createSequentialGroup()
                .addGroup(desejaSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(desejaSairLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20))
                    .addGroup(desejaSairLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(btNão)))
                .addGap(53, 53, 53))
        );
        desejaSairLayout.setVerticalGroup(
            desejaSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desejaSairLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(desejaSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSim)
                    .addComponent(btNão))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(desejaSair);
        desejaSair.setBounds(420, 220, 340, 160);

        frameImagens.setBackground(new java.awt.Color(255, 255, 255));
        frameImagens.setBorder(null);
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
        frameImagens.setBounds(810, 230, 1080, 560);

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
        pImagens.setBounds(810, 210, 1080, 20);

        jPanel2.setBackground(new java.awt.Color(153, 51, 0));

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
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CONTROLE DE ENTRADAS/SAÍDAS");
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(77, 77, 77))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(410, 520, 390, 420);

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/exclamation.png"))); // NOI18N
        jButton3.setText("LIMPAR ENTRADAS");
        jButton3.setToolTipText("LIMPAR ENTRADAS");
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(410, 500, 170, 23);

        fTrocarUser.setTitle("VIGILANTE | TROCAR USUÁRIO?");
        fTrocarUser.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_gray.png"))); // NOI18N
        fTrocarUser.setVisible(true);
        fTrocarUser.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                fTrocarUserComponentMoved(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("TROCAR USUÁRIO OU SAIR DO SISTEMA?");
        jLabel21.setToolTipText("");

        btTrocar.setBackground(new java.awt.Color(0, 153, 0));
        btTrocar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btTrocar.setText("TROCAR USUÁRIO");
        btTrocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTrocarActionPerformed(evt);
            }
        });

        btSairSis.setBackground(new java.awt.Color(153, 0, 0));
        btSairSis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSairSis.setText("SAIR");
        btSairSis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairSisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fTrocarUserLayout = new javax.swing.GroupLayout(fTrocarUser.getContentPane());
        fTrocarUser.getContentPane().setLayout(fTrocarUserLayout);
        fTrocarUserLayout.setHorizontalGroup(
            fTrocarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fTrocarUserLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(fTrocarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fTrocarUserLayout.createSequentialGroup()
                        .addComponent(btTrocar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSairSis))
                    .addComponent(jLabel21))
                .addGap(30, 30, 30))
        );
        fTrocarUserLayout.setVerticalGroup(
            fTrocarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fTrocarUserLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fTrocarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTrocar)
                    .addComponent(btSairSis))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(fTrocarUser);
        fTrocarUser.setBounds(20, 190, 350, 160);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/background.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 1920, 1080);

        menuBar.setBackground(new java.awt.Color(255, 255, 255));
        menuBar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MENU", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        menuBar.setForeground(new java.awt.Color(0, 0, 0));

        mPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconeMenu.png"))); // NOI18N
        mPrincipal.setText("Principal");
        mPrincipal.setToolTipText("PRINCIPAL");

        mAdmin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_red.png"))); // NOI18N
        mAdmin.setText("Administrador");
        mAdmin.setToolTipText("Administrador");
        mAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAdminActionPerformed(evt);
            }
        });
        mPrincipal.add(mAdmin);

        sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/door_in.png"))); // NOI18N
        sair.setText("Sair/Trocar usuário");
        sair.setToolTipText("Sair/Trocar usuário");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        mPrincipal.add(sair);

        menuBar.add(mPrincipal);

        mFerramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/wrench.png"))); // NOI18N
        mFerramentas.setText("Ferramentas");
        mFerramentas.setToolTipText("FERRAMENTAS");

        dataHora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        dataHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/clock.png"))); // NOI18N
        dataHora.setText("Configurações de data e hora");
        dataHora.setToolTipText("Configurações de data e hora");
        dataHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataHoraActionPerformed(evt);
            }
        });
        mFerramentas.add(dataHora);

        EntradasSaidas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        EntradasSaidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/magnifier.png"))); // NOI18N
        EntradasSaidas.setText("Consultas de entradas/saídas");
        EntradasSaidas.setToolTipText("Consultas de entradas/saídas");
        EntradasSaidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradasSaidasActionPerformed(evt);
            }
        });
        mFerramentas.add(EntradasSaidas);

        msgApp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        msgApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/phone.png"))); // NOI18N
        msgApp.setText("Enviar mensagem pelo APP");
        msgApp.setToolTipText("Enviar mensagem pelo APP");
        mFerramentas.add(msgApp);

        menuBar.add(mFerramentas);

        mSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/infoImg.png"))); // NOI18N
        mSobre.setText("Sobre");
        mSobre.setToolTipText("SOBRE");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ajudaImg.png"))); // NOI18N
        jMenuItem6.setText("Quem somos nós");
        jMenuItem6.setToolTipText("Quem somos nós");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        mSobre.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/note.png"))); // NOI18N
        jMenuItem7.setText("Notas da versão");
        jMenuItem7.setToolTipText("Notas da versão");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        mSobre.add(jMenuItem7);

        menuBar.add(mSobre);

        mSuporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_gray.png"))); // NOI18N
        mSuporte.setText("Suporte");
        mSuporte.setToolTipText("SUPORTE");
        menuBar.add(mSuporte);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed

               desejaSair.setVisible(true);
    }//GEN-LAST:event_sairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Date dataAtual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        txtData.setText(formato.format(dataAtual));
        txtDataVisitante.setText(formato.format(dataAtual));
        Timer timer = new Timer(0, new hora());
        timer.start();   
        
        try {
            String ipPc = InetAddress.getLocalHost().getHostAddress();
            ip.setText(ipPc);
        } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(null, "Não encontramos o IP LOCAL.");
        }
    }//GEN-LAST:event_formWindowOpened

    private void btCaixaDeEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCaixaDeEntradaActionPerformed
         mostrarCorrespondencias();
    }//GEN-LAST:event_btCaixaDeEntradaActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        this.dispose();
        mostrarCond();
        limparTabelas();
        this.setVisible(true);
        imgFace.setIcon(null);
        lbNome.setText("");
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btAcionamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcionamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAcionamentosActionPerformed

    private void mAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAdminActionPerformed
       
         verificarAdmin();
    }//GEN-LAST:event_mAdminActionPerformed

    private void condEscolhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_condEscolhaKeyPressed

    }//GEN-LAST:event_condEscolhaKeyPressed

    private void condEscolhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_condEscolhaKeyReleased
               mostrarMoradores();
    }//GEN-LAST:event_condEscolhaKeyReleased

    private void condEscolhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_condEscolhaKeyTyped
                mostrarMoradores();
    }//GEN-LAST:event_condEscolhaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
                   desabilitarCampos();

                } else{ 
                mostrarMoradores();
                iniciarObs();
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbMoradoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMoradoresMouseClicked

        mostrarImg();
        //buscarMoradores();
    }//GEN-LAST:event_tbMoradoresMouseClicked

    private void dataHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataHoraActionPerformed
     JOptionPane.showMessageDialog(null, "A data e hora já estão atualizados de acordo com seu computador.");
    }//GEN-LAST:event_dataHoraActionPerformed

    private void btImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImgActionPerformed
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
    }//GEN-LAST:event_btImgActionPerformed

    private void btPesquisarAptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarAptoActionPerformed
        if(txtApto.getText().isEmpty()){
            mostrarMoradores();
        }else{
                  buscarMoradoresPeloApto();  
        }

    }//GEN-LAST:event_btPesquisarAptoActionPerformed

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
          registrarAcesso();
    }//GEN-LAST:event_btRegistrarActionPerformed

    private void frameImagensComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_frameImagensComponentMoved
        frameImagens.setLocation(810, 230);
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

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        NotasVersao nv = new NotasVersao();
        nv.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        registrarSaída();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void EntradasSaidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradasSaidasActionPerformed
        mostrarEntradas();
    }//GEN-LAST:event_EntradasSaidasActionPerformed

    private void btCorrespondenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCorrespondenciaActionPerformed
        String cond = condEscolha.getSelectedItem().toString();
            if(condicao() == true){
                JOptionPane.showMessageDialog(null, "Selecione o condomínio");
        }else {
            mostrarCorrespondencias();
            }
    }//GEN-LAST:event_btCorrespondenciaActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        QuemSomos qs = new QuemSomos();
        qs.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
    private javax.swing.JMenuItem EntradasSaidas;
    private javax.swing.JLabel admin;
    private javax.swing.JTextField aptoTerceiro;
    private javax.swing.JButton btAbrirInfoMorador;
    private javax.swing.JButton btAcionamentos;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCaixaDeEntrada;
    private javax.swing.JButton btCancelarRegistro;
    private javax.swing.JButton btCorrespondencia;
    private javax.swing.JButton btFecharImgs;
    private javax.swing.JButton btImg;
    private javax.swing.JButton btNota;
    private javax.swing.JButton btNão;
    private javax.swing.JButton btPesquisarApto;
    private javax.swing.JButton btRegistrar;
    private javax.swing.JButton btSairSis;
    private javax.swing.JButton btSim;
    private javax.swing.JButton btTrocar;
    private javax.swing.JComboBox<String> comboTerceiro;
    private javax.swing.JComboBox condEscolha;
    private javax.swing.JMenuItem dataHora;
    private javax.swing.JInternalFrame desejaSair;
    private javax.swing.JInternalFrame fTrocarUser;
    private javax.swing.JInternalFrame frameImagens;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel imgFace;
    private javax.swing.JLabel ip;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbNome;
    private javax.swing.JMenuItem mAdmin;
    private javax.swing.JMenu mFerramentas;
    private javax.swing.JMenu mPrincipal;
    private javax.swing.JMenu mSobre;
    private javax.swing.JMenu mSuporte;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem msgApp;
    private javax.swing.JTextField obsTerceiro;
    private javax.swing.JPanel pBuscar;
    private javax.swing.JPanel pEntrada;
    private javax.swing.JPanel pImagens;
    private javax.swing.JPanel pInfos;
    private javax.swing.JTabbedPane pMenuMBEC;
    private javax.swing.JPanel pMoradores;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JPanel painelMorador;
    private javax.swing.JPanel painelTeste;
    private javax.swing.JPanel painelTeste1;
    private javax.swing.JPanel painelTeste2;
    private javax.swing.JPanel painelTeste3;
    private javax.swing.JTextField placaTerceiro;
    private javax.swing.JMenuItem sair;
    private javax.swing.JTable tbBusca;
    private javax.swing.JTable tbEntradas;
    private javax.swing.JTable tbMoradores;
    private javax.swing.JLabel txt;
    private javax.swing.JTextField txtApto;
    private javax.swing.JFormattedTextField txtCpfTerceiro;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtData1;
    private javax.swing.JLabel txtDataVisitante;
    private javax.swing.JLabel txtHora;
    private javax.swing.JLabel txtHora1;
    private javax.swing.JLabel txtHoraVisitante;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtIp;
    private javax.swing.JTextField txtNomeTerceiro;
    private javax.swing.JFormattedTextField txtRgTerceiro;
    private javax.swing.JLabel txtUser;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JLabel txtbv;
    private javax.swing.JTextField veiculoTerceiro;
    // End of variables declaration//GEN-END:variables
       
    
    // inicializando e executando contador de horas, e formatando.
    public class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            txtHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
            txtHoraVisitante.setText(String.format("%1$tH:%1$tM", now));
        }
    }
         
         // informando o nome do usuário que está autenticado
    public void inicializar(String u) {
        String user = u;
        txtbv.setText(user);
        txtUsuario.setText(txtbv.getText());
               
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
                             JOptionPane.showMessageDialog(null, "Bem-Vindo(a), " + txtbv.getText(), "VIGILANTE | (ADMIN)", JOptionPane.ERROR_MESSAGE,  new ImageIcon(getClass().getResource("/Imagens/iconeAdmin64x64.png")));
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
            ResultSet result = c.verificarIdCond(verificarId);     
        try {
            while(result.next()){
                id = result.getInt("idcond");
                habilitarCampos();
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
        
        // abrindo informações do morador ao clicar no nome na tabela
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
             if(txtNomeTerceiro.getText().isEmpty() || comboTerceiro.equals("-") || aptoTerceiro.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Digite em todos os campos.");   
             }
             else if(condicao() == true){
                    JOptionPane.showMessageDialog(null, "Selecione o condomínio");
                }  else{        
               
                    String id = aptoTerceiro.getText();
                    String cond = txtId.getText();
                    terceiros.setNivel(nivel);
                    terceiros.setApto(Integer.parseInt(id));
                    terceiros.setNome(txtNomeTerceiro.getText());
                    terceiros.setObs(obsTerceiro.getText());
                    terceiros.setCondID(Integer.parseInt(cond));
                    terceiros.setRg(txtRgTerceiro.getText());
                    terceiros.setCpf(txtCpfTerceiro.getText());
                    terceiros.setVeiculo(veiculoTerceiro.getText());
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
        
        // desabilitar campos
        private void desabilitarCampos(){
               EntradasSaidas.setEnabled(false);
               msgApp.setEnabled(false);

            }
        
        
        // habilitar campos
        private void habilitarCampos(){
              EntradasSaidas.setEnabled(true);
              btAcionamentos.setEnabled(true);

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
 

}
