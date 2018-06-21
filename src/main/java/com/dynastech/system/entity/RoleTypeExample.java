package com.dynastech.system.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleTypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RS_RoleType
     *
     * @mbggenerated Mon Aug 14 16:41:32 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RS_RoleType
     *
     * @mbggenerated Mon Aug 14 16:41:32 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RS_RoleType
     *
     * @mbggenerated Mon Aug 14 16:41:32 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_RoleType
     *
     * @mbggenerated Mon Aug 14 16:41:32 CST 2017
     */
    public RoleTypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_RoleType
     *
     * @mbggenerated Mon Aug 14 16:41:32 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_RoleType
     *
     * @mbggenerated Mon Aug 14 16:41:32 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_RoleType
     *
     * @mbggenerated Mon Aug 14 16:41:32 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_RoleType
     *
     * @mbggenerated Mon Aug 14 16:41:32 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_RoleType
     *
     * @mbggenerated Mon Aug 14 16:41:32 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_RoleType
     *
     * @mbggenerated Mon Aug 14 16:41:32 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_RoleType
     *
     * @mbggenerated Mon Aug 14 16:41:32 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_RoleType
     *
     * @mbggenerated Mon Aug 14 16:41:32 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_RoleType
     *
     * @mbggenerated Mon Aug 14 16:41:32 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RS_RoleType
     *
     * @mbggenerated Mon Aug 14 16:41:32 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table RS_RoleType
     *
     * @mbggenerated Mon Aug 14 16:41:32 CST 2017
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
            addCriterion("rt.Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("rt.Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("rt.Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("rt.Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("rt.Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("rt.Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("rt.Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("rt.Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("rt.Id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("rt.Id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("rt.Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("rt.Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("rt.Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("rt.Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDatetimecreatedIsNull() {
            addCriterion("rt.DateTimeCreated is null");
            return (Criteria) this;
        }

        public Criteria andDatetimecreatedIsNotNull() {
            addCriterion("rt.DateTimeCreated is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimecreatedEqualTo(Date value) {
            addCriterion("rt.DateTimeCreated =", value, "datetimecreated");
            return (Criteria) this;
        }

        public Criteria andDatetimecreatedNotEqualTo(Date value) {
            addCriterion("rt.DateTimeCreated <>", value, "datetimecreated");
            return (Criteria) this;
        }

        public Criteria andDatetimecreatedGreaterThan(Date value) {
            addCriterion("rt.DateTimeCreated >", value, "datetimecreated");
            return (Criteria) this;
        }

        public Criteria andDatetimecreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("rt.DateTimeCreated >=", value, "datetimecreated");
            return (Criteria) this;
        }

        public Criteria andDatetimecreatedLessThan(Date value) {
            addCriterion("rt.DateTimeCreated <", value, "datetimecreated");
            return (Criteria) this;
        }

        public Criteria andDatetimecreatedLessThanOrEqualTo(Date value) {
            addCriterion("rt.DateTimeCreated <=", value, "datetimecreated");
            return (Criteria) this;
        }

        public Criteria andDatetimecreatedIn(List<Date> values) {
            addCriterion("rt.DateTimeCreated in", values, "datetimecreated");
            return (Criteria) this;
        }

        public Criteria andDatetimecreatedNotIn(List<Date> values) {
            addCriterion("rt.DateTimeCreated not in", values, "datetimecreated");
            return (Criteria) this;
        }

        public Criteria andDatetimecreatedBetween(Date value1, Date value2) {
            addCriterion("rt.DateTimeCreated between", value1, value2, "datetimecreated");
            return (Criteria) this;
        }

        public Criteria andDatetimecreatedNotBetween(Date value1, Date value2) {
            addCriterion("rt.DateTimeCreated not between", value1, value2, "datetimecreated");
            return (Criteria) this;
        }

        public Criteria andDatetimemodifiedIsNull() {
            addCriterion("rt.DateTimeModified is null");
            return (Criteria) this;
        }

        public Criteria andDatetimemodifiedIsNotNull() {
            addCriterion("rt.DateTimeModified is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimemodifiedEqualTo(Date value) {
            addCriterion("rt.DateTimeModified =", value, "datetimemodified");
            return (Criteria) this;
        }

        public Criteria andDatetimemodifiedNotEqualTo(Date value) {
            addCriterion("rt.DateTimeModified <>", value, "datetimemodified");
            return (Criteria) this;
        }

        public Criteria andDatetimemodifiedGreaterThan(Date value) {
            addCriterion("rt.DateTimeModified >", value, "datetimemodified");
            return (Criteria) this;
        }

        public Criteria andDatetimemodifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("rt.DateTimeModified >=", value, "datetimemodified");
            return (Criteria) this;
        }

        public Criteria andDatetimemodifiedLessThan(Date value) {
            addCriterion("rt.DateTimeModified <", value, "datetimemodified");
            return (Criteria) this;
        }

        public Criteria andDatetimemodifiedLessThanOrEqualTo(Date value) {
            addCriterion("rt.DateTimeModified <=", value, "datetimemodified");
            return (Criteria) this;
        }

        public Criteria andDatetimemodifiedIn(List<Date> values) {
            addCriterion("rt.DateTimeModified in", values, "datetimemodified");
            return (Criteria) this;
        }

        public Criteria andDatetimemodifiedNotIn(List<Date> values) {
            addCriterion("rt.DateTimeModified not in", values, "datetimemodified");
            return (Criteria) this;
        }

        public Criteria andDatetimemodifiedBetween(Date value1, Date value2) {
            addCriterion("rt.DateTimeModified between", value1, value2, "datetimemodified");
            return (Criteria) this;
        }

        public Criteria andDatetimemodifiedNotBetween(Date value1, Date value2) {
            addCriterion("rt.DateTimeModified not between", value1, value2, "datetimemodified");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIsNull() {
            addCriterion("rt.DisplayName is null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIsNotNull() {
            addCriterion("rt.DisplayName is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameEqualTo(String value) {
            addCriterion("rt.DisplayName =", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotEqualTo(String value) {
            addCriterion("rt.DisplayName <>", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameGreaterThan(String value) {
            addCriterion("rt.DisplayName >", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameGreaterThanOrEqualTo(String value) {
            addCriterion("rt.DisplayName >=", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLessThan(String value) {
            addCriterion("rt.DisplayName <", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLessThanOrEqualTo(String value) {
            addCriterion("rt.DisplayName <=", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLike(String value) {
            addCriterion("rt.DisplayName like", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotLike(String value) {
            addCriterion("rt.DisplayName not like", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIn(List<String> values) {
            addCriterion("rt.DisplayName in", values, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotIn(List<String> values) {
            addCriterion("rt.DisplayName not in", values, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameBetween(String value1, String value2) {
            addCriterion("rt.DisplayName between", value1, value2, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotBetween(String value1, String value2) {
            addCriterion("rt.DisplayName not between", value1, value2, "displayname");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNull() {
            addCriterion("rt.IsDeleted is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("rt.IsDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(Boolean value) {
            addCriterion("rt.IsDeleted =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Boolean value) {
            addCriterion("rt.IsDeleted <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Boolean value) {
            addCriterion("rt.IsDeleted >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("rt.IsDeleted >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Boolean value) {
            addCriterion("rt.IsDeleted <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("rt.IsDeleted <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Boolean> values) {
            addCriterion("rt.IsDeleted in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Boolean> values) {
            addCriterion("rt.IsDeleted not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("rt.IsDeleted between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("rt.IsDeleted not between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("rt.Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("rt.Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("rt.Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("rt.Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("rt.Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("rt.Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("rt.Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("rt.Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("rt.Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("rt.Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("rt.Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("rt.Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("rt.Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("rt.Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOrdinalIsNull() {
            addCriterion("rt.Ordinal is null");
            return (Criteria) this;
        }

        public Criteria andOrdinalIsNotNull() {
            addCriterion("rt.Ordinal is not null");
            return (Criteria) this;
        }

        public Criteria andOrdinalEqualTo(Integer value) {
            addCriterion("rt.Ordinal =", value, "ordinal");
            return (Criteria) this;
        }

        public Criteria andOrdinalNotEqualTo(Integer value) {
            addCriterion("rt.Ordinal <>", value, "ordinal");
            return (Criteria) this;
        }

        public Criteria andOrdinalGreaterThan(Integer value) {
            addCriterion("rt.Ordinal >", value, "ordinal");
            return (Criteria) this;
        }

        public Criteria andOrdinalGreaterThanOrEqualTo(Integer value) {
            addCriterion("rt.Ordinal >=", value, "ordinal");
            return (Criteria) this;
        }

        public Criteria andOrdinalLessThan(Integer value) {
            addCriterion("rt.Ordinal <", value, "ordinal");
            return (Criteria) this;
        }

        public Criteria andOrdinalLessThanOrEqualTo(Integer value) {
            addCriterion("rt.Ordinal <=", value, "ordinal");
            return (Criteria) this;
        }

        public Criteria andOrdinalIn(List<Integer> values) {
            addCriterion("rt.Ordinal in", values, "ordinal");
            return (Criteria) this;
        }

        public Criteria andOrdinalNotIn(List<Integer> values) {
            addCriterion("rt.Ordinal not in", values, "ordinal");
            return (Criteria) this;
        }

        public Criteria andOrdinalBetween(Integer value1, Integer value2) {
            addCriterion("rt.Ordinal between", value1, value2, "ordinal");
            return (Criteria) this;
        }

        public Criteria andOrdinalNotBetween(Integer value1, Integer value2) {
            addCriterion("rt.Ordinal not between", value1, value2, "ordinal");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("rt.Level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("rt.Level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("rt.Level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("rt.Level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("rt.Level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("rt.Level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("rt.Level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("rt.Level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("rt.Level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("rt.Level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("rt.Level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("rt.Level not between", value1, value2, "level");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table RS_RoleType
     *
     * @mbggenerated do_not_delete_during_merge Mon Aug 14 16:41:32 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table RS_RoleType
     *
     * @mbggenerated Mon Aug 14 16:41:32 CST 2017
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
}