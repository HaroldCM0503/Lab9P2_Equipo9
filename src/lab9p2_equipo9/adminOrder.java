package lab9p2_equipo9;
import java.sql.ResultSet;
import java.sql.SQLException;

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
}
