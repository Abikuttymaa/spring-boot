package com.example.demo.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="proinsur")
public class Product {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     
     @Column(name="scheme_serial_no",nullable = false)
  	 private int schemeSerialNo;
     
     @NotNull
     @Size(min=1,max = 12, message = "agent group code should have atleast 12 characters")
     @Column(name="agent_group_code",nullable = false)
 	 private String agentGroupCode;
     
     @NotNull
     @Size(min=1,max = 12, message = "company code should have atleast 12 characters")
     @Column(name="company_code",nullable = false)
 	 private String companyCode;
     
     @NotNull
     @Size(min=1,max = 12, message = "lob code should have atleast 12 characters")
     @Column(name="lobcode",nullable = false)
     private String lOBCode;
     
     @NotNull
     @Size(min=1,max = 12, message = "product code should have atleast 12 characters")
     @Column(name="product_code",nullable = false)
     private String productCode;
     
     @NotNull
     @Size(min=1,max = 12, message = "scheme code should have atleast 12 characters")
     @Column(name="scheme_code",nullable = false)
 	 private String schemeCode;
     
     @NotNull
     @Size(min=1,max = 12, message = "scheme color should have atleast 12 characters")
     @Column(name="scheme_color",nullable = false)
 	 private String schemeColor;
     
     @NotNull
     @Size(min=1,max=1, message = "filteryn should have atleast 1 characters")
     @Column(name="filteryn",nullable = false)
 	 private String filterYN;
     
     @Column(name="year",nullable = false,length=9999)
     
 	 private int year;
     
     @NotNull
     @Size(min=1,max=1,message = "show rate yn should have atleast 1 characters")
     @Column(name="show_rateyn",nullable = false)
 	 private String showRateYN;
     
     @NotNull
     @Size(min=1,max=1, message = "appr check should have atleast 1 characters")
     @Column(name="appr_check",nullable = false)
 	 private String apprCheck;
     
     @NotNull
     @Size(min=1,max=1,message = "ded enable yn should have atleast 1 characters")
     @Column(name="ded_enableyn",nullable = false)
 	 private String dedEnableYN;
     
     @NotNull
     @Size(min=1,max=1,message = "description enable yn should have atleast 1 characters")
     @Column(name="description_enableyn",nullable = false)
 	 private String descriptionEnableYN;
     
     @NotNull
     @Size(min=1,max=1,message = "fees enable yn should have atleast 1 characters")
     @Column(name="fees_enableyn",nullable = false)
 	 private String feesEnableYN;
     
     @NotNull
     @Size(min=0,max=1,message = "load enable yn should have atleast 1 characters")
     @Column(name="load_enableyn",nullable = false)
 	 private String loadEnableYN;
     
     @NotNull
     @Size(min=1,max=1,message = "drv enable yn should have atleast 1 characters")
     @Column(name="drv_enableyn",nullable = false)
 	 private String drvEnableYN;
     
     @NotNull
     @Size(min=1,max=1,message = "take ful yn should have atleast 1 characters")
     @Column(name="take_fulyn",nullable = false)
 	 private String takeFulYN;
     
     @NotNull
     @Size(min=1,max=1,message = "renold rate yn should have atleast 1 characters")
     @Column(name="renold_rateyn",nullable = false)
 	 private String renoldRateYN;
     
     @NotNull
     @Size(min=1,max=1,message = "drv lic yn should have atleast 1 characters")
     @Column(name="drvlicyn",nullable = false)
 	 private String drvLICYn;
     
     @NotNull
     @Size(min=1,max=1,message = "best buy yn should have atleast 1 characters")
     @Column(name="best_buyyn",nullable = false)
 	 private String bestBuyYN;
     
     @NotNull
     @Size(min=1,max = 12, message = "scheme old color should have atleast 12 characters")
     @Column(name="schemeold_color",nullable = false)
 	 private String schemeoldColor;
     
    
     @Column(name="effective_from_date",nullable = false)	 
     private Date effectiveFromDate;
     
    
     @Column(name="effective_to_date",nullable = false)
 	 private Date effectiveToDate;
    
    public Product() {
    	
    }

	public Product(int schemeSerialNo, String agentGroupCode, String companyCode, String lOBCode, String productCode,
			String schemeCode, String schemeColor, String filterYN, int year, String showRateYN, String apprCheck,
			String dedEnableYN, String descriptionEnableYN, String feesEnableYN, String loadEnableYN,
			String drvEnableYN, String takeFulYN, String renoldRateYN, String drvLICYn, String bestBuyYN,
			String schemeoldColor, Date effectiveFromDate, Date effectiveToDate) {
		super();
		this.schemeSerialNo = schemeSerialNo;
		this.agentGroupCode = agentGroupCode;
		this.companyCode = companyCode;
		this.lOBCode = lOBCode;
		this.productCode = productCode;
		this.schemeCode = schemeCode;
		this.schemeColor = schemeColor;
		this.filterYN = filterYN;
		this.year = year;
		this.showRateYN = showRateYN;
		this.apprCheck = apprCheck;
		this.dedEnableYN = dedEnableYN;
		this.descriptionEnableYN = descriptionEnableYN;
		this.feesEnableYN = feesEnableYN;
		this.loadEnableYN = loadEnableYN;
		this.drvEnableYN = drvEnableYN;
		this.takeFulYN = takeFulYN;
		this.renoldRateYN = renoldRateYN;
		this.drvLICYn = drvLICYn;
		this.bestBuyYN = bestBuyYN;
		this.schemeoldColor = schemeoldColor;
		this.effectiveFromDate = effectiveFromDate;
		this.effectiveToDate = effectiveToDate;
	}

	public int getschemeSerialNo() {
		return schemeSerialNo;
	}

	public void setschemeSerialNo(int schemeSerialNo) {
		this.schemeSerialNo = schemeSerialNo;
	}

	public String getagentGroupCode() {
		return agentGroupCode;
	}

	public void setagentGroupCode(String agentGroupCode) {
		this.agentGroupCode = agentGroupCode;
	}

	public String getcompanyCode() {
		return companyCode;
	}

	public void setcompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getlOBCode() {
		return lOBCode;
	}

	public void setlOBCode(String lOBCode) {
		this.lOBCode = lOBCode;
	}

	public String getproductCode() {
		return productCode;
	}

	public void setproductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getschemeCode() {
		return schemeCode;
	}

	public void setschemeCode(String schemeCode) {
		this.schemeCode = schemeCode;
	}

	public String getschemeColor() {
		return schemeColor;
	}

	public void setschemeColor(String schemeColor) {
		this.schemeColor = schemeColor;
	}

	public String getfilterYN() {
		return filterYN;
	}

	public void setfilterYN(String filterYN) {
		this.filterYN = filterYN;
	}

	public int getyear() {
		return year;
	}

	public void setyear(int year) {
		this.year = year;
	}

	public String getshowRateYN() {
		return showRateYN;
	}

	public void setshowRateYN(String showRateYN) {
		this.showRateYN = showRateYN;
	}

	public String getapprCheck() {
		return apprCheck;
	}

	public void setapprCheck(String apprCheck) {
		this.apprCheck = apprCheck;
	}

	public String getdedEnableYN() {
		return dedEnableYN;
	}

	public void setdedEnableYN(String dedEnableYN) {
		this.dedEnableYN = dedEnableYN;
	}

	public String getdescriptionEnableYN() {
		return descriptionEnableYN;
	}

	public void setdescriptionEnableYN(String descriptionEnableYN) {
		this.descriptionEnableYN = descriptionEnableYN;
	}

	public String getfeesEnableYN() {
		return feesEnableYN;
	}

	public void setfeesEnableYN(String feesEnableYN) {
		this.feesEnableYN = feesEnableYN;
	}

	public String getloadEnableYN() {
		return loadEnableYN;
	}

	public void setloadEnableYN(String loadEnableYN) {
		this.loadEnableYN = loadEnableYN;
	}

	public String getdrvEnableYN() {
		return drvEnableYN;
	}

	public void setdrvEnableYN(String drvEnableYN) {
		this.drvEnableYN = drvEnableYN;
	}

	public String gettakeFulYN() {
		return takeFulYN;
	}

	public void settakeFulYN(String takeFulYN) {
		this.takeFulYN = takeFulYN;
	}

	public String getrenoldRateYN() {
		return renoldRateYN;
	}

	public void setrenoldRateYN(String renoldRateYN) {
		this.renoldRateYN = renoldRateYN;
	}

	public String getdrvLICYn() {
		return drvLICYn;
	}

	public void setdrvLICYn(String drvLICYn) {
		this.drvLICYn = drvLICYn;
	}

	public String getbestBuyYN() {
		return bestBuyYN;
	}

	public void setbestBuyYN(String bestBuyYN) {
		this.bestBuyYN = bestBuyYN;
	}

	public String getschemeoldColor() {
		return schemeoldColor;
	}

	public void setschemeoldColor(String schemeoldColor) {
		this.schemeoldColor = schemeoldColor;
	}

	public Date geteffectiveFromDate() {
		return effectiveFromDate;
	}

	public void seteffectiveFromDate(Date effectiveFromDate) {
		this.effectiveFromDate = effectiveFromDate;
	}

	public Date geteffectiveToDate() {
		return effectiveToDate;
	}

	public void seteffectiveToDate(Date effectiveToDate) {
		this.effectiveToDate = effectiveToDate;
	}

    
        
	@Override
	public String toString() {
		return "Product [schemeSerialNo=" + schemeSerialNo + ",agentGroupCode=" + agentGroupCode +",companyCode="+ companyCode +",lOBCode=" + lOBCode +",productCode=" + productCode +","
				+ ",schemeCode=" + schemeCode +",schemeColor="+ schemeColor +",filterYN="+ filterYN +",year="+ year +",showRateYN="+ showRateYN +","
						+ ",apprCheck="+ apprCheck +",dedEnableYN=" + dedEnableYN +",descriptionEnableYN="+ descriptionEnableYN +","
								+ ",feesEnableYN="+ feesEnableYN +",loadEnableYN="+ loadEnableYN +",drvEnableYN="+ drvEnableYN +",takeFulYN="+ takeFulYN +","
										+ ",renoldRateYN="+ renoldRateYN +",drvLICYn="+ drvLICYn +",bestBuyYN="+ bestBuyYN +",schemeoldColor=" + schemeoldColor +","
												+ ",effectiveFromDate="+ effectiveFromDate +",effectiveToDate="+ effectiveToDate +"]";	  
	}
	
}	
	
