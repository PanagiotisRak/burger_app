package cb.groupproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cb.groupproject.dao.OrderDAO;
import cb.groupproject.entity.FinalOrder;


@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDAO orderDAO;

	@Override
	@Transactional
	public List<FinalOrder> getOrders() {
		return orderDAO.getOrders();
	}

	@Override
	@Transactional
	public void saveOrder(FinalOrder theOrder) {
		orderDAO.saveOrder(theOrder);

	}

	@Override
	@Transactional
	public FinalOrder getOrder(int theId) {
		return orderDAO.getOrder(theId);
	}

}
