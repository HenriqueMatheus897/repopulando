
package metodos;

import aluno.Alumno;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.omg.CORBA.BAD_CONTEXT;


public class Metodos {
    
    Vector vPrincipal = new Vector();
    
    // Procedimento para guardar dados em 1 vector
    public void guardar(Alumno unAlumno) {
        vPrincipal.addElement(unAlumno);
    }
    
    //Proceminto para guardar en arquivo txt
    public void guardarArchivo(Alumno alumno) {
        try {
            FileWriter fw = new FileWriter("C:\\Arquivos de Programas/Gestão de Clientes/Alumnos.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(alumno.getNombre());
            pw.print(";"+alumno.getEdad());
           // pw.print("|"+alumno.getTipo());
          //  pw.print("|"+alumno.getDescriçao());
            pw.println(";"+alumno.getCodigo());
           // pw.print("|"+alumno.getFoto());
           // pw.println("|"+alumno.getClase());
            pw.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    //para quardar a clase do produto

  public void sauvar(Alumno alumno){
    try{
      FileWriter fw = new FileWriter("C:\\Arquivos do programa/clase.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(alumno.getClase());
            pw.close();
  } catch (IOException e){
  JOptionPane.showMessageDialog(null, e);
  }
  }
    
    
    //Funcion para Mostrar los datos en un  JTable
    public DefaultTableModel listaAlunos() {
        Vector cabeceras = new Vector();
        cabeceras.addElement("Nome");
        cabeceras.addElement("Tamanho");
       // cabeceras.addElement("Tipo");
       // cabeceras.addElement("Descrição");
        cabeceras.addElement("Valor");
        
        //Cramos um cector que contenga CODIGO, NOMBRE, EDAD 
        //Creamos um modelo de tabla para agregar el vector, en la ubicacion 0
        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
        
        try {
            FileReader fr = new FileReader("C:\\Arquivos do programa/Alumnos.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d= br.readLine())!=null){
                StringTokenizer dato = new StringTokenizer(d,";" );
                Vector x = new Vector();
                while(dato.hasMoreTokens()){
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return mdlTabla;
        
    }
    

    // Procediminto para poblar un JComboBox con las EDADES
    public void cboEdad (JComboBox edades){
        edades.removeAllItems();
        
        edades.addItem("pequeno");
        edades.addItem("Medio");
        edades.addItem("Grade");
        /*for(int x =18; x < 60 ; x++){
            edades.addItem(x);*/       
    } 
    /*public void cboTipo (JComboBox edades){
        edades.removeAllItems();
        
        edades.addItem("Pão americano");
        edades.addItem("Pão italiano");
        edades.addItem("Grade");
        edades.addItem("Brioche");
        edades.addItem("Pão australiano");
        edades.addItem("Pão de azeite");
        edades.addItem("Pão de cebola");
        /*for(int x =18; x < 60 ; x++){
            edades.addItem(x);*/       
   // }*/
    
    
}

