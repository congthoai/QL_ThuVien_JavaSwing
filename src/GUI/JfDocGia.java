package GUI;



import DAO.DocGiaDAO;
import DTO.AccountDTO;
import DTO.DocGiaDTO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10 TIMT
 */
public class JfDocGia extends javax.swing.JFrame {
    
    protected AccountDTO Acc;
   
    public JfDocGia() {
    
        initComponents();
       load();
    }

    public JfDocGia(AccountDTO acc) {
    
       initComponents();
       load();
       Acc=acc;
    }
    
    
    private void load() {
       Date ngay = new Date(98, 10, 21);
       DCNgaySinh.setDate(ngay);
        
        DefaultTableModel tableModel = (DefaultTableModel) tableDocGia.getModel();
        tableModel.setRowCount(0);
        List<DocGiaDTO> list = DocGiaDAO.Instance().getTableDocGia();
        
        for(DocGiaDTO d : list){
        tableModel.addRow(new Object[]{
            d.getMaDG(),d.getHoTen(),d.getLoaiDG(),d.getGioiTinh(),d.getNgaySinh(),d.getsDT(),d.getDiaChi(),d.getTichDiem()
        });
        txtTenDG.setText("");
        txtMaDG.setText(DocGiaDAO.Instance().MaDGtieptheo());
        txtSDT.setText("");
        txtDC.setText("");
        rdbNam.setSelected(true);

        
    }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtMaDG = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        rdbNam = new javax.swing.JRadioButton();
        rdbNu = new javax.swing.JRadioButton();
        DCNgaySinh = new com.toedter.calendar.JDateChooser();
        txtTenDG = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btThem = new javax.swing.JButton();
        btChinhSua = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDocGia = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("QUẢN LÝ ĐỘC GIẢ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(375, 375, 375))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông tin độc giả", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mã độc giả");

        txtMaDG.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtMaDG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMaDG.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Tên độc giả");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Ngày sinh");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Địa chỉ");

        txtDC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Số điện thoại");

        txtSDT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSDT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Giới tính");

        rdbNam.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        rdbNam.setText("Nam");
        rdbNam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rdbNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNamActionPerformed(evt);
            }
        });

        rdbNu.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        rdbNu.setText("Nữ");
        rdbNu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rdbNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNuActionPerformed(evt);
            }
        });

        DCNgaySinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DCNgaySinh.setDateFormatString("dd/MM/yyyy");
        DCNgaySinh.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        DCNgaySinh.setRequestFocusEnabled(false);

        txtTenDG.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTenDG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaDG)
                    .addComponent(txtTenDG)
                    .addComponent(DCNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(rdbNu, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDC, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(rdbNam)
                        .addComponent(rdbNu))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtMaDG, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTenDG, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DCNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(txtDC, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tác vụ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btThem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btThem.setText("Thêm");
        btThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btThemMouseClicked(evt);
            }
        });
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btChinhSua.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btChinhSua.setText("Chỉnh sữa");
        btChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChinhSuaActionPerformed(evt);
            }
        });

        btBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btBack.setText("Quay về");
        btBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBackMouseClicked(evt);
            }
        });
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        btXoa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btChinhSua, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(btXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        tableDocGia.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 255), new java.awt.Color(153, 153, 255)));
        tableDocGia.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        tableDocGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã độc giả", "Tên độc giả", "Cấp bậc", "Giới tính", "Ngày sinh", "Số điện thoại", "địa chỉ", "Điểm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDocGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDocGiaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableDocGia);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThemMouseClicked

//        String ma = txtMaDG.getText();
//        String ht=txtTenDG.getText();
//        
//        SimpleDateFormat d=new SimpleDateFormat("MM/dd/yyyy");
//        String ngaysinh = d.format(DCNgaySinh.getDate());
//        String gt =null;   
//        String sdt=txtSDT.getText();
//        String dc=txtDC.getText();
//        int dt = 0; 
//        try {
//            dt = Integer.parseInt(sdt);
//        } catch (Exception e) {
//            dt=0;
//        }
//        
//        if(ht.equals(""))
//        {
//            JOptionPane.showMessageDialog(rootPane, "Không có tên độc giả"); 
//            
//        }
//        else if(dt == 0)        
//            JOptionPane.showMessageDialog(rootPane, "Kiem tra SDT");
//        else if (dc.equals(""))
//            JOptionPane.showMessageDialog(rootPane, "Không có địa chỉ ");
//        else 
//        {
//               if(rdbNam.isSelected())
//                     gt = "Nam";
//               else
//               {   if(rdbNu.isSelected())
//                     gt="Nữ";
//               }     
//                    
//            DocGiaDAO.Instance().InsertDG(ma, ht, gt, ngaysinh, sdt, dc);
//            load();
//            rdbNamMouseClicked(evt);
//        }      
         
       
    }//GEN-LAST:event_btThemMouseClicked

    private void tableDocGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDocGiaMouseClicked
        try {
            int row=this.tableDocGia.getSelectedRow();
            txtMaDG.setText((this.tableDocGia.getModel().getValueAt(row, 0)).toString());
            txtTenDG.setText((this.tableDocGia.getModel().getValueAt(row, 1)).toString());
            txtSDT.setText((this.tableDocGia.getModel().getValueAt(row, 5)).toString());
            txtDC.setText((this.tableDocGia.getModel().getValueAt(row, 6)).toString());
            
            String ngay = (this.tableDocGia.getModel().getValueAt(row, 4)).toString();
            String day = ngay.substring(8, 10) +"/"+ ngay.substring(5, 7) +"/"+ ngay.substring(0, 4);          
            Date d = new SimpleDateFormat("dd/MM/yyyy").parse(day);
            DCNgaySinh.setDate(d);
            

            String gt=null;
            if("Nam".equals(this.tableDocGia.getModel().getValueAt(row, 3).toString()))
            {
                 rdbNu.setSelected(false);
                rdbNam.setSelected(true);
            }
            else if("Nữ".equals(this.tableDocGia.getModel().getValueAt(row, 3).toString()))
            {  
                 rdbNam.setSelected(false);
                rdbNu.setSelected(true);
            }
            
          
           
    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Lỗi");
        }
    }//GEN-LAST:event_tableDocGiaMouseClicked

    private void btBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBackMouseClicked
       this.dispose();
       jfMainMenu f=new jfMainMenu(Acc);
       f.setVisible(true);
    }//GEN-LAST:event_btBackMouseClicked

    private void btChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChinhSuaActionPerformed
        String ma = txtMaDG.getText();
        String ht=txtTenDG.getText();
        
        SimpleDateFormat d=new SimpleDateFormat("MM/dd/yyyy");
        String ngaysinh = d.format(DCNgaySinh.getDate());
        String gt =null;   
        String sdt=txtSDT.getText();
        String dc=txtDC.getText();
        int dt = 0; 
        try {
            dt = Integer.parseInt(sdt);
        } catch (Exception e) {
            dt=0;
        }
        
        if(ht.equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Không có tên độc giả"); 
            
        }
        else if(dt == 0)        
            JOptionPane.showMessageDialog(rootPane, "Kiem tra SDT");
        else if (dc.equals(""))
            JOptionPane.showMessageDialog(rootPane, "Không có địa chỉ ");
        else 
        {
               if(rdbNam.isSelected())
                     gt = "Nam";
               else
               {   if(rdbNu.isSelected())
                     gt="Nữ";
               }     
              
            DocGiaDAO.Instance().UpdateDG(ma, ht, gt, ngaysinh, sdt, dc);
            load();
            rdbNamActionPerformed(evt);
        }  
    }//GEN-LAST:event_btChinhSuaActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBackActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        
         String ma = txtMaDG.getText();
        String ht=txtTenDG.getText();
        
        SimpleDateFormat d=new SimpleDateFormat("MM/dd/yyyy");
        String ngaysinh = d.format(DCNgaySinh.getDate());
        String gt =null;   
        String sdt=txtSDT.getText();
        String dc=txtDC.getText();
        int dt = 0; 
        try {
            dt = Integer.parseInt(sdt);
        } catch (Exception e) {
            dt=0;
        }
        
        if(ht.equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Không có tên độc giả"); 
            
        }
        else if(dt == 0)        
            JOptionPane.showMessageDialog(rootPane, "Kiem tra SDT");
        else if (dc.equals(""))
            JOptionPane.showMessageDialog(rootPane, "Không có địa chỉ ");
        else 
        {
               if(rdbNam.isSelected())
                     gt = "Nam";
               else
               {   if(rdbNu.isSelected())
                     gt="Nữ";
               }     
                    
            DocGiaDAO.Instance().InsertDG(ma, ht, gt, ngaysinh, sdt, dc);
            load();
            rdbNamActionPerformed(evt);
        }    
    }//GEN-LAST:event_btThemActionPerformed

    private void rdbNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNamActionPerformed
        rdbNu.setSelected(false);
    }//GEN-LAST:event_rdbNamActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        if(txtMaDG.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Chọn đọc giả cần xóa!");
        }
        else{
            String kq = DocGiaDAO.Instance().checkXoaDG(txtMaDG.getText());
            if(kq != null)
                JOptionPane.showMessageDialog(rootPane, "Không thể xóa!\n Đọc giả này chưa trả hết sách!");
            else{
                DocGiaDAO.Instance().xoaDG(txtMaDG.getText());
                JOptionPane.showMessageDialog(rootPane, "Xóa thành công!");
                load();
                rdbNamActionPerformed(evt);
            }
            
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void rdbNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNuActionPerformed
        rdbNam.setSelected(false);
    }//GEN-LAST:event_rdbNuActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JfDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfDocGia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DCNgaySinh;
    private javax.swing.JButton btBack;
    private javax.swing.JButton btChinhSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdbNam;
    private javax.swing.JRadioButton rdbNu;
    private javax.swing.JTable tableDocGia;
    private javax.swing.JTextField txtDC;
    private javax.swing.JTextField txtMaDG;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenDG;
    // End of variables declaration//GEN-END:variables
}
