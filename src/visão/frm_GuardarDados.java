package visão;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.util.List;

import visão.ClasePrincipal;
import aluno.Alumno;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import metodos.Metodos;

import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.F;
import javax.persistence.Table;

import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import metodos.MetodoDeCategorias;
import visão.PaginaUsuario;
import visão.PerfilDoCliente;
import visão.RegistroDeCompra;
import visão.telaDEDadosDoMes;

public class frm_GuardarDados extends javax.swing.JFrame {
    telaDEDadosDoMes TelaDEDadosDoMes;
    
    private  static String um,dois,tres,quatro,cinco,seis,sete,oito,nove,dez;
    
    private static String info;
    

    Alumno alumno = new Alumno();
    Metodos metodos = new Metodos();
    DefaultTableModel mdlTabla;
    Vector vCabeceras = new Vector();
    
    public void imagemIcon(){
            
    ImageIcon img = new ImageIcon(getClass().getResource("medico.jpg"));
    jLabel8.setIcon(img);
    }
    
    public frm_GuardarDados() {
        initComponents();
       // this.TelaDEDadosDoMes = new telaDEDadosDoMes(jDesktopPane1);
        
        
        btn_MostarLista.setBackground(new java.awt.Color(0,0,0,0));
       // cbo_Tipo.setBackground(new java.awt.Color(0,0,0,0));
        jTextField1.setBackground(new java.awt.Color(0,0,0,0));
        jButton1.setBackground(new java.awt.Color(0,0,0,0));
        btn_Guardar.setBackground(new java.awt.Color(0,0,0,0));
   //     txt_Nombre.setBackground(new java.awt.Color(0,0,0,0));
        cbo_Edad.setBackground(new java.awt.Color(0,0,0,0));
       // txt_Codigo.setBackground(new java.awt.Color(0,0,0,0));
        jTextField2.setBackground(new java.awt.Color(0,0,0,0));
        jTextField3.setBackground(new java.awt.Color(0,0,0,0));
        jTextField4.setBackground(new java.awt.Color(0,0,0,0));
        jButton2.setBackground(new java.awt.Color(0,0,0,0));
        jButton3.setBackground(new java.awt.Color(0,0,0,0));
        //jDesktopPane1.setBackground(new java.awt.Color(0,0,0,0));
       // jScrollPane2.setBackground(new java.awt.Color(0,0,0,0));
        //jTable2.setBackground(new java.awt.Color(0,0,0,0
        jButton5.setBackground(new java.awt.Color(0,0,0,0));
        
        jButton3.setBackground(new java.awt.Color(0,0,0,0));
        
        
       
       
        
        
        
        //txt_Nombre.setBackground(new  java.awt.Color(0,0,0,0));
        
                
        metodos.cboEdad(cbo_Edad);
       // metodos.cboTipo(cbo_Tipo);
        
        
        vCabeceras.addElement("Nome");
        vCabeceras.addElement("Tamanho");
        vCabeceras.addElement("Tipo");
         vCabeceras.addElement("Descrição");
       vCabeceras.addElement("Valor");
       
        mdlTabla = new DefaultTableModel(vCabeceras,0);
        
        
        
    }
    

    
    
    private void SauvarClase()
    {
    }
           
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Descriçao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbo_Tipo = new javax.swing.JComboBox<>();
        cbo_Edad = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btn_MostarLista = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btn_Guardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Valor R$");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Tamanho");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Descrição");

        txt_Descriçao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DescriçaoActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo de Pão");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Pesquisar Lanche");

        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setText("jLabel9");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Meus produtos(1).png"))); // NOI18N

        jLabel10.setText("jLabel10");

        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        cbo_Tipo.setToolTipText("");
        cbo_Tipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_TipoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbo_TipoMousePressed(evt);
            }
        });
        cbo_Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_TipoActionPerformed(evt);
            }
        });
        getContentPane().add(cbo_Tipo);
        cbo_Tipo.setBounds(460, 70, 560, 40);

        cbo_Edad.setToolTipText("");
        cbo_Edad.setBorder(null);
        cbo_Edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_EdadActionPerformed(evt);
            }
        });
        getContentPane().add(cbo_Edad);
        cbo_Edad.setBounds(1120, 260, 0, 18);

        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1040, 60, 1, 50);

        btn_MostarLista.setBorder(null);
        btn_MostarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MostarListaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MostarLista);
        btn_MostarLista.setBounds(250, 330, 1, 30);

        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(110, 140, 30, 30);

        btn_Guardar.setBorder(null);
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Guardar);
        btn_Guardar.setBounds(1060, 610, 1, 30);

        jButton2.setFont(new java.awt.Font("SimSun", 0, 11)); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(240, 430, 0, 10);

        jTextField2.setBorder(null);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(0, 70, 0, 14);

        jTextField3.setBorder(null);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(0, 120, 0, 14);

        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(0, 170, 0, 14);

        jTextField5.setBorder(null);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(1090, 50, 0, 14);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(460, 130, 570, 40);

        jTextField6.setBorder(null);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(130, 240, 0, 14);

        jTextField7.setBorder(null);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(130, 270, 0, 14);

        jTextField8.setBorder(null);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(130, 310, 0, 14);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(460, 180, 0, 0);

        jButton4.setBorder(null);
        getContentPane().add(jButton4);
        jButton4.setBounds(250, 320, 1, 1);

        jButton5.setToolTipText("Sair Dessa Aba");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(1273, 0, 40, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/produtossssssss.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 1313, 700);

        setSize(new java.awt.Dimension(1313, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        String box = cbo_Tipo.getSelectedItem().toString();
        String clase =jTextField5.getText();
        
        //Apaga todas as linhas da tabela
                                                           
        try {
          FileWriter fw = new FileWriter("C:\\Arquivos do programa/"+clase+";.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            
           // pw.print(this.txt_Nombre.getText()+";");
           // pw.print(this.txt_descriçao.getText()+";");
          //  pw.println(this.txt_Codigo.getText());
          //  pw.println(this.cbo_Edad.getSelectedItem().toString();
            
            

           
           // pw.print(this.valores);
            pw.flush();
            pw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(RegistroDeCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
			//abre o arquivo
			FileReader fr = new FileReader("C:\\Arquivos de Programas/Gestão de Clientes/clase.txt");
			BufferedReader br = new BufferedReader(fr);
			String temp;
			//A cada interação, é uma linha do arquivo e atribui-a a temp
			while ((temp = br.readLine()) != null)
			{
				//Aqui gera a sua "lista". No caso, imprimi cada linha na tela.
				String[] a = temp.split(";");
				int i=0;
				for(String each : a)
				{
					/*if(i==0){
						nome=each;							
						System.out.println(nome);
					}*/
						/*if(i==1){
							data=each;
							//System.out.println(data);
                                                        jLabel9.setText(data);
						} 
						if(i==2){
							hora=each;
							i=-1;
							//System.out.println(hora);
                                                        txtMelhorHora.setText(hora);
                                                        
                                                        }*/
                                                if(i==0){
                                                        um=each;
                                                        i=-1;
                                                       //System.out.println(TOt);
                                                       if(box.toLowerCase().contains(um.toLowerCase()) == true){
                                                           System.out.print("esse nome contem no txt");
                                                           jTextField5.setText(um);
                                                           //String category = um+";";
                                                           
                                                           
                                                          //adicionar aqi
                                                       
                                                       }
                                                        
                                                        
                                                
                                                }
                                                        
						i++;
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
		}  
    
            
       /* mdlTabla = new DefaultTableModel();
        String codigo = txt_Codigo.getText();
        String nombre = txt_Nombre.getText();
        String descriçao = txt_Descriçao.getText();
        String edad = cbo_Edad.getSelectedItem().toString();
     //   String tipo = cbo_Tipo.getSelectedItem().toString();
       // String foto = jTextField2.getText();
        
            

       
        
        //int edad = Integer.parseInt(cbo_Edad.getSelectedItem().toString());
        
        alumno.setCodigo(codigo);
        alumno.setNombre(nombre);
        alumno.setEdad(edad);
        //alumno.setTipo(tipo);
        alumno.setDescriçao(descriçao);
      //  alumno.setFoto(foto);
        
        
        metodos.guardar(alumno);
        metodos.guardarArchivo(alumno);
        
        jTable1.setModel(metodos.listaAlunos() );
        
        txt_Codigo.setText("");
        txt_Nombre.setText("");
        txt_Codigo.setText("");
       // jTextField2.setText("");
       
        */
        
        
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_MostarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MostarListaActionPerformed
        //Cria um frame 
        JFrame frame = new JFrame("JOpitionPanne exemplo");
        
        String clase = JOptionPane.showInputDialog("Qual o nome da nova classe?"); 
        JOptionPane.showConfirmDialog(null, "a nova clase vai se chmar "+ clase);
        
        cbo_Tipo.addItem(clase);
        
        alumno.setClase(clase);
        
        metodos.guardar(alumno);
        metodos.sauvar(alumno);
        
                
        
      /*//Cria o JOpitionPane por ShowMessageDialog
        int resposta =JOptionPane.showInternalMessageDialog(frame, "escolha um"  JOptionPane.INFORMATION_MESSAGE);
        //verifica se a resposta é verdadeira
        if(resposta == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "óla");
        }
        else{
            JOptionPane.showMessageDialog(frame, "Adeus");
            System.exit(0);
        }
        System.exit(0);
        

        jTable1.setModel(metodos.listaAlunos() );
        imagemIcon(); */
        
    }//GEN-LAST:event_btn_MostarListaActionPerformed

    private void cbo_EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_EdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_EdadActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txt_DescriçaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DescriçaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DescriçaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    String box = cbo_Tipo.getSelectedItem().toString();
    
    String procurarPor ="+Adicionar Categoia";
    
    if(box.toLowerCase().contains(procurarPor.toLowerCase()) == true){
        
        
   String entrada  = JOptionPane.showInputDialog("Digite seu nome", "Digite aqui");
   
   MetodoDeCategorias metodoDeCategorias = new MetodoDeCategorias();
        
        metodoDeCategorias.setCategoria(entrada);
        
        try {
            JOptionPane.showMessageDialog(null, metodoDeCategorias.sauvado());  //Atençao
            // jTextField1.setText("");
            // texREs.setText("");
            
            
            /*   t.start();
            prgs.setValue(prgs.getValue()+10);
            
            t.stop(); */
        } catch (IOException ex) {
            Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   
   System.out.println("O nome digitado foi "+ entrada);
   
   File f = new File("C:\\Arquivos do programa/"+entrada+";.txt");
	try {
		f.createNewFile();
	} catch (IOException e) {
		e.printStackTrace();
	}
        try {
          FileWriter fw = new FileWriter("C:\\Arquivos de Programas/Gestão de Clientes/"+entrada+";.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Lanche,obersarvação,valor");

           
           // pw.print(this.valores);
            pw.flush();
            pw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(RegistroDeCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Recarrega um Cobo box ao ser criado nova clase
         // jTable1.setModel(metodos.listaAlunos() );
        File arquivo = new File("C:\\Arquivos de Programas/Gestão de Clientes/clase.txt");
        
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            
            String linha = br.readLine();
            
            
           cbo_Tipo.addItem("+Adicionar Categoia");
            while (linha != null) {
               cbo_Tipo.addItem(linha);
                
               linha = br.readLine();
            }
            
        } catch (Exception ex) {
            Logger.getLogger(frm_GuardarDados.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }else{
     try {
			//abre o arquivo
			FileReader fr = new FileReader("C:\\Arquivos de Programas/Gestão de Clientes/clase.txt");
			BufferedReader br = new BufferedReader(fr);
			String temp;
			//A cada interação, é uma linha do arquivo e atribui-a a temp
			while ((temp = br.readLine()) != null)
			{
				//Aqui gera a sua "lista". No caso, imprimi cada linha na tela.
				String[] a = temp.split(";");
				int i=0;
				for(String each : a)
				{
					/*if(i==0){
						nome=each;							
						System.out.println(nome);
					}*/
						/*if(i==1){
							data=each;
							//System.out.println(data);
                                                        jLabel9.setText(data);
						} 
						if(i==2){
							hora=each;
							i=-1;
							//System.out.println(hora);
                                                        txtMelhorHora.setText(hora);
                                                        
                                                        }*/
                                                if(i==0){
                                                        um=each;
                                                        i=-1;
                                                       //System.out.println(TOt);
                                                       if(box.toLowerCase().contains(um.toLowerCase()) == true){
                                                           System.out.print("esse nome contem no txt");
                                                           jTextField5.setText(um);
                                                           //String category = um+";";
                                                           
                                                           //Apaga todas as linhas da tabela
                                                         
                                                          //prencher tabela 
                                                           //
                                                       
                                                       }
                                                        
                                                        
                                                
                                                }
                                                        
						i++;
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
		}  
    }
      //metodo de pesquisa  
       /* DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
      TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
      jTable1.setRowSorter(tr);
      tr.setRowFilter(RowFilter.regexFilter(jTextField1.getText().trim())); */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//jTable1.setSize(1, 1);
       // jTable1.setVisible(false);
       // jScrollPane1.setSize(1, 1);
       // jTable1.setVisible(false);
    	
    	

        //TOTAL DE CLIENTES 
     /*  LineNumberReader lnr = null;
        try {
            String filePath = ("C:\\Arquivos do programa/clase.txt");
            File file = new File(filePath);
            lnr = new LineNumberReader(new FileReader(file));
            try {
                lnr.skip(Long.MAX_VALUE);
            } catch (IOException ex) {
                Logger.getLogger(TelaRelatorioCistema.class.getName()).log(Level.SEVERE, null, ex);
            }
            int retorno = lnr.getLineNumber();
            String rere = Integer.toString(retorno);
            System.out.print(rere);
           // jLabel10.setText(rere);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TelaRelatorioCistema.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                lnr.close();
            } catch (IOException ex) {
                Logger.getLogger(TelaRelatorioCistema.class.getName()).log(Level.SEVERE, null, ex);
            }
        } */
        
        
  
        
        
     
        
       // jTable1.setModel(metodos.listaAlunos() );
        File arquivo = new File("C:\\Arquivos de Programas/Gestão de Clientes/clase.txt");
        
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            
            String linha = br.readLine();
            
           cbo_Tipo.addItem("Selecione uma Categoria");
           cbo_Tipo.addItem("                                                                    +Adicionar Categoia");
            while (linha != null) {
               cbo_Tipo.addItem(linha);
                
               linha = br.readLine();
            }
            
        } catch (Exception ex) {
            Logger.getLogger(frm_GuardarDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     //   String box1 = cbo_Tipo.getSelectedItem().toString();
      //  jLabel9.setText(box1);
        
        
      
      //LISTA DOS CLIENTES
        
     //   String box1 = cbo_Tipo.getSelectedItem().toString();
      //  jLabel9.setText(box1);
        
        
      
      //LISTA DOS CLIENTES

        
        
      
    }//GEN-LAST:event_formWindowOpened

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        JFileChooser arquivo = new JFileChooser();
            arquivo.setDialogTitle("Selecione uma foto");
            arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        int opc = arquivo.showOpenDialog(this);
        if(opc == JFileChooser.APPROVE_OPTION) {
            File file = new File("Caminho");
            file=arquivo.getSelectedFile(); //RECEBE O CAMINHO
            String filename = file.getAbsolutePath();
            //jTextField2.setText(filename);
            
            
            
            ImageIcon imagem = new ImageIcon(arquivo.getSelectedFile().getPath());
            jLabel8.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_DEFAULT)));
        }
        
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        //System.exit(0);






    }//GEN-LAST:event_formMouseClicked

    private void cbo_TipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_TipoMouseClicked

        
        jTable2.setSize(570, 460);
jScrollPane2.setSize(570, 460);
        
        
   String categoria = jTextField5.getText();
   while (jTable2.getModel().getRowCount() > 0) {
((DefaultTableModel) jTable2.getModel()).removeRow(0);
}
   
        try{

             String filePath = ("C:\\Arquivos de Programas/Gestão de Clientes/"+categoria+";.txt");
        File file = new File(filePath);
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
            
            
            model.setColumnIdentifiers(columnsName);
            
              
            Object[] tableLines = br.lines().toArray();
            //model.addRow(tableLines);
            
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(";");
            //    integer[] valoresint = new integer(dataRow.length);
                model.addRow(dataRow);
             }
            
        }catch (Exception ex) {
            Logger.getLogger(PaginaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      //  TabelaInterna tela = new TabelaInterna();
    //    jDesktopPane1.add(tela);
        
        
        
        jButton3.setText("Adicionar Produto");
        jButton3.setBackground(new java.awt.Color(240,240,240));
   
    
    
        
      
        
        
        
        

        String box1 = cbo_Tipo.getSelectedItem().toString();
        jLabel9.setText(box1);
        
  if (evt.getButton() == MouseEvent.BUTTON3) {
                        int dialogButton = JOptionPane.YES_NO_OPTION;
            JOptionPane.showConfirmDialog (null, "voce tem certeza qu que apagar?","WARNING", dialogButton);
            if(dialogButton == JOptionPane.YES_OPTION) {
                File file = new File("C:\\Arquivos de Programas/Gestão de Clientes/clase.txt");
       
        try {
        FileReader fr = new FileReader(file); 
        BufferedReader br = new BufferedReader(fr);
       
        
        String linha = br.readLine();
        ArrayList<String> salvar = new ArrayList();
        while(linha != null){
            
           

            
            String lanche = jTextField5.getText();
            
            
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
        
        String lanche = jTextField5.getText();
        
        


        
        ((DefaultComboBoxModel) cbo_Tipo.getModel()).removeElementAt(cbo_Tipo.getSelectedIndex());
        
            if(dialogButton == JOptionPane.NO_OPTION) {
                  
                }
              }     
      
      
      
                    }
      
      
      
      
     
        
        
    }//GEN-LAST:event_cbo_TipoMouseClicked

    private void cbo_TipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_TipoMousePressed
       // String box1 = cbo_Tipo.getSelectedItem().toString();
       // jLabel9.setText(box1);
    }//GEN-LAST:event_cbo_TipoMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        /*
        if(jTable.getSelectedRow() != -1){
        
        System.out.print("Linha selecionada: "+jTable1.getSelectedColumn());
            
        DefaultTableModel dmz = (DefaultTableModel)jTable1.getModel();
        dmz.removeRow(jTable1.getSelectedRow());
 
         File file = new File("C:\\Arquivos do programa/Alumnos.txt");
       
        try {
        FileReader fr = new FileReader(file); 
        BufferedReader br = new BufferedReader(fr);
       
        
        String linha = br.readLine();
        ArrayList<String> salvar = new ArrayList();
        while(linha != null){
            
            String nome = jTextField2.getText();
            String tamanho = jTextField3.getText();
            String valor =jTextField4.getText();
            
            
            if(linha.equals(nome+";"+tamanho+";"+valor) == false){
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
        }  */
        

     
              
  
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void cbo_TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_TipoActionPerformed
 
        
          String boxy = cbo_Tipo.getSelectedItem().toString();
    
    String procurarPorr ="Selecione uma Categoria";
    
    if(boxy.toLowerCase().contains(procurarPorr.toLowerCase()) == true){}
    else{
        
      
      
        
   String categoria = jTextField5.getText();
   while (jTable2.getModel().getRowCount() > 0) {
((DefaultTableModel) jTable2.getModel()).removeRow(0);
}
        try{
             String filePath = ("C:\\Arquivos de Programas/Gestão de Clientes/"+categoria+";.txt");
        File file = new File(filePath);
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
         //   DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            
            
          //  model.setColumnIdentifiers(columnsName);
            
              
            Object[] tableLines = br.lines().toArray();
            //model.addRow(tableLines);
            
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(";");
            //    integer[] valoresint = new integer(dataRow.length);
             //   model.addRow(dataRow);
             }
            
        }catch (Exception ex) {
            Logger.getLogger(PaginaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      //  TabelaInterna tela = new TabelaInterna();
    //    jDesktopPane1.add(tela);
        
        
        
        jButton3.setText("Adicionar Produto");
        jButton3.setBackground(new java.awt.Color(240,240,240));
   
    
    }
       
         
      
        
        
        
        String box = cbo_Tipo.getSelectedItem().toString();
    
    String procurarPor ="                                                                    +Adicionar Categoia";
    
    if(box.toLowerCase().contains(procurarPor.toLowerCase()) == true){
        
        
   String entrada  = JOptionPane.showInputDialog("Digite o nome da nova Categoria", "Digite aqui");
   
   MetodoDeCategorias metodoDeCategorias = new MetodoDeCategorias();
        
        metodoDeCategorias.setCategoria(entrada);
        
        try {
            JOptionPane.showMessageDialog(null, metodoDeCategorias.sauvado());  //Atençao
            // jTextField1.setText("");
            // texREs.setText("");
            
            
            /*   t.start();
            prgs.setValue(prgs.getValue()+10);
            
            t.stop(); */
        } catch (IOException ex) {
            Logger.getLogger(PerfilDoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   
   System.out.println("O nome digitado foi "+ entrada);
   
   File f = new File("C:\\Arquivos do programa/"+entrada+";.txt");
	try {
		f.createNewFile();
	} catch (IOException e) {
		e.printStackTrace();
	}
        try {
          FileWriter fw = new FileWriter("C:\\Arquivos de Programas/Gestão de Clientes/"+entrada+";.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Lanche,obersarvação,valor");

           
           // pw.print(this.valores);
            pw.flush();
            pw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(RegistroDeCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Recarrega um Cobo box ao ser criado nova clase
         // jTable1.setModel(metodos.listaAlunos() );
         cbo_Tipo.removeAll();
         cbo_Tipo.setSelectedItem(null); 
        File arquivo = new File("C:\\Arquivos de Programas/Gestão de Clientes/clase.txt");
        
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            
            String linha = br.readLine();
            
            
           cbo_Tipo.addItem("+Adicionar Categoia");
            while (linha != null) {
               cbo_Tipo.addItem(linha);
                
               linha = br.readLine();
            }
            
        } catch (Exception ex) {
            Logger.getLogger(frm_GuardarDados.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }else{ 
      //jButton3.setBackground(new java.awt.Color(0,0,0));
     try {
			//abre o arquivo
			FileReader fr = new FileReader("C:\\Arquivos de Programas/Gestão de Clientes/clase.txt");
			BufferedReader br = new BufferedReader(fr);
			String temp;
			//A cada interação, é uma linha do arquivo e atribui-a a temp
			while ((temp = br.readLine()) != null)
			{
				//Aqui gera a sua "lista". No caso, imprimi cada linha na tela.
				String[] a = temp.split(";");
				int i=0;
				for(String each : a)
				{
					/*if(i==0){
						nome=each;							
						System.out.println(nome);
					}*/
						/*if(i==1){
							data=each;
							//System.out.println(data);
                                                        jLabel9.setText(data);
						} 
						if(i==2){
							hora=each;
							i=-1;
							//System.out.println(hora);
                                                        txtMelhorHora.setText(hora);
                                                        
                                                        }*/
                                                if(i==0){
                                                        um=each;
                                                        i=-1;
                                                       //System.out.println(TOt);
                                                       if(box.toLowerCase().contains(um.toLowerCase()) == true){
                                                           System.out.print("esse nome contem no txt");
                                                           jTextField5.setText(um);
                                                           //String category = um+";";
                                                           
                                                           //Apaga todas as linhas da tabela
                                                           
                                                          //prencher tabela 
                                                          // PrencherTabela();
                                                           //CriarTabela();
                                                           
        
                                                          // jButton3.setBackground(new java.awt.Color(240,240,240));
                                                          // jButton3.setText("Adicionar Produto");
   String categoria = jTextField5.getText();
        try{
             String filePath = ("C:\\Arquivos de Programas/Gestão de Clientes/"+categoria+";.txt");
        File file = new File(filePath);
            
            BufferedReader brr = new BufferedReader(new FileReader(file));
            String firstLine = brr.readLine().trim();
            String[] columnsName = firstLine.split(",");
            //DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            
            
          //  model.setColumnIdentifiers(columnsName);
            
              
            Object[] tableLines = brr.lines().toArray();
            //model.addRow(tableLines);
            
            for(int ri = 0; ri < tableLines.length; ri++)
            {
                String line = tableLines[ri].toString().trim();
                String[] dataRow = line.split(";");
            //    integer[] valoresint = new integer(dataRow.length);
            ///    model.addRow(dataRow);
             }
            
        }catch (Exception ex) {
            Logger.getLogger(PaginaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      //  TabelaInterna tela = new TabelaInterna();
    //    jDesktopPane1.add(tela);
        
        
        
  //------------------------------------------------------verificar-------------------------------      
 /*  JInternalFrame tela = new JInternalFrame();
 //TabelaInterna tela = new TabelaInterna();
 tela.setSize(570,460);
       // tela.setUndecorated(true);
        tela.add(new JScrollPane(jTable));
     //   jFrame.setVisible(true);
     //   jFrame.setVisible(true);
       // jFrame.setLocationRelativeTo(null);
jDesktopPane1.add(tela);
tela.show();
               */                                           
                                                           
                                                           
                                                       }
                                                        
                                                        
                                                
                                                }
                                                        
						i++;
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
		}  
    }        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_TipoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   String lanche  = JOptionPane.showInputDialog("Nome do lanche", "Digite aqui");
   String obiservasoes  = JOptionPane.showInputDialog("Tamanho do lanche", "Digite aqui");
   String valor  = JOptionPane.showInputDialog("Digite o valor", "Digite aqui");
   
   String clase =jTextField5.getText();
   String box = cbo_Tipo.getSelectedItem().toString();
  
   
   try {
          FileWriter fw = new FileWriter("C:\\Arquivos de Programas/Gestão de Clientes/"+clase+";.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.print(lanche+";");
            pw.print(obiservasoes+";");
            pw.println(valor);
          //  pw.println(this.cbo_Edad.getSelectedItem().toString();
            
            

           
           // pw.print(this.valores);
            pw.flush();
            pw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(RegistroDeCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
			//abre o arquivo
			FileReader fr = new FileReader("C:\\Arquivos de Programas/Gestão de Clientes/clase.txt");
			BufferedReader br = new BufferedReader(fr);
			String temp;
			//A cada interação, é uma linha do arquivo e atribui-a a temp
			while ((temp = br.readLine()) != null)
			{
				//Aqui gera a sua "lista". No caso, imprimi cada linha na tela.
				String[] a = temp.split(";");
				int i=0;
				for(String each : a)
				{
					/*if(i==0){
						nome=each;							
						System.out.println(nome);
					}*/
						/*if(i==1){
							data=each;
							//System.out.println(data);
                                                        jLabel9.setText(data);
						} 
						if(i==2){
							hora=each;
							i=-1;
							//System.out.println(hora);
                                                        txtMelhorHora.setText(hora);
                                                        
                                                        }*/
                                                if(i==0){
                                                        um=each;
                                                        i=-1;
                                                       //System.out.println(TOt);
                                                       if(box.toLowerCase().contains(um.toLowerCase()) == true){
                                                           System.out.print("esse nome contem no txt");
                                                           jTextField5.setText(um);
                                                           //String category = um+";";
                                                           
                                                           
                                                          //prencher tabela 
                                                       //    PrencherTabela();
                                                       
                                                       }
                                                        
                                                        
                                                
                                                }
                                                        
						i++;
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
		}  
    
       
   String categoria = jTextField5.getText();
   while (jTable2.getModel().getRowCount() > 0) {
((DefaultTableModel) jTable2.getModel()).removeRow(0);
}
        try{
             String filePath = ("C:\\Arquivos de Programas/Gestão de Clientes/"+categoria+";.txt");
        File file = new File(filePath);
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
            
            
            model.setColumnIdentifiers(columnsName);
            
              
            Object[] tableLines = br.lines().toArray();
            //model.addRow(tableLines);
            
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(";");
            //    integer[] valoresint = new integer(dataRow.length);
                model.addRow(dataRow);
             }
            
        }catch (Exception ex) {
            Logger.getLogger(PaginaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      //  TabelaInterna tela = new TabelaInterna();
    //    jDesktopPane1.add(tela);
        
        
      //  JFrame jFrame = new JFrame();
        
        
       // if (!jFrame.isVisible()) { jFrame.setVisible(true); }
       // jFrame.setSize(570,460);
     //   jFrame.setUndecorated(true);
     //   jFrame.add(new JScrollPane(jTable));
     //   jFrame.setVisible(true);
     //   jFrame.setVisible(true);
     //   jFrame.setLocationRelativeTo(null);
        
  

            
       /* mdlTabla = new DefaultTableModel();
        String codigo = txt_Codigo.getText();
        String nombre = txt_Nombre.getText();
        String descriçao = txt_Descriçao.getText();
        String edad = cbo_Edad.getSelectedItem().toString();
     //   String tipo = cbo_Tipo.getSelectedItem().toString();
       // String foto = jTextField2.getText();
        
            

       
        
        //int edad = Integer.parseInt(cbo_Edad.getSelectedItem().toString());
        
        alumno.setCodigo(codigo);
        alumno.setNombre(nombre);
        alumno.setEdad(edad);
        //alumno.setTipo(tipo);
        alumno.setDescriçao(descriçao);
      //  alumno.setFoto(foto);
        
        
        metodos.guardar(alumno);
        metodos.guardarArchivo(alumno);
        
        jTable1.setModel(metodos.listaAlunos() );
        
        txt_Codigo.setText("");
        txt_Nombre.setText("");
        txt_Codigo.setText("");
       // jTextField2.setText("");
       
        */
        
        
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        jTextField6.setText(jTable2.getModel().getValueAt(jTable2.getSelectedRow(),0).toString()); // Nome
        jTextField7.setText(jTable2.getModel().getValueAt(jTable2.getSelectedRow(),1).toString()); // Nome
        jTextField8.setText(jTable2.getModel().getValueAt(jTable2.getSelectedRow(),2).toString()); // Nome
        
        if (evt.getButton() == MouseEvent.BUTTON3) {
           if(jTable2.getSelectedRow() != -1){
        
        System.out.print("Linha selecionada: "+jTable2.getSelectedColumn());
            
        DefaultTableModel dmz = (DefaultTableModel)jTable2.getModel();
        dmz.removeRow(jTable2.getSelectedRow());
 String clase = jTextField5.getText();
        File file = new File("C:\\Arquivos de Programas/Gestão de Clientes/"+clase+";.txt");
       
        try {
        FileReader fr = new FileReader(file); 
        BufferedReader br = new BufferedReader(fr);
       
        
        String linha = br.readLine();
        ArrayList<String> salvar = new ArrayList();
        while(linha != null){
            

                    
            String nome = jTextField6.getText();//1
            String data = jTextField7.getText();//2
            String valor =jTextField8.getText();//6
            
           
            
            
 
            if(linha.equals(nome+";"+data+";"+valor) == false){
                salvar.add(linha);
                JOptionPane.showInputDialog(null, nome+";"+data+";"+valor);
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
        
        }
        
        
        
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(frm_GuardarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_GuardarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_GuardarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_GuardarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_GuardarDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_MostarLista;
    private javax.swing.JComboBox<String> cbo_Edad;
    private javax.swing.JComboBox<String> cbo_Tipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField txt_Descriçao;
    // End of variables declaration//GEN-END:variables

    private FileReader FileReader(String cArquivos_do_programaclasetxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
