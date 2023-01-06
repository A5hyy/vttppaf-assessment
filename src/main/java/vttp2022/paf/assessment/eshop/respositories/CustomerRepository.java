package vttp2022.paf.assessment.eshop.respositories;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import vttp2022.paf.assessment.eshop.models.Customer;

import static vttp2022.paf.assessment.eshop.respositories.Queries.*;

@Repository
public class CustomerRepository {


	@Autowired
	private JdbcTemplate jdbcTemplate;

	// You cannot change the method's signature
	public Optional<Customer> findCustomerByName(String name) {

		SqlRowSet rs = jdbcTemplate.queryForRowSet(SQL_SELECT_CUSTOMERS_BY_NAME, name);
		List<Customer> nameResult = new LinkedList<>();

		while(rs.next())
			nameResult.add(Customer.create(rs));
		if(nameResult.size()==0)
		return Optional.empty();

		return Optional.of(nameResult.get(0));
		// TODO: Task 3 

	}
}
