package com.example.lab4_fp_grupo4.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name="employees")
public class Employees {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "employeeid")
    private Integer employeeid;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "phonenumber")
    private String phonenumber;
    @Column(name = "hiredate")
    private Date hiredate;
    @ManyToOne
    @JoinColumn(name = "jobid")
    private Jobs jobid;
    @Column(name = "salary")
    private BigDecimal salary;
    @Column(name = "commissionpct")
    private BigDecimal commissionpct;
    @Column(name = "managerid")
    private Integer managerid;
    @ManyToOne
    @JoinColumn(name = "deparmentid")
    private Departments deparmentid;
    @Column(name = "enabled")
    private Integer enabled;

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Jobs getJobid() {
        return jobid;
    }

    public void setJobid(Jobs jobid) {
        this.jobid = jobid;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getCommissionpct() {
        return commissionpct;
    }

    public void setCommissionpct(BigDecimal commissionpct) {
        this.commissionpct = commissionpct;
    }

    public Integer getManagerid() {
        return managerid;
    }

    public void setManagerid(Integer managerid) {
        this.managerid = managerid;
    }

    public Departments getDeparmentid() {
        return deparmentid;
    }

    public void setDeparmentid(Departments deparmentid) {
        this.deparmentid = deparmentid;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }





}
