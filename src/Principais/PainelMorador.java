
package Principais;

import Conexoes.ConexaoMoradores;
import Propriedades.Morador;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class PainelMorador extends javax.swing.JFrame {

    public PainelMorador() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCarro2 = new javax.swing.JTextField();
        txtRg = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtTel2 = new javax.swing.JFormattedTextField();
        txtCarro1 = new javax.swing.JTextField();
        txtPlaca2 = new javax.swing.JTextField();
        txtPlaca1 = new javax.swing.JTextField();
        txtTel1 = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtNome = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        numeroapto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        painelImg = new javax.swing.JPanel();
        txtFace = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(634, 606));
        setResizable(false);
        getContentPane().setLayout(null);

        txtCarro2.setEditable(false);
        txtCarro2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtCarro2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtCarro2);
        txtCarro2.setBounds(210, 490, 157, 28);

        txtRg.setEditable(false);
        txtRg.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRg.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        getContentPane().add(txtRg);
        txtRg.setBounds(90, 370, 150, 28);

        txtCpf.setEditable(false);
        txtCpf.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        getContentPane().add(txtCpf);
        txtCpf.setBounds(310, 370, 150, 28);

        txtTel2.setEditable(false);
        txtTel2.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtTel2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTel2.setToolTipText("");
        txtTel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtTel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTel2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtTel2);
        txtTel2.setBounds(310, 410, 130, 28);

        txtCarro1.setEditable(false);
        txtCarro1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtCarro1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtCarro1);
        txtCarro1.setBounds(210, 450, 157, 28);

        txtPlaca2.setEditable(false);
        txtPlaca2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtPlaca2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtPlaca2);
        txtPlaca2.setBounds(440, 490, 120, 28);

        txtPlaca1.setEditable(false);
        txtPlaca1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtPlaca1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtPlaca1);
        txtPlaca1.setBounds(440, 450, 120, 28);

        txtTel1.setEditable(false);
        txtTel1.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtTel1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        getContentPane().add(txtTel1);
        txtTel1.setBounds(150, 410, 130, 28);

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MARCA/MODELO:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 450, 157, 22);

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PLACA:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(380, 490, 70, 22);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(40, 530, 542, 10);

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RG:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 370, 35, 22);

        txtTipo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtTipo.setForeground(new java.awt.Color(0, 102, 204));
        txtTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTipo.setText("TIPO");
        getContentPane().add(txtTipo);
        txtTipo.setBounds(220, 300, 190, 24);

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(410, 340, 170, 10);

        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNome.setText("NOME");
        getContentPane().add(txtNome);
        txtNome.setBounds(80, 280, 470, 25);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DADOS DO MORADOR");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(210, 330, 200, 25);

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTATO:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 410, 100, 22);

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PLACA:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(380, 450, 77, 22);

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(580, 340, 20, 190);

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(40, 340, 20, 191);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(40, 340, 170, 10);

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CPF:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 370, 36, 22);

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MARCA/MODELO:");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 490, 150, 22);

        numeroapto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numeroapto.setForeground(new java.awt.Color(255, 255, 255));
        numeroapto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeroapto.setText("ap");
        getContentPane().add(numeroapto);
        numeroapto.setBounds(40, 40, 70, 20);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("APARTAMENTO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 140, 16);

        painelImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout painelImgLayout = new javax.swing.GroupLayout(painelImg);
        painelImg.setLayout(painelImgLayout);
        painelImgLayout.setHorizontalGroup(
            painelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtFace, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelImgLayout.setVerticalGroup(
            painelImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelImgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtFace, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(painelImg);
        painelImg.setBounds(198, 20, 230, 260);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/backG.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, -80, 640, 1240);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTel2ActionPerformed

    }//GEN-LAST:event_txtTel2ActionPerformed

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
            java.util.logging.Logger.getLogger(PainelMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelMorador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelMorador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel numeroapto;
    private javax.swing.JPanel painelImg;
    private javax.swing.JTextField txtCarro1;
    private javax.swing.JTextField txtCarro2;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JLabel txtFace;
    private javax.swing.JLabel txtNome;
    private javax.swing.JTextField txtPlaca1;
    private javax.swing.JTextField txtPlaca2;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JFormattedTextField txtTel1;
    private javax.swing.JFormattedTextField txtTel2;
    private javax.swing.JLabel txtTipo;
    // End of variables declaration//GEN-END:variables
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
        txtRg.setText(rg);
        txtCpf.setText(cpf);
        txtTel1.setText(telefone1);
        txtTel2.setText(telefone2);
        numeroapto.setText(apto);
        txtNome.setText(nomemorador);
        txtCarro1.setText(veiculo1);
        txtCarro2.setText(veiculo2);
        txtPlaca1.setText(placa1);
        txtPlaca2.setText(placa2);
        byte [] img = (morador.getFace());
        ImageIcon icone = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(painelImg.getWidth() , painelImg.getHeight(), 100));
        // icone.setImage(icone.getImage().getScaledInstance(painelImg.getWidth()-2 , painelImg.getHeight()-1, 100));
        txtFace.setIcon(icone);
        
        // decidindo qual tipo de morador
         switch (nivel){
             
             // PROPRIETÁRIO(A)
             case 1:
             txtTipo.setText("PROPRIETÁRIO(A)");
             txtTipo.setForeground(Color.red.darker());
             break;
              // MORADOR(A)
             case 2:
               txtTipo.setText("MORADOR(A)");
                 txtTipo.setForeground(Color.red.darker());
             break;
             // AUTORIZADO(A)
             case 3:
                          txtTipo.setText("AUTORIZADO(A)");
                          txtTipo.setForeground(Color.green.darker());
             break;   
             //FILHO(A)
             case 4:
                          txtTipo.setText("FILHO(A)");
                          txtTipo.setForeground(Color.red.darker());
             break;
             // DIARISTA
             case 5:
                          txtTipo.setText("DIARISTA");
             break;
             //ZELADOR(A) 
             case 6:
                          txtTipo.setText("ZELADOR(A)");
             break;
             // PORTEIRO(A)
             case 7:
                          txtTipo.setText("PORTEIRO(A)");
             break;
             // CÔNJUGE
             case 8:
                          txtTipo.setText("CÔNJUGE");
                          txtTipo.setForeground(Color.red.darker());
             break;

         }
                 this.setTitle("VIGILANTE - APTO. " + ap + " | " + name);
             }   
        
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "PainelMorador: mostrarResult:" + erro);
        }
            
        }}
