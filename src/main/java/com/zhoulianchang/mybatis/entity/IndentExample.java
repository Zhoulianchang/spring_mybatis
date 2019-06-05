package com.zhoulianchang.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andExpressNumIsNull() {
            addCriterion("express_num is null");
            return (Criteria) this;
        }

        public Criteria andExpressNumIsNotNull() {
            addCriterion("express_num is not null");
            return (Criteria) this;
        }

        public Criteria andExpressNumEqualTo(String value) {
            addCriterion("express_num =", value, "expressNum");
            return (Criteria) this;
        }

        public Criteria andExpressNumNotEqualTo(String value) {
            addCriterion("express_num <>", value, "expressNum");
            return (Criteria) this;
        }

        public Criteria andExpressNumGreaterThan(String value) {
            addCriterion("express_num >", value, "expressNum");
            return (Criteria) this;
        }

        public Criteria andExpressNumGreaterThanOrEqualTo(String value) {
            addCriterion("express_num >=", value, "expressNum");
            return (Criteria) this;
        }

        public Criteria andExpressNumLessThan(String value) {
            addCriterion("express_num <", value, "expressNum");
            return (Criteria) this;
        }

        public Criteria andExpressNumLessThanOrEqualTo(String value) {
            addCriterion("express_num <=", value, "expressNum");
            return (Criteria) this;
        }

        public Criteria andExpressNumLike(String value) {
            addCriterion("express_num like", value, "expressNum");
            return (Criteria) this;
        }

        public Criteria andExpressNumNotLike(String value) {
            addCriterion("express_num not like", value, "expressNum");
            return (Criteria) this;
        }

        public Criteria andExpressNumIn(List<String> values) {
            addCriterion("express_num in", values, "expressNum");
            return (Criteria) this;
        }

        public Criteria andExpressNumNotIn(List<String> values) {
            addCriterion("express_num not in", values, "expressNum");
            return (Criteria) this;
        }

        public Criteria andExpressNumBetween(String value1, String value2) {
            addCriterion("express_num between", value1, value2, "expressNum");
            return (Criteria) this;
        }

        public Criteria andExpressNumNotBetween(String value1, String value2) {
            addCriterion("express_num not between", value1, value2, "expressNum");
            return (Criteria) this;
        }

        public Criteria andExpressCodeIsNull() {
            addCriterion("express_code is null");
            return (Criteria) this;
        }

        public Criteria andExpressCodeIsNotNull() {
            addCriterion("express_code is not null");
            return (Criteria) this;
        }

        public Criteria andExpressCodeEqualTo(String value) {
            addCriterion("express_code =", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotEqualTo(String value) {
            addCriterion("express_code <>", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeGreaterThan(String value) {
            addCriterion("express_code >", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeGreaterThanOrEqualTo(String value) {
            addCriterion("express_code >=", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeLessThan(String value) {
            addCriterion("express_code <", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeLessThanOrEqualTo(String value) {
            addCriterion("express_code <=", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeLike(String value) {
            addCriterion("express_code like", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotLike(String value) {
            addCriterion("express_code not like", value, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeIn(List<String> values) {
            addCriterion("express_code in", values, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotIn(List<String> values) {
            addCriterion("express_code not in", values, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeBetween(String value1, String value2) {
            addCriterion("express_code between", value1, value2, "expressCode");
            return (Criteria) this;
        }

        public Criteria andExpressCodeNotBetween(String value1, String value2) {
            addCriterion("express_code not between", value1, value2, "expressCode");
            return (Criteria) this;
        }

        public Criteria andIndentNumIsNull() {
            addCriterion("indent_num is null");
            return (Criteria) this;
        }

        public Criteria andIndentNumIsNotNull() {
            addCriterion("indent_num is not null");
            return (Criteria) this;
        }

        public Criteria andIndentNumEqualTo(String value) {
            addCriterion("indent_num =", value, "indentNum");
            return (Criteria) this;
        }

        public Criteria andIndentNumNotEqualTo(String value) {
            addCriterion("indent_num <>", value, "indentNum");
            return (Criteria) this;
        }

        public Criteria andIndentNumGreaterThan(String value) {
            addCriterion("indent_num >", value, "indentNum");
            return (Criteria) this;
        }

        public Criteria andIndentNumGreaterThanOrEqualTo(String value) {
            addCriterion("indent_num >=", value, "indentNum");
            return (Criteria) this;
        }

        public Criteria andIndentNumLessThan(String value) {
            addCriterion("indent_num <", value, "indentNum");
            return (Criteria) this;
        }

        public Criteria andIndentNumLessThanOrEqualTo(String value) {
            addCriterion("indent_num <=", value, "indentNum");
            return (Criteria) this;
        }

        public Criteria andIndentNumLike(String value) {
            addCriterion("indent_num like", value, "indentNum");
            return (Criteria) this;
        }

        public Criteria andIndentNumNotLike(String value) {
            addCriterion("indent_num not like", value, "indentNum");
            return (Criteria) this;
        }

        public Criteria andIndentNumIn(List<String> values) {
            addCriterion("indent_num in", values, "indentNum");
            return (Criteria) this;
        }

        public Criteria andIndentNumNotIn(List<String> values) {
            addCriterion("indent_num not in", values, "indentNum");
            return (Criteria) this;
        }

        public Criteria andIndentNumBetween(String value1, String value2) {
            addCriterion("indent_num between", value1, value2, "indentNum");
            return (Criteria) this;
        }

        public Criteria andIndentNumNotBetween(String value1, String value2) {
            addCriterion("indent_num not between", value1, value2, "indentNum");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Double value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Double value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Double value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Double value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Double value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Double> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Double> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Double value1, Double value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Double value1, Double value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andExpressFeeIsNull() {
            addCriterion("express_fee is null");
            return (Criteria) this;
        }

        public Criteria andExpressFeeIsNotNull() {
            addCriterion("express_fee is not null");
            return (Criteria) this;
        }

        public Criteria andExpressFeeEqualTo(Double value) {
            addCriterion("express_fee =", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeNotEqualTo(Double value) {
            addCriterion("express_fee <>", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeGreaterThan(Double value) {
            addCriterion("express_fee >", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("express_fee >=", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeLessThan(Double value) {
            addCriterion("express_fee <", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeLessThanOrEqualTo(Double value) {
            addCriterion("express_fee <=", value, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeIn(List<Double> values) {
            addCriterion("express_fee in", values, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeNotIn(List<Double> values) {
            addCriterion("express_fee not in", values, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeBetween(Double value1, Double value2) {
            addCriterion("express_fee between", value1, value2, "expressFee");
            return (Criteria) this;
        }

        public Criteria andExpressFeeNotBetween(Double value1, Double value2) {
            addCriterion("express_fee not between", value1, value2, "expressFee");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andMacIdIsNull() {
            addCriterion("mac_id is null");
            return (Criteria) this;
        }

        public Criteria andMacIdIsNotNull() {
            addCriterion("mac_id is not null");
            return (Criteria) this;
        }

        public Criteria andMacIdEqualTo(Integer value) {
            addCriterion("mac_id =", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdNotEqualTo(Integer value) {
            addCriterion("mac_id <>", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdGreaterThan(Integer value) {
            addCriterion("mac_id >", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mac_id >=", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdLessThan(Integer value) {
            addCriterion("mac_id <", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdLessThanOrEqualTo(Integer value) {
            addCriterion("mac_id <=", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdIn(List<Integer> values) {
            addCriterion("mac_id in", values, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdNotIn(List<Integer> values) {
            addCriterion("mac_id not in", values, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdBetween(Integer value1, Integer value2) {
            addCriterion("mac_id between", value1, value2, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mac_id not between", value1, value2, "macId");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNull() {
            addCriterion("commission is null");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNotNull() {
            addCriterion("commission is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionEqualTo(Double value) {
            addCriterion("commission =", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotEqualTo(Double value) {
            addCriterion("commission <>", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThan(Double value) {
            addCriterion("commission >", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanOrEqualTo(Double value) {
            addCriterion("commission >=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThan(Double value) {
            addCriterion("commission <", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanOrEqualTo(Double value) {
            addCriterion("commission <=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionIn(List<Double> values) {
            addCriterion("commission in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotIn(List<Double> values) {
            addCriterion("commission not in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionBetween(Double value1, Double value2) {
            addCriterion("commission between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotBetween(Double value1, Double value2) {
            addCriterion("commission not between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andMtPeisongIdIsNull() {
            addCriterion("mt_peisong_id is null");
            return (Criteria) this;
        }

        public Criteria andMtPeisongIdIsNotNull() {
            addCriterion("mt_peisong_id is not null");
            return (Criteria) this;
        }

        public Criteria andMtPeisongIdEqualTo(String value) {
            addCriterion("mt_peisong_id =", value, "mtPeisongId");
            return (Criteria) this;
        }

        public Criteria andMtPeisongIdNotEqualTo(String value) {
            addCriterion("mt_peisong_id <>", value, "mtPeisongId");
            return (Criteria) this;
        }

        public Criteria andMtPeisongIdGreaterThan(String value) {
            addCriterion("mt_peisong_id >", value, "mtPeisongId");
            return (Criteria) this;
        }

        public Criteria andMtPeisongIdGreaterThanOrEqualTo(String value) {
            addCriterion("mt_peisong_id >=", value, "mtPeisongId");
            return (Criteria) this;
        }

        public Criteria andMtPeisongIdLessThan(String value) {
            addCriterion("mt_peisong_id <", value, "mtPeisongId");
            return (Criteria) this;
        }

        public Criteria andMtPeisongIdLessThanOrEqualTo(String value) {
            addCriterion("mt_peisong_id <=", value, "mtPeisongId");
            return (Criteria) this;
        }

        public Criteria andMtPeisongIdLike(String value) {
            addCriterion("mt_peisong_id like", value, "mtPeisongId");
            return (Criteria) this;
        }

        public Criteria andMtPeisongIdNotLike(String value) {
            addCriterion("mt_peisong_id not like", value, "mtPeisongId");
            return (Criteria) this;
        }

        public Criteria andMtPeisongIdIn(List<String> values) {
            addCriterion("mt_peisong_id in", values, "mtPeisongId");
            return (Criteria) this;
        }

        public Criteria andMtPeisongIdNotIn(List<String> values) {
            addCriterion("mt_peisong_id not in", values, "mtPeisongId");
            return (Criteria) this;
        }

        public Criteria andMtPeisongIdBetween(String value1, String value2) {
            addCriterion("mt_peisong_id between", value1, value2, "mtPeisongId");
            return (Criteria) this;
        }

        public Criteria andMtPeisongIdNotBetween(String value1, String value2) {
            addCriterion("mt_peisong_id not between", value1, value2, "mtPeisongId");
            return (Criteria) this;
        }

        public Criteria andTakeawayFlagIsNull() {
            addCriterion("takeaway_flag is null");
            return (Criteria) this;
        }

        public Criteria andTakeawayFlagIsNotNull() {
            addCriterion("takeaway_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTakeawayFlagEqualTo(Boolean value) {
            addCriterion("takeaway_flag =", value, "takeawayFlag");
            return (Criteria) this;
        }

        public Criteria andTakeawayFlagNotEqualTo(Boolean value) {
            addCriterion("takeaway_flag <>", value, "takeawayFlag");
            return (Criteria) this;
        }

        public Criteria andTakeawayFlagGreaterThan(Boolean value) {
            addCriterion("takeaway_flag >", value, "takeawayFlag");
            return (Criteria) this;
        }

        public Criteria andTakeawayFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("takeaway_flag >=", value, "takeawayFlag");
            return (Criteria) this;
        }

        public Criteria andTakeawayFlagLessThan(Boolean value) {
            addCriterion("takeaway_flag <", value, "takeawayFlag");
            return (Criteria) this;
        }

        public Criteria andTakeawayFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("takeaway_flag <=", value, "takeawayFlag");
            return (Criteria) this;
        }

        public Criteria andTakeawayFlagIn(List<Boolean> values) {
            addCriterion("takeaway_flag in", values, "takeawayFlag");
            return (Criteria) this;
        }

        public Criteria andTakeawayFlagNotIn(List<Boolean> values) {
            addCriterion("takeaway_flag not in", values, "takeawayFlag");
            return (Criteria) this;
        }

        public Criteria andTakeawayFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("takeaway_flag between", value1, value2, "takeawayFlag");
            return (Criteria) this;
        }

        public Criteria andTakeawayFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("takeaway_flag not between", value1, value2, "takeawayFlag");
            return (Criteria) this;
        }

        public Criteria andMachineStatusIsNull() {
            addCriterion("machine_status is null");
            return (Criteria) this;
        }

        public Criteria andMachineStatusIsNotNull() {
            addCriterion("machine_status is not null");
            return (Criteria) this;
        }

        public Criteria andMachineStatusEqualTo(Boolean value) {
            addCriterion("machine_status =", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusNotEqualTo(Boolean value) {
            addCriterion("machine_status <>", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusGreaterThan(Boolean value) {
            addCriterion("machine_status >", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("machine_status >=", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusLessThan(Boolean value) {
            addCriterion("machine_status <", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("machine_status <=", value, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusIn(List<Boolean> values) {
            addCriterion("machine_status in", values, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusNotIn(List<Boolean> values) {
            addCriterion("machine_status not in", values, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("machine_status between", value1, value2, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andMachineStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("machine_status not between", value1, value2, "machineStatus");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(Integer value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(Integer value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(Integer value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(Integer value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<Integer> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<Integer> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(Integer value1, Integer value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceIsNull() {
            addCriterion("settlement_price is null");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceIsNotNull() {
            addCriterion("settlement_price is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceEqualTo(Double value) {
            addCriterion("settlement_price =", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceNotEqualTo(Double value) {
            addCriterion("settlement_price <>", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceGreaterThan(Double value) {
            addCriterion("settlement_price >", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("settlement_price >=", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceLessThan(Double value) {
            addCriterion("settlement_price <", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceLessThanOrEqualTo(Double value) {
            addCriterion("settlement_price <=", value, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceIn(List<Double> values) {
            addCriterion("settlement_price in", values, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceNotIn(List<Double> values) {
            addCriterion("settlement_price not in", values, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceBetween(Double value1, Double value2) {
            addCriterion("settlement_price between", value1, value2, "settlementPrice");
            return (Criteria) this;
        }

        public Criteria andSettlementPriceNotBetween(Double value1, Double value2) {
            addCriterion("settlement_price not between", value1, value2, "settlementPrice");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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