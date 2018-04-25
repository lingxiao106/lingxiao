package com.lingxiao.pojo.user;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.alibaba.fastjson.annotation.JSONField;

@Entity
@Table
public class User implements Serializable {

	private static final long serialVersionUID = -3696701512176393973L;
	@Id
	@GeneratedValue
	private Integer userId;
	private String userName;
	private String userPwd;
	private String userEmail;
	private String userPhone;
	@JSONField(format = "yyyy-MM-dd")
	private Date userCreateDate;

	public Date getUserCreateDate() {
		return userCreateDate;
	}

	public void setUserCreateDate(Date userCreateDate) {
		this.userCreateDate = userCreateDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userImgId")
	private UserImages userImage;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public UserImages getUserImage() {
		return userImage;
	}

	public void setUserImage(UserImages userImage) {
		this.userImage = userImage;
	}

	public String getUserDescription() {
		return userDescription;
	}

	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
	}

	public UserSex getUserSex() {
		return userSex;
	}

	public void setUserSex(UserSex userSex) {
		this.userSex = userSex;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}


	private String userDescription;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sexId")
	private UserSex userSex;


	private int userAge;

}
