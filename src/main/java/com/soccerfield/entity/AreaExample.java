package com.soccerfield.entity;

import java.util.ArrayList;
import java.util.List;

public class AreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaExample() {
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

        public Criteria andAreaidIsNull() {
            addCriterion("areaid is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("areaid is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(Integer value) {
            addCriterion("areaid =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(Integer value) {
            addCriterion("areaid <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(Integer value) {
            addCriterion("areaid >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("areaid >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(Integer value) {
            addCriterion("areaid <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Integer value) {
            addCriterion("areaid <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<Integer> values) {
            addCriterion("areaid in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<Integer> values) {
            addCriterion("areaid not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(Integer value1, Integer value2) {
            addCriterion("areaid between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(Integer value1, Integer value2) {
            addCriterion("areaid not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andStaidIsNull() {
            addCriterion("staid is null");
            return (Criteria) this;
        }

        public Criteria andStaidIsNotNull() {
            addCriterion("staid is not null");
            return (Criteria) this;
        }

        public Criteria andStaidEqualTo(Integer value) {
            addCriterion("staid =", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidNotEqualTo(Integer value) {
            addCriterion("staid <>", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidGreaterThan(Integer value) {
            addCriterion("staid >", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("staid >=", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidLessThan(Integer value) {
            addCriterion("staid <", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidLessThanOrEqualTo(Integer value) {
            addCriterion("staid <=", value, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidIn(List<Integer> values) {
            addCriterion("staid in", values, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidNotIn(List<Integer> values) {
            addCriterion("staid not in", values, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidBetween(Integer value1, Integer value2) {
            addCriterion("staid between", value1, value2, "staid");
            return (Criteria) this;
        }

        public Criteria andStaidNotBetween(Integer value1, Integer value2) {
            addCriterion("staid not between", value1, value2, "staid");
            return (Criteria) this;
        }

        public Criteria andAreaintroIsNull() {
            addCriterion("areaintro is null");
            return (Criteria) this;
        }

        public Criteria andAreaintroIsNotNull() {
            addCriterion("areaintro is not null");
            return (Criteria) this;
        }

        public Criteria andAreaintroEqualTo(String value) {
            addCriterion("areaintro =", value, "areaintro");
            return (Criteria) this;
        }

        public Criteria andAreaintroNotEqualTo(String value) {
            addCriterion("areaintro <>", value, "areaintro");
            return (Criteria) this;
        }

        public Criteria andAreaintroGreaterThan(String value) {
            addCriterion("areaintro >", value, "areaintro");
            return (Criteria) this;
        }

        public Criteria andAreaintroGreaterThanOrEqualTo(String value) {
            addCriterion("areaintro >=", value, "areaintro");
            return (Criteria) this;
        }

        public Criteria andAreaintroLessThan(String value) {
            addCriterion("areaintro <", value, "areaintro");
            return (Criteria) this;
        }

        public Criteria andAreaintroLessThanOrEqualTo(String value) {
            addCriterion("areaintro <=", value, "areaintro");
            return (Criteria) this;
        }

        public Criteria andAreaintroLike(String value) {
            addCriterion("areaintro like", value, "areaintro");
            return (Criteria) this;
        }

        public Criteria andAreaintroNotLike(String value) {
            addCriterion("areaintro not like", value, "areaintro");
            return (Criteria) this;
        }

        public Criteria andAreaintroIn(List<String> values) {
            addCriterion("areaintro in", values, "areaintro");
            return (Criteria) this;
        }

        public Criteria andAreaintroNotIn(List<String> values) {
            addCriterion("areaintro not in", values, "areaintro");
            return (Criteria) this;
        }

        public Criteria andAreaintroBetween(String value1, String value2) {
            addCriterion("areaintro between", value1, value2, "areaintro");
            return (Criteria) this;
        }

        public Criteria andAreaintroNotBetween(String value1, String value2) {
            addCriterion("areaintro not between", value1, value2, "areaintro");
            return (Criteria) this;
        }

        public Criteria andAreapicIsNull() {
            addCriterion("areapic is null");
            return (Criteria) this;
        }

        public Criteria andAreapicIsNotNull() {
            addCriterion("areapic is not null");
            return (Criteria) this;
        }

        public Criteria andAreapicEqualTo(String value) {
            addCriterion("areapic =", value, "areapic");
            return (Criteria) this;
        }

        public Criteria andAreapicNotEqualTo(String value) {
            addCriterion("areapic <>", value, "areapic");
            return (Criteria) this;
        }

        public Criteria andAreapicGreaterThan(String value) {
            addCriterion("areapic >", value, "areapic");
            return (Criteria) this;
        }

        public Criteria andAreapicGreaterThanOrEqualTo(String value) {
            addCriterion("areapic >=", value, "areapic");
            return (Criteria) this;
        }

        public Criteria andAreapicLessThan(String value) {
            addCriterion("areapic <", value, "areapic");
            return (Criteria) this;
        }

        public Criteria andAreapicLessThanOrEqualTo(String value) {
            addCriterion("areapic <=", value, "areapic");
            return (Criteria) this;
        }

        public Criteria andAreapicLike(String value) {
            addCriterion("areapic like", value, "areapic");
            return (Criteria) this;
        }

        public Criteria andAreapicNotLike(String value) {
            addCriterion("areapic not like", value, "areapic");
            return (Criteria) this;
        }

        public Criteria andAreapicIn(List<String> values) {
            addCriterion("areapic in", values, "areapic");
            return (Criteria) this;
        }

        public Criteria andAreapicNotIn(List<String> values) {
            addCriterion("areapic not in", values, "areapic");
            return (Criteria) this;
        }

        public Criteria andAreapicBetween(String value1, String value2) {
            addCriterion("areapic between", value1, value2, "areapic");
            return (Criteria) this;
        }

        public Criteria andAreapicNotBetween(String value1, String value2) {
            addCriterion("areapic not between", value1, value2, "areapic");
            return (Criteria) this;
        }

        public Criteria andAunpriceIsNull() {
            addCriterion("aunprice is null");
            return (Criteria) this;
        }

        public Criteria andAunpriceIsNotNull() {
            addCriterion("aunprice is not null");
            return (Criteria) this;
        }

        public Criteria andAunpriceEqualTo(Integer value) {
            addCriterion("aunprice =", value, "aunprice");
            return (Criteria) this;
        }

        public Criteria andAunpriceNotEqualTo(Integer value) {
            addCriterion("aunprice <>", value, "aunprice");
            return (Criteria) this;
        }

        public Criteria andAunpriceGreaterThan(Integer value) {
            addCriterion("aunprice >", value, "aunprice");
            return (Criteria) this;
        }

        public Criteria andAunpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("aunprice >=", value, "aunprice");
            return (Criteria) this;
        }

        public Criteria andAunpriceLessThan(Integer value) {
            addCriterion("aunprice <", value, "aunprice");
            return (Criteria) this;
        }

        public Criteria andAunpriceLessThanOrEqualTo(Integer value) {
            addCriterion("aunprice <=", value, "aunprice");
            return (Criteria) this;
        }

        public Criteria andAunpriceIn(List<Integer> values) {
            addCriterion("aunprice in", values, "aunprice");
            return (Criteria) this;
        }

        public Criteria andAunpriceNotIn(List<Integer> values) {
            addCriterion("aunprice not in", values, "aunprice");
            return (Criteria) this;
        }

        public Criteria andAunpriceBetween(Integer value1, Integer value2) {
            addCriterion("aunprice between", value1, value2, "aunprice");
            return (Criteria) this;
        }

        public Criteria andAunpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("aunprice not between", value1, value2, "aunprice");
            return (Criteria) this;
        }

        public Criteria andAcashpledgeIsNull() {
            addCriterion("acashpledge is null");
            return (Criteria) this;
        }

        public Criteria andAcashpledgeIsNotNull() {
            addCriterion("acashpledge is not null");
            return (Criteria) this;
        }

        public Criteria andAcashpledgeEqualTo(Integer value) {
            addCriterion("acashpledge =", value, "acashpledge");
            return (Criteria) this;
        }

        public Criteria andAcashpledgeNotEqualTo(Integer value) {
            addCriterion("acashpledge <>", value, "acashpledge");
            return (Criteria) this;
        }

        public Criteria andAcashpledgeGreaterThan(Integer value) {
            addCriterion("acashpledge >", value, "acashpledge");
            return (Criteria) this;
        }

        public Criteria andAcashpledgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("acashpledge >=", value, "acashpledge");
            return (Criteria) this;
        }

        public Criteria andAcashpledgeLessThan(Integer value) {
            addCriterion("acashpledge <", value, "acashpledge");
            return (Criteria) this;
        }

        public Criteria andAcashpledgeLessThanOrEqualTo(Integer value) {
            addCriterion("acashpledge <=", value, "acashpledge");
            return (Criteria) this;
        }

        public Criteria andAcashpledgeIn(List<Integer> values) {
            addCriterion("acashpledge in", values, "acashpledge");
            return (Criteria) this;
        }

        public Criteria andAcashpledgeNotIn(List<Integer> values) {
            addCriterion("acashpledge not in", values, "acashpledge");
            return (Criteria) this;
        }

        public Criteria andAcashpledgeBetween(Integer value1, Integer value2) {
            addCriterion("acashpledge between", value1, value2, "acashpledge");
            return (Criteria) this;
        }

        public Criteria andAcashpledgeNotBetween(Integer value1, Integer value2) {
            addCriterion("acashpledge not between", value1, value2, "acashpledge");
            return (Criteria) this;
        }

        public Criteria andAdelsignIsNull() {
            addCriterion("adelsign is null");
            return (Criteria) this;
        }

        public Criteria andAdelsignIsNotNull() {
            addCriterion("adelsign is not null");
            return (Criteria) this;
        }

        public Criteria andAdelsignEqualTo(Integer value) {
            addCriterion("adelsign =", value, "adelsign");
            return (Criteria) this;
        }

        public Criteria andAdelsignNotEqualTo(Integer value) {
            addCriterion("adelsign <>", value, "adelsign");
            return (Criteria) this;
        }

        public Criteria andAdelsignGreaterThan(Integer value) {
            addCriterion("adelsign >", value, "adelsign");
            return (Criteria) this;
        }

        public Criteria andAdelsignGreaterThanOrEqualTo(Integer value) {
            addCriterion("adelsign >=", value, "adelsign");
            return (Criteria) this;
        }

        public Criteria andAdelsignLessThan(Integer value) {
            addCriterion("adelsign <", value, "adelsign");
            return (Criteria) this;
        }

        public Criteria andAdelsignLessThanOrEqualTo(Integer value) {
            addCriterion("adelsign <=", value, "adelsign");
            return (Criteria) this;
        }

        public Criteria andAdelsignIn(List<Integer> values) {
            addCriterion("adelsign in", values, "adelsign");
            return (Criteria) this;
        }

        public Criteria andAdelsignNotIn(List<Integer> values) {
            addCriterion("adelsign not in", values, "adelsign");
            return (Criteria) this;
        }

        public Criteria andAdelsignBetween(Integer value1, Integer value2) {
            addCriterion("adelsign between", value1, value2, "adelsign");
            return (Criteria) this;
        }

        public Criteria andAdelsignNotBetween(Integer value1, Integer value2) {
            addCriterion("adelsign not between", value1, value2, "adelsign");
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