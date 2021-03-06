package cn.edu.upc.hyz.model;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    private String password;
    private String password2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.real_name
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    private String realName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.work_place
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    private Integer workPlace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.technology
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    private Integer technology;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.field_position
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    private Integer fieldPosition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.role
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    private Integer role;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.creat_time
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    private Date creatTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.del_flag
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    private Integer delFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.operator
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.operator_ip
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    private String operatorIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.operator_time
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    private Date operatorTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.real_name
     *
     * @return the value of user.real_name
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.real_name
     *
     * @param realName the value for user.real_name
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.work_place
     *
     * @return the value of user.work_place
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public Integer getWorkPlace() {
        return workPlace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.work_place
     *
     * @param workPlace the value for user.work_place
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public void setWorkPlace(Integer workPlace) {
        this.workPlace = workPlace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.technology
     *
     * @return the value of user.technology
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public Integer getTechnology() {
        return technology;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.technology
     *
     * @param technology the value for user.technology
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public void setTechnology(Integer technology) {
        this.technology = technology;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.field_position
     *
     * @return the value of user.field_position
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public Integer getFieldPosition() {
        return fieldPosition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.field_position
     *
     * @param fieldPosition the value for user.field_position
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public void setFieldPosition(Integer fieldPosition) {
        this.fieldPosition = fieldPosition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.role
     *
     * @return the value of user.role
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public Integer getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.role
     *
     * @param role the value for user.role
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.creat_time
     *
     * @return the value of user.creat_time
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.creat_time
     *
     * @param creatTime the value for user.creat_time
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.del_flag
     *
     * @return the value of user.del_flag
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.del_flag
     *
     * @param delFlag the value for user.del_flag
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.operator
     *
     * @return the value of user.operator
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.operator
     *
     * @param operator the value for user.operator
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.operator_ip
     *
     * @return the value of user.operator_ip
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public String getOperatorIp() {
        return operatorIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.operator_ip
     *
     * @param operatorIp the value for user.operator_ip
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.operator_time
     *
     * @return the value of user.operator_time
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public Date getOperatorTime() {
        return operatorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.operator_time
     *
     * @param operatorTime the value for user.operator_time
     *
     * @mbg.generated Thu Mar 19 22:18:47 CST 2020
     */
    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public String getPassword2() {
        return password2;
    }
    public void setPassword2(String password2) {
        this.password2 = password2 == null ? null : password2.trim();
    }

}