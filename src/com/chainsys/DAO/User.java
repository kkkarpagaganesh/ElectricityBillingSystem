package com.chainsys.DAO;

public class User {
	private int circle_no,  cus_age, cus_pincode, cus_id, met_no, met_amount,
			met_unit;
	
private	long  cus_aadharnumber, cus_phonenumber;
	public void setCus_aadharnumber(long cus_aadharnumber) {
	this.cus_aadharnumber = cus_aadharnumber;
}

public void setCus_phonenumber(long cus_phonenumber) {
	this.cus_phonenumber = cus_phonenumber;
}

	private String circle_name, division_name, cus_gender, cus_email, cus_address, cus_name, met_month, password;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((circle_name == null) ? 0 : circle_name.hashCode());
		result = prime * result + circle_no;
		result = prime * result + (int) (cus_aadharnumber ^ (cus_aadharnumber >>> 32));
		result = prime * result + ((cus_address == null) ? 0 : cus_address.hashCode());
		result = prime * result + cus_age;
		result = prime * result + ((cus_email == null) ? 0 : cus_email.hashCode());
		result = prime * result + ((cus_gender == null) ? 0 : cus_gender.hashCode());
		result = prime * result + cus_id;
		result = prime * result + ((cus_name == null) ? 0 : cus_name.hashCode());
		result = prime * result + (int) (cus_phonenumber ^ (cus_phonenumber >>> 32));
		result = prime * result + cus_pincode;
		result = prime * result + ((division_name == null) ? 0 : division_name.hashCode());
		result = prime * result + met_amount;
		result = prime * result + ((met_month == null) ? 0 : met_month.hashCode());
		result = prime * result + met_no;
		result = prime * result + met_unit;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (circle_name == null) {
			if (other.circle_name != null)
				return false;
		} else if (!circle_name.equals(other.circle_name))
			return false;
		if (circle_no != other.circle_no)
			return false;
		if (cus_aadharnumber != other.cus_aadharnumber)
			return false;
		if (cus_address == null) {
			if (other.cus_address != null)
				return false;
		} else if (!cus_address.equals(other.cus_address))
			return false;
		if (cus_age != other.cus_age)
			return false;
		if (cus_email == null) {
			if (other.cus_email != null)
				return false;
		} else if (!cus_email.equals(other.cus_email))
			return false;
		if (cus_gender == null) {
			if (other.cus_gender != null)
				return false;
		} else if (!cus_gender.equals(other.cus_gender))
			return false;
		if (cus_id != other.cus_id)
			return false;
		if (cus_name == null) {
			if (other.cus_name != null)
				return false;
		} else if (!cus_name.equals(other.cus_name))
			return false;
		if (cus_phonenumber != other.cus_phonenumber)
			return false;
		if (cus_pincode != other.cus_pincode)
			return false;
		if (division_name == null) {
			if (other.division_name != null)
				return false;
		} else if (!division_name.equals(other.division_name))
			return false;
		if (met_amount != other.met_amount)
			return false;
		if (met_month == null) {
			if (other.met_month != null)
				return false;
		} else if (!met_month.equals(other.met_month))
			return false;
		if (met_no != other.met_no)
			return false;
		if (met_unit != other.met_unit)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [circle_no=" + circle_no + ", cus_age=" + cus_age + ", cus_pincode=" + cus_pincode + ", cus_id="
				+ cus_id + ", met_no=" + met_no + ", met_amount=" + met_amount + ", met_unit=" + met_unit
				+ ", cus_aadharnumber=" + cus_aadharnumber + ", cus_phonenumber=" + cus_phonenumber + ", circle_name="
				+ circle_name + ", division_name=" + division_name + ", cus_gender=" + cus_gender + ", cus_email="
				+ cus_email + ", cus_address=" + cus_address + ", cus_name=" + cus_name + ", met_month=" + met_month
				+ ", password=" + password + "]";
	}

	public int getCircle_no() {
		return circle_no;
	}

	public void setCircle_no(int circle_no) {
		this.circle_no = circle_no;
	}

	

	public int getCus_age() {
		return cus_age;
	}

	public void setCus_age(int cus_age) {
		this.cus_age = cus_age;
	}

	public int getCus_pincode() {
		return cus_pincode;
	}

	public void setCus_pincode(int cus_pincode) {
		this.cus_pincode = cus_pincode;
	}

	public int getCus_id() {
		return cus_id;
	}

	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}

	public int getMet_no() {
		return met_no;
	}

	public void setMet_no(int met_no) {
		this.met_no = met_no;
	}

	public int getMet_amount() {
		return met_amount;
	}

	public void setMet_amount(int met_amount) {
		this.met_amount = met_amount;
	}

	public int getMet_unit() {
		return met_unit;
	}

	public void setMet_unit(int met_unit) {
		this.met_unit = met_unit;
	}

	public String getCircle_name() {
		return circle_name;
	}

	public void setCircle_name(String circle_name) {
		this.circle_name = circle_name;
	}

	public String getDivision_name() {
		return division_name;
	}

	public void setDivision_name(String division_name) {
		this.division_name = division_name;
	}

	public String getCus_gender() {
		return cus_gender;
	}

	public void setCus_gender(String cus_gender) {
		this.cus_gender = cus_gender;
	}

	public String getCus_email() {
		return cus_email;
	}

	public void setCus_email(String cus_email) {
		this.cus_email = cus_email;
	}

	public String getCus_address() {
		return cus_address;
	}

	public void setCus_address(String cus_address) {
		this.cus_address = cus_address;
	}

	public String getCus_name() {
		return cus_name;
	}

	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}

	public String getMet_month() {
		return met_month;
	}

	public void setMet_month(String met_month) {
		this.met_month = met_month;
	}

	public String getPassword() {
		return password;
	}

	public long getCus_aadharnumber() {
		return cus_aadharnumber;
	}

	public long getCus_phonenumber() {
		return cus_phonenumber;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
