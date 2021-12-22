package com.project3.revtech.pojo;

// CONTAINS USER & CART
public class UserCart {

	private int userId;
	private String userEmail;
	private String userName;
	private String userPassword;
	private String userFirstName;
	private String userLastName;
	private String userAddress;
	private String userContact;
	private String userType;
	private boolean userRemoved;
	private Cart cart;

	public UserCart() {
		super();
	}

	public UserCart(int userId, String userEmail, String userName, String userPassword, String userFirstName,
			String userLastName, String userAddress, String userContact, String userType, boolean userRemoved,
			Cart cart) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userAddress = userAddress;
		this.userContact = userContact;
		this.userType = userType;
		this.userRemoved = userRemoved;
		this.cart = cart;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public boolean isUserRemoved() {
		return userRemoved;
	}

	public void setUserRemoved(boolean userRemoved) {
		this.userRemoved = userRemoved;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "UserCart [userId=" + userId + ", userEmail=" + userEmail + ", userName=" + userName + ", userPassword="
				+ userPassword + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userAddress=" + userAddress + ", userContact=" + userContact + ", userType=" + userType
				+ ", userRemoved=" + userRemoved + ", cart=" + cart + "]";
	}

}
