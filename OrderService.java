package cb.groupproject.service;

import java.util.List;

import cb.groupproject.entity.FinalOrder;


public interface OrderService {
	public List<FinalOrder> getOrders();

	public void saveOrder(FinalOrder theOrder);

	public FinalOrder getOrder(int theId);

}
