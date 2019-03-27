package Review;

public class Plane {
	private String id;
	private int flights;
	private int miles;
	public Plane() {
	}
	public Plane(String xid, int xflights, int xmiles) {
		id = xid;
		flights= xflights;
		miles= xmiles;
	}
	public String getId() {
		return id;
	}
	public int getFlights() {
		return flights;
	}
	public int getMiles() {
		return miles;
	}
	public void setId(String xid) {
		id = xid;
	}
	public void setMiles(int xmiles) {
		miles = xmiles;
	}
	public void setFlights(int xflights) {
		flights = xflights;
	}
	public void fly(int length) {
		miles+=length;
		flights++;
	}
}