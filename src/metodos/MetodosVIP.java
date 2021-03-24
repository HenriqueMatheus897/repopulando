/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import aluno.Alumno;
import aluno.AlumnoVIP;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author henrique matheus
 */
public class MetodosVIP {
    public void guardar(AlumnoVIP unAlumno) {
      //  vPrincipal.addElement(unAlumno);
    }
  //  public void guardarvip(AluminoVIP alunoVIP);
  
    public void guardarArchivo(AlumnoVIP alumno) {
    try {
            FileWriter fw = new FileWriter("C:\\Arquivos de Programas/Gestão de Clientes/vip.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(alumno.getNome());
            pw.print(";"+alumno.getEmail());
            pw.print(";"+alumno.getBairro());
            pw.print(";"+alumno.getNumero());
            pw.print(";"+alumno.getAniversario());
            pw.print(";"+alumno.getWhats());
            pw.print(";"+alumno.getCelular());
            pw.print(";"+alumno.getObiservaçoes());
            pw.println(";"+alumno.getEndereco());
            pw.close();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
    
    
}
