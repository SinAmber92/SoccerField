package com.soccerfield.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNull() {
            addCriterion("upassword is null");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNotNull() {
            addCriterion("upassword is not null");
            return (Criteria) this;
        }

        public Criteria andUpasswordEqualTo(String value) {
            addCriterion("upassword =", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotEqualTo(String value) {
            addCriterion("upassword <>", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThan(String value) {
            addCriterion("upassword >", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("upassword >=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThan(String value) {
            addCriterion("upassword <", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThanOrEqualTo(String value) {
            addCriterion("upassword <=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLike(String value) {
            addCriterion("upassword like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotLike(String value) {
            addCriterion("upassword not like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordIn(List<String> values) {
            addCriterion("upassword in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotIn(List<String> values) {
            addCriterion("upassword not in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordBetween(String value1, String value2) {
            addCriterion("upassword between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotBetween(String value1, String value2) {
            addCriterion("upassword not between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUtelphoneIsNull() {
            addCriterion("utelphone is null");
            return (Criteria) this;
        }

        public Criteria andUtelphoneIsNotNull() {
            addCriterion("utelphone is not null");
            return (Criteria) this;
        }

        public Criteria andUtelphoneEqualTo(String value) {
            addCriterion("utelphone =", value, "utelphone");
            return (Criteria) this;
        }

        public Criteria andUtelphoneNotEqualTo(String value) {
            addCriterion("utelphone <>", value, "utelphone");
            return (Criteria) this;
        }

        public Criteria andUtelphoneGreaterThan(String value) {
            addCriterion("utelphone >", value, "utelphone");
            return (Criteria) this;
        }

        public Criteria andUtelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("utelphone >=", value, "utelphone");
            return (Criteria) this;
        }

        public Criteria andUtelphoneLessThan(String value) {
            addCriterion("utelphone <", value, "utelphone");
            return (Criteria) this;
        }

        public Criteria andUtelphoneLessThanOrEqualTo(String value) {
            addCriterion("utelphone <=", value, "utelphone");
            return (Criteria) this;
        }

        public Criteria andUtelphoneLike(String value) {
            addCriterion("utelphone like", value, "utelphone");
            return (Criteria) this;
        }

        public Criteria andUtelphoneNotLike(String value) {
            addCriterion("utelphone not like", value, "utelphone");
            return (Criteria) this;
        }

        public Criteria andUtelphoneIn(List<String> values) {
            addCriterion("utelphone in", values, "utelphone");
            return (Criteria) this;
        }

        public Criteria andUtelphoneNotIn(List<String> values) {
            addCriterion("utelphone not in", values, "utelphone");
            return (Criteria) this;
        }

        public Criteria andUtelphoneBetween(String value1, String value2) {
            addCriterion("utelphone between", value1, value2, "utelphone");
            return (Criteria) this;
        }

        public Criteria andUtelphoneNotBetween(String value1, String value2) {
            addCriterion("utelphone not between", value1, value2, "utelphone");
            return (Criteria) this;
        }

        public Criteria andUpersonidIsNull() {
            addCriterion("upersonid is null");
            return (Criteria) this;
        }

        public Criteria andUpersonidIsNotNull() {
            addCriterion("upersonid is not null");
            return (Criteria) this;
        }

        public Criteria andUpersonidEqualTo(String value) {
            addCriterion("upersonid =", value, "upersonid");
            return (Criteria) this;
        }

        public Criteria andUpersonidNotEqualTo(String value) {
            addCriterion("upersonid <>", value, "upersonid");
            return (Criteria) this;
        }

        public Criteria andUpersonidGreaterThan(String value) {
            addCriterion("upersonid >", value, "upersonid");
            return (Criteria) this;
        }

        public Criteria andUpersonidGreaterThanOrEqualTo(String value) {
            addCriterion("upersonid >=", value, "upersonid");
            return (Criteria) this;
        }

        public Criteria andUpersonidLessThan(String value) {
            addCriterion("upersonid <", value, "upersonid");
            return (Criteria) this;
        }

        public Criteria andUpersonidLessThanOrEqualTo(String value) {
            addCriterion("upersonid <=", value, "upersonid");
            return (Criteria) this;
        }

        public Criteria andUpersonidLike(String value) {
            addCriterion("upersonid like", value, "upersonid");
            return (Criteria) this;
        }

        public Criteria andUpersonidNotLike(String value) {
            addCriterion("upersonid not like", value, "upersonid");
            return (Criteria) this;
        }

        public Criteria andUpersonidIn(List<String> values) {
            addCriterion("upersonid in", values, "upersonid");
            return (Criteria) this;
        }

        public Criteria andUpersonidNotIn(List<String> values) {
            addCriterion("upersonid not in", values, "upersonid");
            return (Criteria) this;
        }

        public Criteria andUpersonidBetween(String value1, String value2) {
            addCriterion("upersonid between", value1, value2, "upersonid");
            return (Criteria) this;
        }

        public Criteria andUpersonidNotBetween(String value1, String value2) {
            addCriterion("upersonid not between", value1, value2, "upersonid");
            return (Criteria) this;
        }

        public Criteria andUiconIsNull() {
            addCriterion("uicon is null");
            return (Criteria) this;
        }

        public Criteria andUiconIsNotNull() {
            addCriterion("uicon is not null");
            return (Criteria) this;
        }

        public Criteria andUiconEqualTo(String value) {
            addCriterion("uicon =", value, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconNotEqualTo(String value) {
            addCriterion("uicon <>", value, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconGreaterThan(String value) {
            addCriterion("uicon >", value, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconGreaterThanOrEqualTo(String value) {
            addCriterion("uicon >=", value, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconLessThan(String value) {
            addCriterion("uicon <", value, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconLessThanOrEqualTo(String value) {
            addCriterion("uicon <=", value, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconLike(String value) {
            addCriterion("uicon like", value, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconNotLike(String value) {
            addCriterion("uicon not like", value, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconIn(List<String> values) {
            addCriterion("uicon in", values, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconNotIn(List<String> values) {
            addCriterion("uicon not in", values, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconBetween(String value1, String value2) {
            addCriterion("uicon between", value1, value2, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconNotBetween(String value1, String value2) {
            addCriterion("uicon not between", value1, value2, "uicon");
            return (Criteria) this;
        }

        public Criteria andUaccessIsNull() {
            addCriterion("uaccess is null");
            return (Criteria) this;
        }

        public Criteria andUaccessIsNotNull() {
            addCriterion("uaccess is not null");
            return (Criteria) this;
        }

        public Criteria andUaccessEqualTo(Integer value) {
            addCriterion("uaccess =", value, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessNotEqualTo(Integer value) {
            addCriterion("uaccess <>", value, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessGreaterThan(Integer value) {
            addCriterion("uaccess >", value, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("uaccess >=", value, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessLessThan(Integer value) {
            addCriterion("uaccess <", value, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessLessThanOrEqualTo(Integer value) {
            addCriterion("uaccess <=", value, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessIn(List<Integer> values) {
            addCriterion("uaccess in", values, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessNotIn(List<Integer> values) {
            addCriterion("uaccess not in", values, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessBetween(Integer value1, Integer value2) {
            addCriterion("uaccess between", value1, value2, "uaccess");
            return (Criteria) this;
        }

        public Criteria andUaccessNotBetween(Integer value1, Integer value2) {
            addCriterion("uaccess not between", value1, value2, "uaccess");
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