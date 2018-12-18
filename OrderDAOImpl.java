package cb.groupproject.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cb.groupproject.entity.FinalOrder;
@Repository
public class OrderDAOImpl implements OrderDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<FinalOrder> getOrders() {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<FinalOrder> theQuery = currentSession.createQuery("from FinalOrder", FinalOrder.class);

		// execute query and get result list
		List<FinalOrder> orders = theQuery.getResultList();

		// return the results
		return orders;

	}

	@Override
	public void saveOrder(FinalOrder theOrder) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save/upate the ïrder
		currentSession.saveOrUpdate(theOrder);

	}

	@Override
	public FinalOrder getOrder(int theId) {
Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		FinalOrder theOrder= currentSession.get(FinalOrder.class, theId);
		
		return theOrder;
	}


}
