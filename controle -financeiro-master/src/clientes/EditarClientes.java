/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import Ferramentas.InternalFrame.GFrame;
import Ferramentas.Managers.Managers;
import Ferramentas.TableModel.TbModelReflection;
import java.awt.Point;
import java.util.List;
import javax.persistence.EntityManager;
import principal.models.TbClientes;

/**
 *
 * @author ANDRE PORTO
 */
public class EditarClientes extends javax.swing.JInternalFrame {

    EntityManager em = Managers.GetManager();
    TbModelReflection mdClientes;
    List<TbClientes> lClientes;
    int row;

    /**
     * Creates new form EditarClientes
     */
    public EditarClientes() {
        initComponents();
        mdClientes = new TbModelReflection<TbClientes>() {
            {
                setName(tbClientes, "cnpj", "nome", "municipio", "uf");
                setModel("nrCpfCnpj14", "dsCliente", "dsMunicipio", "dsUf");
                setPreferredWidth(100, 300, 150, 50);
            }
        };

        lClientes = em.createQuery("SELECT t FROM TbClientes t ORDER BY t.dsCliente").getResultList();
        mdClientes.setList(lClientes);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfCnpj = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfMunicipio = new javax.swing.JTextField();

        jMenuItem1.setText("Excluir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setClosable(true);

        tbClientes.setAutoCreateRowSorter(true);
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbClientesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbClientes);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtrar Por:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("CNPJ:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Município:");

        tfCnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCnpjKeyReleased(evt);
            }
        });

        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNomeKeyReleased(evt);
            }
        });

        tfMunicipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfMunicipioKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tfMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbClientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseReleased
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            GFrame.addInternalFrame(false, CadastrarClientesBoleto.class, lClientes.get(tbClientes.convertRowIndexToModel(tbClientes.getSelectedRow())));
        }
        if (tbClientes.isEnabled() && evt.isPopupTrigger()) {
            Point p = new Point(evt.getX(), evt.getY());
            row = tbClientes.rowAtPoint(p);
            jPopupMenu1.show(tbClientes, p.x, p.y);
        }
    }//GEN-LAST:event_tbClientesMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        em.getTransaction().begin();
        TbClientes cli = lClientes.get(tbClientes.convertRowIndexToModel(row));
        em.remove(cli);
        em.getTransaction().commit();
        lClientes.remove(cli);
        mdClientes.setList(lClientes);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tfCnpjKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCnpjKeyReleased
        // TODO add your handling code here:
        filtrar();
    }//GEN-LAST:event_tfCnpjKeyReleased

    private void tfNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyReleased
        // TODO add your handling code here:
        filtrar();
    }//GEN-LAST:event_tfNomeKeyReleased

    private void tfMunicipioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMunicipioKeyReleased
        // TODO add your handling code here:
        filtrar();
    }//GEN-LAST:event_tfMunicipioKeyReleased

    void filtrar(){
        GFrame.filtrarJTable(tbClientes, new Object[][]{{tfCnpj.getText(),0},{tfNome.getText(),1},{tfMunicipio.getText(),2}});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField tfCnpj;
    private javax.swing.JTextField tfMunicipio;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
