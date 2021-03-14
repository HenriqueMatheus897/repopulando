/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.ProgressMonitorInputStream;

import aluno.AlumnoVIP;
import aluno.AlumnoParaUsuario;
import java.awt.Color;
import java.awt.Desktop;
import metodos.MetodosParaUsuario;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.List;
import java.awt.PopupMenu;
import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.util.logging.Level;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import metodos.Metodos;
import metodos.MetodosParaUsuario;
import metodos.MetodosVIP;
import javax.swing.JProgressBar;
import static org.eclipse.persistence.jpa.jpql.utility.CollectionTools.array;

public class PerfilDoCliente extends javax.swing.JFrame {
    
    public Timer t;
    public ActionListener al;
    
    JProgressBar barra = new JProgressBar();
   // AlumnoParaUsuario alumnoParaUsuario = new AlumnoParaUsuario();
    MetodosParaUsuario metodosParaUsuario = new MetodosParaUsuario();
   // Vector vCabeceras = new Vector();
    //private Object model; 
    
    AlumnoVIP alumno = new AlumnoVIP();
    MetodosVIP metodos = new MetodosVIP();
    

    
    
    //fuçao para calcular os totais
    private void calcular()
    {
        
     // fuçao para caucular o subtotal 
        float suma = 0;
        for( int i = 0; i < jTable1.getRowCount(); i++)
        {
            float renglon;
            renglon = Float.parseFloat(jTable1.getValueAt(i, 1).toString());
            
            suma = suma + renglon;
            
        }

         jTextField30.setText(String.valueOf(suma));
  
    }
    private void calcularConponete()
    {
        
         
        float suma = 0;
        for( int i = 0; i < jTable1.getRowCount(); i++)
        {
            float renglon;
            renglon = Float.parseFloat(jTable1.getValueAt(i, 1).toString());
            
            suma = suma + renglon;
            
        }
           double a=0.5;
         jTextField30.setText(String.valueOf(suma - a));

    }
    
    private void prencher()
    {
        cbo_ItemDaClasse.removeAll();
        
        String item = jTextField86.getText();
        
    File classes = new File("C:\\Arquivos do programa/"+item+".txt");  

      try {
          FileReader fr = new FileReader(classes);   
           BufferedReader br = new BufferedReader(fr);
           

                String linha = br.readLine();
                
                
                cbo_ItemDaClasse.addItem("Selecione o item");
                
                while(linha != null){
                    cbo_ItemDaClasse.addItem(linha);
                   
                    linha = br.readLine();
                } 
                } catch (Exception ex) {
        Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    
    public PerfilDoCliente() {
        initComponents();
        

        
        

        
       /* cbo_select.addItem("Lima");
        cbo_select.addItem("Chiclayo");
        cbo_select.addItem("Trunjillo");
        cbo_select.addItem("Cajamarca");
        cbo_select.addItem("Chimbote");
        cbo_select.addItem("Pirura");
        cbo_select.addItem("Trumbes"); */
        
        metodosParaUsuario.cboSelect(cbo_quat);
        
        txT_EnderecoUSUARIO.setBackground(new java.awt.Color(0,0,0,0));
        txT_NomeUSUARIO.setBackground(new java.awt.Color(0,0,0,0));
        txT_BairroUSUARIO.setBackground(new java.awt.Color(0,0,0,0));
        txT_NumeroUSUARIO.setBackground(new java.awt.Color(0,0,0,0));
        txT_AniversarioUSUARIO.setBackground(new java.awt.Color(0,0,0,0));
        txT_EmailUSUARIO.setBackground(new java.awt.Color(0,0,0,0));
        txT_whatsUSUARIO1.setBackground(new java.awt.Color(0,0,0,0));
        txT_CelularUSUARIO2.setBackground(new java.awt.Color(0,0,0,0));
        txT_ObiservacoesUSUARIO1.setBackground(new java.awt.Color(0,0,0,0));
        jButtonlink.setBackground(new java.awt.Color(0,0,0,0));
        jButton1.setBackground(new java.awt.Color(0,0,0,0));
        jButton777.setBackground(new java.awt.Color(0,0,0,0));
        jTextField71.setBackground(new java.awt.Color(0,0,0,0));
        jTextField72.setBackground(new java.awt.Color(0,0,0,0));
        jTextField3.setBackground(new java.awt.Color(0,0,0,0));
        jTextField4.setBackground(new java.awt.Color(0,0,0,0));
        jTextField1.setBackground(new java.awt.Color(0,0,0,0));
        jTextField2.setBackground(new java.awt.Color(0,0,0,0));
        jTextField6.setBackground(new java.awt.Color(0,0,0,0));
        jTextField5.setBackground(new java.awt.Color(0,0,0,0));
        jTestfildbig.setBackground(new java.awt.Color(0,0,0,0));
        jToggleButton1.setBackground(new java.awt.Color(0,0,0,0));
        jButton6.setBackground(new java.awt.Color(0,0,0,0));
        jButton3.setBackground(new java.awt.Color(0,0,0,0));
        jTextField82.setBackground(new java.awt.Color(0,0,0,0));
        
        jTextField8.setBackground(new java.awt.Color(0,0,0,0));
        jTextField9.setBackground(new java.awt.Color(0,0,0,0));
       // jTextField10.setBackground(new java.awt.Color(0,0,0,0));
        jTextField11.setBackground(new java.awt.Color(0,0,0,0));
        jTextField14.setBackground(new java.awt.Color(0,0,0,0));
        jTextField15.setBackground(new java.awt.Color(0,0,0,0));
        jTextField16.setBackground(new java.awt.Color(0,0,0,0));
        jTextField17.setBackground(new java.awt.Color(0,0,0,0));
        jTextField18.setBackground(new java.awt.Color(0,0,0,0));
        jTextField19.setBackground(new java.awt.Color(0,0,0,0));
        jTextField20.setBackground(new java.awt.Color(0,0,0,0));
        jTextField21.setBackground(new java.awt.Color(0,0,0,0));
        jTextField22.setBackground(new java.awt.Color(0,0,0,0));
        jTextField23.setBackground(new java.awt.Color(0,0,0,0));
        jTextField24.setBackground(new java.awt.Color(0,0,0,0));
        jTextField25.setBackground(new java.awt.Color(0,0,0,0));
        jTextField26.setBackground(new java.awt.Color(0,0,0,0));
        jTextField27.setBackground(new java.awt.Color(0,0,0,0));
        jTextField28.setBackground(new java.awt.Color(0,0,0,0));
        jTextField29.setBackground(new java.awt.Color(0,0,0,0));
        
        jTextField13.setBackground(new java.awt.Color(0,0,0,0));
         jTextField31.setBackground(new java.awt.Color(0,0,0,0));
        jTextField32.setBackground(new java.awt.Color(0,0,0,0));
        jTextField33.setBackground(new java.awt.Color(0,0,0,0));
        jTextField34.setBackground(new java.awt.Color(0,0,0,0));
        jTextField35.setBackground(new java.awt.Color(0,0,0,0));
        jTextField36.setBackground(new java.awt.Color(0,0,0,0));
        jTextField37.setBackground(new java.awt.Color(0,0,0,0));
        jTextField38.setBackground(new java.awt.Color(0,0,0,0));
        jTextField39.setBackground(new java.awt.Color(0,0,0,0));
        jTextField40.setBackground(new java.awt.Color(0,0,0,0));
        jTextField41.setBackground(new java.awt.Color(0,0,0,0));
        jTextField42.setBackground(new java.awt.Color(0,0,0,0));
        jTextField43.setBackground(new java.awt.Color(0,0,0,0));
        jTextField44.setBackground(new java.awt.Color(0,0,0,0));
        jTextField45.setBackground(new java.awt.Color(0,0,0,0));
        jTextField46.setBackground(new java.awt.Color(0,0,0,0));
        jTextField47.setBackground(new java.awt.Color(0,0,0,0));
        jTextField48.setBackground(new java.awt.Color(0,0,0,0));
        jTextField49.setBackground(new java.awt.Color(0,0,0,0));
        jTextField70.setBackground(new java.awt.Color(0,0,0,0));
        
        jTextField50.setBackground(new java.awt.Color(0,0,0,0));
         jTextField51.setBackground(new java.awt.Color(0,0,0,0));
        jTextField52.setBackground(new java.awt.Color(0,0,0,0));
        jTextField53.setBackground(new java.awt.Color(0,0,0,0));
        jTextField54.setBackground(new java.awt.Color(0,0,0,0));
        jTextField55.setBackground(new java.awt.Color(0,0,0,0));
        jTextField56.setBackground(new java.awt.Color(0,0,0,0));
        jTextField57.setBackground(new java.awt.Color(0,0,0,0));
        jTextField58.setBackground(new java.awt.Color(0,0,0,0));
        jTextField59.setBackground(new java.awt.Color(0,0,0,0));
        jTextField60.setBackground(new java.awt.Color(0,0,0,0));
        jTextField61.setBackground(new java.awt.Color(0,0,0,0));
        jTextField62.setBackground(new java.awt.Color(0,0,0,0));
        jTextField63.setBackground(new java.awt.Color(0,0,0,0));
        jTextField64.setBackground(new java.awt.Color(0,0,0,0));
        jTextField65.setBackground(new java.awt.Color(0,0,0,0));
        jTextField66.setBackground(new java.awt.Color(0,0,0,0));
        jTextField67.setBackground(new java.awt.Color(0,0,0,0));
        jTextField68.setBackground(new java.awt.Color(0,0,0,0));
        jTextField69.setBackground(new java.awt.Color(0,0,0,0));
        jTextField73.setBackground(new java.awt.Color(0,0,0,0));
        jTextField74.setBackground(new java.awt.Color(0,0,0,0));
        jTextField80.setBackground(new java.awt.Color(0,0,0,0));
        jTextField83.setBackground(new java.awt.Color(0,0,0,0));
        jTextField84.setBackground(new java.awt.Color(0,0,0,0));
        jTextField75.setBackground(new java.awt.Color(0,0,0,0));
        jTextField76.setBackground(new java.awt.Color(0,0,0,0));
        jTextField77.setBackground(new java.awt.Color(0,0,0,0));
        jTextField78.setBackground(new java.awt.Color(0,0,0,0));
        jTextField81.setBackground(new java.awt.Color(0,0,0,0));
        jTextField79.setBackground(new java.awt.Color(0,0,0,0));
        jTextField13not.setBackground(new java.awt.Color(0,0,0,0));
        jTextField30.setBackground(new java.awt.Color(0,0,0,0));
        cbo_ItemDaClasse.setBackground(new java.awt.Color(0,0,0,0));
        jLabel55.setVisible(false);
        
       // t=new Timer(100,al);
        
        
        
       }
    
    
    
       public void imagemIcon() {
           

         String caminho =  txT_Numero.getText();
         
        ImageIcon img = new ImageIcon("'"+caminho+"'");
        jLabel17.setIcon(img);
                   
    }
       
       
       
       

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        texREs = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        txT_EnderecoUSUARIO1 = new javax.swing.JTextField();
        txT_NumeroUSUARIO1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txT_BairroUSUARIO1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txT_CodigoUSUARIO1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txT_dataUSUARIO1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txT_AniversarioUSUARIO1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txT_EmailUSUARIO1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txT_whatsUSUARIO2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txT_CelularUSUARIO3 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txT_ObiservacoesUSUARIO2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextFieldPath1 = new javax.swing.JTextField();
        txT_Numero1 = new javax.swing.JTextField();
        jButtonlink1 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txT_CodigoUSUARIO = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldPath = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txT_dataUSUARIO = new javax.swing.JTextField();
        txT_EnderecoUSUARIO2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txT_Numero = new javax.swing.JTextField();
        jFrame2 = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        txT_BairroUSUARIO = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        txT_CelularUSUARIO2 = new javax.swing.JTextField();
        cbo_select = new javax.swing.JComboBox<>();
        jButtonlink = new javax.swing.JButton();
        txT_AniversarioUSUARIO = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        txT_ObiservacoesUSUARIO1 = new javax.swing.JTextField();
        txT_NumeroUSUARIO = new javax.swing.JTextField();
        txT_NomeUSUARIO = new javax.swing.JTextField();
        txT_EnderecoUSUARIO = new javax.swing.JTextField();
        txT_whatsUSUARIO1 = new javax.swing.JTextField();
        txT_EmailUSUARIO = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cbo_quat = new javax.swing.JComboBox<>();
        jButton777 = new javax.swing.JButton();
        javax.swing.JButton jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTestfildbig = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField13not = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField13 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jTextField70 = new javax.swing.JTextField();
        jTextField71 = new javax.swing.JTextField();
        jTextField72 = new javax.swing.JTextField();
        cbo_Conplementos = new javax.swing.JComboBox<>();
        jTextField73 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jTextField74 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField75 = new javax.swing.JTextField();
        jTextField76 = new javax.swing.JTextField();
        jTextField77 = new javax.swing.JTextField();
        jTextField78 = new javax.swing.JTextField();
        jTextField79 = new javax.swing.JTextField();
        jTextField80 = new javax.swing.JTextField();
        jTextField81 = new javax.swing.JTextField();
        jTextField82 = new javax.swing.JTextField();
        jTextField83 = new javax.swing.JTextField();
        jTextField84 = new javax.swing.JTextField();
        jTextField85 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        cbo_Clases = new javax.swing.JComboBox<>();
        cbo_ItemDaClasse = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jTextField86 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        txt_Nome = new javax.swing.JTextField();
        txt_Endereco = new javax.swing.JTextField();
        txt_Numero = new javax.swing.JTextField();
        txt_Bairro = new javax.swing.JTextField();
        txt_data = new javax.swing.JTextField();
        Txt_Aniversario = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_whats = new javax.swing.JTextField();
        txt_celular = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txt_obiservasoes = new javax.swing.JTextField();
        jTextField90 = new javax.swing.JTextField();
        txt_Rua = new javax.swing.JTextField();
        txt_cidade = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jTextField88 = new javax.swing.JTextField();
        txt_pedidos = new javax.swing.JTextField();
        txt_valorTotal = new javax.swing.JTextField();
        jTextField87 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextField89 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txT_NomeUSUARIO1 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Selecione o produto");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("quantidade");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Confirmar Pedido ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Total:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(351, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(57, 57, 57)
                .addComponent(texREs, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texREs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(29, 29, 29)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel18.setText("Endereço");

        jFrame1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jFrame1formWindowOpened(evt);
            }
        });

        txT_EnderecoUSUARIO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_EnderecoUSUARIO1ActionPerformed(evt);
            }
        });

        txT_NumeroUSUARIO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_NumeroUSUARIO1ActionPerformed(evt);
            }
        });

        jLabel19.setText("Numero");

        txT_BairroUSUARIO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_BairroUSUARIO1ActionPerformed(evt);
            }
        });

        jLabel20.setText("Bairro");

        txT_CodigoUSUARIO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_CodigoUSUARIO1ActionPerformed(evt);
            }
        });

        jLabel21.setText("Codigo");

        txT_dataUSUARIO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_dataUSUARIO1ActionPerformed(evt);
            }
        });

        jLabel22.setText("Data do Cadastro");

        txT_AniversarioUSUARIO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_AniversarioUSUARIO1ActionPerformed(evt);
            }
        });

        jLabel23.setText("Aniversario");

        txT_EmailUSUARIO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_EmailUSUARIO1ActionPerformed(evt);
            }
        });

        jLabel24.setText("Email");

        txT_whatsUSUARIO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_whatsUSUARIO2ActionPerformed(evt);
            }
        });

        jLabel25.setText("WhatsApp");

        txT_CelularUSUARIO3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_CelularUSUARIO3ActionPerformed(evt);
            }
        });

        jLabel26.setText("Celular");

        txT_ObiservacoesUSUARIO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_ObiservacoesUSUARIO2ActionPerformed(evt);
            }
        });

        jLabel27.setText("Obiservações");

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cliente.png"))); // NOI18N
        jLabel28.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        txT_Numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_Numero1ActionPerformed(evt);
            }
        });

        jButtonlink1.setText("whatzap");
        jButtonlink1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlink1ActionPerformed(evt);
            }
        });

        jLabel29.setText("jLabel2");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(txT_Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177)
                .addComponent(jButtonlink1)
                .addContainerGap(719, Short.MAX_VALUE))
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                                            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txT_CodigoUSUARIO1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel21)
                                                .addComponent(jLabel24))
                                            .addGap(464, 464, 464))
                                        .addComponent(txT_EmailUSUARIO1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jFrame1Layout.createSequentialGroup()
                                            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txT_whatsUSUARIO2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel25))
                                            .addGap(45, 45, 45)
                                            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel26)
                                                .addComponent(txT_CelularUSUARIO3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jFrame1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(txT_EnderecoUSUARIO1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txT_NumeroUSUARIO1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19)
                                            .addComponent(txT_dataUSUARIO1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel22))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel27)
                                        .addComponent(txT_ObiservacoesUSUARIO2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGap(367, 367, 367)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(txT_BairroUSUARIO1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txT_AniversarioUSUARIO1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE))))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jTextFieldPath1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 644, Short.MAX_VALUE)))
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jButtonlink1)
                .addGap(133, 133, 133)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txT_EnderecoUSUARIO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txT_NumeroUSUARIO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txT_BairroUSUARIO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61))
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txT_CodigoUSUARIO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txT_dataUSUARIO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txT_AniversarioUSUARIO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel24)
                        .addGap(10, 10, 10)
                        .addComponent(txT_EmailUSUARIO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txT_whatsUSUARIO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txT_CelularUSUARIO3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txT_ObiservacoesUSUARIO2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPath1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(txT_Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Perfil Do Cliente");
        jLabel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabel1FocusLost(evt);
            }
        });

        jLabel4.setText("Nome");

        jLabel7.setText("Bairro");

        jLabel6.setText("Numero");

        txT_CodigoUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_CodigoUSUARIOActionPerformed(evt);
            }
        });

        jLabel8.setText("Codigo");

        jLabel10.setText("Aniversario");

        jLabel9.setText("Data do Cadastro");

        jLabel11.setText("Email");

        jLabel13.setText("Celular");

        jLabel15.setText("Obiservações");

        jLabel12.setText("WhatsApp");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cliente.png"))); // NOI18N
        jLabel17.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel2.setText("jLabel2");

        txT_dataUSUARIO.setBackground(new java.awt.Color(82, 94, 108));
        txT_dataUSUARIO.setBorder(null);
        txT_dataUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_dataUSUARIOActionPerformed(evt);
            }
        });

        txT_EnderecoUSUARIO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_EnderecoUSUARIO2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Endereço");

        txT_Numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_NumeroActionPerformed(evt);
            }
        });

        jFrame2.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jFrame2WindowOpened(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título 1", "Título 2"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jButton11.setText("apagar ");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel50.setText("jLabel50");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        txT_BairroUSUARIO.setForeground(java.awt.Color.white);
        txT_BairroUSUARIO.setBorder(null);
        txT_BairroUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_BairroUSUARIOActionPerformed(evt);
            }
        });
        getContentPane().add(txT_BairroUSUARIO);
        txT_BairroUSUARIO.setBounds(90, 360, 150, 20);

        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(760, 10, 0, 20);

        txT_CelularUSUARIO2.setForeground(java.awt.Color.white);
        txT_CelularUSUARIO2.setBorder(null);
        txT_CelularUSUARIO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_CelularUSUARIO2ActionPerformed(evt);
            }
        });
        getContentPane().add(txT_CelularUSUARIO2);
        txT_CelularUSUARIO2.setBounds(360, 490, 260, 30);

        cbo_select.setToolTipText("xtudo");
        cbo_select.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_selectItemStateChanged(evt);
            }
        });
        cbo_select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_selectMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbo_selectMouseExited(evt);
            }
        });
        cbo_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_selectActionPerformed(evt);
            }
        });
        getContentPane().add(cbo_select);
        cbo_select.setBounds(730, 90, 0, 40);

        jButtonlink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlinkActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonlink);
        jButtonlink.setBounds(630, 110, 50, 40);

        txT_AniversarioUSUARIO.setForeground(java.awt.Color.white);
        txT_AniversarioUSUARIO.setBorder(null);
        txT_AniversarioUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_AniversarioUSUARIOActionPerformed(evt);
            }
        });
        getContentPane().add(txT_AniversarioUSUARIO);
        txT_AniversarioUSUARIO.setBounds(460, 360, 160, 20);

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Design sem nome.png"))); // NOI18N
        jLabel55.setText("jLabel55");
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel55);
        jLabel55.setBounds(630, 50, 50, 50);

        txT_ObiservacoesUSUARIO1.setBackground(new java.awt.Color(82, 94, 108));
        txT_ObiservacoesUSUARIO1.setForeground(java.awt.Color.white);
        txT_ObiservacoesUSUARIO1.setBorder(null);
        txT_ObiservacoesUSUARIO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_ObiservacoesUSUARIO1ActionPerformed(evt);
            }
        });
        getContentPane().add(txT_ObiservacoesUSUARIO1);
        txT_ObiservacoesUSUARIO1.setBounds(100, 560, 520, 90);

        txT_NumeroUSUARIO.setForeground(java.awt.Color.white);
        txT_NumeroUSUARIO.setBorder(null);
        txT_NumeroUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_NumeroUSUARIOActionPerformed(evt);
            }
        });
        getContentPane().add(txT_NumeroUSUARIO);
        txT_NumeroUSUARIO.setBounds(280, 360, 150, 20);

        txT_NomeUSUARIO.setBackground(new java.awt.Color(82, 94, 108));
        txT_NomeUSUARIO.setForeground(java.awt.Color.white);
        txT_NomeUSUARIO.setBorder(null);
        txT_NomeUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_NomeUSUARIOActionPerformed(evt);
            }
        });
        getContentPane().add(txT_NomeUSUARIO);
        txT_NomeUSUARIO.setBounds(100, 220, 520, 20);

        txT_EnderecoUSUARIO.setForeground(java.awt.Color.white);
        txT_EnderecoUSUARIO.setBorder(null);
        txT_EnderecoUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_EnderecoUSUARIOActionPerformed(evt);
            }
        });
        getContentPane().add(txT_EnderecoUSUARIO);
        txT_EnderecoUSUARIO.setBounds(100, 280, 510, 30);

        txT_whatsUSUARIO1.setForeground(java.awt.Color.white);
        txT_whatsUSUARIO1.setBorder(null);
        txT_whatsUSUARIO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_whatsUSUARIO1ActionPerformed(evt);
            }
        });
        getContentPane().add(txT_whatsUSUARIO1);
        txT_whatsUSUARIO1.setBounds(100, 490, 240, 30);

        txT_EmailUSUARIO.setBackground(new java.awt.Color(82, 94, 108));
        txT_EmailUSUARIO.setForeground(java.awt.Color.white);
        txT_EmailUSUARIO.setBorder(null);
        txT_EmailUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_EmailUSUARIOActionPerformed(evt);
            }
        });
        getContentPane().add(txT_EmailUSUARIO);
        txT_EmailUSUARIO.setBounds(90, 430, 520, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(760, 30, 0, 20);

        jButton1.setText("finlisar pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1030, 550, 140, 70);

        cbo_quat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_quatItemStateChanged(evt);
            }
        });
        cbo_quat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_quatMouseClicked(evt);
            }
        });
        cbo_quat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_quatActionPerformed(evt);
            }
        });
        getContentPane().add(cbo_quat);
        cbo_quat.setBounds(1130, 70, 50, 50);

        jButton777.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Design sem nome.png"))); // NOI18N
        jButton777.setRequestFocusEnabled(false);
        jButton777.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton777ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton777);
        jButton777.setBounds(630, 50, 50, 50);

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1190, 280, 40, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lanches ", "valor", "quantidade"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMaxWidth(120);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(120);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(730, 180, 440, 350);

        jTextField3.setBorder(null);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(820, 10, 0, 20);

        jTextField4.setBorder(null);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(820, 30, 0, 20);

        jTextField6.setBorder(null);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(430, 20, 0, 14);

        jTextField5.setBorder(null);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(430, 40, 0, 14);

        jTestfildbig.setBorder(null);
        getContentPane().add(jTestfildbig);
        jTestfildbig.setBounds(430, 60, 0, 14);

        jTextField7.setBorder(null);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(560, 180, 0, 0);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Título 4", "Título 5", "Título 6", "Título 7", "Título 8", "Título 9", "Título 10"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 650, 0, 10);

        jTextField8.setBorder(null);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(0, 100, 0, 20);

        jTextField9.setBorder(null);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(0, 120, 0, 14);

        jTextField10.setBorder(null);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10);
        jTextField10.setBounds(0, 140, 0, 14);

        jTextField11.setBorder(null);
        getContentPane().add(jTextField11);
        jTextField11.setBounds(0, 160, 0, 14);

        jToggleButton1.setBorder(null);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(10, 630, 50, 30);

        jTextField13not.setBorder(null);
        getContentPane().add(jTextField13not);
        jTextField13not.setBounds(730, 510, 0, 40);

        jTextField14.setBorder(null);
        getContentPane().add(jTextField14);
        jTextField14.setBounds(0, 180, 0, 14);

        jTextField15.setBorder(null);
        getContentPane().add(jTextField15);
        jTextField15.setBounds(0, 200, 0, 14);

        jTextField16.setBorder(null);
        getContentPane().add(jTextField16);
        jTextField16.setBounds(0, 220, 0, 14);

        jTextField17.setBorder(null);
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField17);
        jTextField17.setBounds(0, 240, 0, 14);

        jTextField18.setBorder(null);
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField18);
        jTextField18.setBounds(0, 260, 0, 14);

        jTextField19.setBorder(null);
        getContentPane().add(jTextField19);
        jTextField19.setBounds(0, 280, 0, 14);

        jTextField20.setBorder(null);
        getContentPane().add(jTextField20);
        jTextField20.setBounds(0, 300, 0, 14);

        jTextField21.setBorder(null);
        getContentPane().add(jTextField21);
        jTextField21.setBounds(0, 320, 0, 14);

        jTextField22.setBorder(null);
        getContentPane().add(jTextField22);
        jTextField22.setBounds(0, 340, 0, 14);

        jTextField23.setBorder(null);
        getContentPane().add(jTextField23);
        jTextField23.setBounds(0, 360, 0, 14);

        jTextField24.setBorder(null);
        getContentPane().add(jTextField24);
        jTextField24.setBounds(0, 380, 0, 14);

        jTextField25.setBorder(null);
        getContentPane().add(jTextField25);
        jTextField25.setBounds(0, 400, 0, 14);

        jTextField26.setBorder(null);
        getContentPane().add(jTextField26);
        jTextField26.setBounds(0, 420, 0, 14);

        jTextField27.setBorder(null);
        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField27);
        jTextField27.setBounds(0, 440, 0, 14);

        jTextField28.setBorder(null);
        getContentPane().add(jTextField28);
        jTextField28.setBounds(0, 460, 0, 14);

        jTextField29.setBorder(null);
        getContentPane().add(jTextField29);
        jTextField29.setBounds(0, 480, 0, 14);

        jTextField30.setForeground(java.awt.Color.white);
        jTextField30.setText("0");
        jTextField30.setBorder(null);
        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField30);
        jTextField30.setBounds(760, 630, 150, 30);

        jButton5.setText("jButton5");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(440, 120, 0, 15);

        jTextField12.setBorder(null);
        getContentPane().add(jTextField12);
        jTextField12.setBounds(260, 130, 0, 14);

        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(920, 600, 1, 1);

        jButton7.setText("jButton7");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(370, 170, 0, 15);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(1330, 640, 10, 10);

        jTextField13.setBorder(null);
        getContentPane().add(jTextField13);
        jTextField13.setBounds(0, 520, 0, 14);

        jTextField31.setBorder(null);
        getContentPane().add(jTextField31);
        jTextField31.setBounds(0, 540, 0, 14);

        jTextField32.setBorder(null);
        getContentPane().add(jTextField32);
        jTextField32.setBounds(0, 560, 0, 14);

        jTextField34.setBorder(null);
        jTextField34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField34ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField34);
        jTextField34.setBounds(0, 600, 0, 14);

        jTextField33.setBorder(null);
        getContentPane().add(jTextField33);
        jTextField33.setBounds(0, 580, 0, 14);

        jTextField35.setBorder(null);
        getContentPane().add(jTextField35);
        jTextField35.setBounds(0, 620, 0, 14);

        jTextField36.setBorder(null);
        getContentPane().add(jTextField36);
        jTextField36.setBounds(0, 640, 0, 14);

        jTextField37.setBorder(null);
        getContentPane().add(jTextField37);
        jTextField37.setBounds(90, 640, 0, 14);

        jTextField38.setBorder(null);
        getContentPane().add(jTextField38);
        jTextField38.setBounds(160, 640, 0, 14);

        jTextField39.setBorder(null);
        jTextField39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField39ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField39);
        jTextField39.setBounds(230, 640, 0, 14);

        jTextField40.setBorder(null);
        getContentPane().add(jTextField40);
        jTextField40.setBounds(300, 640, 0, 14);

        jTextField41.setBorder(null);
        getContentPane().add(jTextField41);
        jTextField41.setBounds(370, 640, 0, 14);

        jTextField42.setBorder(null);
        getContentPane().add(jTextField42);
        jTextField42.setBounds(430, 640, 0, 10);

        jTextField43.setBorder(null);
        getContentPane().add(jTextField43);
        jTextField43.setBounds(510, 640, 0, 14);

        jTextField44.setBorder(null);
        jTextField44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField44ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField44);
        jTextField44.setBounds(580, 640, 0, 14);

        jTextField45.setBorder(null);
        getContentPane().add(jTextField45);
        jTextField45.setBounds(650, 640, 0, 14);

        jTextField46.setBorder(null);
        getContentPane().add(jTextField46);
        jTextField46.setBounds(730, 640, 0, 14);

        jTextField47.setBorder(null);
        getContentPane().add(jTextField47);
        jTextField47.setBounds(800, 640, 0, 14);

        jTextField48.setBorder(null);
        getContentPane().add(jTextField48);
        jTextField48.setBounds(870, 640, 0, 14);

        jTextField49.setBorder(null);
        getContentPane().add(jTextField49);
        jTextField49.setBounds(940, 640, 0, 14);

        jTextField50.setBorder(null);
        getContentPane().add(jTextField50);
        jTextField50.setBounds(1270, 0, 0, 14);

        jTextField51.setBorder(null);
        getContentPane().add(jTextField51);
        jTextField51.setBounds(1270, 20, 0, 14);

        jTextField52.setBorder(null);
        getContentPane().add(jTextField52);
        jTextField52.setBounds(1270, 40, 0, 14);

        jTextField53.setBorder(null);
        getContentPane().add(jTextField53);
        jTextField53.setBounds(1270, 60, 0, 14);

        jTextField54.setBorder(null);
        getContentPane().add(jTextField54);
        jTextField54.setBounds(1270, 80, 0, 14);

        jTextField55.setBorder(null);
        getContentPane().add(jTextField55);
        jTextField55.setBounds(1270, 100, 0, 14);

        jTextField56.setBorder(null);
        getContentPane().add(jTextField56);
        jTextField56.setBounds(1270, 120, 0, 14);

        jTextField57.setBorder(null);
        getContentPane().add(jTextField57);
        jTextField57.setBounds(1270, 140, 0, 14);

        jTextField58.setBorder(null);
        getContentPane().add(jTextField58);
        jTextField58.setBounds(1270, 160, 0, 14);

        jTextField59.setBorder(null);
        jTextField59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField59ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField59);
        jTextField59.setBounds(1270, 180, 0, 14);

        jTextField60.setBorder(null);
        getContentPane().add(jTextField60);
        jTextField60.setBounds(1270, 200, 0, 14);

        jTextField61.setBorder(null);
        getContentPane().add(jTextField61);
        jTextField61.setBounds(1270, 220, 0, 14);

        jTextField62.setBorder(null);
        getContentPane().add(jTextField62);
        jTextField62.setBounds(1270, 240, 0, 14);

        jTextField63.setBorder(null);
        getContentPane().add(jTextField63);
        jTextField63.setBounds(1270, 260, 0, 20);

        jTextField64.setBorder(null);
        getContentPane().add(jTextField64);
        jTextField64.setBounds(1270, 280, 0, 14);

        jTextField65.setBorder(null);
        getContentPane().add(jTextField65);
        jTextField65.setBounds(1270, 300, 0, 14);

        jTextField66.setBorder(null);
        getContentPane().add(jTextField66);
        jTextField66.setBounds(1270, 320, 0, 14);

        jTextField67.setBorder(null);
        getContentPane().add(jTextField67);
        jTextField67.setBounds(1270, 340, 0, 14);

        jTextField68.setBorder(null);
        getContentPane().add(jTextField68);
        jTextField68.setBounds(1270, 360, 0, 14);

        jTextField69.setBorder(null);
        getContentPane().add(jTextField69);
        jTextField69.setBounds(1270, 380, 0, 14);

        jTextField70.setBorder(null);
        getContentPane().add(jTextField70);
        jTextField70.setBounds(90, 510, 0, 14);

        jTextField71.setBorder(null);
        getContentPane().add(jTextField71);
        jTextField71.setBounds(1200, 10, 0, 14);

        jTextField72.setBorder(null);
        jTextField72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField72ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField72);
        jTextField72.setBounds(920, 20, 0, 14);

        cbo_Conplementos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_ConplementosMouseClicked(evt);
            }
        });
        cbo_Conplementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_ConplementosActionPerformed(evt);
            }
        });
        getContentPane().add(cbo_Conplementos);
        cbo_Conplementos.setBounds(790, 150, 0, 20);

        jTextField73.setBorder(null);
        getContentPane().add(jTextField73);
        jTextField73.setBounds(560, 70, 0, 14);
        getContentPane().add(jLabel33);
        jLabel33.setBounds(630, 140, 50, 40);

        jTextField74.setBorder(null);
        jTextField74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField74ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField74);
        jTextField74.setBounds(560, 90, 0, 14);

        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(920, 630, 1, 1);

        jTextField75.setBorder(null);
        getContentPane().add(jTextField75);
        jTextField75.setBounds(690, 10, 0, 14);

        jTextField76.setBorder(null);
        jTextField76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField76ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField76);
        jTextField76.setBounds(690, 30, 0, 14);

        jTextField77.setBorder(null);
        getContentPane().add(jTextField77);
        jTextField77.setBounds(690, 50, 0, 14);

        jTextField78.setBorder(null);
        getContentPane().add(jTextField78);
        jTextField78.setBounds(690, 70, 0, 14);

        jTextField79.setBorder(null);
        getContentPane().add(jTextField79);
        jTextField79.setBounds(770, 70, 0, 14);

        jTextField80.setBorder(null);
        jTextField80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField80ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField80);
        jTextField80.setBounds(0, 560, 0, 14);

        jTextField81.setBorder(null);
        getContentPane().add(jTextField81);
        jTextField81.setBounds(770, 50, 0, 14);

        jTextField82.setBorder(null);
        getContentPane().add(jTextField82);
        jTextField82.setBounds(940, 0, 0, 14);
        getContentPane().add(jTextField83);
        jTextField83.setBounds(0, 590, 0, 20);

        jTextField84.setBorder(null);
        getContentPane().add(jTextField84);
        jTextField84.setBounds(80, 510, 0, 14);

        jTextField85.setBorder(null);
        getContentPane().add(jTextField85);
        jTextField85.setBounds(470, 90, 0, 30);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setForeground(java.awt.Color.white);
        jLabel40.setText("Rua");
        getContentPane().add(jLabel40);
        jLabel40.setBounds(100, 250, 60, 30);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setForeground(java.awt.Color.white);
        getContentPane().add(jLabel35);
        jLabel35.setBounds(490, 50, 0, 30);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setForeground(java.awt.Color.white);
        jLabel39.setText("Nome ");
        getContentPane().add(jLabel39);
        jLabel39.setBounds(90, 180, 50, 40);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setForeground(java.awt.Color.white);
        jLabel43.setText("Número");
        getContentPane().add(jLabel43);
        jLabel43.setBounds(90, 330, 70, 20);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setForeground(java.awt.Color.white);
        jLabel44.setText("Bairro ");
        getContentPane().add(jLabel44);
        jLabel44.setBounds(280, 330, 50, 20);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setForeground(java.awt.Color.white);
        jLabel45.setText("Data de aniversário");
        getContentPane().add(jLabel45);
        jLabel45.setBounds(460, 330, 140, 20);

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setForeground(java.awt.Color.white);
        jLabel46.setText("Email");
        getContentPane().add(jLabel46);
        jLabel46.setBounds(90, 400, 60, 20);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setForeground(java.awt.Color.white);
        jLabel47.setText("whatsApp");
        getContentPane().add(jLabel47);
        jLabel47.setBounds(100, 470, 80, 20);

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setForeground(java.awt.Color.white);
        jLabel48.setText("Telefone");
        getContentPane().add(jLabel48);
        jLabel48.setBounds(360, 460, 70, 30);

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setForeground(java.awt.Color.white);
        jLabel49.setText("Observações");
        getContentPane().add(jLabel49);
        jLabel49.setBounds(90, 530, 100, 30);

        cbo_Clases.setEditable(true);
        cbo_Clases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_ClasesActionPerformed(evt);
            }
        });
        getContentPane().add(cbo_Clases);
        cbo_Clases.setBounds(730, 70, 380, 50);

        cbo_ItemDaClasse.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        cbo_ItemDaClasse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_ItemDaClasse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_ItemDaClasseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbo_ItemDaClasseMouseExited(evt);
            }
        });
        cbo_ItemDaClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_ItemDaClasseActionPerformed(evt);
            }
        });
        getContentPane().add(cbo_ItemDaClasse);
        cbo_ItemDaClasse.setBounds(730, 130, 380, 30);

        jButton8.setText("jButton8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(700, 0, 73, 23);

        jTextField86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField86ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField86);
        jTextField86.setBounds(1050, 10, 20, 10);

        jButton9.setText("jButton9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(690, 30, 73, 23);

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(630, 340, 60, 40);
        getContentPane().add(jLabel51);
        jLabel51.setBounds(80, 640, 710, 0);

        jButton12.setText("jButton12");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(540, 50, 50, 40);

        txt_Nome.setBorder(null);
        getContentPane().add(txt_Nome);
        txt_Nome.setBounds(0, 0, 80, 20);

        txt_Endereco.setBorder(null);
        getContentPane().add(txt_Endereco);
        txt_Endereco.setBounds(0, 20, 80, 14);

        txt_Numero.setBorder(null);
        getContentPane().add(txt_Numero);
        txt_Numero.setBounds(0, 40, 80, 14);

        txt_Bairro.setBorder(null);
        getContentPane().add(txt_Bairro);
        txt_Bairro.setBounds(0, 60, 80, 14);

        txt_data.setBorder(null);
        getContentPane().add(txt_data);
        txt_data.setBounds(0, 80, 70, 14);

        Txt_Aniversario.setBorder(null);
        getContentPane().add(Txt_Aniversario);
        Txt_Aniversario.setBounds(0, 100, 70, 14);

        txt_email.setBorder(null);
        getContentPane().add(txt_email);
        txt_email.setBounds(0, 120, 70, 14);

        txt_whats.setBorder(null);
        getContentPane().add(txt_whats);
        txt_whats.setBounds(0, 140, 70, 14);

        txt_celular.setBorder(null);
        getContentPane().add(txt_celular);
        txt_celular.setBounds(0, 160, 70, 14);

        jLabel52.setText("jLabel52");
        getContentPane().add(jLabel52);
        jLabel52.setBounds(120, 10, 40, 14);

        txt_obiservasoes.setBorder(null);
        getContentPane().add(txt_obiservasoes);
        txt_obiservasoes.setBounds(0, 180, 70, 14);

        jTextField90.setText("jTextField90");
        getContentPane().add(jTextField90);
        jTextField90.setBounds(250, 110, 65, 20);

        txt_Rua.setBorder(null);
        getContentPane().add(txt_Rua);
        txt_Rua.setBounds(0, 230, 70, 14);

        txt_cidade.setBorder(null);
        txt_cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cidade);
        txt_cidade.setBounds(0, 200, 70, 14);

        jLabel54.setText("jLabel54");
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel54);
        jLabel54.setBounds(80, 30, 130, 130);

        jTextField88.setBorder(null);
        getContentPane().add(jTextField88);
        jTextField88.setBounds(360, 150, 0, 14);
        getContentPane().add(txt_pedidos);
        txt_pedidos.setBounds(0, 250, 70, 20);
        getContentPane().add(txt_valorTotal);
        txt_valorTotal.setBounds(0, 280, 70, 20);

        jTextField87.setBorder(null);
        getContentPane().add(jTextField87);
        jTextField87.setBounds(0, 160, 0, 14);

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setForeground(java.awt.Color.white);
        getContentPane().add(jLabel53);
        jLabel53.setBounds(240, 50, 260, 80);
        getContentPane().add(jLabel34);
        jLabel34.setBounds(300, 50, 0, 50);

        jTextField89.setBorder(null);
        getContentPane().add(jTextField89);
        jTextField89.setBounds(480, 10, 0, 14);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/azul.jpg"))); // NOI18N
        jLabel31.setText("jLabel31");
        getContentPane().add(jLabel31);
        jLabel31.setBounds(1280, 50, 20, 520);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/azul.jpg"))); // NOI18N
        jLabel32.setText("jLabel32");
        getContentPane().add(jLabel32);
        jLabel32.setBounds(1300, 500, 437, 160);

        jLabel36.setForeground(java.awt.Color.white);
        jLabel36.setText("jLabel36");
        getContentPane().add(jLabel36);
        jLabel36.setBounds(500, 34, 40, 30);

        jLabel41.setText("jLabel41");
        getContentPane().add(jLabel41);
        jLabel41.setBounds(100, 304, 70, 20);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setForeground(java.awt.Color.white);
        jLabel37.setText("Pontos :");
        getContentPane().add(jLabel37);
        jLabel37.setBounds(500, 40, 90, 30);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setForeground(java.awt.Color.white);
        jLabel38.setText("Pontos :");
        getContentPane().add(jLabel38);
        jLabel38.setBounds(500, 40, 90, 30);

        jLabel42.setForeground(java.awt.Color.white);
        jLabel42.setText("jLabel42");
        getContentPane().add(jLabel42);
        jLabel42.setBounds(100, 304, 60, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(680, 510, 140, 20);

        txT_NomeUSUARIO1.setBackground(new java.awt.Color(82, 94, 108));
        txT_NomeUSUARIO1.setBorder(null);
        txT_NomeUSUARIO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txT_NomeUSUARIO1ActionPerformed(evt);
            }
        });
        getContentPane().add(txT_NomeUSUARIO1);
        txT_NomeUSUARIO1.setBounds(90, 200, 520, 30);

        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(1259, 0, 50, 50);

        jLabel30.setForeground(java.awt.Color.white);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/---Perfil.png"))); // NOI18N
        jLabel30.setText("jLabel30");
        jLabel30.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel30MouseMoved(evt);
            }
        });
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel30);
        jLabel30.setBounds(0, 0, 1360, 700);

        setSize(new java.awt.Dimension(1312, 701));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

String vip = txT_AniversarioUSUARIO.getText();
Date dataSistema = new Date();
SimpleDateFormat formato = new SimpleDateFormat("MM-yyyy");
        
jLabel52.setText(formato.format(dataSistema));
String dataHoje = jLabel52.getText();


         if(vip.toLowerCase().contains(dataHoje.toLowerCase()) == true){
      //   JOptionPane.showMessageDialog(this, "hoje é aniversario da pesssoa");
         
         jLabel53.setText("Hoje é aniversario desse cliente ");
         }
        
        
        
        String vips = txt_cidade.getText();
String verifica = ":VIP";

         if(vips.toLowerCase().contains(verifica.toLowerCase()) == true){
        // JOptionPane.showInputDialog("é vip ");
             
         }else{
         //JOptionPane.showInputDialog("Nao é vip ");
      //   jButton777.setBackground(new java.awt.Color(0,0,0,0));
         jButton777.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        // Icon icone = new ImageIcon(getClass().getResource("/bomba.ico"));
         
         }
        
        
        
        
         File classes = new File("C:\\Arquivos do programa/clase.txt");  

      try {
          FileReader fr = new FileReader(classes);   
           BufferedReader br = new BufferedReader(fr);
           

                String linha = br.readLine();
                
                
                cbo_Clases.addItem("Selecione a clase");
                
                while(linha != null){
                    cbo_Clases.addItem(linha);
                   
                    linha = br.readLine();
                } 
                } catch (Exception ex) {
        Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
        
        
        File file = new File("C:\\Arquivos do programa/ControleDaTabela.txt");
        
        if(file.exists()) {
        file.delete();
            try {
                FileWriter fw = new FileWriter("C:\\Arquivos do programa/ControleDaTabela.txt");
                 
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Valor1,Valor2,Valor3,Valor4,Valor,5,Valor6"); 
            pw.flush();
            pw.close();
            fw.close();
            } catch (IOException ex) {
                Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
        File arquivo = new File("C:\\Arquivos do programa/Alumnos.txt");  

      try {
          FileReader fr = new FileReader(arquivo);   
           BufferedReader br = new BufferedReader(fr);
           

                String linha = br.readLine();
                
                
                cbo_select.addItem("Selecione o serviço");
                
                while(linha != null){
                    cbo_select.addItem(linha);
                   
                    linha = br.readLine();
                } 
                              

            
              
   } catch (Exception ex) {
        Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
    }
              File Arquivo = new File("C:\\Arquivos do programa/Complementos.txt");  

      try {
          FileReader fr = new FileReader(Arquivo);   
           BufferedReader br = new BufferedReader(fr);
           

                String linha = br.readLine();
                
                
                cbo_Conplementos.addItem("Selecione o serviço");
                
                while(linha != null){
                    cbo_Conplementos.addItem(linha);
                   
                    linha = br.readLine();
                } 
                              

            
              
   } catch (Exception ex) {
        Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
    }
        
  
        
   /* String filePath = ("C://Users/henrique matheus/Documents/NetBeansProjects/AplicacaoAnbiente/Lanches.txt");
    File fie = new File(filePath);

    try {
        BufferedReader br = new BufferedReader(new FileReader(fie));
        String firstLine = br.readLine().trim();
        String[] columnsName = firstLine.split(",");
        DefaultTableModel model = (DefaultTableModel)jTableDados.getModel();
        model.setColumnIdentifiers(columnsName);
        
        
        Object[] tableLines = br.lines().toArray();
        
        for(int i = 0; 1 < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                model.addRow(dataRow); 
  
            }

        } catch (IOException ex) {
            Logger.getLogger(PaginaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        //cbo_select.addItem("hello");
         File arquivo = new File ("C://Users/henrique matheus/Documents/NetBeansProjects/AplicacaoAnbiente/Alumnos.txt");
    
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            //String linha = br.readLine();
            String d;  //new
            while((d=br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer(d,"|");
                Vector x = new Vector();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                cbo_select.addItem(x.toString());
               
            }
            
            // fim
            
            cbo_select.addItem("Selecione o lanche");
            
           
            
            
           // while(linha != null){
         //       cbo_select.addItem(linha);
                
                
         //       linha = br.readLine();

         //   }
            fr.close();
        } catch (Exception ex) {
            Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);

        }*/
        //int selecionado = jtTabelaNome.getSelectedRow();   
      //  txT_NomeUSUARIO.setText((java.lang.String) jtTabelaNome.getValueAt(selecionado,0)); //coluna é a coluna da tabela que você quer pegar a informação. Você pode colocar diretamente o número da coluna. Ex.: 0, 1, 2, etc....   
    
    
    }//GEN-LAST:event_formWindowOpened

    private void cbo_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_selectActionPerformed
                                  

       
    }//GEN-LAST:event_cbo_selectActionPerformed

    private void cbo_quatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_quatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_quatActionPerformed

    private void cbo_selectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_selectItemStateChanged
        String box1 = cbo_select.getSelectedItem().toString();
        String boxy1 = cbo_quat.getSelectedItem().toString();
       // jTextField1.setText("O valor "+box1+" a quntidade é "+boxy1);
       
       
       
       
       
        /* String ciudad=(String)cbo_select.getSelectedItem();
     if(ciudad.equals("Lima"))
        {
           jTextField1.setText("Cidade de los Reyes");
        }
        if(ciudad.equals("Chiclayo"))
        {
            jTextField1.setText("Cidade de los Amistad");
        }
        if(ciudad.equals("Trunjillo"))
        {
            jTextField1.setText("Cidade de  las prima");
        }
        if(ciudad.equals("Cajamarca"))
        {
            jTextField1.setText("Cidade de los animacion");
        }
        if(ciudad.equals("Pirura"))  
        {
            jTextField1.setText("Cidade de Pirula!! ");
        }
        if(ciudad.equals("Trumbes"))
        {
            jTextField1.setText("Cidade uy bonita");
        }
     //   String box = cbo_select.getSelectedItem().toString(); 
     //  String boxy = cbo_quat.getSelectedItem().toString();
       
       */
        
        
    }//GEN-LAST:event_cbo_selectItemStateChanged

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void cbo_selectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_selectMouseClicked
        String box = cbo_select.getSelectedItem().toString();
        String boxy = cbo_quat.getSelectedItem().toString();
        
        String[] Lanche = box.split(";");
       // System.out.print(Lanche[0]); //nome
        //System.out.print(Lanche[1]); //tamanho
       // System.out.print(Lanche[2]); //valor
       
       jTextField7.setText(Lanche[2]);
       String valor =  jTextField7.getText();
       String mega =  valor;
       int Mega = Integer.parseInt(mega);
       
       
        
        jTextField1.setText("O valor R$"+Lanche[2]+" a quantidade "+boxy);
        int BOX = Integer.parseInt(Lanche[2]);
        int BOXY = Integer.parseInt(boxy);
        int res = BOXY * BOX;
        jTextField2.setText(""+res);
        
        jTextField3.setText(Lanche[0]+Lanche[1]+Lanche[2]);
        String escolha = jTextField3.getText();
        
        jTextField4.setText(boxy);
        String quantidade = jTextField4.getText();
        
        String Valor = jTextField2.getText();
        
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.addRow(new Object[]{escolha,Valor,quantidade,"",""});
        
       
        
       
        
      String texto[] = new String[10];
       // texto[0] =  jTextField3.getText();// escolha
        texto[1] = jTextField2.getText(); // valor
        texto[2] = jTextField4.getText(); // quantidade 
       
        
       // System.out.print(texto[0] +" "+ texto[1] + " "+ texto[2] +" "); 
       
        System.out.print(escolha);
        
        RegistroDaTabela registroDaTabela = new RegistroDaTabela();
        
        registroDaTabela.setQuantia(jTextField2.getText()); // valor
       // registroDaTabela.setValorTotal(jTextField3.getText()); // lanche 
        registroDaTabela.setQuantida(jTextField4.getText()); // quantidade 
        JOptionPane.showMessageDialog(null, registroDaTabela.sauvado());
        
        //String aSeparar = lerArquivo2()
        
        
  /*         File arquivo = new File("C:\\Arquivos do programa/ControleDaTabela.txt");  

      try {
          FileReader fr = new FileReader(arquivo);   
           BufferedReader br = new BufferedReader(fr);
           

                String linha = br.readLine();
                
                
               // cbo_select.addItem("Selecione o serviço");
                
                while(linha != null){
                    //cbo_select.addItem(linha);
                   int obiter = Integer.parseInt(linha);
                   int array[];
                   new  array[0] = ;
                   
                    linha = br.readLine();
                } 
                              

            
              
   } catch (Exception ex) {
        Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
    } */
 
	/*	while((texto2 = br2.readLine()) != null){
                    
		
			valores.add(texto2);
                        valores.split();
			System.out.print(valores);
                                
                               
                        
                     
                            
                       
			
		}		*/		
		 try {
             String filePath = ("C:\\Arquivos do programa/ControleDaTabela.txt");
        File file = new File(filePath);
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
          //  model.setColumnIdentifiers(columnsName);
            
            

            
            Object[] tableLines = br.lines().toArray();
            //model.addRow(tableLines);
            
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(";");
                model.addRow(dataRow);
                jTextField8.setText(dataRow[0]);
                jTextField9.setText(dataRow[1]);
                jTextField10.setText(dataRow[2]);
                jTextField11.setText(dataRow[3]);
                jTextField14.setText(dataRow[4]);
                jTextField15.setText(dataRow[5]);
                jTextField16.setText(dataRow[6]);
                jTextField17.setText(dataRow[7]);
                jTextField18.setText(dataRow[8]);
                jTextField19.setText(dataRow[9]);
                jTextField20.setText(dataRow[10]);
                jTextField21.setText(dataRow[11]);
                jTextField22.setText(dataRow[12]);
                jTextField23.setText(dataRow[13]);
                jTextField24.setText(dataRow[14]);
                jTextField25.setText(dataRow[15]);
                jTextField26.setText(dataRow[16]);
                jTextField27.setText(dataRow[17]);
                jTextField28.setText(dataRow[18]);
                jTextField29.setText(dataRow[19]);


               
               String nove =  jTextField18.getText();
               
             /*  String dois = jTextField9.getText();
               String tres = jTextField10.getText();
               String quatro = jTextField11.getText(); */
               
               
               int Nove = Integer.parseInt(nove);
            /*   int DOIS = Integer.parseInt(dois);
               int TRES =  Integer.parseInt(tres);
               int QUATRO =  Integer.parseInt(quatro);
               int RESUTADO = UM * DOIS;
               System.out.print(RESUTADO);
               jTextField12.setText(""+RESUTADO); */
             
             
             //3 CONPONETES
             if (Nove == 12){
                 jTextField84.setText("deu certo"); 
             }else {
             jTextField84.setText("nao deu certo"); 
             }
             
             
                
                
            // int AA = Integer.parseInt( jTextField80.getText()); 
             //int AA = 4;
             
            }
            
        } catch (Exception ex) {
            Logger.getLogger(PaginaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
	jTextField13not.setText(""+jTable1.getRowCount());
        

         //calcular totai
         calcular();
      
        
        
    }//GEN-LAST:event_cbo_selectMouseClicked

    private void cbo_quatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_quatItemStateChanged
        
    }//GEN-LAST:event_cbo_quatItemStateChanged

    private void txT_NomeUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_NomeUSUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_NomeUSUARIOActionPerformed

    private void jLabel1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1FocusLost

    private void txT_EnderecoUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_EnderecoUSUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_EnderecoUSUARIOActionPerformed

    private void txT_NumeroUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_NumeroUSUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_NumeroUSUARIOActionPerformed

    private void txT_BairroUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_BairroUSUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_BairroUSUARIOActionPerformed

    private void txT_CodigoUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_CodigoUSUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_CodigoUSUARIOActionPerformed

    private void txT_dataUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_dataUSUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_dataUSUARIOActionPerformed

    private void txT_AniversarioUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_AniversarioUSUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_AniversarioUSUARIOActionPerformed

    private void txT_EmailUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_EmailUSUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_EmailUSUARIOActionPerformed

    private void txT_whatsUSUARIO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_whatsUSUARIO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_whatsUSUARIO1ActionPerformed

    private void txT_CelularUSUARIO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_CelularUSUARIO2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_CelularUSUARIO2ActionPerformed

    private void txT_ObiservacoesUSUARIO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_ObiservacoesUSUARIO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_ObiservacoesUSUARIO1ActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        
            JFileChooser arquivo = new JFileChooser();
            arquivo.setDialogTitle("Selecione uma foto");
            arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        int opc = arquivo.showOpenDialog(this);
        if(opc == JFileChooser.APPROVE_OPTION) {
            File file = new File("Caminho");
            file=arquivo.getSelectedFile(); //RECEBE O CAMINHO
            String filename = file.getAbsolutePath();
            jTextFieldPath.setText(filename);
            
            
            ImageIcon imagem = new ImageIcon(arquivo.getSelectedFile().getPath());
            jLabel17.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(jLabel17.getWidth(), jLabel17.getHeight(), Image.SCALE_DEFAULT)));
           
        }
        
    }//GEN-LAST:event_jLabel17MouseClicked

    private void txT_NumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_NumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_NumeroActionPerformed

    private void jButtonlinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlinkActionPerformed
  
        String numero = txT_whatsUSUARIO1.getText();
   String valor = "send?l=pt-BR&phone=" + numero;
    System.out.println(valor);

    
    try {
        java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://api.whatsapp.com/" + valor  ) );
    } catch (URISyntaxException ex) {
        Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
    }   catch (IOException ex) {
            Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
        } 

        
    }//GEN-LAST:event_jButtonlinkActionPerformed

    private void txT_EnderecoUSUARIO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_EnderecoUSUARIO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_EnderecoUSUARIO1ActionPerformed

    private void txT_NumeroUSUARIO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_NumeroUSUARIO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_NumeroUSUARIO1ActionPerformed

    private void txT_BairroUSUARIO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_BairroUSUARIO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_BairroUSUARIO1ActionPerformed

    private void txT_CodigoUSUARIO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_CodigoUSUARIO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_CodigoUSUARIO1ActionPerformed

    private void txT_dataUSUARIO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_dataUSUARIO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_dataUSUARIO1ActionPerformed

    private void txT_AniversarioUSUARIO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_AniversarioUSUARIO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_AniversarioUSUARIO1ActionPerformed

    private void txT_EmailUSUARIO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_EmailUSUARIO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_EmailUSUARIO1ActionPerformed

    private void txT_whatsUSUARIO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_whatsUSUARIO2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_whatsUSUARIO2ActionPerformed

    private void txT_CelularUSUARIO3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_CelularUSUARIO3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_CelularUSUARIO3ActionPerformed

    private void txT_ObiservacoesUSUARIO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_ObiservacoesUSUARIO2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_ObiservacoesUSUARIO2ActionPerformed

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel28MouseClicked

    private void txT_Numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_Numero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_Numero1ActionPerformed

    private void jButtonlink1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlink1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonlink1ActionPerformed

    private void jFrame1formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame1formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrame1formWindowOpened

    private void txT_EnderecoUSUARIO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_EnderecoUSUARIO2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_EnderecoUSUARIO2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
jTextField90.setText(jTable1.getRowCount()+"");
int pedido = Integer.parseInt(txt_pedidos.getText());
int NewPedido = Integer.parseInt(jTextField90.getText());
int RES1 = pedido + NewPedido;

float valorP = Float.parseFloat(txt_valorTotal.getText());
float newPedido = Float.parseFloat(jTextField30.getText());
float RES2 = valorP + newPedido;

        try {
          FileWriter fw = new FileWriter("C:\\Arquivos do programa/texto.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.print(txt_Nome.getText()+"/");//Valor
            pw.print(txt_Numero.getText()+"/");//Data
            pw.print(RES1+"/");//total de pedidos
            pw.print(RES2+"/");//valor total
            pw.print(txt_Rua.getText()+"/");//Rua
            
            pw.print(txt_Endereco.getText()+"/");//numero
            pw.print(txt_Bairro.getText()+"/");//bairro
            pw.print(txt_data.getText()+"/");//aniversario
            pw.print(Txt_Aniversario.getText()+"/");//email
            pw.print(txt_email.getText()+"/");//whatzap
            pw.print(txt_whats.getText()+"/");//celular
            pw.print(txt_celular.getText()+"/");//obiservaçaoes

            
            pw.println(txt_obiservasoes.getText()+"/1");//controle da tabela
        //    pw.print(";"+this.obiservaçoes);
            
            
            
        //    pw.print(";"+this.valores);
        //   pw.println(";"+this.pedido);
           
           // pw.print(this.valores);
            pw.flush();
            pw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(RegistroDeCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         File file = new File("C:\\Arquivos do programa/texto.txt");
       
        try {
        FileReader fr = new FileReader(file); 
        BufferedReader br = new BufferedReader(fr);
       
        
        String linha = br.readLine();
        ArrayList<String> salvar = new ArrayList();
        while(linha != null){
            
          //  String lanche = jTextField6.getText();
            String nome =txt_Nome.getText()+"/";//Valor
            String data = txt_Numero.getText()+"/";//Data
            String total = RES1+"/";//total de pedidos
            String valor = RES2+"/";//valor total
            String rua =txt_Rua.getText()+"/";//Rua
            
            String numero = txt_Endereco.getText()+"/";//numero
            String bairro = txt_Bairro.getText()+"/";//bairro
            String aniversario = txt_data.getText()+"/";//aniversario
            String email = Txt_Aniversario.getText()+"/";//email
            String zap = txt_email.getText()+"/";//zap
            String celular = txt_whats.getText()+"/";//celular
            String obiservacoes = txt_celular.getText()+"/";//obiservaçaoes

            String controle = txt_obiservasoes.getText()+"/1";//controle da tabela

            
            
            if(linha.equals(nome+data+total+valor+rua+numero+bairro+aniversario+email+zap+celular+obiservacoes+controle) == false){
                salvar.add(linha);
               // JOptionPane.showMessageDialog(null, nome+data+total+valor+rua+numero+bairro+aniversario+email+zap+celular+obiservacoes+controle);
            }
            linha = br.readLine();
        }

        br.close();
        fr.close();
        FileWriter fw2 = new FileWriter(file, true);
        fw2.close();
        
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
            for (int i = 0; i < salvar.size(); i++) {
            bw.write( salvar.get(i) );
            bw.newLine();
            
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
        }
        
        
        
        
        
        Date dataSistema = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat hora = new SimpleDateFormat("HH:mm:ss"); 
        
        //valor dpo dia
        ClasseDoDia classeDoDia = new ClasseDoDia();
        
        classeDoDia.setValorDia(jTextField30.getText());
        
      //  classeDoDia.set(formato.format(dataSistema));
        
        
        
        
        
        try {
            JOptionPane.showMessageDialog(null, classeDoDia.sauvado());  //Atençao
            // jTextField1.setText("");
            // texREs.setText("");
            
            
            /*   t.start();
            prgs.setValue(prgs.getValue()+10);
            
            t.stop(); */
        } catch (IOException ex) {
            Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        //valor total
        RegistroDeCompra registroDeCompra = new RegistroDeCompra();

    //    registroDeCompra.setPedido(pedidos);
       
        registroDeCompra.setTTotal(jTextField30.getText());
        registroDeCompra.setHorario(formato.format(dataSistema));
        registroDeCompra.setDATA(hora.format(dataSistema));
        registroDeCompra.setNomef(txT_NomeUSUARIO.getText());
        
      //  registroDeCompra.setResutado(jTextField85.getText());
        
       
    /*    registroDeCompra.setNome(txT_NomeUSUARIO.getText());
        registroDeCompra.setEndereço(txT_EnderecoUSUARIO.getText());
        registroDeCompra.setNumero(txT_NumeroUSUARIO.getText());
        registroDeCompra.setBairro(txT_BairroUSUARIO.getText());
        registroDeCompra.setDataNacimento(txT_AniversarioUSUARIO1.getText());
        registroDeCompra.setEmail(txT_EmailUSUARIO.getText());
        registroDeCompra.setWhatsApp(txT_whatsUSUARIO1.getText());
        registroDeCompra.setCelular(txT_CelularUSUARIO2.getText());
        registroDeCompra.setObiservaçoes(txT_ObiservacoesUSUARIO1.getText());
     //   registroDeCompra.setValores(jTextField30.getText()); */
       // registroDeCompra.setData(dataString);
      //  registroDeCompra.setHora(horarioString);

     
        
        
        try {
            JOptionPane.showMessageDialog(null, registroDeCompra.sauvado());  //Atençao
            // jTextField1.setText("");
            // texREs.setText("");
            
            
            /*   t.start();
            prgs.setValue(prgs.getValue()+10);
            
            t.stop(); */
        } catch (IOException ex) {
            Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
      
      
        
        
        
      
      
      
      
      
      
      
        String dataAtualFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
        .format(System.currentTimeMillis());

        //Seta valores da data
        String dataString = dataAtualFormatada.substring(0,10);

        //Seta valores do horário
        String horarioString = dataAtualFormatada.substring(11,19);

    /*    RegistroDeCompra registroDeCompra = new RegistroDeCompra();

    //    registroDeCompra.setPedido(pedidos);
       
        registroDeCompra.setResutado(jTextField30.getText());
       
        registroDeCompra.setNome(txT_NomeUSUARIO.getText());
        registroDeCompra.setEndereço(txT_EnderecoUSUARIO.getText());
        registroDeCompra.setNumero(txT_NumeroUSUARIO.getText());
        registroDeCompra.setBairro(txT_BairroUSUARIO.getText());
        registroDeCompra.setDataNacimento(txT_AniversarioUSUARIO1.getText());
        registroDeCompra.setEmail(txT_EmailUSUARIO.getText());
        registroDeCompra.setWhatsApp(txT_whatsUSUARIO1.getText());
        registroDeCompra.setCelular(txT_CelularUSUARIO2.getText());
        registroDeCompra.setObiservaçoes(txT_ObiservacoesUSUARIO1.getText());
     //   registroDeCompra.setValores(jTextField30.getText());
        registroDeCompra.setData(dataString);
        registroDeCompra.setHora(horarioString);

     
        
       / 
        try {
            JOptionPane.showMessageDialog(null, registroDeCompra.sauvado());
            // jTextField1.setText("");
            // texREs.setText("");
            
            
            /*   t.start();
            prgs.setValue(prgs.getValue()+10);
            
            t.stop(); 
        
        } catch (IOException ex) {
            Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
        } */
        
        
       
        
            
         
        
       
 
 
        
        
        
     
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton777ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton777ActionPerformed

        
        
        
        String vips = txt_cidade.getText();
String verifica = ":VIP";

         if(vips.toLowerCase().contains(verifica.toLowerCase()) == true){
         //JOptionPane.showInputDialog("é vip ");
         jButton777.setVisible(true);
         
        File file = new File("C:\\Arquivos do programa/Texto.txt");
       
        try {
        FileReader fr = new FileReader(file); 
        BufferedReader br = new BufferedReader(fr);
       
        
        String linha = br.readLine();
        ArrayList<String> salvar = new ArrayList();
        while(linha != null){
            
           String nome =txt_Nome.getText()+"/";//Valor
            String data = txt_Numero.getText()+"/";//Data
            String total = txt_pedidos.getText()+"/";//total de pedidos
            String valor = txt_valorTotal.getText()+"/";//valor total
            String rua =txt_Rua.getText()+"/";//Rua
            
            String numero = txt_Endereco.getText()+"/";//numero
            String bairro = txt_Bairro.getText()+"/";//bairro
            String aniversario = txt_data.getText()+"/";//aniversario
            String email = Txt_Aniversario.getText()+"/";//email
            String zap = txt_email.getText()+"/";//zap
            String celular = txt_whats.getText()+"/";//celular
            String obiservacoes = txt_celular.getText()+"/";//obiservaçaoes

            String controle = txt_obiservasoes.getText()+"/1";//controle da tabela

            

            
            
            if(linha.equals(nome+data+total+valor+rua+numero+bairro+aniversario+email+zap+celular+obiservacoes+controle) == false){
                salvar.add(linha);
           // JOptionPane.showMessageDialog(null, "1/"+nome+"/"+data+"/0/0/"+endereco+"/"+bairro+"/"+numero+"/"+aniversario+"/"+email+"/"+whats+"/"+celular+"/"+obiserva+"/"+cidade);
            }
            linha = br.readLine();
        }

        br.close();
        fr.close();
        FileWriter fw2 = new FileWriter(file, true);
        fw2.close();
        
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
            for (int i = 0; i < salvar.size(); i++) {
            bw.write( salvar.get(i) );
            bw.newLine();
            
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
        }
        
        
         ArmazenmentoVIP armazenmentoVIP = new ArmazenmentoVIP();

    
        armazenmentoVIP.setNome(txT_NomeUSUARIO.getText()); 
        armazenmentoVIP.setEndereço(txT_EnderecoUSUARIO.getText());
        armazenmentoVIP.setNumero(txT_NumeroUSUARIO.getText());
        armazenmentoVIP.setBairro(txT_BairroUSUARIO.getText());
        armazenmentoVIP.setDataNacimento(txT_AniversarioUSUARIO1.getText());
        armazenmentoVIP.setEmail(txT_EmailUSUARIO.getText());
        armazenmentoVIP.setWhatsApp(txT_whatsUSUARIO1.getText());
        armazenmentoVIP.setCelular(txT_CelularUSUARIO2.getText());
        armazenmentoVIP.setObiservaçoes(txT_ObiservacoesUSUARIO1.getText());
        armazenmentoVIP.setCidade(txt_cidade.getText());
         try {
            JOptionPane.showMessageDialog(null, armazenmentoVIP.sauvado());  //Atençao
            // jTextField1.setText("");
            // texREs.setText("");
            
            
            /*   t.start();
            prgs.setValue(prgs.getValue()+10);
            
            t.stop(); */
        } catch (IOException ex) {
           Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
     //   registroDeCompra.setValores(jTextField30.getText()); */
       // registroDeCompra.setData(dataString);
      //  registroDeCompra.setHora(horarioString);
/*
        } catch (IOException ex) {
            Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         */
         }else{
             jLabel55.setVisible(true);
      //   JOptionPane.showInputDialog("Nao é vip ");
         
          ArmazenmentoVIP armazenmentoVIP = new ArmazenmentoVIP();
        
          String nome = txt_Nome.getText();
           String endereco = txt_Endereco.getText();
           String numero = txt_Numero.getText();
           String bairro = txt_Bairro.getText();
           String data = txt_data.getText();
           String aniversario = Txt_Aniversario.getText();
           String email = txt_email.getText();
           String whats = txt_whats.getText();
           String celular = txt_celular.getText();
           String obiserva = txt_obiservasoes.getText();
           String cidade = txt_cidade.getText();
        
        armazenmentoVIP.setNome(txT_NomeUSUARIO.getText()); 
        armazenmentoVIP.setEndereço(txT_EnderecoUSUARIO.getText());
        armazenmentoVIP.setNumero(txT_NumeroUSUARIO.getText());
        armazenmentoVIP.setBairro(txT_BairroUSUARIO.getText());
        armazenmentoVIP.setDataNacimento(txT_AniversarioUSUARIO1.getText());
        armazenmentoVIP.setEmail(txT_EmailUSUARIO.getText());
        armazenmentoVIP.setWhatsApp(txT_whatsUSUARIO1.getText());
        armazenmentoVIP.setCelular(txT_CelularUSUARIO2.getText());
        armazenmentoVIP.setObiservaçoes(txT_ObiservacoesUSUARIO1.getText());
        armazenmentoVIP.setCidade(txt_cidade.getText());
        
        try {
            JOptionPane.showMessageDialog(null, armazenmentoVIP.sauvado());  //Atençao
            // jTextField1.setText("");
            // texREs.setText("");
            
            
            /*   t.start();
            prgs.setValue(prgs.getValue()+10);
            
            t.stop(); */
        } catch (IOException ex) {
           Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         }
        
        
        
  /*      
         File classes = new File("C:\\Arquivos do programa/clase.txt");  

      try {
          FileReader fr = new FileReader(classes);   
           BufferedReader br = new BufferedReader(fr);
           

                String linha = br.readLine();
                
                
                cbo_Clases.addItem("Selecione a clase");
                
                while(linha != null){
                    cbo_Clases.addItem(linha);
                   
                    linha = br.readLine();
                } 
                } catch (Exception ex) {
        Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
    }   /* String vips = jTextField85.getText();
String verifica = ":VIP";

         if(vips.toLowerCase().contains(verifica.toLowerCase()) == true){
         JOptionPane.showInputDialog("é vip ");
             
         }else{
         JOptionPane.showInputDialog("Nao é vip ");
         }
        */
        //se for vip
       //////////////////É  aqui
        /*
        File file = new File("C:\\Arquivos do programa/Texto.txt");
       
        try {
        FileReader fr = new FileReader(file); 
        BufferedReader br = new BufferedReader(fr);
       
        
        String linha = br.readLine();
        ArrayList<String> salvar = new ArrayList();
        while(linha != null){
            
           String nome = txt_Nome.getText();
           String endereco = txt_Endereco.getText();
           String numero = txt_Numero.getText();
           String bairro = txt_Bairro.getText();
           String data = txt_data.getText();
           String aniversario = Txt_Aniversario.getText();
           String email = txt_email.getText();
           String whats = txt_whats.getText();
           String celular = txt_celular.getText();
           String obiserva = txt_obiservasoes.getText();
           String cidade = txt_cidade.getText();
            

            
            
            if(linha.equals("1/"+nome+"/"+data+"/0/0/"+endereco+"/"+bairro+"/"+numero+"/"+aniversario+"/"+email+"/"+whats+"/"+celular+"/"+obiserva+"/"+cidade) == false){
                salvar.add(linha);
           // JOptionPane.showMessageDialog(null, "1/"+nome+"/"+data+"/0/0/"+endereco+"/"+bairro+"/"+numero+"/"+aniversario+"/"+email+"/"+whats+"/"+celular+"/"+obiserva+"/"+cidade);
            }
            linha = br.readLine();
        }

        br.close();
        fr.close();
        FileWriter fw2 = new FileWriter(file, true);
        fw2.close();
        
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
            for (int i = 0; i < salvar.size(); i++) {
            bw.write( salvar.get(i) );
            bw.newLine();
            
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
        }
        
        
         ArmazenmentoVIP armazenmentoVIP = new ArmazenmentoVIP();

    
        armazenmentoVIP.setNome(txT_NomeUSUARIO.getText()); 
        armazenmentoVIP.setEndereço(txT_EnderecoUSUARIO.getText());
        armazenmentoVIP.setNumero(txT_NumeroUSUARIO.getText());
        armazenmentoVIP.setBairro(txT_BairroUSUARIO.getText());
        armazenmentoVIP.setDataNacimento(txT_AniversarioUSUARIO1.getText());
        armazenmentoVIP.setEmail(txT_EmailUSUARIO.getText());
        armazenmentoVIP.setWhatsApp(txT_whatsUSUARIO1.getText());
        armazenmentoVIP.setCelular(txT_CelularUSUARIO2.getText());
        armazenmentoVIP.setObiservaçoes(txT_ObiservacoesUSUARIO1.getText());
        armazenmentoVIP.setCidade(txt_cidade.getText());
        
     //   registroDeCompra.setValores(jTextField30.getText()); */
       // registroDeCompra.setData(dataString);
      //  registroDeCompra.setHora(horarioString);
/*
        } catch (IOException ex) {
            Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*/
     
    }//GEN-LAST:event_jButton777ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jTable1.getSelectedRow() != -1){
        
        System.out.print("Linha selecionada: "+jTable1.getSelectedColumn());
            
        DefaultTableModel dmz = (DefaultTableModel)jTable1.getModel();
        dmz.removeRow(jTable1.getSelectedRow());
 
        
         File file = new File("C:\\Arquivos do programa/ControleDaTabela.txt");
       
        try {
        FileReader fr = new FileReader(file); 
        BufferedReader br = new BufferedReader(fr);
       
        
        String linha = br.readLine();
        ArrayList<String> salvar = new ArrayList();
        while(linha != null){
            
            String lanche = jTextField6.getText();

            
            
            if(linha.equals(lanche) == false){
                salvar.add(linha);
            
            }
            linha = br.readLine();
        }

        br.close();
        fr.close();
        FileWriter fw2 = new FileWriter(file, true);
        fw2.close();
        
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
            for (int i = 0; i < salvar.size(); i++) {
            bw.write( salvar.get(i) );
            bw.newLine();
            
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
        }
        
        
         }else{
            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
        }  
        
        //calcular tatais
        calcular();
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
 /////////////clicado
       TableModel model1 = jTable1.getModel(); 
     // TableModel model3 = jTextField8.getModel();
      int indexs[] = jTable1.getSelectedRows();
      
      jTextField6.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0).toString()); //controle lanche
      jTextField5.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),1).toString()); //controle valor
      jTestfildbig.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),2).toString()); //controle quantidade
        
        
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
         
                
        String um =  jTextField8.getText();
               String dois = jTextField9.getText();
               String tres = jTextField10.getText();
               String quatro = jTextField11.getText();
               String sinco = jTextField14.getText();
                String seis = jTextField15.getText();
               String sete =  jTextField16.getText();
               String oito = jTextField17.getText();
               String nove = jTextField18.getText();
               String dez=  jTextField19.getText();
           /*  String onze =  jTextField20.getText();
               String doze =  jTextField21.getText();
               String treze = jTextField22.getText();
               String quatoze =  jTextField23.getText();
               String quinze = jTextField24.getText();
               String deseseis =  jTextField25.getText();
               String desoito =  jTextField26.getText();
               String desenove =  jTextField27.getText();
               String vinte = jTextField28.getText();
               String vinteUm =  jTextField29.getText(); */
               
               int UM = Integer.parseInt(um);
               int DOIS = Integer.parseInt(dois);
               int TRES =  Integer.parseInt(tres);
               int QUATRO =  Integer.parseInt(quatro);
               int CINCO= Integer.parseInt(sinco);
               int SEIS = Integer.parseInt(seis);
               int SETE = Integer.parseInt(sete);
               int OITO = Integer.parseInt(oito);
               int NOVE = Integer.parseInt(nove);
               int DEZ = Integer.parseInt(dez);
         /*      int ONZE = Integer.parseInt(onze);
               int DOZE = Integer.parseInt(doze);
               int TREZE = Integer.parseInt(treze);
               int QUATOZE = Integer.parseInt(quatoze);
               int QUINZE = Integer.parseInt(quinze);
               int DESESEIS = Integer.parseInt(deseseis);
               int DESOITO =Integer.parseInt(desoito);
               int DESENOVE = Integer.parseInt(desenove);
               int VINTE = Integer.parseInt(vinte);
               int VInTEUM = Integer.parseInt(vinteUm); */
                
               
               
               int RESUTADO = UM * DOIS + TRES * QUATRO; //3
               int res1 = RESUTADO + CINCO * SEIS; //4
               int res2 = UM * DOIS + TRES * QUATRO + CINCO * SEIS + SETE * OITO; //5
               int res3 = UM * DOIS + TRES * QUATRO + CINCO * SEIS + SETE * OITO + NOVE * DEZ; //6
              // int res4 = UM * DOIS + TRES * QUATRO + CINCO * SEIS + SETE * OITO + NOVE * DEZ + ONZE * DOZE;
              // int res5 = UM * DOIS + TRES * QUATRO + CINCO * SEIS + SETE * OITO + NOVE * DEZ + ONZE * DOZE + TREZE * QUATOZE;
              // int res6 = UM * DOIS + TRES * QUATRO + CINCO * SEIS + SETE * OITO + NOVE * DEZ + ONZE * DOZE + TREZE * QUATOZE + QUINZE *DESESEIS;
              // int res7 = UM * DOIS + TRES * QUATRO + CINCO * SEIS + SETE * OITO + NOVE * DEZ + ONZE * DOZE + TREZE * QUATOZE + QUINZE *DESESEIS + DESOITO * DESENOVE;
              // int res8 = UM * DOIS + TRES * QUATRO + CINCO * SEIS + SETE * OITO + NOVE * DEZ + ONZE * DOZE + TREZE * QUATOZE + QUINZE *DESESEIS + DESOITO * DESENOVE +VINTE * VInTEUM;
               
            
               // jTextField13.setText("ta vasio");
           /*    String quantidade = jTextField13not.getText();
               int Quantidade = Integer.parseInt(quantidade); 
               int valor = 3;
               if (Quantidade != 3){
               jTextField30.setText(""+RESUTADO);
               }else{
               jTextField30.setText(""+res1);
               }
               
                         /*    int AA = Integer.parseInt(A); 
               if(AA != 3){
                   // È DIFERENTE DE 3
               jTextField30.setText(""+res1);
               }else{
                   // NAO È DIFRENTE
               jTextField30.setText(""+RESUTADO);
               }if(AA !=5&&AA == 7){
               jTextField30.setText(""+res3);    
               }else{
               jTextField30.setText(""+res2);
               } */
               
               
               
               
               //jTextField12.setText(""+RESUTADO);
             /*  jTextField13.setText(""+res1);
               jTextField12.setText(""+res2);
               jTextField13.setText(""+res2);
               jTextField12.setText(""+res3);
               jTextField13.setText(""+res3);
               jTextField12.setText(""+res4);
               jTextField13.setText(""+res4);
               jTextField12.setText(""+res5);
               jTextField13.setText(""+res5);
               jTextField12.setText(""+res6);
               jTextField13.setText(""+res6);
               jTextField12.setText(""+res7);
               jTextField13.setText(""+res8); */                
        
        
        
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String resutado1 = jTextField30.getText();      
        int Resutado1 = Integer.parseInt(resutado1);
        
        String um =  jTextField8.getText();
               String dois = jTextField9.getText();
              String tres = jTextField10.getText();
               String quatro = jTextField11.getText();
               String sinco = jTextField14.getText();
                String seis = jTextField15.getText(); 
               String sete =  jTextField16.getText();
               String oito = jTextField17.getText();
               String nove = jTextField18.getText();
               String dez=  jTextField19.getText();
               String onze =  jTextField20.getText();
        //       String doze =  jTextField21.getText();
              // String treze = jTextField22.getText();
            //   String quatoze =  jTextField23.getText();
          //     String quinze = jTextField24.getText();
           //    String deseseis =  jTextField25.getText();
            /*   String desoito =  jTextField26.getText();
               String desenove =  jTextField27.getText();
               String vinte = jTextField28.getText();
               String vinteUm =  jTextField29.getText(); */
               
               int UM = Integer.parseInt(um);
               int DOIS = Integer.parseInt(dois);
               int TRES =  Integer.parseInt(tres);
               int QUATRO =  Integer.parseInt(quatro);
               int CINCO= Integer.parseInt(sinco);
               int SEIS = Integer.parseInt(seis);
               int CETE = Integer.parseInt(oito);
               int SETE = Integer.parseInt(sete);
              int OITO = Integer.parseInt(oito);
               int NOVE = Integer.parseInt(nove);
               int DEZ = Integer.parseInt(dez);
               int ONZE = Integer.parseInt(onze);
          //     int DOZE = Integer.parseInt(doze);
           //    int TREZE = Integer.parseInt(treze);
            //   int QUATOZE = Integer.parseInt(quatoze);
         //      int QUINZE = Integer.parseInt(quinze);
             //  int DESESEIS = Integer.parseInt(deseseis);
          /*     int DESOITO =Integer.parseInt(desoito);
               int DESENOVE = Integer.parseInt(desenove);
               int VINTE = Integer.parseInt(vinte);
               int VInTEUM = Integer.parseInt(vinteUm); */
          int AA = Integer.parseInt( jTextField80.getText()); 
          int[] TrezComplementos = new int[AA];
               
               int[] a = new int[4];
             
             if(NOVE == 1){
             a[0] = UM;
             TrezComplementos[0] = 1;
             NOVE = 0;
             //    JOptionPane.showMessageDialog(null, a[0]);
             }else{}
             if(ONZE == 1){
             a[1] = UM;
             TrezComplementos[1] = 1;
             ONZE = 0;
             //    JOptionPane.showMessageDialog(null, a[0]);
             }else{}
             

          
             
             
             int[] b = {0,1,2,3,4};
             
              int   tamanho  = TrezComplementos.length;
               for (int j = 0; j < TrezComplementos.length; j ++){
                System.out.print( TrezComplementos[j]);
               }
               System.out.print("/"+tamanho+"/");
              
               jTextField79.setText(""+TrezComplementos[0]);
               jTextField81.setText(""+TrezComplementos[1]);
               
               
              //int prima = Integer.parseInt( jTextField75.getText());

             
               
                int[] Complementos = new int[AA];
                
                
               int primaMax2 = Integer.parseInt( jTextField76.getText());
               int primaMax = Integer.parseInt( jTextField75.getText());
               int primaMax3 = Integer.parseInt( jTextField77.getText());
               int primaMax4 = Integer.parseInt( jTextField78.getText());
               int primaMax5 = Integer.parseInt( jTextField79.getText());
               int primaMax6 = Integer.parseInt( jTextField81.getText());
               
               if(primaMax == 1){
                   Complementos[0] = 1;
               }
               if(primaMax2 == 1){
                   Complementos[1] = 1;
               }
                if(primaMax3 == 1){
                   Complementos[2] = 1;
               }
                if(primaMax4 == 1){
                   Complementos[3] = 1;
               }
                if(primaMax5 == 1){
                   Complementos[4] = 1;
               }
                if(primaMax6 == 1){
                   Complementos[5] = 1;
               }
                 //int   tamanho  = Complementos.length;
                 int t  = Complementos.length;
               for (int j = 0; j < Complementos.length; j ++){
                System.out.print( Complementos[j]);
               }
               System.out.print("/"+t+"/");
               //jTextField82.setText("tamanho é = "+t);jTextField17
               
               
               int resutadoo = Complementos[0] + Complementos[1] + Complementos[2] + Complementos[3] + Complementos[4] + Complementos[5];
               jTextField82.setText("tamanho é = "+resutadoo);
                int  numero = Integer.parseInt( jTextField18.getText());
                if(numero == 1){
                 int resutad2 = Complementos[0] + Complementos[1] + Complementos[2] + Complementos[3] + Complementos[4] + Complementos[5];
                }
               if(resutadoo ==4){
               JOptionPane.showMessageDialog(null, "acai de 3 com 4 compontes");
               }
               
               if(resutadoo ==5){
               JOptionPane.showMessageDialog(null, "acai de 5 com 5 compontes");
               }
               
              /* if(t ==4){
               JOptionPane.showMessageDialog(null, "acai de 3 4 compontes");
               } */
               
               
               
              int resutado =  UM * DOIS + TRES * QUATRO + CINCO * SEIS + SETE * CETE + SETE * OITO + NOVE * DEZ ; //6
             // int resutado2 =  UM * DOIS + TRES * QUATRO + CINCO * SEIS + SETE * CETE + SETE * OITO + NOVE * DEZ ;
              
              // int RESUTADO = UM * DOIS + TRES * QUATRO; // 3
              // int res1 =  UM * DOIS + TRES * QUATRO + CINCO * SEIS; //4 linhas
              // int res2 = Resutado1 + SETE * OITO;  //6 linhas
              // int res3 = res2 + NOVE * DEZ;  //7
             //  int res4 = res2 + ONZE * DOZE; //8
              // int res5 = res4 + TREZE * QUATOZE; //9
             //  int res6 = res5 + QUINZE *DESESEIS;
              // int res7 = UM * DOIS + TRES * QUATRO + CINCO * SEIS + SETE * OITO + NOVE * DEZ + ONZE * DOZE + TREZE * QUATOZE + QUINZE *DESESEIS + DESOITO * DESENOVE;
              // int res8 = UM * DOIS + TRES * QUATRO + CINCO * SEIS + SETE * OITO + NOVE * DEZ + ONZE * DOZE + TREZE * QUATOZE + QUINZE *DESESEIS + DESOITO * DESENOVE +VINTE * VInTEUM;
               
               String quantidade = jTextField13not.getText();
               int Quantidade = Integer.parseInt(quantidade); 
              // int valor = 3;
               // Nao ta no 3
           //    if (Quantidade !=6){
              // jTextField30.setText(""+res2);
               
             
               if(Quantidade !=6){
              // jTextField30.setText(""+res3);
              // System.out.print(res3);
              
              
               }else{
               jTextField30.setText(""+resutado);
               }
             //  }else{
             //     jTextField30.setText(""+res2); 
             //  }
               
               // jTextField13.setText("ta vasio");
             
              // jTextField30.setText(""+RESUTADO);
               //jTextField12.setText(""+RESUTADO);
             /*  jTextField13.setText(""+res1);
               jTextField12.setText(""+res2);
               jTextField13.setText(""+res2);
               jTextField12.setText(""+res3);
               jTextField13.setText(""+res3);
               jTextField12.setText(""+res4);
               jTextField13.setText(""+res4);
               jTextField12.setText(""+res5);
               jTextField13.setText(""+res5);
               jTextField12.setText(""+res6);
               jTextField13.setText(""+res6);
               jTextField12.setText(""+res7);
               jTextField13.setText(""+res8); */
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField44ActionPerformed

    private void jTextField59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField59ActionPerformed

    private void jTextField72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField72ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField72ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27ActionPerformed

    private void jTextField39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField39ActionPerformed

    private void jTextField34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField34ActionPerformed

    private void cbo_ConplementosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_ConplementosMouseClicked
String box = cbo_Conplementos.getSelectedItem().toString();
        String boxy = cbo_quat.getSelectedItem().toString();
        
        String[] Lanche = box.split(";");
       // System.out.print(Lanche[0]); //nome
        //System.out.print(Lanche[1]); //tamanho
       // System.out.print(Lanche[2]); //valor
       
       jTextField7.setText(Lanche[2]);
       String valor =  jTextField7.getText();
       String mega =  valor;
       int Mega = Integer.parseInt(mega);
       
       
        
        jTextField1.setText("O valor R$"+Lanche[2]+" a quantidade "+boxy);
        int BOX = Integer.parseInt(Lanche[2]);
        int BOXY = Integer.parseInt(boxy);
        int res = BOXY * BOX;
        jTextField2.setText(""+res);
        
        jTextField3.setText(Lanche[0]+Lanche[1]+Lanche[2]);
        String escolha = jTextField3.getText();
        
        jTextField4.setText(boxy);
        String quantidade = jTextField4.getText();
        
        String Valor = jTextField2.getText();
        
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.addRow(new Object[]{escolha,Valor,quantidade,"",""});
        
       
        
       
        
      String texto[] = new String[10];
       // texto[0] =  jTextField3.getText();// escolha
        texto[1] = jTextField2.getText(); // valor
        texto[2] = jTextField4.getText(); // quantidade 
       
        
       // System.out.print(texto[0] +" "+ texto[1] + " "+ texto[2] +" "); 
       
        System.out.print(escolha);
        
        RegistroDaTabela registroDaTabela = new RegistroDaTabela();
        
        registroDaTabela.setQuantia(jTextField2.getText()); // valor
       // registroDaTabela.setValorTotal(jTextField3.getText()); // lanche 
        registroDaTabela.setQuantida(jTextField4.getText()); // quantidade 
        JOptionPane.showMessageDialog(null, registroDaTabela.sauvado());
        
        //String aSeparar = lerArquivo2()
        
        
  /*         File arquivo = new File("C:\\Arquivos do programa/ControleDaTabela.txt");  

      try {
          FileReader fr = new FileReader(arquivo);   
           BufferedReader br = new BufferedReader(fr);
           

                String linha = br.readLine();
                
                
               // cbo_select.addItem("Selecione o serviço");
                
                while(linha != null){
                    //cbo_select.addItem(linha);
                   int obiter = Integer.parseInt(linha);
                   int array[];
                   new  array[0] = ;
                   
                    linha = br.readLine();
                } 
                              

            
              
   } catch (Exception ex) {
        Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
    } */
 
	/*	while((texto2 = br2.readLine()) != null){
                    
		
			valores.add(texto2);
                        valores.split();
			System.out.print(valores);
                                
                               
                        
                     
                            
                       
			
		}		*/		
		 try {
             String filePath = ("C:\\Arquivos do programa/ControleDaTabela.txt");
        File file = new File(filePath);
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
          //  model.setColumnIdentifiers(columnsName);
            
            

            
            Object[] tableLines = br.lines().toArray();
            //model.addRow(tableLines);
            
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(";");
                model.addRow(dataRow);
                jTextField8.setText(dataRow[0]);
                jTextField9.setText(dataRow[1]);
                jTextField10.setText(dataRow[2]);
                jTextField11.setText(dataRow[3]);
                jTextField14.setText(dataRow[4]);
                jTextField15.setText(dataRow[5]);
                jTextField16.setText(dataRow[6]);
                jTextField17.setText(dataRow[7]);
                jTextField18.setText(dataRow[8]);
                jTextField19.setText(dataRow[9]);
                jTextField20.setText(dataRow[10]);
                jTextField21.setText(dataRow[11]);
                jTextField22.setText(dataRow[12]);
                jTextField23.setText(dataRow[13]);
                jTextField24.setText(dataRow[14]);
                jTextField25.setText(dataRow[15]);
                jTextField26.setText(dataRow[16]);
                jTextField27.setText(dataRow[17]);
                jTextField28.setText(dataRow[18]);
                jTextField29.setText(dataRow[19]);


             /*  String um =  jTextField8.getText();
               String dois = jTextField9.getText();
               String tres = jTextField10.getText();
               String quatro = jTextField11.getText();
               
               int UM = Integer.parseInt(um);
               int DOIS = Integer.parseInt(dois);
               int TRES =  Integer.parseInt(tres);
               int QUATRO =  Integer.parseInt(quatro);
               int RESUTADO = UM * DOIS;
               System.out.print(RESUTADO);
               jTextField12.setText(""+RESUTADO); */
             
            }
            
        } catch (Exception ex) {
            Logger.getLogger(PaginaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
	jTextField13not.setText(""+jTable1.getRowCount());
    
         //calcular totai
         calcularConponete();
         
         
      
        
     
        
    }//GEN-LAST:event_cbo_ConplementosMouseClicked

    private void jTextField74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField74ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     // int Resutado1 = Integer.parseInt(resutado1);
        
        String um =  jTextField8.getText();
               String dois = jTextField9.getText();
              String tres = jTextField10.getText();
               String quatro = jTextField11.getText();
               String sinco = jTextField14.getText();
                String seis = jTextField15.getText(); 
               String sete =  jTextField16.getText();
               String oito = jTextField17.getText();
               String nove = jTextField18.getText();
               String dez=  jTextField19.getText();
               String onze =  jTextField20.getText();
               String doze =  jTextField21.getText();
               String treze = jTextField22.getText();
               String quatoze =  jTextField23.getText();
          //     String quinze = jTextField24.getText();
           //    String deseseis =  jTextField25.getText();
            /*   String desoito =  jTextField26.getText();
               String desenove =  jTextField27.getText();
               String vinte = jTextField28.getText();
               String vinteUm =  jTextField29.getText(); */
               
               int UM = Integer.parseInt(um);
               int DOIS = Integer.parseInt(dois);
               int TRES =  Integer.parseInt(tres);
               int QUATRO =  Integer.parseInt(quatro);
               int CINCO= Integer.parseInt(sinco);
               int SEIS = Integer.parseInt(seis);
               int CETE = Integer.parseInt(oito);
               int SETE = Integer.parseInt(sete);
              int OITO = Integer.parseInt(oito);
               int NOVE = Integer.parseInt(nove);
               int DEZ = Integer.parseInt(dez);
               int ONZE = Integer.parseInt(onze);
               int DOZE = Integer.parseInt(doze);
               int TREZE = Integer.parseInt(treze);
               int QUATOZE = Integer.parseInt(quatoze);
         //      int QUINZE = Integer.parseInt(quinze);
             //  int DESESEIS = Integer.parseInt(deseseis);
          /*     int DESOITO =Integer.parseInt(desoito);
               int DESENOVE = Integer.parseInt(desenove);
               int VINTE = Integer.parseInt(vinte);
               int VInTEUM = Integer.parseInt(vinteUm); */
               
               
            ///  int resutado =  UM * DOIS + TRES * QUATRO + CINCO * SEIS + SETE * CETE + SETE * OITO + NOVE * DEZ ; //6
              int resutado2 =  UM * DOIS + TRES * QUATRO + CINCO * SEIS + SETE * CETE + SETE * OITO + NOVE * DEZ + ONZE * DOZE + TREZE * QUATOZE;
              
              // int RESUTADO = UM * DOIS + TRES * QUATRO; // 3
              // int res1 =  UM * DOIS + TRES * QUATRO + CINCO * SEIS; //4 linhas
              // int res2 = Resutado1 + SETE * OITO;  //6 linhas
              // int res3 = res2 + NOVE * DEZ;  //7
             //  int res4 = res2 + ONZE * DOZE; //8
              // int res5 = res4 + TREZE * QUATOZE; //9
             //  int res6 = res5 + QUINZE *DESESEIS;
              // int res7 = UM * DOIS + TRES * QUATRO + CINCO * SEIS + SETE * OITO + NOVE * DEZ + ONZE * DOZE + TREZE * QUATOZE + QUINZE *DESESEIS + DESOITO * DESENOVE;
              // int res8 = UM * DOIS + TRES * QUATRO + CINCO * SEIS + SETE * OITO + NOVE * DEZ + ONZE * DOZE + TREZE * QUATOZE + QUINZE *DESESEIS + DESOITO * DESENOVE +VINTE * VInTEUM;
               
               String quantidade = jTextField13not.getText();
               int Quantidade = Integer.parseInt(quantidade); 
              // int valor = 3;
               // Nao ta no 3
           //    if (Quantidade !=6){
              // jTextField30.setText(""+res2);
               
             
               if(Quantidade !=8){
              // jTextField30.setText(""+res3);
              // System.out.print(res3);
              

               }else{
               jTextField30.setText(""+resutado2);
               }
             //  }else{
             //     jTextField30.setText(""+res2); 
             //  }
               
               // jTextField13.setText("ta vasio");
             
              // jTextField30.setText(""+RESUTADO);
               //jTextField12.setText(""+RESUTADO);
             /*  jTextField13.setText(""+res1);
               jTextField12.setText(""+res2);
               jTextField13.setText(""+res2);
               jTextField12.setText(""+res3);
               jTextField13.setText(""+res3);
               jTextField12.setText(""+res4);
               jTextField13.setText(""+res4);
               jTextField12.setText(""+res5);
               jTextField13.setText(""+res5);
               jTextField12.setText(""+res6); 
               jTextField13.setText(""+res6);
               jTextField12.setText(""+res7);
               jTextField13.setText(""+res8); */
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbo_ConplementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_ConplementosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_ConplementosActionPerformed

    private void jTextField76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField76ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField76ActionPerformed

    private void jLabel30MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseMoved
       // JOptionPane.showMessageDialog(null, "oiiiii");
      
        int UM = Integer.valueOf(jTextField8.getText());
        
       
       
              //3 CONPONETES
             if (UM == 12){
                 jTextField80.setText(""+4); 
             }
             
              if(UM==15){
                     jTextField80.setText(""+4);
              }
              if(UM==21){
                     jTextField80.setText(""+4);
              }
              if(UM==32){
                    jTextField80.setText(""+4);
              }
              if(UM==39){
                    jTextField80.setText(""+4);
              }
              
              //5 CONPONEMTES
             if(UM == 14){
             jTextField80.setText(""+6);
             }
             if(UM == 17){
             jTextField80.setText(""+6);
             }
             if(UM == 23){
             jTextField80.setText(""+6);
             }
             if(UM == 34){
             jTextField80.setText(""+6);
             }
             if(UM == 43){
             jTextField80.setText(""+6);
             }
             
             //7 COMPONENTES
             if(UM == 16){
             jTextField80.setText(""+8);
             }
              if(UM == 19){
             jTextField80.setText(""+8);
             }
               if(UM == 25){
             jTextField80.setText(""+8);
             }
                if(UM == 36){
             jTextField80.setText(""+8);
             }
                if(UM == 45){
             jTextField80.setText(""+8);
             }
                
                
       
       //calcular totai
         calcular();
    }//GEN-LAST:event_jLabel30MouseMoved

    private void cbo_quatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_quatMouseClicked
        //calcula total
        calcular();
    }//GEN-LAST:event_cbo_quatMouseClicked

    private void jTextField80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField80ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField80ActionPerformed

    private void cbo_selectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_selectMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_selectMouseExited

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    cbo_ItemDaClasse.setBackground(new java.awt.Color(255,255,255));
        
        String box = cbo_Clases.getSelectedItem().toString();
    

		                               
                                               
    jTextField86.setText(box);
    cbo_ItemDaClasse.removeAll();
    //metodo de prencher a segunda Combobox 
    prencher();
        
    
    
     
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField86ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField86ActionPerformed

    private void cbo_ItemDaClasseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_ItemDaClasseMouseClicked
       if (evt.getClickCount() == 1 ) { 
        
        String box = cbo_ItemDaClasse.getSelectedItem().toString();
        String boxy = cbo_quat.getSelectedItem().toString();
        
        String[] Lanche = box.split(";");
       // System.out.print(Lanche[0]); //nome
        //System.out.print(Lanche[1]); //tamanho
       // System.out.print(Lanche[2]); //valor
       
       jTextField7.setText(Lanche[2]);
       String valor =  jTextField7.getText();
       String mega =  valor;
       int Mega = Integer.parseInt(mega);
       
       
        
        jTextField1.setText("O valor R$"+Lanche[2]+" a quantidade "+boxy);
        int BOX = Integer.parseInt(Lanche[2]);
        int BOXY = Integer.parseInt(boxy);
        int res = BOXY * BOX;
        jTextField2.setText(""+res);
        
        jTextField3.setText(Lanche[0]+Lanche[1]+Lanche[2]);
        String escolha = jTextField3.getText();
        
        jTextField4.setText(boxy);
        String quantidade = jTextField4.getText();
        
        String Valor = jTextField2.getText();
        
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.addRow(new Object[]{escolha,Valor,quantidade,"",""});
        
       
        
       
        
      String texto[] = new String[10];
       // texto[0] =  jTextField3.getText();// escolha
        texto[1] = jTextField2.getText(); // valor
        texto[2] = jTextField4.getText(); // quantidade 
       
        
       // System.out.print(texto[0] +" "+ texto[1] + " "+ texto[2] +" "); 
       
        System.out.print(escolha);
        
        RegistroDaTabela registroDaTabela = new RegistroDaTabela();
        
        registroDaTabela.setQuantia(jTextField2.getText()); // valor
       // registroDaTabela.setValorTotal(jTextField3.getText()); // lanche 
        registroDaTabela.setQuantida(jTextField4.getText()); // quantidade 
        JOptionPane.showMessageDialog(null, registroDaTabela.sauvado());
        
        //String aSeparar = lerArquivo2()
        
        
  /*         File arquivo = new File("C:\\Arquivos do programa/ControleDaTabela.txt");  

      try {
          FileReader fr = new FileReader(arquivo);   
           BufferedReader br = new BufferedReader(fr);
           

                String linha = br.readLine();
                
                
               // cbo_select.addItem("Selecione o serviço");
                
                while(linha != null){
                    //cbo_select.addItem(linha);
                   int obiter = Integer.parseInt(linha);
                   int array[];
                   new  array[0] = ;
                   
                    linha = br.readLine();
                } 
                              

            
              
   } catch (Exception ex) {
        Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
    } */
 
	/*	while((texto2 = br2.readLine()) != null){
                    
		
			valores.add(texto2);
                        valores.split();
			System.out.print(valores);
                                
                               
                        
                     
                            
                       
			
		}		*/		
		 try {
             String filePath = ("C:\\Arquivos do programa/ControleDaTabela.txt");
        File file = new File(filePath);
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
          //  model.setColumnIdentifiers(columnsName);
            
            

            
            Object[] tableLines = br.lines().toArray();
            //model.addRow(tableLines);
            
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(";");
                model.addRow(dataRow);
                jTextField8.setText(dataRow[0]);
                jTextField9.setText(dataRow[1]);
                jTextField10.setText(dataRow[2]);
                jTextField11.setText(dataRow[3]);
                jTextField14.setText(dataRow[4]);
                jTextField15.setText(dataRow[5]);
                jTextField16.setText(dataRow[6]);
                jTextField17.setText(dataRow[7]);
                jTextField18.setText(dataRow[8]);
                jTextField19.setText(dataRow[9]);
                jTextField20.setText(dataRow[10]);
                jTextField21.setText(dataRow[11]);
                jTextField22.setText(dataRow[12]);
                jTextField23.setText(dataRow[13]);
                jTextField24.setText(dataRow[14]);
                jTextField25.setText(dataRow[15]);
                jTextField26.setText(dataRow[16]);
                jTextField27.setText(dataRow[17]);
                jTextField28.setText(dataRow[18]);
                jTextField29.setText(dataRow[19]);


               
               String nove =  jTextField18.getText();
               
             /*  String dois = jTextField9.getText();
               String tres = jTextField10.getText();
               String quatro = jTextField11.getText(); */
               
               
               int Nove = Integer.parseInt(nove);
            /*   int DOIS = Integer.parseInt(dois);
               int TRES =  Integer.parseInt(tres);
               int QUATRO =  Integer.parseInt(quatro);
               int RESUTADO = UM * DOIS;
               System.out.print(RESUTADO);
               jTextField12.setText(""+RESUTADO); */
             
             
             //3 CONPONETES
             if (Nove == 12){
                 jTextField84.setText("deu certo"); 
             }else {
             jTextField84.setText("nao deu certo"); 
             }
             
             
                
                
            // int AA = Integer.parseInt( jTextField80.getText()); 
             //int AA = 4;
             
            }
            
        } catch (Exception ex) {
            Logger.getLogger(PaginaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
	jTextField13not.setText(""+jTable1.getRowCount());
        

         //calcular totai
         calcular();  
      
       }           
    }//GEN-LAST:event_cbo_ItemDaClasseMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        cbo_ItemDaClasse.setSelectedItem(null);
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void cbo_ItemDaClasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_ItemDaClasseActionPerformed

       
    }//GEN-LAST:event_cbo_ItemDaClasseActionPerformed

    private void cbo_ClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_ClasesActionPerformed

 
        String box = cbo_Clases.getSelectedItem().toString();
        
    
        
     //   String box = cbo_Clases.getSelectedItem().toString();
    

		                               
                                               
    jTextField86.setText(box);
    String verifica = jTextField86.getText();
    if(verifica.equals("Selecione a clase")){
    System.out.print("È igual");
    }else{
    System.out.print("Não é igual");
        prencher();cbo_ItemDaClasse.setBackground(new java.awt.Color(255,255,255));

    }
    cbo_ItemDaClasse.removeAll();
    
    //metodo de prencher a segunda Combobox 
    
    
    }//GEN-LAST:event_cbo_ClasesActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
 jFrame2.setVisible(rootPaneCheckingEnabled);   
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jFrame2WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame2WindowOpened
  //carrega tabela aqui
   try {
             String filePath = ("C:\\Arquivos do programa/faturamentoDia.txt");
        File file = new File(filePath);
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)jTable4.getModel();
          //  model.setColumnIdentifiers(columnsName);

            Object[] tableLines = br.lines().toArray();
            //model.addRow(tableLines);
            
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(";");
                model.addRow(dataRow);
                
               
            }
        } catch (Exception ex) {
            Logger.getLogger(PaginaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jFrame2WindowOpened

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         if(jTable4.getSelectedRow() != -1){
        
        System.out.print("Linha selecionada: "+jTable4.getSelectedColumn());
            
        DefaultTableModel dmz = (DefaultTableModel)jTable4.getModel();
        dmz.removeRow(jTable4.getSelectedRow());
 
        
         File file = new File("C:\\Arquivos do programa/faturamentoDia.txt");
       
        try {
        FileReader fr = new FileReader(file); 
        BufferedReader br = new BufferedReader(fr);
       
        
        String linha = br.readLine();
        ArrayList<String> salvar = new ArrayList();
        while(linha != null){
            
            String lanche = jLabel50.getText();

            
            
            if(linha.equals(lanche+";") == false){
                salvar.add(linha);
            
            }
            linha = br.readLine();
        }

        br.close();
        fr.close();
        FileWriter fw2 = new FileWriter(file, true);
        fw2.close();
        
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
            for (int i = 0; i < salvar.size(); i++) {
            bw.write( salvar.get(i) );
            bw.newLine();
            
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
        }
        
        
         }else{
            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
        }  
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
TableModel model = jTable4.getModel(); 
     // TableModel model3 = jTextField8.getModel();
      int indexs[] = jTable4.getSelectedRows();
      
      jLabel50.setText(jTable4.getModel().getValueAt(jTable4.getSelectedRow(),0).toString()); //controle lanche
    }//GEN-LAST:event_jTable4MouseClicked

    private void cbo_ItemDaClasseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_ItemDaClasseMouseExited
        
    }//GEN-LAST:event_cbo_ItemDaClasseMouseExited

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        
        File file = new File("C:\\Arquivos do programa/Texto.txt");
       
        try {
        FileReader fr = new FileReader(file); 
        BufferedReader br = new BufferedReader(fr);
       
        
        String linha = br.readLine();
        ArrayList<String> salvar = new ArrayList();
        while(linha != null){
            
           String nome =txt_Nome.getText()+"/";//Valor
            String data = txt_Numero.getText()+"/";//Data
            String total = txt_pedidos.getText()+"/";//total de pedidos
            String valor = txt_valorTotal.getText()+"/";//valor total
            String rua =txt_Rua.getText()+"/";//Rua
            
            String numero = txt_Endereco.getText()+"/";//numero
            String bairro = txt_Bairro.getText()+"/";//bairro
            String aniversario = txt_data.getText()+"/";//aniversario
            String email = Txt_Aniversario.getText()+"/";//email
            String zap = txt_email.getText()+"/";//zap
            String celular = txt_whats.getText()+"/";//celular
            String obiservacoes = txt_celular.getText()+"/";//obiservaçaoes

            String controle = txt_obiservasoes.getText()+"/1";//controle da tabela

            

            
            
            if(linha.equals(nome+data+total+valor+rua+numero+bairro+aniversario+email+zap+celular+obiservacoes+controle) == false){
                salvar.add(linha);
           // JOptionPane.showMessageDialog(null, "1/"+nome+"/"+data+"/0/0/"+endereco+"/"+bairro+"/"+numero+"/"+aniversario+"/"+email+"/"+whats+"/"+celular+"/"+obiserva+"/"+cidade);
            }
            linha = br.readLine();
        }

        br.close();
        fr.close();
        FileWriter fw2 = new FileWriter(file, true);
        fw2.close();
        
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
            for (int i = 0; i < salvar.size(); i++) {
            bw.write( salvar.get(i) );
            bw.newLine();
            
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
        }
        
        
         RegistroDeCompra registroDeCompra = new RegistroDeCompra();

    
        registroDeCompra.setNome(txT_NomeUSUARIO.getText()); 
        registroDeCompra.setEndereço(txT_EnderecoUSUARIO.getText());
        registroDeCompra.setNumero(txT_NumeroUSUARIO.getText());
        registroDeCompra.setBairro(txT_BairroUSUARIO.getText());
        registroDeCompra.setDataNacimento(txT_AniversarioUSUARIO1.getText());
        registroDeCompra.setEmail(txT_EmailUSUARIO.getText());
        registroDeCompra.setWhatsApp(txT_whatsUSUARIO1.getText());
        registroDeCompra.setCelular(txT_CelularUSUARIO2.getText());
        registroDeCompra.setObiservaçoes(txT_ObiservacoesUSUARIO1.getText());
     //   registroDeCompra.setValores(jTextField30.getText()); */
       // registroDeCompra.setData(dataString);
      //  registroDeCompra.setHora(horarioString);

     
        
        
        try {
            JOptionPane.showMessageDialog(null, registroDeCompra.sauvado());  //Atençao
            // jTextField1.setText("");
            // texREs.setText("");
            
            
            /*   t.start();
            prgs.setValue(prgs.getValue()+10);
            
            t.stop(); */
        } catch (IOException ex) {
            Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
       
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void txT_NomeUSUARIO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txT_NomeUSUARIO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txT_NomeUSUARIO1ActionPerformed

    private void txt_cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cidadeActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked
       
        JFileChooser arquivo = new JFileChooser();
            arquivo.setDialogTitle("Selecione uma foto");
            arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        int opc = arquivo.showOpenDialog(this);
        if(opc == JFileChooser.APPROVE_OPTION) {
            File file = new File("Caminho");
            file=arquivo.getSelectedFile(); //RECEBE O CAMINHO
            String filename = file.getAbsolutePath();
            jTextFieldPath.setText(filename);
            
            
            ImageIcon imagem = new ImageIcon(arquivo.getSelectedFile().getPath());
            jLabel54.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(jLabel54.getWidth(), jLabel54.getHeight(), Image.SCALE_DEFAULT)));
        
        }
        //faz o novo registro com a foto
        try{
        Writer fw = new FileWriter("C:\\Arquivos do programa/texto.txt", true);
        PrintWriter pw = new PrintWriter(fw);
        
           String nome = txt_Nome.getText();
           String endereco = txt_Endereco.getText();
           String numero = txt_Numero.getText();
           String bairro = txt_Bairro.getText();
           String data = txt_data.getText();
           String aniversario = Txt_Aniversario.getText();
           String email = txt_email.getText();
           String whats = txt_whats.getText();
           String celular = txt_celular.getText();
           String obiserva = txt_obiservasoes.getText();
           String cidade = txt_cidade.getText();
           
            
            pw.print(nome+"/");
            pw.print(endereco+"/");
            pw.print(numero+"/");
            pw.print(bairro+"/");
            pw.print(data+"/");
            pw.print(aniversario+"/");
            pw.print(email+"/");
            pw.print(whats+"/");
            pw.print(celular+"/");
            pw.print(obiserva+"/");
            pw.print(cidade+"/");
            pw.println("/1/"+jTextFieldPath.getText());
            pw.close();
            
        }catch (Exception ex){
        
        }
           

 
        
        
        //apaga o antigo registro 
        File file = new File("C:\\Arquivos do programa/Texto.txt");
       
        try {
        FileReader fr = new FileReader(file); 
        BufferedReader br = new BufferedReader(fr);
       
        
        String linha = br.readLine();
        ArrayList<String> salvar = new ArrayList();
        while(linha != null){
            
           String nome = txt_Nome.getText();
           String endereco = txt_Endereco.getText();
           String numero = txt_Numero.getText();
           String bairro = txt_Bairro.getText();
           String data = txt_data.getText();
           String aniversario = Txt_Aniversario.getText();
           String email = txt_email.getText();
           String whats = txt_whats.getText();
           String celular = txt_celular.getText();
           String obiserva = txt_obiservasoes.getText();
           String cidade = txt_cidade.getText();
            

            
            
            if(linha.equals(nome+"/"+data+"/0/0/"+endereco+"/"+bairro+"/"+numero+"/"+aniversario+"/"+email+"/"+whats+"/"+celular+"/"+obiserva+"/"+cidade+"1/") == false){
                salvar.add(linha);
           // JOptionPane.showMessageDialog(null, "1/"+nome+"/"+data+"/0/0/"+endereco+"/"+bairro+"/"+numero+"/"+aniversario+"/"+email+"/"+whats+"/"+celular+"/"+obiserva+"/"+cidade);
            }
            linha = br.readLine();
        }

        br.close();
        fr.close();
        FileWriter fw2 = new FileWriter(file, true);
        fw2.close();
        
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
            for (int i = 0; i < salvar.size(); i++) {
            bw.write( salvar.get(i) );
            bw.newLine();
            
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
        }
        
        
    }//GEN-LAST:event_jLabel54MouseClicked

    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked

        
        
        
        String vips = txt_cidade.getText();
String verifica = ":VIP";

         if(vips.toLowerCase().contains(verifica.toLowerCase()) == true){
         //JOptionPane.showInputDialog("é vip ");
         jButton777.setVisible(true);
         
        File file = new File("C:\\Arquivos do programa/Texto.txt");
       
        try {
        FileReader fr = new FileReader(file); 
        BufferedReader br = new BufferedReader(fr);
       
        
        String linha = br.readLine();
        ArrayList<String> salvar = new ArrayList();
        while(linha != null){
            
           String nome =txt_Nome.getText()+"/";//Valor
            String data = txt_Numero.getText()+"/";//Data
            String total = txt_pedidos.getText()+"/";//total de pedidos
            String valor = txt_valorTotal.getText()+"/";//valor total
            String rua =txt_Rua.getText()+"/";//Rua
            
            String numero = txt_Endereco.getText()+"/";//numero
            String bairro = txt_Bairro.getText()+"/";//bairro
            String aniversario = txt_data.getText()+"/";//aniversario
            String email = Txt_Aniversario.getText()+"/";//email
            String zap = txt_email.getText()+"/";//zap
            String celular = txt_whats.getText()+"/";//celular
            String obiservacoes = txt_celular.getText()+"/";//obiservaçaoes

            String controle = txt_obiservasoes.getText()+"/1";//controle da tabela

            

            
            
            if(linha.equals(nome+data+total+valor+rua+numero+bairro+aniversario+email+zap+celular+obiservacoes+controle) == false){
                salvar.add(linha);
           // JOptionPane.showMessageDialog(null, "1/"+nome+"/"+data+"/0/0/"+endereco+"/"+bairro+"/"+numero+"/"+aniversario+"/"+email+"/"+whats+"/"+celular+"/"+obiserva+"/"+cidade);
            }
            linha = br.readLine();
        }

        br.close();
        fr.close();
        FileWriter fw2 = new FileWriter(file, true);
        fw2.close();
        
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
            for (int i = 0; i < salvar.size(); i++) {
            bw.write( salvar.get(i) );
            bw.newLine();
            
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
        }
        
        
         ArmazenmentoVIP armazenmentoVIP = new ArmazenmentoVIP();

    
        armazenmentoVIP.setNome(txT_NomeUSUARIO.getText()); 
        armazenmentoVIP.setEndereço(txT_EnderecoUSUARIO.getText());
        armazenmentoVIP.setNumero(txT_NumeroUSUARIO.getText());
        armazenmentoVIP.setBairro(txT_BairroUSUARIO.getText());
        armazenmentoVIP.setDataNacimento(txT_AniversarioUSUARIO1.getText());
        armazenmentoVIP.setEmail(txT_EmailUSUARIO.getText());
        armazenmentoVIP.setWhatsApp(txT_whatsUSUARIO1.getText());
        armazenmentoVIP.setCelular(txT_CelularUSUARIO2.getText());
        armazenmentoVIP.setObiservaçoes(txT_ObiservacoesUSUARIO1.getText());
        armazenmentoVIP.setCidade(txt_cidade.getText());
         try {
            JOptionPane.showMessageDialog(null, armazenmentoVIP.sauvado());  //Atençao
            // jTextField1.setText("");
            // texREs.setText("");
            
            
            /*   t.start();
            prgs.setValue(prgs.getValue()+10);
            
            t.stop(); */
        } catch (IOException ex) {
           Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
     //   registroDeCompra.setValores(jTextField30.getText()); */
       // registroDeCompra.setData(dataString);
      //  registroDeCompra.setHora(horarioString);
/*
        } catch (IOException ex) {
            Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         */
         }else{
             jLabel55.setVisible(true);
      //   JOptionPane.showInputDialog("Nao é vip ");
         
          ArmazenmentoVIP armazenmentoVIP = new ArmazenmentoVIP();
        
          String nome = txt_Nome.getText();
           String endereco = txt_Endereco.getText();
           String numero = txt_Numero.getText();
           String bairro = txt_Bairro.getText();
           String data = txt_data.getText();
           String aniversario = Txt_Aniversario.getText();
           String email = txt_email.getText();
           String whats = txt_whats.getText();
           String celular = txt_celular.getText();
           String obiserva = txt_obiservasoes.getText();
           String cidade = txt_cidade.getText();
        
        armazenmentoVIP.setNome(txT_NomeUSUARIO.getText()); 
        armazenmentoVIP.setEndereço(txT_EnderecoUSUARIO.getText());
        armazenmentoVIP.setNumero(txT_NumeroUSUARIO.getText());
        armazenmentoVIP.setBairro(txT_BairroUSUARIO.getText());
        armazenmentoVIP.setDataNacimento(txT_AniversarioUSUARIO1.getText());
        armazenmentoVIP.setEmail(txT_EmailUSUARIO.getText());
        armazenmentoVIP.setWhatsApp(txT_whatsUSUARIO1.getText());
        armazenmentoVIP.setCelular(txT_CelularUSUARIO2.getText());
        armazenmentoVIP.setObiservaçoes(txT_ObiservacoesUSUARIO1.getText());
        armazenmentoVIP.setCidade(txt_cidade.getText());
        
        try {
            JOptionPane.showMessageDialog(null, armazenmentoVIP.sauvado());  //Atençao
            // jTextField1.setText("");
            // texREs.setText("");
            
            
            /*   t.start();
            prgs.setValue(prgs.getValue()+10);
            
            t.stop(); */
        } catch (IOException ex) {
           Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         }
        
        
        
  /*      
         File classes = new File("C:\\Arquivos do programa/clase.txt");  

      try {
          FileReader fr = new FileReader(classes);   
           BufferedReader br = new BufferedReader(fr);
           

                String linha = br.readLine();
                
                
                cbo_Clases.addItem("Selecione a clase");
                
                while(linha != null){
                    cbo_Clases.addItem(linha);
                   
                    linha = br.readLine();
                } 
                } catch (Exception ex) {
        Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
    }   /* String vips = jTextField85.getText();
String verifica = ":VIP";

         if(vips.toLowerCase().contains(verifica.toLowerCase()) == true){
         JOptionPane.showInputDialog("é vip ");
             
         }else{
         JOptionPane.showInputDialog("Nao é vip ");
         }
        */
        //se for vip
       //////////////////É  aqui
        /*
        File file = new File("C:\\Arquivos do programa/Texto.txt");
       
        try {
        FileReader fr = new FileReader(file); 
        BufferedReader br = new BufferedReader(fr);
       
        
        String linha = br.readLine();
        ArrayList<String> salvar = new ArrayList();
        while(linha != null){
            
           String nome = txt_Nome.getText();
           String endereco = txt_Endereco.getText();
           String numero = txt_Numero.getText();
           String bairro = txt_Bairro.getText();
           String data = txt_data.getText();
           String aniversario = Txt_Aniversario.getText();
           String email = txt_email.getText();
           String whats = txt_whats.getText();
           String celular = txt_celular.getText();
           String obiserva = txt_obiservasoes.getText();
           String cidade = txt_cidade.getText();
            

            
            
            if(linha.equals("1/"+nome+"/"+data+"/0/0/"+endereco+"/"+bairro+"/"+numero+"/"+aniversario+"/"+email+"/"+whats+"/"+celular+"/"+obiserva+"/"+cidade) == false){
                salvar.add(linha);
           // JOptionPane.showMessageDialog(null, "1/"+nome+"/"+data+"/0/0/"+endereco+"/"+bairro+"/"+numero+"/"+aniversario+"/"+email+"/"+whats+"/"+celular+"/"+obiserva+"/"+cidade);
            }
            linha = br.readLine();
        }

        br.close();
        fr.close();
        FileWriter fw2 = new FileWriter(file, true);
        fw2.close();
        
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
            for (int i = 0; i < salvar.size(); i++) {
            bw.write( salvar.get(i) );
            bw.newLine();
            
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
        }
        
        
         ArmazenmentoVIP armazenmentoVIP = new ArmazenmentoVIP();

    
        armazenmentoVIP.setNome(txT_NomeUSUARIO.getText()); 
        armazenmentoVIP.setEndereço(txT_EnderecoUSUARIO.getText());
        armazenmentoVIP.setNumero(txT_NumeroUSUARIO.getText());
        armazenmentoVIP.setBairro(txT_BairroUSUARIO.getText());
        armazenmentoVIP.setDataNacimento(txT_AniversarioUSUARIO1.getText());
        armazenmentoVIP.setEmail(txT_EmailUSUARIO.getText());
        armazenmentoVIP.setWhatsApp(txT_whatsUSUARIO1.getText());
        armazenmentoVIP.setCelular(txT_CelularUSUARIO2.getText());
        armazenmentoVIP.setObiservaçoes(txT_ObiservacoesUSUARIO1.getText());
        armazenmentoVIP.setCidade(txt_cidade.getText());
        
     //   registroDeCompra.setValores(jTextField30.getText()); */
       // registroDeCompra.setData(dataString);
      //  registroDeCompra.setHora(horarioString);
/*
        } catch (IOException ex) {
            Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*/        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel55MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
dispose();
TelaPrincipal tela = new TelaPrincipal();
                       tela.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed
    private static final Logger LOG = Logger.getLogger(PerfilDoCliente.class.getName());

    public PerfilDoCliente(JTable jTable1, JTextField jTextField1, String string) throws HeadlessException {

        
    }
 
    
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
            java.util.logging.Logger.getLogger(PerfilDoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilDoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilDoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilDoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PerfilDoCliente().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Txt_Aniversario;
    private javax.swing.JComboBox<String> cbo_Clases;
    private javax.swing.JComboBox<String> cbo_Conplementos;
    private javax.swing.JComboBox<String> cbo_ItemDaClasse;
    private javax.swing.JComboBox<String> cbo_quat;
    public javax.swing.JComboBox<String> cbo_select;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton777;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonlink;
    private javax.swing.JButton jButtonlink1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTestfildbig;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField13not;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField79;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField81;
    private javax.swing.JTextField jTextField82;
    private javax.swing.JTextField jTextField83;
    private javax.swing.JTextField jTextField84;
    public javax.swing.JTextField jTextField85;
    private javax.swing.JTextField jTextField86;
    private javax.swing.JTextField jTextField87;
    public javax.swing.JTextField jTextField88;
    public javax.swing.JTextField jTextField89;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextField90;
    private javax.swing.JTextField jTextFieldPath;
    private javax.swing.JTextField jTextFieldPath1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField texREs;
    public javax.swing.JTextField txT_AniversarioUSUARIO;
    public javax.swing.JTextField txT_AniversarioUSUARIO1;
    public javax.swing.JTextField txT_BairroUSUARIO;
    public javax.swing.JTextField txT_BairroUSUARIO1;
    public javax.swing.JTextField txT_CelularUSUARIO2;
    public javax.swing.JTextField txT_CelularUSUARIO3;
    public javax.swing.JTextField txT_CodigoUSUARIO;
    public javax.swing.JTextField txT_CodigoUSUARIO1;
    public javax.swing.JTextField txT_EmailUSUARIO;
    public javax.swing.JTextField txT_EmailUSUARIO1;
    public javax.swing.JTextField txT_EnderecoUSUARIO;
    public javax.swing.JTextField txT_EnderecoUSUARIO1;
    public javax.swing.JTextField txT_EnderecoUSUARIO2;
    public javax.swing.JTextField txT_NomeUSUARIO;
    public javax.swing.JTextField txT_NomeUSUARIO1;
    public javax.swing.JTextField txT_Numero;
    public javax.swing.JTextField txT_Numero1;
    public javax.swing.JTextField txT_NumeroUSUARIO;
    public javax.swing.JTextField txT_NumeroUSUARIO1;
    public javax.swing.JTextField txT_ObiservacoesUSUARIO1;
    public javax.swing.JTextField txT_ObiservacoesUSUARIO2;
    public javax.swing.JTextField txT_dataUSUARIO;
    public javax.swing.JTextField txT_dataUSUARIO1;
    public javax.swing.JTextField txT_whatsUSUARIO1;
    public javax.swing.JTextField txT_whatsUSUARIO2;
    public javax.swing.JTextField txt_Bairro;
    public javax.swing.JTextField txt_Endereco;
    public javax.swing.JTextField txt_Nome;
    public javax.swing.JTextField txt_Numero;
    public javax.swing.JTextField txt_Rua;
    public javax.swing.JTextField txt_celular;
    public javax.swing.JTextField txt_cidade;
    public javax.swing.JTextField txt_data;
    public javax.swing.JTextField txt_email;
    public javax.swing.JTextField txt_obiservasoes;
    public javax.swing.JTextField txt_pedidos;
    public javax.swing.JTextField txt_valorTotal;
    public javax.swing.JTextField txt_whats;
    // End of variables declaration//GEN-END:variables

    private PopupMenu String(String[] dataRow) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  //  private String getValueAt(Object tableLine, int i) {
   //     throw new UnjTableReceberedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  //  }

    DefaultTableModel jTextField8(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String setText(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object aSeparar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class jComboBox {

        public jComboBox() {
        }
    }

    private static class ProgressToNewForm {

        public ProgressToNewForm() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
