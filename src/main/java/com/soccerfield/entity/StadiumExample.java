package com.soccerfield.entity;

import java.util.ArrayList;
import java.util.List;

public class StadiumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StadiumExample() {
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

        public Criteria andStanameIsNull() {
            addCriterion("staname is null");
            return (Criteria) this;
        }

        public Criteria andStanameIsNotNull() {
            addCriterion("staname is not null");
            return (Criteria) this;
        }

        public Criteria andStanameEqualTo(String value) {
            addCriterion("staname =", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameNotEqualTo(String value) {
            addCriterion("staname <>", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameGreaterThan(String value) {
            addCriterion("staname >", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameGreaterThanOrEqualTo(String value) {
            addCriterion("staname >=", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameLessThan(String value) {
            addCriterion("staname <", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameLessThanOrEqualTo(String value) {
            addCriterion("staname <=", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameLike(String value) {
            addCriterion("staname like", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameNotLike(String value) {
            addCriterion("staname not like", value, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameIn(List<String> values) {
            addCriterion("staname in", values, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameNotIn(List<String> values) {
            addCriterion("staname not in", values, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameBetween(String value1, String value2) {
            addCriterion("staname between", value1, value2, "staname");
            return (Criteria) this;
        }

        public Criteria andStanameNotBetween(String value1, String value2) {
            addCriterion("staname not between", value1, value2, "staname");
            return (Criteria) this;
        }

        public Criteria andStaaddrIsNull() {
            addCriterion("staaddr is null");
            return (Criteria) this;
        }

        public Criteria andStaaddrIsNotNull() {
            addCriterion("staaddr is not null");
            return (Criteria) this;
        }

        public Criteria andStaaddrEqualTo(String value) {
            addCriterion("staaddr =", value, "staaddr");
            return (Criteria) this;
        }

        public Criteria andStaaddrNotEqualTo(String value) {
            addCriterion("staaddr <>", value, "staaddr");
            return (Criteria) this;
        }

        public Criteria andStaaddrGreaterThan(String value) {
            addCriterion("staaddr >", value, "staaddr");
            return (Criteria) this;
        }

        public Criteria andStaaddrGreaterThanOrEqualTo(String value) {
            addCriterion("staaddr >=", value, "staaddr");
            return (Criteria) this;
        }

        public Criteria andStaaddrLessThan(String value) {
            addCriterion("staaddr <", value, "staaddr");
            return (Criteria) this;
        }

        public Criteria andStaaddrLessThanOrEqualTo(String value) {
            addCriterion("staaddr <=", value, "staaddr");
            return (Criteria) this;
        }

        public Criteria andStaaddrLike(String value) {
            addCriterion("staaddr like", value, "staaddr");
            return (Criteria) this;
        }

        public Criteria andStaaddrNotLike(String value) {
            addCriterion("staaddr not like", value, "staaddr");
            return (Criteria) this;
        }

        public Criteria andStaaddrIn(List<String> values) {
            addCriterion("staaddr in", values, "staaddr");
            return (Criteria) this;
        }

        public Criteria andStaaddrNotIn(List<String> values) {
            addCriterion("staaddr not in", values, "staaddr");
            return (Criteria) this;
        }

        public Criteria andStaaddrBetween(String value1, String value2) {
            addCriterion("staaddr between", value1, value2, "staaddr");
            return (Criteria) this;
        }

        public Criteria andStaaddrNotBetween(String value1, String value2) {
            addCriterion("staaddr not between", value1, value2, "staaddr");
            return (Criteria) this;
        }

        public Criteria andStaintroIsNull() {
            addCriterion("staintro is null");
            return (Criteria) this;
        }

        public Criteria andStaintroIsNotNull() {
            addCriterion("staintro is not null");
            return (Criteria) this;
        }

        public Criteria andStaintroEqualTo(String value) {
            addCriterion("staintro =", value, "staintro");
            return (Criteria) this;
        }

        public Criteria andStaintroNotEqualTo(String value) {
            addCriterion("staintro <>", value, "staintro");
            return (Criteria) this;
        }

        public Criteria andStaintroGreaterThan(String value) {
            addCriterion("staintro >", value, "staintro");
            return (Criteria) this;
        }

        public Criteria andStaintroGreaterThanOrEqualTo(String value) {
            addCriterion("staintro >=", value, "staintro");
            return (Criteria) this;
        }

        public Criteria andStaintroLessThan(String value) {
            addCriterion("staintro <", value, "staintro");
            return (Criteria) this;
        }

        public Criteria andStaintroLessThanOrEqualTo(String value) {
            addCriterion("staintro <=", value, "staintro");
            return (Criteria) this;
        }

        public Criteria andStaintroLike(String value) {
            addCriterion("staintro like", value, "staintro");
            return (Criteria) this;
        }

        public Criteria andStaintroNotLike(String value) {
            addCriterion("staintro not like", value, "staintro");
            return (Criteria) this;
        }

        public Criteria andStaintroIn(List<String> values) {
            addCriterion("staintro in", values, "staintro");
            return (Criteria) this;
        }

        public Criteria andStaintroNotIn(List<String> values) {
            addCriterion("staintro not in", values, "staintro");
            return (Criteria) this;
        }

        public Criteria andStaintroBetween(String value1, String value2) {
            addCriterion("staintro between", value1, value2, "staintro");
            return (Criteria) this;
        }

        public Criteria andStaintroNotBetween(String value1, String value2) {
            addCriterion("staintro not between", value1, value2, "staintro");
            return (Criteria) this;
        }

        public Criteria andStapicIsNull() {
            addCriterion("stapic is null");
            return (Criteria) this;
        }

        public Criteria andStapicIsNotNull() {
            addCriterion("stapic is not null");
            return (Criteria) this;
        }

        public Criteria andStapicEqualTo(String value) {
            addCriterion("stapic =", value, "stapic");
            return (Criteria) this;
        }

        public Criteria andStapicNotEqualTo(String value) {
            addCriterion("stapic <>", value, "stapic");
            return (Criteria) this;
        }

        public Criteria andStapicGreaterThan(String value) {
            addCriterion("stapic >", value, "stapic");
            return (Criteria) this;
        }

        public Criteria andStapicGreaterThanOrEqualTo(String value) {
            addCriterion("stapic >=", value, "stapic");
            return (Criteria) this;
        }

        public Criteria andStapicLessThan(String value) {
            addCriterion("stapic <", value, "stapic");
            return (Criteria) this;
        }

        public Criteria andStapicLessThanOrEqualTo(String value) {
            addCriterion("stapic <=", value, "stapic");
            return (Criteria) this;
        }

        public Criteria andStapicLike(String value) {
            addCriterion("stapic like", value, "stapic");
            return (Criteria) this;
        }

        public Criteria andStapicNotLike(String value) {
            addCriterion("stapic not like", value, "stapic");
            return (Criteria) this;
        }

        public Criteria andStapicIn(List<String> values) {
            addCriterion("stapic in", values, "stapic");
            return (Criteria) this;
        }

        public Criteria andStapicNotIn(List<String> values) {
            addCriterion("stapic not in", values, "stapic");
            return (Criteria) this;
        }

        public Criteria andStapicBetween(String value1, String value2) {
            addCriterion("stapic between", value1, value2, "stapic");
            return (Criteria) this;
        }

        public Criteria andStapicNotBetween(String value1, String value2) {
            addCriterion("stapic not between", value1, value2, "stapic");
            return (Criteria) this;
        }

        public Criteria andStatelIsNull() {
            addCriterion("statel is null");
            return (Criteria) this;
        }

        public Criteria andStatelIsNotNull() {
            addCriterion("statel is not null");
            return (Criteria) this;
        }

        public Criteria andStatelEqualTo(String value) {
            addCriterion("statel =", value, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelNotEqualTo(String value) {
            addCriterion("statel <>", value, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelGreaterThan(String value) {
            addCriterion("statel >", value, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelGreaterThanOrEqualTo(String value) {
            addCriterion("statel >=", value, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelLessThan(String value) {
            addCriterion("statel <", value, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelLessThanOrEqualTo(String value) {
            addCriterion("statel <=", value, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelLike(String value) {
            addCriterion("statel like", value, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelNotLike(String value) {
            addCriterion("statel not like", value, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelIn(List<String> values) {
            addCriterion("statel in", values, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelNotIn(List<String> values) {
            addCriterion("statel not in", values, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelBetween(String value1, String value2) {
            addCriterion("statel between", value1, value2, "statel");
            return (Criteria) this;
        }

        public Criteria andStatelNotBetween(String value1, String value2) {
            addCriterion("statel not between", value1, value2, "statel");
            return (Criteria) this;
        }

        public Criteria andStaopentimeIsNull() {
            addCriterion("staopentime is null");
            return (Criteria) this;
        }

        public Criteria andStaopentimeIsNotNull() {
            addCriterion("staopentime is not null");
            return (Criteria) this;
        }

        public Criteria andStaopentimeEqualTo(String value) {
            addCriterion("staopentime =", value, "staopentime");
            return (Criteria) this;
        }

        public Criteria andStaopentimeNotEqualTo(String value) {
            addCriterion("staopentime <>", value, "staopentime");
            return (Criteria) this;
        }

        public Criteria andStaopentimeGreaterThan(String value) {
            addCriterion("staopentime >", value, "staopentime");
            return (Criteria) this;
        }

        public Criteria andStaopentimeGreaterThanOrEqualTo(String value) {
            addCriterion("staopentime >=", value, "staopentime");
            return (Criteria) this;
        }

        public Criteria andStaopentimeLessThan(String value) {
            addCriterion("staopentime <", value, "staopentime");
            return (Criteria) this;
        }

        public Criteria andStaopentimeLessThanOrEqualTo(String value) {
            addCriterion("staopentime <=", value, "staopentime");
            return (Criteria) this;
        }

        public Criteria andStaopentimeLike(String value) {
            addCriterion("staopentime like", value, "staopentime");
            return (Criteria) this;
        }

        public Criteria andStaopentimeNotLike(String value) {
            addCriterion("staopentime not like", value, "staopentime");
            return (Criteria) this;
        }

        public Criteria andStaopentimeIn(List<String> values) {
            addCriterion("staopentime in", values, "staopentime");
            return (Criteria) this;
        }

        public Criteria andStaopentimeNotIn(List<String> values) {
            addCriterion("staopentime not in", values, "staopentime");
            return (Criteria) this;
        }

        public Criteria andStaopentimeBetween(String value1, String value2) {
            addCriterion("staopentime between", value1, value2, "staopentime");
            return (Criteria) this;
        }

        public Criteria andStaopentimeNotBetween(String value1, String value2) {
            addCriterion("staopentime not between", value1, value2, "staopentime");
            return (Criteria) this;
        }

        public Criteria andStaclosetimeIsNull() {
            addCriterion("staclosetime is null");
            return (Criteria) this;
        }

        public Criteria andStaclosetimeIsNotNull() {
            addCriterion("staclosetime is not null");
            return (Criteria) this;
        }

        public Criteria andStaclosetimeEqualTo(String value) {
            addCriterion("staclosetime =", value, "staclosetime");
            return (Criteria) this;
        }

        public Criteria andStaclosetimeNotEqualTo(String value) {
            addCriterion("staclosetime <>", value, "staclosetime");
            return (Criteria) this;
        }

        public Criteria andStaclosetimeGreaterThan(String value) {
            addCriterion("staclosetime >", value, "staclosetime");
            return (Criteria) this;
        }

        public Criteria andStaclosetimeGreaterThanOrEqualTo(String value) {
            addCriterion("staclosetime >=", value, "staclosetime");
            return (Criteria) this;
        }

        public Criteria andStaclosetimeLessThan(String value) {
            addCriterion("staclosetime <", value, "staclosetime");
            return (Criteria) this;
        }

        public Criteria andStaclosetimeLessThanOrEqualTo(String value) {
            addCriterion("staclosetime <=", value, "staclosetime");
            return (Criteria) this;
        }

        public Criteria andStaclosetimeLike(String value) {
            addCriterion("staclosetime like", value, "staclosetime");
            return (Criteria) this;
        }

        public Criteria andStaclosetimeNotLike(String value) {
            addCriterion("staclosetime not like", value, "staclosetime");
            return (Criteria) this;
        }

        public Criteria andStaclosetimeIn(List<String> values) {
            addCriterion("staclosetime in", values, "staclosetime");
            return (Criteria) this;
        }

        public Criteria andStaclosetimeNotIn(List<String> values) {
            addCriterion("staclosetime not in", values, "staclosetime");
            return (Criteria) this;
        }

        public Criteria andStaclosetimeBetween(String value1, String value2) {
            addCriterion("staclosetime between", value1, value2, "staclosetime");
            return (Criteria) this;
        }

        public Criteria andStaclosetimeNotBetween(String value1, String value2) {
            addCriterion("staclosetime not between", value1, value2, "staclosetime");
            return (Criteria) this;
        }

        public Criteria andStaunittimeIsNull() {
            addCriterion("staunittime is null");
            return (Criteria) this;
        }

        public Criteria andStaunittimeIsNotNull() {
            addCriterion("staunittime is not null");
            return (Criteria) this;
        }

        public Criteria andStaunittimeEqualTo(String value) {
            addCriterion("staunittime =", value, "staunittime");
            return (Criteria) this;
        }

        public Criteria andStaunittimeNotEqualTo(String value) {
            addCriterion("staunittime <>", value, "staunittime");
            return (Criteria) this;
        }

        public Criteria andStaunittimeGreaterThan(String value) {
            addCriterion("staunittime >", value, "staunittime");
            return (Criteria) this;
        }

        public Criteria andStaunittimeGreaterThanOrEqualTo(String value) {
            addCriterion("staunittime >=", value, "staunittime");
            return (Criteria) this;
        }

        public Criteria andStaunittimeLessThan(String value) {
            addCriterion("staunittime <", value, "staunittime");
            return (Criteria) this;
        }

        public Criteria andStaunittimeLessThanOrEqualTo(String value) {
            addCriterion("staunittime <=", value, "staunittime");
            return (Criteria) this;
        }

        public Criteria andStaunittimeLike(String value) {
            addCriterion("staunittime like", value, "staunittime");
            return (Criteria) this;
        }

        public Criteria andStaunittimeNotLike(String value) {
            addCriterion("staunittime not like", value, "staunittime");
            return (Criteria) this;
        }

        public Criteria andStaunittimeIn(List<String> values) {
            addCriterion("staunittime in", values, "staunittime");
            return (Criteria) this;
        }

        public Criteria andStaunittimeNotIn(List<String> values) {
            addCriterion("staunittime not in", values, "staunittime");
            return (Criteria) this;
        }

        public Criteria andStaunittimeBetween(String value1, String value2) {
            addCriterion("staunittime between", value1, value2, "staunittime");
            return (Criteria) this;
        }

        public Criteria andStaunittimeNotBetween(String value1, String value2) {
            addCriterion("staunittime not between", value1, value2, "staunittime");
            return (Criteria) this;
        }

        public Criteria andSdelsignIsNull() {
            addCriterion("sdelsign is null");
            return (Criteria) this;
        }

        public Criteria andSdelsignIsNotNull() {
            addCriterion("sdelsign is not null");
            return (Criteria) this;
        }

        public Criteria andSdelsignEqualTo(Integer value) {
            addCriterion("sdelsign =", value, "sdelsign");
            return (Criteria) this;
        }

        public Criteria andSdelsignNotEqualTo(Integer value) {
            addCriterion("sdelsign <>", value, "sdelsign");
            return (Criteria) this;
        }

        public Criteria andSdelsignGreaterThan(Integer value) {
            addCriterion("sdelsign >", value, "sdelsign");
            return (Criteria) this;
        }

        public Criteria andSdelsignGreaterThanOrEqualTo(Integer value) {
            addCriterion("sdelsign >=", value, "sdelsign");
            return (Criteria) this;
        }

        public Criteria andSdelsignLessThan(Integer value) {
            addCriterion("sdelsign <", value, "sdelsign");
            return (Criteria) this;
        }

        public Criteria andSdelsignLessThanOrEqualTo(Integer value) {
            addCriterion("sdelsign <=", value, "sdelsign");
            return (Criteria) this;
        }

        public Criteria andSdelsignIn(List<Integer> values) {
            addCriterion("sdelsign in", values, "sdelsign");
            return (Criteria) this;
        }

        public Criteria andSdelsignNotIn(List<Integer> values) {
            addCriterion("sdelsign not in", values, "sdelsign");
            return (Criteria) this;
        }

        public Criteria andSdelsignBetween(Integer value1, Integer value2) {
            addCriterion("sdelsign between", value1, value2, "sdelsign");
            return (Criteria) this;
        }

        public Criteria andSdelsignNotBetween(Integer value1, Integer value2) {
            addCriterion("sdelsign not between", value1, value2, "sdelsign");
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