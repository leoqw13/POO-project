
package Entities;

import java.util.Date;


public class Seller {
    private String name;
    private Integer id;
    private Double basicSalary;
    private Double commissions;
    private Double monthlySalary;
    private Date startDate;

    public Seller() {
    }

    public Seller(String name, Integer id, Double basicSalary, Double commissions, Double monthlySalary, Date startDate) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.commissions = commissions;
        this.monthlySalary = monthlySalary;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Double getCommissions() {
        return commissions;
    }

    public void setCommissions(Double commissions) {
        this.commissions = commissions;
    }

    public Double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(Double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Seller{" + "name=" + name + ", id=" + id + ", basicSalary=" + basicSalary + ", commissions=" + commissions + ", monthlySalary=" + monthlySalary + ", startDate=" + startDate + '}';
    }
    
    
}
