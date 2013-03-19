/**
 * 
 */
package pl.arturkb.EInvoice.UI;

/**
 * @author artur
 *
 */
public interface HTML5 {
	
	/**
	 * Getter for the layout
	 * @return the layout
	 */
	public String getLayout();


	/**
	 * Setter for the layput
	 * @param layout the layout to set
	 */
	public void setLayout(String layout);


	/**
	 * Getter for the head tag
	 * @return the head
	 */
	public Head getHead();


	/**
	 * Setter for the head
	 * @param head the head to set
	 */
	public void setHead(Head head);


	/**
	 * Getter for the body tag
	 * @return the body
	 */
	public Body getBody();


	/**
	 * Setter for the bodt tag
	 * @param body the body to set
	 */
	public void setBody(Body body);
}
