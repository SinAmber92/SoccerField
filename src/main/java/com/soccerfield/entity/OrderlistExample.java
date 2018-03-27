package com.soccerfield.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderlistExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
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

        public Criteria andOrdertimeIsNull() {
            addCriterion("ordertime is null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNotNull() {
            addCriterion("ordertime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeEqualTo(Date value) {
            addCriterion("ordertime =", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotEqualTo(Date value) {
            addCriterion("ordertime <>", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThan(Date value) {
            addCriterion("ordertime >", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ordertime >=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThan(Date value) {
            addCriterion("ordertime <", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThanOrEqualTo(Date value) {
            addCriterion("ordertime <=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIn(List<Date> values) {
            addCriterion("ordertime in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotIn(List<Date> values) {
            addCriterion("ordertime not in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeBetween(Date value1, Date value2) {
            addCriterion("ordertime between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotBetween(Date value1, Date value2) {
            addCriterion("ordertime not between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrestarttimeIsNull() {
            addCriterion("orestarttime is null");
            return (Criteria) this;
        }

        public Criteria andOrestarttimeIsNotNull() {
            addCriterion("orestarttime is not null");
            return (Criteria) this;
        }

        public Criteria andOrestarttimeEqualTo(String value) {
            addCriterion("orestarttime =", value, "orestarttime");
            return (Criteria) this;
        }

        public Criteria andOrestarttimeNotEqualTo(String value) {
            addCriterion("orestarttime <>", value, "orestarttime");
            return (Criteria) this;
        }

        public Criteria andOrestarttimeGreaterThan(String value) {
            addCriterion("orestarttime >", value, "orestarttime");
            return (Criteria) this;
        }

        public Criteria andOrestarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("orestarttime >=", value, "orestarttime");
            return (Criteria) this;
        }

        public Criteria andOrestarttimeLessThan(String value) {
            addCriterion("orestarttime <", value, "orestarttime");
            return (Criteria) this;
        }

        public Criteria andOrestarttimeLessThanOrEqualTo(String value) {
            addCriterion("orestarttime <=", value, "orestarttime");
            return (Criteria) this;
        }

        public Criteria andOrestarttimeLike(String value) {
            addCriterion("orestarttime like", value, "orestarttime");
            return (Criteria) this;
        }

        public Criteria andOrestarttimeNotLike(String value) {
            addCriterion("orestarttime not like", value, "orestarttime");
            return (Criteria) this;
        }

        public Criteria andOrestarttimeIn(List<String> values) {
            addCriterion("orestarttime in", values, "orestarttime");
            return (Criteria) this;
        }

        public Criteria andOrestarttimeNotIn(List<String> values) {
            addCriterion("orestarttime not in", values, "orestarttime");
            return (Criteria) this;
        }

        public Criteria andOrestarttimeBetween(String value1, String value2) {
            addCriterion("orestarttime between", value1, value2, "orestarttime");
            return (Criteria) this;
        }

        public Criteria andOrestarttimeNotBetween(String value1, String value2) {
            addCriterion("orestarttime not between", value1, value2, "orestarttime");
            return (Criteria) this;
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

        public Criteria andOnameIsNull() {
            addCriterion("oname is null");
            return (Criteria) this;
        }

        public Criteria andOnameIsNotNull() {
            addCriterion("oname is not null");
            return (Criteria) this;
        }

        public Criteria andOnameEqualTo(String value) {
            addCriterion("oname =", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotEqualTo(String value) {
            addCriterion("oname <>", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThan(String value) {
            addCriterion("oname >", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThanOrEqualTo(String value) {
            addCriterion("oname >=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThan(String value) {
            addCriterion("oname <", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThanOrEqualTo(String value) {
            addCriterion("oname <=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLike(String value) {
            addCriterion("oname like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotLike(String value) {
            addCriterion("oname not like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameIn(List<String> values) {
            addCriterion("oname in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotIn(List<String> values) {
            addCriterion("oname not in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameBetween(String value1, String value2) {
            addCriterion("oname between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotBetween(String value1, String value2) {
            addCriterion("oname not between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOtelphoneIsNull() {
            addCriterion("otelphone is null");
            return (Criteria) this;
        }

        public Criteria andOtelphoneIsNotNull() {
            addCriterion("otelphone is not null");
            return (Criteria) this;
        }

        public Criteria andOtelphoneEqualTo(String value) {
            addCriterion("otelphone =", value, "otelphone");
            return (Criteria) this;
        }

        public Criteria andOtelphoneNotEqualTo(String value) {
            addCriterion("otelphone <>", value, "otelphone");
            return (Criteria) this;
        }

        public Criteria andOtelphoneGreaterThan(String value) {
            addCriterion("otelphone >", value, "otelphone");
            return (Criteria) this;
        }

        public Criteria andOtelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("otelphone >=", value, "otelphone");
            return (Criteria) this;
        }

        public Criteria andOtelphoneLessThan(String value) {
            addCriterion("otelphone <", value, "otelphone");
            return (Criteria) this;
        }

        public Criteria andOtelphoneLessThanOrEqualTo(String value) {
            addCriterion("otelphone <=", value, "otelphone");
            return (Criteria) this;
        }

        public Criteria andOtelphoneLike(String value) {
            addCriterion("otelphone like", value, "otelphone");
            return (Criteria) this;
        }

        public Criteria andOtelphoneNotLike(String value) {
            addCriterion("otelphone not like", value, "otelphone");
            return (Criteria) this;
        }

        public Criteria andOtelphoneIn(List<String> values) {
            addCriterion("otelphone in", values, "otelphone");
            return (Criteria) this;
        }

        public Criteria andOtelphoneNotIn(List<String> values) {
            addCriterion("otelphone not in", values, "otelphone");
            return (Criteria) this;
        }

        public Criteria andOtelphoneBetween(String value1, String value2) {
            addCriterion("otelphone between", value1, value2, "otelphone");
            return (Criteria) this;
        }

        public Criteria andOtelphoneNotBetween(String value1, String value2) {
            addCriterion("otelphone not between", value1, value2, "otelphone");
            return (Criteria) this;
        }

        public Criteria andOtotalIsNull() {
            addCriterion("ototal is null");
            return (Criteria) this;
        }

        public Criteria andOtotalIsNotNull() {
            addCriterion("ototal is not null");
            return (Criteria) this;
        }

        public Criteria andOtotalEqualTo(Integer value) {
            addCriterion("ototal =", value, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalNotEqualTo(Integer value) {
            addCriterion("ototal <>", value, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalGreaterThan(Integer value) {
            addCriterion("ototal >", value, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("ototal >=", value, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalLessThan(Integer value) {
            addCriterion("ototal <", value, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalLessThanOrEqualTo(Integer value) {
            addCriterion("ototal <=", value, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalIn(List<Integer> values) {
            addCriterion("ototal in", values, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalNotIn(List<Integer> values) {
            addCriterion("ototal not in", values, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalBetween(Integer value1, Integer value2) {
            addCriterion("ototal between", value1, value2, "ototal");
            return (Criteria) this;
        }

        public Criteria andOtotalNotBetween(Integer value1, Integer value2) {
            addCriterion("ototal not between", value1, value2, "ototal");
            return (Criteria) this;
        }

        public Criteria andOcashpledgeIsNull() {
            addCriterion("ocashpledge is null");
            return (Criteria) this;
        }

        public Criteria andOcashpledgeIsNotNull() {
            addCriterion("ocashpledge is not null");
            return (Criteria) this;
        }

        public Criteria andOcashpledgeEqualTo(Integer value) {
            addCriterion("ocashpledge =", value, "ocashpledge");
            return (Criteria) this;
        }

        public Criteria andOcashpledgeNotEqualTo(Integer value) {
            addCriterion("ocashpledge <>", value, "ocashpledge");
            return (Criteria) this;
        }

        public Criteria andOcashpledgeGreaterThan(Integer value) {
            addCriterion("ocashpledge >", value, "ocashpledge");
            return (Criteria) this;
        }

        public Criteria andOcashpledgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ocashpledge >=", value, "ocashpledge");
            return (Criteria) this;
        }

        public Criteria andOcashpledgeLessThan(Integer value) {
            addCriterion("ocashpledge <", value, "ocashpledge");
            return (Criteria) this;
        }

        public Criteria andOcashpledgeLessThanOrEqualTo(Integer value) {
            addCriterion("ocashpledge <=", value, "ocashpledge");
            return (Criteria) this;
        }

        public Criteria andOcashpledgeIn(List<Integer> values) {
            addCriterion("ocashpledge in", values, "ocashpledge");
            return (Criteria) this;
        }

        public Criteria andOcashpledgeNotIn(List<Integer> values) {
            addCriterion("ocashpledge not in", values, "ocashpledge");
            return (Criteria) this;
        }

        public Criteria andOcashpledgeBetween(Integer value1, Integer value2) {
            addCriterion("ocashpledge between", value1, value2, "ocashpledge");
            return (Criteria) this;
        }

        public Criteria andOcashpledgeNotBetween(Integer value1, Integer value2) {
            addCriterion("ocashpledge not between", value1, value2, "ocashpledge");
            return (Criteria) this;
        }

        public Criteria andOstatusIsNull() {
            addCriterion("ostatus is null");
            return (Criteria) this;
        }

        public Criteria andOstatusIsNotNull() {
            addCriterion("ostatus is not null");
            return (Criteria) this;
        }

        public Criteria andOstatusEqualTo(Integer value) {
            addCriterion("ostatus =", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotEqualTo(Integer value) {
            addCriterion("ostatus <>", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusGreaterThan(Integer value) {
            addCriterion("ostatus >", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ostatus >=", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusLessThan(Integer value) {
            addCriterion("ostatus <", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusLessThanOrEqualTo(Integer value) {
            addCriterion("ostatus <=", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusIn(List<Integer> values) {
            addCriterion("ostatus in", values, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotIn(List<Integer> values) {
            addCriterion("ostatus not in", values, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusBetween(Integer value1, Integer value2) {
            addCriterion("ostatus between", value1, value2, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ostatus not between", value1, value2, "ostatus");
            return (Criteria) this;
        }

        public Criteria andDeletesignIsNull() {
            addCriterion("deletesign is null");
            return (Criteria) this;
        }

        public Criteria andDeletesignIsNotNull() {
            addCriterion("deletesign is not null");
            return (Criteria) this;
        }

        public Criteria andDeletesignEqualTo(Integer value) {
            addCriterion("deletesign =", value, "deletesign");
            return (Criteria) this;
        }

        public Criteria andDeletesignNotEqualTo(Integer value) {
            addCriterion("deletesign <>", value, "deletesign");
            return (Criteria) this;
        }

        public Criteria andDeletesignGreaterThan(Integer value) {
            addCriterion("deletesign >", value, "deletesign");
            return (Criteria) this;
        }

        public Criteria andDeletesignGreaterThanOrEqualTo(Integer value) {
            addCriterion("deletesign >=", value, "deletesign");
            return (Criteria) this;
        }

        public Criteria andDeletesignLessThan(Integer value) {
            addCriterion("deletesign <", value, "deletesign");
            return (Criteria) this;
        }

        public Criteria andDeletesignLessThanOrEqualTo(Integer value) {
            addCriterion("deletesign <=", value, "deletesign");
            return (Criteria) this;
        }

        public Criteria andDeletesignIn(List<Integer> values) {
            addCriterion("deletesign in", values, "deletesign");
            return (Criteria) this;
        }

        public Criteria andDeletesignNotIn(List<Integer> values) {
            addCriterion("deletesign not in", values, "deletesign");
            return (Criteria) this;
        }

        public Criteria andDeletesignBetween(Integer value1, Integer value2) {
            addCriterion("deletesign between", value1, value2, "deletesign");
            return (Criteria) this;
        }

        public Criteria andDeletesignNotBetween(Integer value1, Integer value2) {
            addCriterion("deletesign not between", value1, value2, "deletesign");
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