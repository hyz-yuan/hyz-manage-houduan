package cn.edu.upc.hyz.model;

import java.util.Date;

public class Manage {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manage.id
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manage.rights
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    private String rights;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manage.technology_name
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    private String technologyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manage.create_time
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manage.del_flag
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    private Integer delFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manage.operator
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manage.operator_ip
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    private String operatorIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column manage.operator_time
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    private Date operatorTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manage.id
     *
     * @return the value of manage.id
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manage.id
     *
     * @param id the value for manage.id
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manage.rights
     *
     * @return the value of manage.rights
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    public String getRights() {
        return rights;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manage.rights
     *
     * @param rights the value for manage.rights
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    public void setRights(String rights) {
        this.rights = rights == null ? null : rights.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manage.technology_name
     *
     * @return the value of manage.technology_name
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    public String getTechnologyName() {
        return technologyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manage.technology_name
     *
     * @param technologyName the value for manage.technology_name
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName == null ? null : technologyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manage.create_time
     *
     * @return the value of manage.create_time
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manage.create_time
     *
     * @param createTime the value for manage.create_time
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manage.del_flag
     *
     * @return the value of manage.del_flag
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manage.del_flag
     *
     * @param delFlag the value for manage.del_flag
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manage.operator
     *
     * @return the value of manage.operator
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manage.operator
     *
     * @param operator the value for manage.operator
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manage.operator_ip
     *
     * @return the value of manage.operator_ip
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    public String getOperatorIp() {
        return operatorIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manage.operator_ip
     *
     * @param operatorIp the value for manage.operator_ip
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column manage.operator_time
     *
     * @return the value of manage.operator_time
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    public Date getOperatorTime() {
        return operatorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column manage.operator_time
     *
     * @param operatorTime the value for manage.operator_time
     *
     * @mbg.generated Tue Mar 24 20:28:53 CST 2020
     */
    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }
}