package kr.ac.kopo.vo;

import java.util.List;

public class Ice_StockVO {
	
	private String ice_flavors;
	private int ice_quantity;
	private String ice_uptodate;
	private int ice_price;
	
	public Ice_StockVO() {
		
	}
	

	public Ice_StockVO(String ice_flavors, int ice_quantity) {
		this.ice_flavors = ice_flavors;
		this.ice_quantity = ice_quantity;
	}



	public Ice_StockVO(String ice_flavors, int ice_quantity, String ice_uptodate) {
		
		this.ice_flavors = ice_flavors;
		this.ice_quantity = ice_quantity;
		this.ice_uptodate = ice_uptodate;
		
	}

	public Ice_StockVO(String ice_flavors, int ice_quantity, String ice_uptodate, int ice_price) {
		super();
		this.ice_flavors = ice_flavors;
		this.ice_quantity = ice_quantity;
		this.ice_uptodate = ice_uptodate;
		this.ice_price = ice_price;
	}

	

	public int getIce_price() {
		return ice_price;
	}


	public void setIce_price(int ice_price) {
		this.ice_price = ice_price;
	}


	public String getIce_flavors() {
		return ice_flavors;
	}

	public void setIce_flavors(String ice_flavors) {
		this.ice_flavors = ice_flavors;
	}

	public int getIce_quantity() {
		return ice_quantity;
	}

	public void setIce_quantity(int ice_quantity) {
		this.ice_quantity = ice_quantity;
	}

	public String getIce_uptodate() {
		return ice_uptodate;
	}

	public void setIce_uptodate(String ice_uptodate) {
		this.ice_uptodate = ice_uptodate;
	}

	@Override
	public String toString() {
		return "Ice_StockVO [ice_flavors=" + ice_flavors + ", ice_quantity=" + ice_quantity + ", ice_uptodate="
				+ ice_uptodate + "]";
	}
	
	
}
