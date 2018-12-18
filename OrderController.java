package cb.groupproject.rest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cb.groupproject.entity.FinalOrder;
import cb.groupproject.service.OrderService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/orders")
	public List<FinalOrder> getOrders() {
		return orderService.getOrders();

	}
	
	@GetMapping("/orders/{orderId}")
	public FinalOrder getOrder(@PathVariable int orderId) {
		FinalOrder theOrders = orderService.getOrder(orderId);
		return theOrders;

	}

	@PostMapping("/orders")
	public FinalOrder addOrders(@RequestBody FinalOrder theOrder) {
		theOrder.setId(0);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime date=LocalDateTime.now();
		String dateFormatted = date.format(formatter);
		theOrder.setDate(dateFormatted);
		orderService.saveOrder(theOrder);
		return theOrder;
	}

}
