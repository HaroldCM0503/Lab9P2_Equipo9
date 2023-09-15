package lab9p2_equipo9;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextArea;

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
    
    public void agregarOrder(Order orden){
        admin.conectar();
        try {
            admin.query.execute("INSERT INTO TenRecord" 
                    + "VALUES('" + orden.getOrderID() + "','" + 
                    orden.getOrderDate() + "','" +
                    orden.getShipDate() + "','" +
                    orden.getShipMode() + "','" +
                    orden.getCustomerID() + "','" +
                    orden.getCustomerName() + "','" +
                    orden.getSegment() + "','" +
                    orden.getCountry() + "','" +
                    orden.getCity() + "','" +
                    orden.getState() + "','" +
                    orden.getPostalCode() + "','" +
                    orden.getRegion() + "','" +
                    orden.getProductID() + "','" +
                    orden.getCategory() + "','" +
                    orden.getSub_Category() + "','" +
                    orden.getProductName() + "','" +
                    orden.getSales() + "','" +
                    orden.getQuantity() + "','" +
                    orden.getDiscount() + "','" +
                    orden.getProfit() + "')"
                    );
            admin.commit();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        admin.desconectar();
    }
    
    public void listarOrders(JTextArea texto){
        admin.conectar();
        try {
            admin.query.execute("select Order ID, Order Date, Ship Date, Ship Mode, Customer ID from TenRecord");
            ResultSet rs = admin.query.getResultSet();
            String lista = "";
            int cc = 1;
            while(rs.next()){
                lista += "Order " + cc;
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
        }
    }
    
    public void listarDetails(JTextArea texto){
        admin.conectar();
        try {
            admin.query.execute("select Order ID, Product ID, Sales, Quantity, Discount, Profit from TenRecord");
            ResultSet rs = admin.query.getResultSet();
            String lista = "";
            int cc = 1;
            while(rs.next()){
                lista += "Details " + cc;
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
        }
    }
    
    public void listarCustomers(JTextArea texto){}
    
    public void listarProducts(JTextArea texto){}
    
}
