/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Capellix
 */
@Entity
@Table(name = "COVIDDATA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coviddata.findAll", query = "SELECT c FROM Coviddata c"),
    @NamedQuery(name = "Coviddata.findById", query = "SELECT c FROM Coviddata c WHERE c.id = :id"),
    @NamedQuery(name = "Coviddata.findByYears", query = "SELECT c FROM Coviddata c WHERE c.years = :years"),
    @NamedQuery(name = "Coviddata.findByWeeknum", query = "SELECT c FROM Coviddata c WHERE c.weeknum = :weeknum"),
    @NamedQuery(name = "Coviddata.findByProvince", query = "SELECT c FROM Coviddata c WHERE c.province = :province"),
    @NamedQuery(name = "Coviddata.findByNewCase", query = "SELECT c FROM Coviddata c WHERE c.newCase = :newCase"),
    @NamedQuery(name = "Coviddata.findByTotalCase", query = "SELECT c FROM Coviddata c WHERE c.totalCase = :totalCase"),
    @NamedQuery(name = "Coviddata.findByNewCaseExcludeabroad", query = "SELECT c FROM Coviddata c WHERE c.newCaseExcludeabroad = :newCaseExcludeabroad"),
    @NamedQuery(name = "Coviddata.findByTotalCaseExcludeabroad", query = "SELECT c FROM Coviddata c WHERE c.totalCaseExcludeabroad = :totalCaseExcludeabroad"),
    @NamedQuery(name = "Coviddata.findByNewDeath", query = "SELECT c FROM Coviddata c WHERE c.newDeath = :newDeath"),
    @NamedQuery(name = "Coviddata.findByTotalDeath", query = "SELECT c FROM Coviddata c WHERE c.totalDeath = :totalDeath"),
    @NamedQuery(name = "Coviddata.findByUpdateDate", query = "SELECT c FROM Coviddata c WHERE c.updateDate = :updateDate")})
public class Coviddata implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "YEARS")
    private Integer years;
    @Column(name = "WEEKNUM")
    private Integer weeknum;
    @Size(max = 40)
    @Column(name = "PROVINCE")
    private String province;
    @Column(name = "NEW_CASE")
    private Integer newCase;
    @Column(name = "TOTAL_CASE")
    private Integer totalCase;
    @Column(name = "NEW_CASE_EXCLUDEABROAD")
    private Integer newCaseExcludeabroad;
    @Column(name = "TOTAL_CASE_EXCLUDEABROAD")
    private Integer totalCaseExcludeabroad;
    @Column(name = "NEW_DEATH")
    private Integer newDeath;
    @Column(name = "TOTAL_DEATH")
    private Integer totalDeath;
    @Size(max = 40)
    @Column(name = "UPDATE_DATE")
    private String updateDate;

    public Coviddata() {
    }

    public Coviddata(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public Integer getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(Integer weeknum) {
        this.weeknum = weeknum;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getNewCase() {
        return newCase;
    }

    public void setNewCase(Integer newCase) {
        this.newCase = newCase;
    }

    public Integer getTotalCase() {
        return totalCase;
    }

    public void setTotalCase(Integer totalCase) {
        this.totalCase = totalCase;
    }

    public Integer getNewCaseExcludeabroad() {
        return newCaseExcludeabroad;
    }

    public void setNewCaseExcludeabroad(Integer newCaseExcludeabroad) {
        this.newCaseExcludeabroad = newCaseExcludeabroad;
    }

    public Integer getTotalCaseExcludeabroad() {
        return totalCaseExcludeabroad;
    }

    public void setTotalCaseExcludeabroad(Integer totalCaseExcludeabroad) {
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
    }

    public Integer getNewDeath() {
        return newDeath;
    }

    public void setNewDeath(Integer newDeath) {
        this.newDeath = newDeath;
    }

    public Integer getTotalDeath() {
        return totalDeath;
    }

    public void setTotalDeath(Integer totalDeath) {
        this.totalDeath = totalDeath;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coviddata)) {
            return false;
        }
        Coviddata other = (Coviddata) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Coviddata[ id=" + id + " ]";
    }
    
}
