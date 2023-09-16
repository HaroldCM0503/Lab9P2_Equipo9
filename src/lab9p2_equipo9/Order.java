package lab9p2_equipo9;

import java.util.Date;

public class Order {
    String orderID;
    String orderDate;
    String shipDate;
    String shipMode;
    String customerID;
    String customerName;
    String segment;
    String country;
    String city;
    String State;
    String postalCode;
    String Region;
    String productID;
    String Category;
    String sub_Category;
    String productName;
    String sales;
    String quantity;
    String discount;
    String profit;

    public Order(String orderID, String orderDate, String shipDate,String shipMode, String customerID, String customerName, String segment, String country, String city, String State, String postalCode, String Region, String productID, String Category, String sub_Category, String productName, String sales, String quantity, String discount, String profit) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.shipDate = shipDate;
        this.shipMode = shipMode;
        this.customerID = customerID;
        this.customerName = customerName;
        this.segment = segment;
        this.country = country;
        this.city = city;
        this.State = State;
        this.postalCode = postalCode;
        this.Region = Region;
        this.productID = productID;
        this.Category = Category;
        this.sub_Category = sub_Category;
        this.productName = productName;
        this.sales = sales;
        this.quantity = quantity;
        this.discount = discount;
        this.profit = profit;
    }

    public Order() {
    }


    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getSub_Category() {
        return sub_Category;
    }

    public void setSub_Category(String sub_Category) {
        this.sub_Category = sub_Category;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public String getShipMode() {
        return shipMode;
    }

    public void setShipMode(String shipMode) {
        this.shipMode = shipMode;
    }

    
    
    @Override
    public String toString() {
        return "Order[" + orderID + ","+ productName + "]";
    }
}
