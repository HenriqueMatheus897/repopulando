
package visão;
import java.awt.event.KeyEvent;
import java.io.IOException;   

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;


public class PaginaUsuario extends javax.swing.JFrame {

 private static String codigo,Nome,datadeCadrastro,QuantidadedePedidos,valorPago,endereço,numero,bairro,aniversrio,email,whatsApp,celuar,obiservações;
    public PaginaUsuario() {
        initComponents();
        
        
       jButtonImport.setBackground(new java.awt.Color(0,0,0,0));
       jButtonImport2.setBackground(new java.awt.Color(0,0,0,0));
       jButtonImport3.setBackground(new java.awt.Color(0,0,0,0));
       jButtonImport1.setBackground(new java.awt.Color(0,0,0,0));
       jTable1.setBackground(new java.awt.Color(0,0,0,0));
       txt_controle.setBackground(new java.awt.Color(0,0,0,0));
       tex_controle_2.setBackground(new java.awt.Color(0,0,0,0));
       jTextField1.setBackground(new java.awt.Color(0,0,0,0));
       jTextField2.setBackground(new java.awt.Color(0,0,0,0));
       jTextField3.setBackground(new java.awt.Color(0,0,0,0));
       jTextField4.setBackground(new java.awt.Color(0,0,0,0));
       jTextField5.setBackground(new java.awt.Color(0,0,0,0));
       jTextField6.setBackground(new java.awt.Color(0,0,0,0));
       jTextField7.setBackground(new java.awt.Color(0,0,0,0));
       jTextField8.setBackground(new java.awt.Color(0,0,0,0));
       jButton1.setBackground(new java.awt.Color(0,0,0,0));
       jTxtPesquisa.setBackground(new java.awt.Color(0,0,0,0));
       jButton2.setBackground(new java.awt.Color(0,0,0,0));
        
        
       
    }

    private PerfilDoCliente Chamar_Fornecedor = new PerfilDoCliente();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txT_Nome = new javax.swing.JTextField();
        jButtonImport = new javax.swing.JButton();
        jTxtPesquisa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonImport1 = new javax.swing.JButton();
        jButtonImport2 = new javax.swing.JButton();
        jButtonImport3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_controle = new javax.swing.JTextField();
        tex_controle_2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setAutoRequestFocus(false);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jButtonImport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImportActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonImport);
        jButtonImport.setBounds(180, 170, 90, 70);

        jTxtPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTxtPesquisa.setBorder(null);
        jTxtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPesquisaActionPerformed(evt);
            }
        });
        jTxtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtPesquisaKeyPressed(evt);
            }
        });
        getContentPane().add(jTxtPesquisa);
        jTxtPesquisa.setBounds(360, 50, 690, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1100, 40, 60, 60);

        jButtonImport1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonImport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImport1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonImport1);
        jButtonImport1.setBounds(180, 530, 97, 70);

        jButtonImport2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonImport2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImport2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonImport2);
        jButtonImport2.setBounds(-270, 620, 97, 80);

        jButtonImport3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonImport3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImport3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonImport3);
        jButtonImport3.setBounds(180, 600, 97, 80);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 260, 0, 0);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 340, 0, 0);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 440, 0, 0);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 540, 0, 0);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Aniversario", "Pedidos", "valor", "Rua", "Numero", "bairro"
            }
        ));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(1).setMinWidth(0);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(0);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(0);
            jTable2.getColumnModel().getColumn(2).setMinWidth(260);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(260);
            jTable2.getColumnModel().getColumn(2).setMaxWidth(260);
            jTable2.getColumnModel().getColumn(3).setMinWidth(260);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(260);
            jTable2.getColumnModel().getColumn(3).setMaxWidth(260);
            jTable2.getColumnModel().getColumn(4).setMinWidth(0);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(0);
            jTable2.getColumnModel().getColumn(4).setMaxWidth(0);
            jTable2.getColumnModel().getColumn(5).setMinWidth(0);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(0);
            jTable2.getColumnModel().getColumn(5).setMaxWidth(0);
            jTable2.getColumnModel().getColumn(6).setMinWidth(0);
            jTable2.getColumnModel().getColumn(6).setPreferredWidth(0);
            jTable2.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(350, 120, 810, 530);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(410, 630, 0, 10);

        txt_controle.setBorder(null);
        txt_controle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_controleActionPerformed(evt);
            }
        });
        getContentPane().add(txt_controle);
        txt_controle.setBounds(50, 80, 0, 10);

        tex_controle_2.setBorder(null);
        getContentPane().add(tex_controle_2);
        tex_controle_2.setBounds(50, 100, 0, 10);

        jTextField1.setBorder(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(50, 120, 0, 10);

        jTextField2.setBorder(null);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(70, 80, 0, 10);

        jTextField3.setBorder(null);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(70, 100, 0, 10);

        jTextField4.setBorder(null);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(70, 120, 0, 10);

        jTextField5.setBorder(null);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(90, 80, 0, 10);

        jTextField6.setBorder(null);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(90, 80, 0, 30);

        jTextField7.setBorder(null);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(10, 100, 0, 30);

        jTextField8.setBorder(null);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(110, 80, 0, 10);

        jTextField10.setText("jTextField10");
        getContentPane().add(jTextField10);
        jTextField10.setBounds(20, 90, 80, 20);

        jTextField12.setText("jTextField12");
        getContentPane().add(jTextField12);
        jTextField12.setBounds(20, 160, 80, 20);

        jTextField11.setText("jTextField11");
        getContentPane().add(jTextField11);
        jTextField11.setBounds(20, 120, 80, 20);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 270, 90, 70);

        jTextField9.setBorder(null);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(180, 130, 0, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/azul.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1250, 90, 40, 350);

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(180, 360, 80, 80);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/azul.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1260, 350, 40, 350);

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(1263, 3, 50, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/--- Clientes.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jLabel6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jLabel6ComponentMoved(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1360, 700);

        setSize(new java.awt.Dimension(1314, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImportActionPerformed
              JFCadrastro Tela = new JFCadrastro();
        Tela.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButtonImportActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
 if (!Chamar_Fornecedor.isVisible()) { Chamar_Fornecedor.setVisible(true); }/*
        PerfilDoCliente Tela = new PerfilDoCliente();
        Tela.setVisible(rootPaneCheckingEnabled); */
    }//GEN-LAST:event_jTable1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
        
        String filePath = ("C:\\Arquivos do programa/Texto.txt");
        File file = new File(filePath);
        //tabela 1
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model00 = (DefaultTableModel)jTable2.getModel();
            //model00.setColumnIdentifiers(columnsName);
            
            Object[] tableLines = br.lines().toArray();

            
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                model00.addRow(dataRow);
            }
            
        } catch (Exception ex) {
           Logger.getLogger(PaginaUsuario.class.getName()).log(Level.SEVERE, null, ex); 
        }
        // tabela 2

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setColumnIdentifiers(columnsName);
            
            

            
            Object[] tableLines = br.lines().toArray();
            //model.addRow(tableLines);
            
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                model.addRow(dataRow);


            }
            
        } catch (Exception ex) {
            Logger.getLogger(PaginaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }//GEN-LAST:event_formWindowOpened

    private void jButtonImport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImport1ActionPerformed
        
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*JFileChooser arquivo = new JFileChooser();
        arquivo.setDialogTitle("Selecione uma foto");
        arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        int opc = arquivo.showOpenDialog(this);
        if(opc == JFileChooser.APPROVE_OPTION) {
            File file = new File("Caminho");
            file=arquivo.getSelectedFile(); //RECEBE O CAMINHO
            String filename = file.getAbsolutePath();
           // jTextFieldPath.setText(filename);
        
        
        File arquivoCSV = arquivo.getSelectedFile();
        
        try {
            String linhaDoArquivo = new String();
            
            Scanner leitor =new Scanner(arquivoCSV);
            
            leitor.nextLine();
            
            while(leitor.hasNext()){
            linhaDoArquivo = leitor.nextLine();
            
            String[] valoresEntreVirgulas = linhaDoArquivo.split(";");
            
            System.out.print(valoresEntreVirgulas[0] +" "+ valoresEntreVirgulas[2]);
            
            
            
            Clientes clientes = new Clientes();
            
            clientes.setInportacao(valoresEntreVirgulas[0] + valoresEntreVirgulas[1]+ valoresEntreVirgulas[2] + valoresEntreVirgulas[3]+ valoresEntreVirgulas[4]);
            
            JOptionPane.showMessageDialog(null, clientes.sauvar());
            }
                    
        } catch (FileNotFoundException e) {
        }
        }     /*
       /////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
        
        
        
     /*   TableModel model1 = jTable1.getModel(); 
     // TableModel model3 = jTextField8.getModel();
      int indexs[] = jTable2.getSelectedRows();
      
        
      txT_Nome.setText(jTable2.getModel().getValueAt(jTable2.getSelectedRow(),1).toString()); */
      
      
      
       // System.out.print(jTable2.getModel().getValueAt(jTable2.getSelectedRow(),1).toString());
        /* TableModel model1 = jTable2.getModel(); 
         // TableModel model3 = jTextField8.getModel();
        int indexs[] = jTable1.getSelectedRows();
        
        jTable2.setModel(model1);
        int linha = jTable2.getSelectedRow();
        
        
        return jTable2.getModel().getValueAt(linha,0).toString();
        /*if (linha != -1) {
            //int big = jTable2.getSelectedRow();
            
            String box = jTable2.Arrays.toString(jTable2.getSelectedRow()).parse((String)model1.getValueAt(indexs, 0));
            
           // int BOX = Integer.parseInt(big);
            txT_Nome.setText(box);
           // jTable2.removeRow(jTable2.getSelectedRow());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um item na tabela!");
            return;
        }*/

    
        
    }//GEN-LAST:event_jButtonImport1ActionPerformed

    private void jButtonImport2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImport2ActionPerformed
       // System.out.print("Linha selecionada: "+jTable2.getSelectedRow());

      
        /* DefaultTableModel dmz = (DefaultTableModel)jTable1.getModel();
        DefaultTableModel dtm = (DefaultTableModel)jTable2.getModel();
        if (jTable2.getSelectedRow() >= 0){
            dtm.removeRow(jTable2.getSelectedRow());
            dmz.removeRow(jTable1.getSelectedRow());
            jTable2.setModel(dtm);
            jTable1.setModel(dmz);

                   PerfilDoCliente frm2 = new PerfilDoCliente();
 
             //TableModel model1 = jTable1.getModel(); 
     // TableModel model3 = jTextField8.getModel();
      int indexs[] = jTable2.getSelectedRows();
      
      jTextField1.setText(jTable2.getModel().getValueAt(jTable2.getSelectedRow(),5).toString());
      jTextField1.setText((String) jTable2.getValueAt(jTable2.getSelectedRow(),1))
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
        } */
        
        

            
              
  
        
    }//GEN-LAST:event_jButtonImport2ActionPerformed

    private void jButtonImport3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImport3ActionPerformed

    
    }//GEN-LAST:event_jButtonImport3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
      TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
      jTable2.setRowSorter(tr);
      tr.setRowFilter(RowFilter.regexFilter(jTxtPesquisa.getText().trim()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTxtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPesquisaActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        
        
        
       
      // Captura o ID
      //JOptionPane.showMessageDialog(null, "foi clicado 2 veses!");
    
         



        //Pelfil DO CLIENTE    
        PerfilDoCliente frm2 = new PerfilDoCliente();
        /*
 try {
			//abre o arquivo
			FileReader fr = new FileReader("Texto.txt");
			BufferedReader br = new BufferedReader(fr);
			String temp;
			//A cada interação, é uma linha do arquivo e atribui-a a temp
			while ((temp = br.readLine()) != null)
			{
				//Aqui gera a sua "lista". No caso, imprimi cada linha na tela.
				String[] a = temp.split("/");
				int i=0;
				for(String each : a)
				{
					/*if(i==0){
						nome=each;							
						System.out.println(nome);
					}*/
						/*if(i==1){
							Nome=each;
                                                        
							System.out.println(Nome);
                                                       // frm2.txT_Nome.setText(Nome);
						} /*
						if(i==2){
							valor=each;
							i=-1;
							System.out.println(valor);
                                                        
						}*/
						/*i++;
					}						
				}
		}
		catch (FileNotFoundException el)
		{
			System.out.println("Arquivo não Encontrado!");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}*/
        
        
        
        
        
             TableModel model1 = jTable1.getModel(); 
     // TableModel model3 = jTextField8.getModel();
      int indexs[] = jTable2.getSelectedRows();
      
      
     // frm2.txT_Nome.setText();
                                                           
      frm2.txT_NomeUSUARIO.setText(jTable2.getModel().getValueAt(jTable2.getSelectedRow(),0).toString()); //Nome
      frm2.txT_EnderecoUSUARIO.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),4).toString()); //Rua
      frm2.txT_NumeroUSUARIO.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),6).toString()); //Bairro
      frm2.txT_BairroUSUARIO.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),5).toString()); //Numero
      frm2.txT_dataUSUARIO.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),2).toString()); //Data
      frm2.txT_AniversarioUSUARIO.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),7).toString()); //Aniversario
      frm2.txT_EmailUSUARIO.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),8).toString()); //Email
      frm2.txT_whatsUSUARIO1.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),9).toString()); //WhatsApp
      frm2.txT_CelularUSUARIO2.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),10).toString()); //Celular
      frm2.txT_ObiservacoesUSUARIO1.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),11).toString()); // Obiservaçoes
      
     //string que vai ser apgada ao aperta o botão de sauvar alteraçoes
      frm2.txt_Nome.setText(jTable2.getModel().getValueAt(jTable2.getSelectedRow(),0).toString()); //Nome
      frm2.txt_pedidos.setText(jTable2.getModel().getValueAt(jTable2.getSelectedRow(),2).toString()); //pedido
      frm2.txt_valorTotal.setText(jTable2.getModel().getValueAt(jTable2.getSelectedRow(),3).toString()); //valor total
      frm2.txt_Rua.setText(jTable2.getModel().getValueAt(jTable2.getSelectedRow(),4).toString()); //Rua
      frm2.txt_Endereco.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),5).toString()); //Endereço
      frm2.txt_Numero.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),7).toString()); //Numero
      frm2.txt_Bairro.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),6).toString()); //Bairro
      frm2.txt_data.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),7).toString()); //Data
      frm2.Txt_Aniversario.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),8).toString()); //Aniversario
      frm2.txt_email.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),9).toString()); //Email
      frm2.txt_whats.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),10).toString()); //WhatsApp
      frm2.txt_celular.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),11).toString()); //Celular
      frm2.txt_obiservasoes.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),12).toString()); // Obiservaçoes
      frm2.txt_cidade.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),13).toString()); //controle cidade
     
      
      
      
      txt_controle.setText(jTable2.getModel().getValueAt(jTable2.getSelectedRow(),0).toString()); // Nome
      tex_controle_2.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),2).toString()); //Pedido
      jTextField1.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),3).toString()); //valor total
      jTextField2.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),4).toString()); //rua
      jTextField3.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),5).toString()); // Endereço
      jTextField4.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),7).toString()); // numero
      jTextField5.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),6).toString()); // Bairo
      jTextField6.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),7).toString()); //data
      jTextField7.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),8).toString()); // aniversario
      jTextField8.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),9).toString()); // email
      jTextField9.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),10).toString()); //whats
      jTextField10.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),11).toString());//celular
      jTextField11.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),12).toString());//obiservaçoes
      jTextField12.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),13).toString());//cidade
      
      
      
      
      
      // frm2.txT_whatsUSUARIO1.setText.(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),13).toString());
//      frm2.txT_Numero.setText(jTable1.getModel().getValueAt(jTable2.getSelectedRow(),13).toString());
      
      
      
      
      
      Object[] row = new Object[2];
     
     // PerfilDoCliente frm2 = new PerfilDoCliente();
      //DefaultTableModel mode13 = (DefaultTableModel)frm2.jtTabelaNome.getModel();
      //DefaultTableModel model4 = (DefaultTableModel)frm2.jtTabelaData.getModel();
      //DefaultTableModel model5 = (DefaultTableModel)frm2.jtTabelaEndereço.getModel();
     // DefaultTableModel model6 = (DefaultTableModel)frm2.jtTabelaNumero.getModel();
     // DefaultTableModel model7 = (DefaultTableModel)frm2.jtTabelaBairro.getModel();
     // DefaultTableModel model8 = (DefaultTableModel)frm2.jtTabelaAniversario.getModel();
    //  DefaultTableModel model9 = (DefaultTableModel)frm2.jtTabelaEmail.getModel();
      //DefaultTableModel model10 = (DefaultTableModel)frm2.jtTabelaWhatsApp.getModel();
     // DefaultTableModel model11 = (DefaultTableModel)frm2.jtTabelaCelular.getModel();
      //DefaultTableModel model12 = (DefaultTableModel)frm2.jtTabelaObiservaçoes.getModel();
      
     // for(int i = 0; i < indexs.length; i++)
     // {
       //row[0] = model1.getValueAt(indexs[i], 1); // Nome
      // mode13.addRow(row);
       
       
       
      // row[0] = model1.getValueAt(indexs[i], 2); // Data 
     //  model4.addRow(row);

       //row[0] = model1.getValueAt(indexs[i], 5); // Endereço
      // model5.addRow(row);
       
      // row[0] = model1.getValueAt(indexs[i], 6); //Numero
       //model7.addRow(row);
       
       //ow[0] = model1.getValueAt(indexs[i], 7); //Bairro
      // model6.addRow(row);
       
       //row[0] = model1.getValueAt(indexs[i], 8); //Aniversario 
      // model8.addRow(row);
       
      // row[0] = model1.getValueAt(indexs[i], 9);//Emaill
       //model9.addRow(row);
       
       //row[0] = model1.getValueAt(indexs[i], 10);//WhatsApp
       //model10.addRow(row);
       
       //row[0] = model1.getValueAt(indexs[i], 11); //Celular
       //model11.addRow(row);
       
       //row[0] = model1.getValueAt(indexs[i], 12); // Obiservaçoes
      // model12.addRow(row);
       
     // }
      
      frm2.setVisible(true); 

    }//GEN-LAST:event_jTable2MouseClicked

    private void txt_controleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_controleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_controleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
         
        if(jTable2.getSelectedRow() != -1){
        
        System.out.print("Linha selecionada: "+jTable2.getSelectedColumn());
            
        DefaultTableModel dmz = (DefaultTableModel)jTable2.getModel();
        dmz.removeRow(jTable2.getSelectedRow());
 
        File file = new File("C:\\Arquivos do programa/Texto.txt");
       
        try {
        FileReader fr = new FileReader(file); 
        BufferedReader br = new BufferedReader(fr);
       
        
        String linha = br.readLine();
        ArrayList<String> salvar = new ArrayList();
        while(linha != null){
            

                    
            String nome = txt_controle.getText()+"/";
            String data =jTextField6.getText()+"/";
            String total = jTextField3.getText()+"/";
            String valor = jTextField1.getText()+"/";
            String rua = jTextField2.getText()+"/";
            String numero = jTextField4.getText()+"/";
            String bairro = jTextField5.getText()+"/";
            String aniversario = jTextField7.getText()+"/";
            String email = jTextField8.getText()+"/";
            String zap = jTextField9.getText()+"/";
            String celular = jTextField10.getText()+"/";
            String obiservacoes = jTextField11.getText()+"/";           
            String controle = jTextField12.getText()+"/1";
           
            
            
 
            if(linha.equals(nome+data+total+valor+rua+numero+bairro+aniversario+email+zap+celular+obiservacoes+controle) == false){
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
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel6ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel6ComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6ComponentMoved

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        
        
        
        
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ListaVIP Tela = new ListaVIP();
        Tela.setVisible(rootPaneCheckingEnabled); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
dispose();
TelaPrincipal tela = new TelaPrincipal();
                       tela.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTxtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtPesquisaKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
      TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
      jTable2.setRowSorter(tr);
      tr.setRowFilter(RowFilter.regexFilter(jTxtPesquisa.getText().trim()));
       }
    }//GEN-LAST:event_jTxtPesquisaKeyPressed

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
            java.util.logging.Logger.getLogger(PaginaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonImport;
    private javax.swing.JButton jButtonImport1;
    private javax.swing.JButton jButtonImport2;
    private javax.swing.JButton jButtonImport3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTxtPesquisa;
    private javax.swing.JTextField tex_controle_2;
    private javax.swing.JTextField txT_Nome;
    public javax.swing.JTextField txt_controle;
    // End of variables declaration//GEN-END:variables

    private static class lstClientes {

        public lstClientes() {
        }
    }

    private class tableLines {

        public tableLines() {
        }
    }
}
