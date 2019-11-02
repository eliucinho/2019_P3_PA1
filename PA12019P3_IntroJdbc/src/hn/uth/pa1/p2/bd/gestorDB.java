/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.p2.bd;

import hn.uth.pa1.p2.objetos.Humano;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author uth
 */
public class gestorDB {

    public static Connection getConexion()
            throws Exception {
        try {
            String url = "jdbc:derby://localhost:1527/uthDB";
            String usuario = "uth";
            String contrasenia = "uth";

            return DriverManager
                    .getConnection(url,
                            usuario,
                            contrasenia);
        } catch (Exception e) {
            throw new Exception("No se pudo establecer la conexión: " + e.toString());
        }

    }

    public static void guardarHumano(Humano humano) {
        try {
            Connection con = getConexion();
            String sql = "INSERT INTO HUMANOS "
                    + " (IDENTIDAD, NOMBRE, APELLIDO,ANIO_NACIMIENTO,DIRECCION) "
                    + " VALUES (?,?,?,?,?) ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, humano.getIdentidad());
            ps.setString(2, humano.getNombre());
            ps.setString(3, humano.getApellido());
            ps.setInt(4, humano.getAnioNacimiento());
            ps.setString(5, humano.getDireccion());

            ps.execute();

            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error guardarHumano: "
                    + e.toString());
        }
    }

    public static void actualizarHumano(Humano humano) {
        try {
            Connection con = getConexion();
            String sql = "UPDATE  HUMANOS "
                    + "SET NOMBRE=? "
                    + ", APELLIDO =? "
                    + ",ANIO_NACIMIENTO=? "
                    + ",DIRECCION=? "
                    + "WHERE IDENTIDAD=? ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(5, humano.getIdentidad());
            ps.setString(1, humano.getNombre());
            ps.setString(2, humano.getApellido());
            ps.setInt(3, humano.getAnioNacimiento());
            ps.setString(4, humano.getDireccion());

            ps.executeUpdate();

            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error guardarHumano: "
                    + e.toString());
        }
    }

    public static void eliminarHumano(Humano humano) {
        try {
            Connection con = getConexion();
            String sql = "DELETE FROM HUMANOS "
                    + "WHERE IDENTIDAD=? ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, humano.getIdentidad());

            ps.execute();

            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error guardarHumano: "
                    + e.toString());
        }
    }

    public static List<Humano> getHumanos() {
        try {
            List<Humano> lista = new ArrayList<>();
            Connection con = getConexion();
            String sql = "SELECT *  FROM HUMANOS ";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                lista.add(
                        new Humano(
                                rs.getString("IDENTIDAD"),
                                 rs.getString("NOMBRE"),
                                 rs.getString("APELLIDO"),
                                 rs.getInt("ANIO_NACIMIENTO"),
                                 rs.getString("DIRECCION")));
            }
            rs.close();
            st.close();
            con.close();

            return lista;
        } catch (Exception e) {
            System.out.println("Error guardarHumano: "
                    + e.toString());
        }
        return null;
    }
}
