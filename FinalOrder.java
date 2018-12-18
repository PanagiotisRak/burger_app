package cb.groupproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="final_order")
public class FinalOrder {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id ;
	
	@Column(name="cheese")
	private int cheesenum;
	@Column(name="cheesebacon")
	private int cheesebaconnum;
	@Column(name="tower")
	private int towernum;
	@Column(name="newyork")
	private int newyorknum;
	@Column(name="sweetchili")
	private int sweetchillinum;
	@Column(name="mexican")
	private int mexicannum;
	@Column(name="date")
	private String date;
	@Column(name="price")
	private double price;
	
	
	
	public FinalOrder() {
		
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCheesenum() {
		return cheesenum;
	}
	public void setCheesenum(int cheesenum) {
		this.cheesenum = cheesenum;
	}
	public int getChesebaconnum() {
		return cheesebaconnum;
	}
	public void setChesebaconnum(int chesebaconnum) {
		this.cheesebaconnum = chesebaconnum;
	}
	public int getTowernum() {
		return towernum;
	}
	public void setTowernum(int towernum) {
		this.towernum = towernum;
	}
	public int getNewyorknum() {
		return newyorknum;
	}
	public void setNewyorknum(int newyorknum) {
		this.newyorknum = newyorknum;
	}
	public int getSweetchillinum() {
		return sweetchillinum;
	}
	public void setSweetchillinum(int sweetchillinum) {
		this.sweetchillinum = sweetchillinum;
	}
	public int getMexicannum() {
		return mexicannum;
	}
	public void setMexicannum(int mexicannum) {
		this.mexicannum = mexicannum;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "FinalOrder [id=" + id + ", cheesenum=" + cheesenum + ", chesebaconnum=" + cheesebaconnum + ", towernum="
				+ towernum + ", newyorknum=" + newyorknum + ", sweetchillinum=" + sweetchillinum + ", mexicannum="
				+ mexicannum + ", date=" + date + ", price=" + price + "]";
	}
	
	
	
}
