package dmacc.computer;

import javax.persistence.Embeddable;

@Embeddable
public class Memory {
	private String brands;
	private int ramGB;
	private int cost;
	
	public Memory() {
		super();
	}
	
	
	
	public Memory(String brands, int ramGB, int cost) {
		super();
		this.brands = brands;
		this.ramGB = ramGB;
		this.cost = cost;
	}



	@Override
	public String toString() {
		return "Memory [brands=" + brands + ", ramGB=" + ramGB + ", cost=" + cost + "]";
	}



	public String getBrands() {
		return brands;
	}



	public void setBrands(String brands) {
		this.brands = brands;
	}



	public int getRamGB() {
		return ramGB;
	}



	public void setRamGB(int ramGB) {
		this.ramGB = ramGB;
	}



	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

}
