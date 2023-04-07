
package Secundarias;

import Conexoes.ConexaoCorrespondencia;
import Principais.Menu;
import Propriedades.Correspondencias;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class CaixaDeEntrada extends javax.swing.JFrame {


    public CaixaDeEntrada() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon.png")).getImage());
        frameAdd.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameAdd = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        btAddOk = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        txtTitulo = new javax.swing.JTextField();
        txtObs = new javax.swing.JTextField();
        txtAp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCorrespondencias = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btAdd = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();
        txtIdCond = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(588, 637));
        setMinimumSize(new java.awt.Dimension(588, 637));
        setPreferredSize(new java.awt.Dimension(588, 637));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        frameAdd.setTitle("ADICIONAR CORRESPONDÊNCIA");
        frameAdd.setToolTipText("");
        frameAdd.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/email.png"))); // NOI18N
        frameAdd.setVisible(true);

        jPanel1.setBackground(new java.awt.Color(1, 3, 73));

        btAddOk.setBackground(new java.awt.Color(0, 153, 0));
        btAddOk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAddOk.setForeground(new java.awt.Color(255, 255, 255));
        btAddOk.setText("ADICIONAR");
        btAddOk.setToolTipText("");
        btAddOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddOkActionPerformed(evt);
            }
        });

        btCancelar.setBackground(new java.awt.Color(153, 0, 0));
        btCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("CANCELAR");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        txtTitulo.setBackground(new java.awt.Color(153, 153, 0));
        txtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(0, 0, 0));
        txtTitulo.setToolTipText("TÍTULO");
        txtTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TÍTULO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        txtObs.setBackground(new java.awt.Color(153, 153, 0));
        txtObs.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtObs.setForeground(new java.awt.Color(0, 0, 0));
        txtObs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OBSERVAÇÕES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        txtAp.setBackground(new java.awt.Color(153, 153, 0));
        txtAp.setToolTipText("APARTAMENTO");
        txtAp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APTO.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(314, 314, 314)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtAp, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(232, 232, 232))
                                .addComponent(txtObs, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTitulo)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btCancelar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                                    .addComponent(btAddOk)))
                            .addGap(10, 10, 10)))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(0, 302, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(txtAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btCancelar)
                                .addComponent(btAddOk))))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout frameAddLayout = new javax.swing.GroupLayout(frameAdd.getContentPane());
        frameAdd.getContentPane().setLayout(frameAddLayout);
        frameAddLayout.setHorizontalGroup(
            frameAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frameAddLayout.setVerticalGroup(
            frameAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(frameAdd);
        frameAdd.setBounds(88, 136, 390, 350);

        tbCorrespondencias.setAutoCreateRowSorter(true);
        tbCorrespondencias.setBackground(new java.awt.Color(153, 153, 0));
        tbCorrespondencias.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbCorrespondencias.setForeground(new java.awt.Color(0, 0, 0));
        tbCorrespondencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "APTO.", "TÍTULO", "DATA/HORA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCorrespondencias.setRowHeight(22);
        tbCorrespondencias.getTableHeader().setResizingAllowed(false);
        tbCorrespondencias.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbCorrespondencias);
        if (tbCorrespondencias.getColumnModel().getColumnCount() > 0) {
            tbCorrespondencias.getColumnModel().getColumn(0).setResizable(false);
            tbCorrespondencias.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbCorrespondencias.getColumnModel().getColumn(1).setResizable(false);
            tbCorrespondencias.getColumnModel().getColumn(1).setPreferredWidth(170);
            tbCorrespondencias.getColumnModel().getColumn(2).setResizable(false);
            tbCorrespondencias.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 90, 470, 402);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CORRESPONDÊNCIAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 30, 400, 48);

        btAdd.setBackground(new java.awt.Color(0, 153, 0));
        btAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btAdd.setForeground(new java.awt.Color(255, 255, 255));
        btAdd.setText("ADICIONAR");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        getContentPane().add(btAdd);
        btAdd.setBounds(420, 510, 100, 23);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/backG.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 600, 720);

        txtIdCond.setText("ID");
        getContentPane().add(txtIdCond);
        txtIdCond.setBounds(517, 10, 60, 16);

        txtData.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtData.setForeground(new java.awt.Color(204, 204, 204));
        txtData.setText("DATA");
        getContentPane().add(txtData);
        txtData.setBounds(50, 500, 89, 16);

        txtHora.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtHora.setForeground(new java.awt.Color(204, 204, 204));
        txtHora.setText("HORA");
        getContentPane().add(txtHora);
        txtHora.setBounds(50, 530, 89, 16);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
       frameAdd.setVisible(true);
    }//GEN-LAST:event_btAddActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
       frameAdd.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Date dataAtual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        txtData.setText(formato.format(dataAtual));
        Timer timer = new Timer(0, new hora());
        timer.start();                                  
    }//GEN-LAST:event_formWindowOpened

    private void btAddOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddOkActionPerformed

        if(txtAp.getText().isEmpty() || txtTitulo.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Preencha o campo APTO. e campo TÍTULO.");
        } else{
            registrarCarta();
        }
    }//GEN-LAST:event_btAddOkActionPerformed

    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CaixaDeEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaixaDeEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaixaDeEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaixaDeEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaixaDeEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btAddOk;
    private javax.swing.JButton btCancelar;
    private javax.swing.JInternalFrame frameAdd;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCorrespondencias;
    private javax.swing.JTextField txtAp;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtHora;
    private javax.swing.JLabel txtIdCond;
    private javax.swing.JTextField txtObs;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
       public class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar now = Calendar.getInstance();
            txtHora.setText(String.format("%1$tH:%1$tM", now));
        }
    }
    
    
    
    
    // exibindo as correspondências
    public void mostrarCorrespondencias(int idcond){
        
        int id = idcond;
        String mostrarId = "";
        mostrarId = String.valueOf(id);
        txtIdCond.setText(mostrarId);
        DefaultTableModel cartas = (DefaultTableModel) tbCorrespondencias.getModel();
        // mostrando entradas de terceiros
        tbCorrespondencias.removeAll();
        cartas.setNumRows(0);
        ConexaoCorrespondencia c = new ConexaoCorrespondencia();
        for(Correspondencias cr: c.listarCorrespondencias(id)){

            
            cartas.addRow(new Object[]{
                "APTO. " + cr.getApto() + " > " , cr.getTitulo(), cr.getData() + " - " + cr.getHora()
                    
            });
        }
    }

   
    // registrando correspondência
   public void registrarCarta(){       
       Correspondencias carta = new Correspondencias();
       String ap = txtAp.getText();
       String id = txtIdCond.getText();
       carta.setApto(Integer.parseInt(ap));
       carta.setIdcond(Integer.parseInt(id));
       carta.setTitulo(txtTitulo.getText());
       carta.setObs(txtObs.getText());
       carta.setData(txtData.getText());
       carta.setHora(txtHora.getText());
       ConexaoCorrespondencia cc = new ConexaoCorrespondencia();
       cc.registrarCorrespondencia(carta);
       frameAdd.setVisible(false);
       mostrarCorrespondencias(Integer.parseInt(id));
   }
}
