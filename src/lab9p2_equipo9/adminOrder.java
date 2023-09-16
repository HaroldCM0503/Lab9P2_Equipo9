package lab9p2_equipo9;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class adminOrder {

    private Dba admin;

    public adminOrder(Dba admin) {
        this.admin = admin;
    }

    public Dba getAdmin() {
        return admin;
    }

    public void setAdmin(Dba admin) {
        this.admin = admin;
    }

    public void agregarOrder(Order orden) {
        admin.conectar();
        try {
            admin.query.execute("INSERT INTO TenRecord"
                    + "([Row ID],[Order ID],[Order Date],[Ship Date],[Ship Mode],[Customer ID],[Customer Name],[Segment],[Country],[City],[State],[Postal Code],[Region],[Product ID],[Category],[Sub-Category],[Product Name],[Sales],[Quantity],[Discount],[Profit])"
                    + " VALUES('" + orden.getId()+","+orden.getOrderID() + "','"
                    + orden.getOrderDate() + "','"
                    + orden.getShipDate() + "','"
                    + orden.getShipMode() + "','"
                    + orden.getCustomerID() + "','"
                    + orden.getCustomerName() + "','"
                    + orden.getSegment() + "','"
                    + orden.getCountry() + "','"
                    + orden.getCity() + "','"
                    + orden.getState() + "','"
                    + orden.getPostalCode() + "','"
                    + orden.getRegion() + "','"
                    + orden.getProductID() + "','"
                    + orden.getCategory() + "','"
                    + orden.getSub_Category() + "','"
                    + orden.getProductName() + "','"
                    + orden.getSales() + "','"
                    + orden.getQuantity() + "','"
                    + orden.getDiscount() + "','"
                    + orden.getProfit() + "')"
            );
            admin.commit();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal! OOPS!");
            e.printStackTrace();
        }
        admin.desconectar();
    }

    public void listarOrders(JTextArea texto) {
        admin.conectar();
        try {
            admin.query.execute("SELECT a.[Order ID], a.[Order Date], a.[Ship Date], a.[Ship Mode], a.[Customer ID] FROM TenRecord a");
            ResultSet rs = admin.query.getResultSet();
            String lista = "";
            int cc = 1;
            while (rs.next()) {
                lista += "Order " + cc + "\n";
                lista += "Order ID: " + rs.getString(1) + "\n";
                lista += "Order Date: " + rs.getString(2) + "\n";
                lista += "Ship Date: " + rs.getString(3) + "\n";
                lista += "Ship Mode: " + rs.getString(4) + "\n";
                lista += "Customer ID: " + rs.getString(5) + "\n";
                lista += "\n";
                cc++;
            }
            texto.setText(lista);
            admin.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal! OOPS!");
        }
    }

    public void listarDetails(JTextArea texto) {
        admin.conectar();
        try {
            admin.query.execute("SELECT a.[Order ID], a.[Product ID], a.[Sales], a.[Quantity], a.[Discount], a.[Profit] FROM TenRecord a");
            ResultSet rs = admin.query.getResultSet();
            String lista = "";
            int cc = 1;
            while (rs.next()) {
                lista += "Details " + cc + "\n";
                lista += "Order ID: " + rs.getString(1) + "\n";
                lista += "Product ID: " + rs.getString(2) + "\n";
                lista += "Sales: " + rs.getString(3) + "\n";
                lista += "Quantity:" + rs.getString(4) + "\n";
                lista += "Discount: " + rs.getString(5) + "\n";
                lista += "Profit: " + rs.getString(6) + "\n";
                lista += "\n";
                cc++;
            }
            texto.setText(lista);
            admin.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal! OOPS!");
        }
    }

    public void listarCustomers(JTextArea texto) {
        admin.conectar();
        try {
            admin.query.execute("SELECT a.[Customer ID], a.[Customer Name], a.[Segment], a.[Country], a.[City], a.[State], a.[Postal Code], a.[Region] FROM TenRecord a");
            ResultSet rs = admin.query.getResultSet();
            String lista = "";
            int cc = 1;
            while (rs.next()) {
                lista += "Customer " + cc + "\n";
                lista += "Customer ID: " + rs.getString(1) + "\n";
                lista += "Customer Name: " + rs.getString(2) + "\n";
                lista += "Segment: " + rs.getString(3) + "\n";
                lista += "Country: " + rs.getString(4) + "\n";
                lista += "City: " + rs.getString(5) + "\n";
                lista += "State: " + rs.getString(6) + "\n";
                lista += "Postal Code: " + rs.getString(7) + "\n";
                lista += "Region: " + rs.getString(8) + "\n";
                lista += "\n";
                cc++;
            }
            texto.setText(lista);
            admin.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal! OOPS!");
        }
    }

    public void listarProducts(JTextArea texto) {
        admin.conectar();
        try {
            admin.query.execute("SELECT a.[Product ID], a.[Category], a.[Sub-Category], a.[Product Name] FROM TenRecord a");
            ResultSet rs = admin.query.getResultSet();
            String lista = "";
            int cc = 1;
            while (rs.next()) {
                lista += "Product " + cc + "\n";
                lista += "Product ID: " + rs.getString(1) + "\n";
                lista += "Category: " + rs.getString(2) + "\n";
                lista += "Sub-Category: " + rs.getString(3) + "\n";
                lista += "Product Name: " + rs.getString(4) + "\n";
                lista += "\n";
                cc++;
            }
            texto.setText(lista);
            admin.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal! OOPS!");
        }
    }

    public void EliminarTabla(JTable tabla) {
        DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
        
        int columna = tabla.getSelectedColumn();
        int columna2 = 0;
        int row = tabla.getSelectedRow();
        String nombre = tb.getValueAt(row, columna2).toString();
        admin.conectar();
        try {
            admin.query.execute("delete \n"
                    + "from TenRecord " + "\n"
                    + "where [Row ID] = " + "\'" + nombre + "\'");//ejecuta query
            ResultSet rs = admin.query.getResultSet();//tabla pero en memoria de java

        } catch (SQLException ex) {           
            JOptionPane.showMessageDialog(null, "Algo salio mal! OOPS!");
        }
        admin.desconectar();
    }

}
