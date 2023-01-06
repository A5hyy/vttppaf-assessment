package vttp2022.paf.assessment.eshop.respositories;

public class Queries {
    
    public static final String SQL_SELECT_CUSTOMERS_BY_NAME = "select name from customers";
    public static String SQL_INSERT_PURCHASE_ORDER = "insert into purchase_order(order_id, name, order_date) values (?, ?, ?)";
}
