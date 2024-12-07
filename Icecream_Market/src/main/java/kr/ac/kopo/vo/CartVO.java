package kr.ac.kopo.vo;

public class CartVO {
	private String cart_ice_cup;
	private String im_id;
	private int cart_quantity;
	
	
	
	public CartVO() {
		
	}

	public CartVO(String cart_ice_cup, String im_id, int cart_quantity) {
		this.cart_ice_cup = cart_ice_cup;
		this.im_id = im_id;
		this.cart_quantity = cart_quantity;
	}

	public String getCart_ice_cup() {
		return cart_ice_cup;
	}

	public void setCart_ice_cup(String cart_ice_cup) {
		this.cart_ice_cup = cart_ice_cup;
	}

	public String getIm_id() {
		return im_id;
	}

	public void setIm_id(String im_id) {
		this.im_id = im_id;
	}

	public int getCart_quantity() {
		return cart_quantity;
	}

	public void setCart_quantity(int cart_quantity) {
		this.cart_quantity = cart_quantity;
	}

	@Override
	public String toString() {
		return "CartVO [cart_ice_cup=" + cart_ice_cup + ", im_id=" + im_id + ", cart_quantity=" + cart_quantity + "]";
	}	
	
}
