package kr.ac.kopo.vo;

public class OrderVO {
	
	private int order_ice_no;
	private String im_id;
	private String order_ice_cup;
	private int order_ice_quantity;
	private String order_date;
	private int order_cup_price;
	
	public OrderVO() {
		
	}

	public OrderVO(int order_ice_no, String im_id, String order_ice_cup, int order_ice_quantity, String order_date,
			int order_cup_price) {
		this.order_ice_no = order_ice_no;
		this.im_id = im_id;
		this.order_ice_cup = order_ice_cup;
		this.order_ice_quantity = order_ice_quantity;
		this.order_date = order_date;
		this.order_cup_price = order_cup_price;
	}

	public int getOrder_ice_no() {
		return order_ice_no;
	}

	public void setOrder_ice_no(int order_ice_no) {
		this.order_ice_no = order_ice_no;
	}

	public String getIm_id() {
		return im_id;
	}

	public void setIm_id(String im_id) {
		this.im_id = im_id;
	}

	public String getOrder_ice_cup() {
		return order_ice_cup;
	}

	public void setOrder_ice_cup(String order_ice_cup) {
		this.order_ice_cup = order_ice_cup;
	}

	public int getOrder_ice_quantity() {
		return order_ice_quantity;
	}

	public void setOrder_ice_quantity(int order_ice_quantity) {
		this.order_ice_quantity = order_ice_quantity;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public int getOrder_cup_price() {
		return order_cup_price;
	}

	public void setOrder_cup_price(int order_cup_price) {
		this.order_cup_price = order_cup_price;
	}

	@Override
	public String toString() {
		return "OrderVO [order_ice_no=" + order_ice_no + ", im_id=" + im_id + ", order_ice_cup=" + order_ice_cup
				+ ", order_ice_quantity=" + order_ice_quantity + ", order_date=" + order_date + ", order_cup_price="
				+ order_cup_price + "]";
	}
	
	
}
