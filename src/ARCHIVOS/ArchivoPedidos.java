package ARCHIVOS;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class ArchivoPedidos {
    
     public void GuardarDatos(String Id, String fecha, String Idcliente, String valorPedido, String valorItbis, String valorPropinaP, String concepto, String IdCamarero, String IdMesaP) throws IOException {

        try {
            FileWriter F1 = new FileWriter("Pedidos.txt", true);

            PrintWriter pw = new PrintWriter(F1);
            pw.println(Id + "; " + fecha + "; " + Idcliente + "; " + valorPedido + "; " + valorItbis + "; " +valorPropinaP + "; " +concepto  + "; " + IdCamarero + "; " +IdMesaP);
            pw.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al grabar Archivo" + ex);
        }
    }


    public void Modificar(String LineaAntigua, String nuevalinea) {

        File Fnuevo = new File("archivo10.txt");
        File FAntiguo = new File("Pedidos.txt");
        String aCadena = LineaAntigua;
        String nCadena = nuevalinea;

        BufferedReader br;

        try {
            if (FAntiguo.exists()) {
                br = new BufferedReader(new FileReader(FAntiguo));

                String linea;

                while ((linea = br.readLine()) != null) {
                    if (linea.equals(aCadena)) {
                        Escribir(Fnuevo, nCadena);
                    } else {
                        Escribir(Fnuevo, linea);
                    }
                }

                br.close();

                String nAntiguo = FAntiguo.getName();
                Eliminar(FAntiguo);
                Fnuevo.renameTo(FAntiguo);
            } else {
                System.out.println("El Fichero no Existe");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void Escribir(File fFichero, String cadena) {
        BufferedWriter bw;

        try {
            if (!fFichero.exists()) {
                fFichero.createNewFile();
            }

            bw = new BufferedWriter(new FileWriter(fFichero, true));
            bw.write(cadena + "\r\n");
            bw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void Eliminar(File Ffichero) {
        try {
            if (Ffichero.exists()) {
                Ffichero.delete();
                System.out.println("Fichero Borrado");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
