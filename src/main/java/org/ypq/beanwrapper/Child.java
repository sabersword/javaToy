package org.ypq.beanwrapper;

import java.math.BigDecimal;

public class Child {

    private BigDecimal salary;
    private Parent parent;

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
}
