package com.dynastech.user.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserCertificateExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	public UserCertificateExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("uc.id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("uc.id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(String value) {
			addCriterion("uc.id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(String value) {
			addCriterion("uc.id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(String value) {
			addCriterion("uc.id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(String value) {
			addCriterion("uc.id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(String value) {
			addCriterion("uc.id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(String value) {
			addCriterion("uc.id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLike(String value) {
			addCriterion("uc.id like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotLike(String value) {
			addCriterion("uc.id not like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<String> values) {
			addCriterion("uc.id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<String> values) {
			addCriterion("uc.id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(String value1, String value2) {
			addCriterion("uc.id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(String value1, String value2) {
			addCriterion("uc.id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andUseridIsNull() {
			addCriterion("uc.userId is null");
			return (Criteria) this;
		}

		public Criteria andUseridIsNotNull() {
			addCriterion("uc.userId is not null");
			return (Criteria) this;
		}

		public Criteria andUseridEqualTo(String value) {
			addCriterion("uc.userId =", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridNotEqualTo(String value) {
			addCriterion("uc.userId <>", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridGreaterThan(String value) {
			addCriterion("uc.userId >", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridGreaterThanOrEqualTo(String value) {
			addCriterion("uc.userId >=", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridLessThan(String value) {
			addCriterion("uc.userId <", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridLessThanOrEqualTo(String value) {
			addCriterion("uc.userId <=", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridLike(String value) {
			addCriterion("uc.userId like", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridNotLike(String value) {
			addCriterion("uc.userId not like", value, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridIn(List<String> values) {
			addCriterion("uc.userId in", values, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridNotIn(List<String> values) {
			addCriterion("uc.userId not in", values, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridBetween(String value1, String value2) {
			addCriterion("uc.userId between", value1, value2, "userid");
			return (Criteria) this;
		}

		public Criteria andUseridNotBetween(String value1, String value2) {
			addCriterion("uc.userId not between", value1, value2, "userid");
			return (Criteria) this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("uc.type is null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("uc.type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(String value) {
			addCriterion("uc.type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(String value) {
			addCriterion("uc.type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(String value) {
			addCriterion("uc.type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(String value) {
			addCriterion("uc.type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(String value) {
			addCriterion("uc.type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(String value) {
			addCriterion("uc.type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLike(String value) {
			addCriterion("uc.type like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotLike(String value) {
			addCriterion("uc.type not like", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<String> values) {
			addCriterion("uc.type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<String> values) {
			addCriterion("uc.type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(String value1, String value2) {
			addCriterion("uc.type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(String value1, String value2) {
			addCriterion("uc.type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andDeptIsNull() {
			addCriterion("uc.dept is null");
			return (Criteria) this;
		}

		public Criteria andDeptIsNotNull() {
			addCriterion("uc.dept is not null");
			return (Criteria) this;
		}

		public Criteria andDeptEqualTo(String value) {
			addCriterion("uc.dept =", value, "dept");
			return (Criteria) this;
		}

		public Criteria andDeptNotEqualTo(String value) {
			addCriterion("uc.dept <>", value, "dept");
			return (Criteria) this;
		}

		public Criteria andDeptGreaterThan(String value) {
			addCriterion("uc.dept >", value, "dept");
			return (Criteria) this;
		}

		public Criteria andDeptGreaterThanOrEqualTo(String value) {
			addCriterion("uc.dept >=", value, "dept");
			return (Criteria) this;
		}

		public Criteria andDeptLessThan(String value) {
			addCriterion("uc.dept <", value, "dept");
			return (Criteria) this;
		}

		public Criteria andDeptLessThanOrEqualTo(String value) {
			addCriterion("uc.dept <=", value, "dept");
			return (Criteria) this;
		}

		public Criteria andDeptLike(String value) {
			addCriterion("uc.dept like", value, "dept");
			return (Criteria) this;
		}

		public Criteria andDeptNotLike(String value) {
			addCriterion("uc.dept not like", value, "dept");
			return (Criteria) this;
		}

		public Criteria andDeptIn(List<String> values) {
			addCriterion("uc.dept in", values, "dept");
			return (Criteria) this;
		}

		public Criteria andDeptNotIn(List<String> values) {
			addCriterion("uc.dept not in", values, "dept");
			return (Criteria) this;
		}

		public Criteria andDeptBetween(String value1, String value2) {
			addCriterion("uc.dept between", value1, value2, "dept");
			return (Criteria) this;
		}

		public Criteria andDeptNotBetween(String value1, String value2) {
			addCriterion("uc.dept not between", value1, value2, "dept");
			return (Criteria) this;
		}

		public Criteria andThedateIsNull() {
			addCriterion("uc.theDate is null");
			return (Criteria) this;
		}

		public Criteria andThedateIsNotNull() {
			addCriterion("uc.theDate is not null");
			return (Criteria) this;
		}

		public Criteria andThedateEqualTo(String value) {
			addCriterion("uc.theDate =", value, "thedate");
			return (Criteria) this;
		}

		public Criteria andThedateNotEqualTo(String value) {
			addCriterion("uc.theDate <>", value, "thedate");
			return (Criteria) this;
		}

		public Criteria andThedateGreaterThan(String value) {
			addCriterion("uc.theDate >", value, "thedate");
			return (Criteria) this;
		}

		public Criteria andThedateGreaterThanOrEqualTo(String value) {
			addCriterion("uc.theDate >=", value, "thedate");
			return (Criteria) this;
		}

		public Criteria andThedateLessThan(String value) {
			addCriterion("uc.theDate <", value, "thedate");
			return (Criteria) this;
		}

		public Criteria andThedateLessThanOrEqualTo(String value) {
			addCriterion("uc.theDate <=", value, "thedate");
			return (Criteria) this;
		}

		public Criteria andThedateLike(String value) {
			addCriterion("uc.theDate like", value, "thedate");
			return (Criteria) this;
		}

		public Criteria andThedateNotLike(String value) {
			addCriterion("uc.theDate not like", value, "thedate");
			return (Criteria) this;
		}

		public Criteria andThedateIn(List<String> values) {
			addCriterion("uc.theDate in", values, "thedate");
			return (Criteria) this;
		}

		public Criteria andThedateNotIn(List<String> values) {
			addCriterion("uc.theDate not in", values, "thedate");
			return (Criteria) this;
		}

		public Criteria andThedateBetween(String value1, String value2) {
			addCriterion("uc.theDate between", value1, value2, "thedate");
			return (Criteria) this;
		}

		public Criteria andThedateNotBetween(String value1, String value2) {
			addCriterion("uc.theDate not between", value1, value2, "thedate");
			return (Criteria) this;
		}

		public Criteria andThenoIsNull() {
			addCriterion("uc.theNo is null");
			return (Criteria) this;
		}

		public Criteria andThenoIsNotNull() {
			addCriterion("uc.theNo is not null");
			return (Criteria) this;
		}

		public Criteria andThenoEqualTo(String value) {
			addCriterion("uc.theNo =", value, "theno");
			return (Criteria) this;
		}

		public Criteria andThenoNotEqualTo(String value) {
			addCriterion("uc.theNo <>", value, "theno");
			return (Criteria) this;
		}

		public Criteria andThenoGreaterThan(String value) {
			addCriterion("uc.theNo >", value, "theno");
			return (Criteria) this;
		}

		public Criteria andThenoGreaterThanOrEqualTo(String value) {
			addCriterion("uc.theNo >=", value, "theno");
			return (Criteria) this;
		}

		public Criteria andThenoLessThan(String value) {
			addCriterion("uc.theNo <", value, "theno");
			return (Criteria) this;
		}

		public Criteria andThenoLessThanOrEqualTo(String value) {
			addCriterion("uc.theNo <=", value, "theno");
			return (Criteria) this;
		}

		public Criteria andThenoLike(String value) {
			addCriterion("uc.theNo like", value, "theno");
			return (Criteria) this;
		}

		public Criteria andThenoNotLike(String value) {
			addCriterion("uc.theNo not like", value, "theno");
			return (Criteria) this;
		}

		public Criteria andThenoIn(List<String> values) {
			addCriterion("uc.theNo in", values, "theno");
			return (Criteria) this;
		}

		public Criteria andThenoNotIn(List<String> values) {
			addCriterion("uc.theNo not in", values, "theno");
			return (Criteria) this;
		}

		public Criteria andThenoBetween(String value1, String value2) {
			addCriterion("uc.theNo between", value1, value2, "theno");
			return (Criteria) this;
		}

		public Criteria andThenoNotBetween(String value1, String value2) {
			addCriterion("uc.theNo not between", value1, value2, "theno");
			return (Criteria) this;
		}

		public Criteria andCategoryIsNull() {
			addCriterion("uc.category is null");
			return (Criteria) this;
		}

		public Criteria andCategoryIsNotNull() {
			addCriterion("uc.category is not null");
			return (Criteria) this;
		}

		public Criteria andCategoryEqualTo(String value) {
			addCriterion("uc.category =", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryNotEqualTo(String value) {
			addCriterion("uc.category <>", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryGreaterThan(String value) {
			addCriterion("uc.category >", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryGreaterThanOrEqualTo(String value) {
			addCriterion("uc.category >=", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryLessThan(String value) {
			addCriterion("uc.category <", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryLessThanOrEqualTo(String value) {
			addCriterion("uc.category <=", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryLike(String value) {
			addCriterion("uc.category like", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryNotLike(String value) {
			addCriterion("uc.category not like", value, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryIn(List<String> values) {
			addCriterion("uc.category in", values, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryNotIn(List<String> values) {
			addCriterion("uc.category not in", values, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryBetween(String value1, String value2) {
			addCriterion("uc.category between", value1, value2, "category");
			return (Criteria) this;
		}

		public Criteria andCategoryNotBetween(String value1, String value2) {
			addCriterion("uc.category not between", value1, value2, "category");
			return (Criteria) this;
		}

		public Criteria andDatetimecreatedIsNull() {
			addCriterion("uc.DateTimeCreated is null");
			return (Criteria) this;
		}

		public Criteria andDatetimecreatedIsNotNull() {
			addCriterion("uc.DateTimeCreated is not null");
			return (Criteria) this;
		}

		public Criteria andDatetimecreatedEqualTo(Date value) {
			addCriterion("uc.DateTimeCreated =", value, "datetimecreated");
			return (Criteria) this;
		}

		public Criteria andDatetimecreatedNotEqualTo(Date value) {
			addCriterion("uc.DateTimeCreated <>", value, "datetimecreated");
			return (Criteria) this;
		}

		public Criteria andDatetimecreatedGreaterThan(Date value) {
			addCriterion("uc.DateTimeCreated >", value, "datetimecreated");
			return (Criteria) this;
		}

		public Criteria andDatetimecreatedGreaterThanOrEqualTo(Date value) {
			addCriterion("uc.DateTimeCreated >=", value, "datetimecreated");
			return (Criteria) this;
		}

		public Criteria andDatetimecreatedLessThan(Date value) {
			addCriterion("uc.DateTimeCreated <", value, "datetimecreated");
			return (Criteria) this;
		}

		public Criteria andDatetimecreatedLessThanOrEqualTo(Date value) {
			addCriterion("uc.DateTimeCreated <=", value, "datetimecreated");
			return (Criteria) this;
		}

		public Criteria andDatetimecreatedIn(List<Date> values) {
			addCriterion("uc.DateTimeCreated in", values, "datetimecreated");
			return (Criteria) this;
		}

		public Criteria andDatetimecreatedNotIn(List<Date> values) {
			addCriterion("uc.DateTimeCreated not in", values, "datetimecreated");
			return (Criteria) this;
		}

		public Criteria andDatetimecreatedBetween(Date value1, Date value2) {
			addCriterion("uc.DateTimeCreated between", value1, value2, "datetimecreated");
			return (Criteria) this;
		}

		public Criteria andDatetimecreatedNotBetween(Date value1, Date value2) {
			addCriterion("uc.DateTimeCreated not between", value1, value2, "datetimecreated");
			return (Criteria) this;
		}

		public Criteria andDatetimemodifiedIsNull() {
			addCriterion("uc.DateTimeModified is null");
			return (Criteria) this;
		}

		public Criteria andDatetimemodifiedIsNotNull() {
			addCriterion("uc.DateTimeModified is not null");
			return (Criteria) this;
		}

		public Criteria andDatetimemodifiedEqualTo(Date value) {
			addCriterion("uc.DateTimeModified =", value, "datetimemodified");
			return (Criteria) this;
		}

		public Criteria andDatetimemodifiedNotEqualTo(Date value) {
			addCriterion("uc.DateTimeModified <>", value, "datetimemodified");
			return (Criteria) this;
		}

		public Criteria andDatetimemodifiedGreaterThan(Date value) {
			addCriterion("uc.DateTimeModified >", value, "datetimemodified");
			return (Criteria) this;
		}

		public Criteria andDatetimemodifiedGreaterThanOrEqualTo(Date value) {
			addCriterion("uc.DateTimeModified >=", value, "datetimemodified");
			return (Criteria) this;
		}

		public Criteria andDatetimemodifiedLessThan(Date value) {
			addCriterion("uc.DateTimeModified <", value, "datetimemodified");
			return (Criteria) this;
		}

		public Criteria andDatetimemodifiedLessThanOrEqualTo(Date value) {
			addCriterion("uc.DateTimeModified <=", value, "datetimemodified");
			return (Criteria) this;
		}

		public Criteria andDatetimemodifiedIn(List<Date> values) {
			addCriterion("uc.DateTimeModified in", values, "datetimemodified");
			return (Criteria) this;
		}

		public Criteria andDatetimemodifiedNotIn(List<Date> values) {
			addCriterion("uc.DateTimeModified not in", values, "datetimemodified");
			return (Criteria) this;
		}

		public Criteria andDatetimemodifiedBetween(Date value1, Date value2) {
			addCriterion("uc.DateTimeModified between", value1, value2, "datetimemodified");
			return (Criteria) this;
		}

		public Criteria andDatetimemodifiedNotBetween(Date value1, Date value2) {
			addCriterion("uc.DateTimeModified not between", value1, value2, "datetimemodified");
			return (Criteria) this;
		}

		public Criteria andIsdeletedIsNull() {
			addCriterion("uc.isDeleted is null");
			return (Criteria) this;
		}

		public Criteria andIsdeletedIsNotNull() {
			addCriterion("uc.isDeleted is not null");
			return (Criteria) this;
		}

		public Criteria andIsdeletedEqualTo(Boolean value) {
			addCriterion("uc.isDeleted =", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedNotEqualTo(Boolean value) {
			addCriterion("uc.isDeleted <>", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedGreaterThan(Boolean value) {
			addCriterion("uc.isDeleted >", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedGreaterThanOrEqualTo(Boolean value) {
			addCriterion("uc.isDeleted >=", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedLessThan(Boolean value) {
			addCriterion("uc.isDeleted <", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedLessThanOrEqualTo(Boolean value) {
			addCriterion("uc.isDeleted <=", value, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedIn(List<Boolean> values) {
			addCriterion("uc.isDeleted in", values, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedNotIn(List<Boolean> values) {
			addCriterion("uc.isDeleted not in", values, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedBetween(Boolean value1, Boolean value2) {
			addCriterion("uc.isDeleted between", value1, value2, "isdeleted");
			return (Criteria) this;
		}

		public Criteria andIsdeletedNotBetween(Boolean value1, Boolean value2) {
			addCriterion("uc.isDeleted not between", value1, value2, "isdeleted");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table RS_UserCertificate
	 * @mbggenerated  Thu Aug 31 09:35:03 CST 2017
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table RS_UserCertificate
     *
     * @mbggenerated do_not_delete_during_merge Thu Aug 31 09:27:29 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}