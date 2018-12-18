package cb.groupproject.dao;

import java.util.List;

import cb.groupproject.entity.FinalOrder;


public interface OrderDAO {
	
	public List<FinalOrder> getOrders();

	public void saveOrder(FinalOrder theOrder);

	public FinalOrder getOrder(int theId);
}
