
package Secundarias;

import Conexoes.ConexaoTerceiros;
import Propriedades.Terceiros;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class ConsultaEntradas extends javax.swing.JFrame {


    public ConsultaEntradas() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconePrincipal.png")).getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEntradas = new javax.swing.JTable();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(605, 683));
        setMinimumSize(new java.awt.Dimension(605, 683));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTROS DE ENTRADAS/SAÍDAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 30, 410, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ATIVOS: VISITANTES/PRESTADORES QUE AINDA ESTÃO NO CONDOMÍNIO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 70, 420, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SAIU: VISITANTES/PRESTADORES QUE JÁ SAIRAM DO CONDOMÍNIO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 90, 400, 16);

        tbEntradas.setAutoCreateRowSorter(true);
        tbEntradas.setBackground(new java.awt.Color(153, 153, 0));
        tbEntradas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tbEntradas.setForeground(new java.awt.Color(0, 0, 0));
        tbEntradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "APTO.", "NOME/TIPO", "DATA/HORA", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbEntradas.setFocusable(false);
        tbEntradas.setRowHeight(22);
        tbEntradas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbEntradas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbEntradas.getTableHeader().setResizingAllowed(false);
        tbEntradas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbEntradas);
        if (tbEntradas.getColumnModel().getColumnCount() > 0) {
            tbEntradas.getColumnModel().getColumn(0).setResizable(false);
            tbEntradas.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbEntradas.getColumnModel().getColumn(1).setResizable(false);
            tbEntradas.getColumnModel().getColumn(1).setPreferredWidth(180);
            tbEntradas.getColumnModel().getColumn(2).setResizable(false);
            tbEntradas.getColumnModel().getColumn(2).setPreferredWidth(70);
            tbEntradas.getColumnModel().getColumn(3).setResizable(false);
            tbEntradas.getColumnModel().getColumn(3).setPreferredWidth(8);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 140, 530, 402);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/background.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 610, 690);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(ConsultaEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaEntradas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbEntradas;
    // End of variables declaration//GEN-END:variables
    public void mostrarEntradasSaidas(int idcond){
        
        int id = idcond;
        DefaultTableModel entradas = (DefaultTableModel) tbEntradas.getModel();
        // mostrando entradas de terceiros
        tbEntradas.removeAll();
        entradas.setNumRows(0);
        ConexaoTerceiros ct = new ConexaoTerceiros();
        for(Terceiros t: ct.listarEntradasSaidas(id)){
            String tipo = "";
            String stt = "";
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
            if(t.getStatus() == 1){
                stt = "ATIVO";
            }
            if(t.getStatus() == 0){
                stt = "SAIU";
            }
            
            entradas.addRow(new Object[]{
                "APTO. " + t.getApto() + " > " , t.getNome() + " > " + tipo, t.getData() + " - " + t.getHora(), stt
                    
            });
        }
        TableRowSorter tableSorter = new TableRowSorter(entradas);
        tbEntradas.setRowSorter(tableSorter);
        tableSorter.toggleSortOrder(3);

    }}
