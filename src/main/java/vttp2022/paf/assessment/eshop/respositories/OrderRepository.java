package vttp2022.paf.assessment.eshop.respositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import vttp2022.paf.assessment.eshop.models.OrderStatus;

@Repository
public class OrderRepository {
	// TODO: Task 3

	@Autowired
    private JdbcTemplate template;

    // public boolean insertPurchaseOrder(OrderStatus os) {
    //     return template.update(SQL_INSERT_PURCHASE_ORDER, 
    //         po.getOrderId(), po.getName(), po.getOrderDate()) > 0;
    // }
}
