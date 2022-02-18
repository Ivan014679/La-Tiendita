/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import prueba.Productos;

/**
 *
 * @author PERSONAL
 */
public class Conectar {

    /* conexion a la bd*/
    private Connection dbconeccion;

    /*sentencias bd*/
    
    private PreparedStatement guardarusuario;
    private PreparedStatement guardarproducto;
    private PreparedStatement guardarproveedor;
    
    private PreparedStatement editarusuario;
    private PreparedStatement editarproduc;
    private PreparedStatement pagar;
    
    private PreparedStatement ingresrusuario;
    private PreparedStatement consultarusuarios;
    public PreparedStatement mostrartabla;
    public PreparedStatement mostrarusu;
    public PreparedStatement cantidadPro;
    public PreparedStatement guardarVenta;
    public PreparedStatement VerificarCodPro;
    
    
    public Conectar() {
        conexion();
        
    }
    
    private void conexion(){
        
        
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String password = "ESTEBAN2013";
        String user = "postgres";
        
        try {
            Class.forName("org.postgresql.Driver");

            dbconeccion = DriverManager.getConnection(url, user, password);
            
            Statement stm = dbconeccion.createStatement();
            
            //preparar las consultas o sentencias
            guardarusuario=dbconeccion.prepareStatement("insert into usuarios (cedulausu,nomusu,telusu,contraseñausu) values (?,?,?,?);");
            guardarproducto=dbconeccion.prepareStatement("insert into productos (codpro,nompro,codprov,cedulausu,cantpro,valorpro,stockmax,stockmin)values (?,?,?,?,?,?,?,?);");
            guardarproveedor=dbconeccion.prepareStatement("insert into proveedores (codprov,nomprov,marcaprov,telprov)values (?,?,?,?);");
            
            editarusuario=dbconeccion.prepareStatement("update usuarios set cedulausu=?,nomusu=?,telusu=?,contraseñausu=? where cedulausu = ?;");
            editarproduc=dbconeccion.prepareStatement("update productos set codpro=?,nompro=?,cantpro=?,valorpro=?,stockmax=?,stockmin=?where codpro= ?;");
            pagar=dbconeccion.prepareStatement("update productos set cantpro=? where codpro=?");
            
            consultarusuarios=dbconeccion.prepareStatement("select * from usuarios;");
            ingresrusuario=dbconeccion.prepareStatement("select contraseñausu, nomusu from usuarios where nomusu = ? and contraseñausu= ?;");
            mostrartabla=dbconeccion.prepareStatement("select codpro, nompro, cantpro, valorpro, stockmax, stockmin from productos;");
            mostrarusu=dbconeccion.prepareStatement("select cedulausu, nomusu, telusu ,contraseñausu from usuarios;");
            cantidadPro=dbconeccion.prepareStatement("Select cantpro from productos where codpro = ?;");
            
            guardarVenta=dbconeccion.prepareStatement("insert into ventas (codven,codpro,nomusu,tatpag) values(?,?,?,?);");
            VerificarCodPro=dbconeccion.prepareStatement("select codprov from proveedores where codprov = ?;");
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String editarProcducto (String cod, String pro, int cantpro, int valorpro, int stockmax , int stockmin,String cod1){
        String msn="";
        try{
        //establesco los valores para la sentencia
            editarproduc.setString(1, cod);
            editarproduc.setString(2, pro);
            editarproduc.setInt(3, cantpro);
            editarproduc.setInt(4, valorpro);
            editarproduc.setInt(5, stockmax);
            editarproduc.setInt(6, stockmin);
            editarproduc.setString(7, cod1);
            //ejecutar la sentencia 
            editarproduc.execute();
            msn="Exito";
       }catch(SQLException ex){
            ex.printStackTrace();
            msn=ex.toString();
        }
        return msn;
    }
    public String editarUsuario(String ced, String user, String tel , String pass, String ced1){
        
        String msn="";
        try{
            //establesco los valores para la sentencia
            editarusuario.setString(1, ced);
            editarusuario.setString(2, user);
            editarusuario.setString(3, tel);
            editarusuario.setString(4, pass);
            editarusuario.setString(5, ced1);
            //ejecutar la sentencia 
            editarusuario.execute();
            //verificar si se guardo
            msn="exito";
            
        }catch(SQLException ex){
            ex.printStackTrace();
            msn=ex.toString();
        }
        
        return msn;
    }
    private void destroyDB(){
        try{
            //cierro las sentencias
            guardarusuario.close();
            guardarproducto.close();
            guardarproveedor.close();
            editarusuario.close();
            consultarusuarios.close();
            mostrarusu.close();
            
            //cierra la conexion con la bd
            dbconeccion.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public String guardarUsuario(String ced, String user, String tel , String pass){
        
        String msn="";
        try{
            //establesco los valores para la sentencia
            guardarusuario.setString(1, ced);
            guardarusuario.setString(2, user);
            guardarusuario.setString(3, tel);
            guardarusuario.setString(4, pass);
            //ejecutar la sentencia 
            guardarusuario.execute();
            //verificar si se guardo
            msn="exito";
            
        }catch(SQLException ex){
            ex.printStackTrace();
            msn=ex.toString();
        }
        
        return msn;
    }
    public String guardarProveedor (String cod, String nom,String marca, String tel){
        String msn="";
        try {
        guardarproveedor.setString(1, cod);
        guardarproveedor.setString(2, nom);
        guardarproveedor.setString(3, marca);
        guardarproveedor.setString(4, tel);
        guardarproveedor.execute();
                msn="exito al conectar";
        
        
        } catch(SQLException ex){
            ex.printStackTrace();
            msn=ex.toString();
        }    
        return msn;
    }
//    public int cantidadProducto(String cod){
//         int resultado=0;
//        try {
//            cantidadPro.setString(1, cod);
//            ResultSet k = cantidadPro.executeQuery();
//            resultado=k.geti;
//            
//        } catch (Exception ex) {
//            ex.printStackTrace();
//           
//        }
//        return resultado;
//    }

    public String guardarPro(String cod, String pro, String codprov, String cedulausu, int cantpro, int valorpro, int stockmax , int stockmin){
        
        String msn="";
        try{
            
            //establesco los valores para la sentencia
            guardarproducto.setString(1, cod);
            guardarproducto.setString(2, pro);
            guardarproducto.setString(3, codprov);
            guardarproducto.setString(4, cedulausu);
            guardarproducto.setInt(5, cantpro);
            guardarproducto.setInt(6, valorpro);
            guardarproducto.setInt(7, stockmax);
            guardarproducto.setInt(8, stockmin);
            //ejecutar la sentencia 
            guardarproducto.execute();
            //verificar si se guardo
            msn="exito";
            
        }catch(SQLException ex){
            ex.printStackTrace();
            msn=ex.toString();
        }
        
        return msn;
    }
    
    public boolean ingresarUsu(String nom, String pasword){
        boolean estado=false;
        try{ 
            ingresrusuario.setString(1, nom);
             ingresrusuario.setString(2, pasword);
             ResultSet srr= ingresrusuario.executeQuery();
             if(srr.next()){
                 estado=true;
             }else estado=false;
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return estado;
    }
    public boolean verificarCodPro(String codigo ){
        boolean estado=false;
        try{ 
             VerificarCodPro.setString(1, codigo);
             ResultSet rs= ingresrusuario.executeQuery();
             if(rs.next()){
                 estado=true;
             }else estado=false;
            
        }catch(SQLException ex){
            ex.printStackTrace();
           
            
        }
        
        return estado;
    }
    public String pagar (int cantpro,String cod){
        String msn="";
        try {
        pagar.setInt(1, cantpro);
        pagar.setString(2, cod);

        pagar.execute();
                msn="exito al conectar";
        
        
        } catch(SQLException ex){
            ex.printStackTrace();
            msn=ex.toString();
        }    
        return msn;
    }
    public String guardarventa (String codven, String codpro, String nomusu, double totpag){
        String msn="";
        try {
        guardarVenta.setString(1, codven);
        guardarVenta.setString(2, codpro);
        guardarVenta.setString(3, nomusu);
        guardarVenta.setDouble(4, totpag);
        guardarVenta.execute();
                msn="exito al conectar";
        
        
        } catch(SQLException ex){
            ex.printStackTrace();
            msn=ex.toString();
        }    
        return msn;
    }

    
}