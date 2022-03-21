package com.example.demo.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
@Table(name="scheme")
public class ProductScheme {
    @Id
    @NotNull
    @Size(min=1,max=12,message="psch prod code is required")
    @Column(name="psch_prod_code")
	private String PSCH_PROD_CODE;
    
    @NotNull
    @Size(min=1,max=12,message="psch comp code is required")
    @Column(name="psch_comp_code")
	private String PSCH_COMP_CODE;
    
    @NotNull
    @Size(min=1,max=12,message="psch scheme code is required")
    @Column(name="psch_scheme_code")
	private String PSCH_SCHEME_CODE;
    
    @NotNull
    @Size(min=1,max=12,message="psch scheme name is required")
    @Column(name="psch_scheme_name")
	private String PSCH_SCHEME_NAME;
    
    @NotNull
    @Size(min=1,max=240,message="psch scheme name bl is required")
    @Column(name="psch_scheme_name_bl")
	private String PSCH_SCHEME_NAME_BL;
    
    @NotNull
    @Size(min=1,max=1,message="psch scheme name bl yn is required")
    @Column(name="psch_scheme_name_bl_yn")
	private String PSCH_SCHEME_NAME_BL_YN;
    
    @NotNull
    @Size(min=1,max=1,message="psch sep disc entry yn is required")
    @Column(name="psch_sep_disc_entry_yn")
	private String PSCH_SEP_DISC_ENTRY_YN;
    
    @NotNull
    @Size(min=1,max=1,message="psch sep load entry yn is required")
    @Column(name="psch_sep_load_entry_yn")
	private String PSCH_SEP_LOAD_ENTRY_YN;
    
    @NotNull
    @Size(min=1,max=1,message="psch sep fees entry yn is required")
    @Column(name="psch_sep_fees_entry_yn")
	private String PSCH_SEP_FEES_ENTRY_YN;
    
    
    @Column(name="psch_prod_fm_dt")
	private Date PSCH_EFF_FM_DT;
    
    
    @Column(name="psch_eff_to_dt")
	private Date PSCH_EFF_TO_DT;
    
    @NotNull
    @Size(min=1,max=12,message="psch cr uid is required")
    @Column(name="psch_cr_uid")
	private String PSCH_CR_UID;
    
    @NotNull
    @Size(min=1,max=12,message="psch upd uid is required")
    @Column(name="psch_upd_uid")
	private String PSCH_UPD_UID;
    
    @Column(name="psch_cr_dt")
	private Date PSCH_CR_DT;
    
    
    @Column(name="psch_upd_dt")
	private Date PSCH_UPD_DT;
    
    @NotNull
    @Size(min=1,max=4000,message="psch long desc is required")
    @Column(name="psch_long_desc")
	private String PSCH_LONG_DESC;
    
    @NotNull
    @Size(min=1,max=60,message="psch dflt fac pool is required")
    @Column(name="psch_dflt_fac_pool")
	private String PSCH_DFLT_FAC_POOL;
    
    @NotNull
    @Size(min=1,max=60,message="psch risk url is required")
    @Column(name="psch_risk_url")
	private String PSCH_RISK_URL;
    
    @NotNull
    @Size(min=1,max=1,message="psch_sep_tax_entry_yn is required")
    @Column(name="psch_sep_tax_entry_yn")
	private String PSCH_SEP_TAX_ENTRY_YN;

	public String getPSCH_PROD_CODE() {
		return PSCH_PROD_CODE;
	}

	public void setPSCH_PROD_CODE(String pSCH_PROD_CODE) {
		this.PSCH_PROD_CODE = pSCH_PROD_CODE;
	}

	public String getPSCH_COMP_CODE() {
		return PSCH_COMP_CODE;
	}

	public void setPSCH_COMP_CODE(String pSCH_COMP_CODE) {
		this.PSCH_COMP_CODE = pSCH_COMP_CODE;
	}

	public String getPSCH_SCHEME_CODE() {
		return PSCH_SCHEME_CODE;
	}

	public void setPSCH_SCHEME_CODE(String pSCH_SCHEME_CODE) {
		this.PSCH_SCHEME_CODE = pSCH_SCHEME_CODE;
	}

	public String getPSCH_SCHEME_NAME() {
		return PSCH_SCHEME_NAME;
	}

	public void setPSCH_SCHEME_NAME(String pSCH_SCHEME_NAME) {
		this.PSCH_SCHEME_NAME = pSCH_SCHEME_NAME;
	}

	public String getPSCH_SCHEME_NAME_BL() {
		return PSCH_SCHEME_NAME_BL;
	}

	public void setPSCH_SCHEME_NAME_BL(String pSCH_SCHEME_NAME_BL) {
		this.PSCH_SCHEME_NAME_BL = pSCH_SCHEME_NAME_BL;
	}

	public String getPSCH_SCHEME_NAME_BL_YN() {
		return PSCH_SCHEME_NAME_BL_YN;
	}

	public void setPSCH_SCHEME_NAME_BL_YN(String pSCH_SCHEME_NAME_BL_YN) {
		this.PSCH_SCHEME_NAME_BL_YN = pSCH_SCHEME_NAME_BL_YN;
	}

	public String getPSCH_SEP_DISC_ENTRY_YN() {
		return PSCH_SEP_DISC_ENTRY_YN;
	}

	public void setPSCH_SEP_DISC_ENTRY_YN(String pSCH_SEP_DISC_ENTRY_YN) {
		this.PSCH_SEP_DISC_ENTRY_YN = pSCH_SEP_DISC_ENTRY_YN;
	}

	public String getPSCH_SEP_LOAD_ENTRY_YN() {
		return PSCH_SEP_LOAD_ENTRY_YN;
	}

	public void setPSCH_SEP_LOAD_ENTRY_YN(String pSCH_SEP_LOAD_ENTRY_YN) {
		this.PSCH_SEP_LOAD_ENTRY_YN = pSCH_SEP_LOAD_ENTRY_YN;
	}

	public String getPSCH_SEP_FEES_ENTRY_YN() {
		return PSCH_SEP_FEES_ENTRY_YN;
	}

	public void setPSCH_SEP_FEES_ENTRY_YN(String pSCH_SEP_FEES_ENTRY_YN) {
		this.PSCH_SEP_FEES_ENTRY_YN = pSCH_SEP_FEES_ENTRY_YN;
	}

	public Date getPSCH_EFF_FM_DT() {
		return PSCH_EFF_FM_DT;
	}

	public void setPSCH_EFF_FM_DT(Date pSCH_EFF_FM_DT) {
		this.PSCH_EFF_FM_DT = pSCH_EFF_FM_DT;
	}

	public Date getPSCH_EFF_TO_DT() {
		return PSCH_EFF_TO_DT;
	}

	public void setPSCH_EFF_TO_DT(Date pSCH_EFF_TO_DT) {
		this.PSCH_EFF_TO_DT = pSCH_EFF_TO_DT;
	}

	public String getPSCH_CR_UID() {
		return PSCH_CR_UID;
	}

	public void setPSCH_CR_UID(String pSCH_CR_UID) {
		this.PSCH_CR_UID = pSCH_CR_UID;
	}

	public String getPSCH_UPD_UID() {
		return PSCH_UPD_UID;
	}

	public void setPSCH_UPD_UID(String pSCH_UPD_UID) {
		this.PSCH_UPD_UID = pSCH_UPD_UID;
	}

	public Date getPSCH_CR_DT() {
		return PSCH_CR_DT;
	}

	public void setPSCH_CR_DT(Date pSCH_CR_DT) {
		this.PSCH_CR_DT = pSCH_CR_DT;
	}

	public Date getPSCH_UPD_DT() {
		return PSCH_UPD_DT;
	}

	public void setPSCH_UPD_DT(Date pSCH_UPD_DT) {
		this.PSCH_UPD_DT = pSCH_UPD_DT;
	}

	public String getPSCH_LONG_DESC() {
		return PSCH_LONG_DESC;
	}

	public void setPSCH_LONG_DESC(String pSCH_LONG_DESC) {
		this.PSCH_LONG_DESC = pSCH_LONG_DESC;
	}

	public String getPSCH_DFLT_FAC_POOL() {
		return PSCH_DFLT_FAC_POOL;
	}

	public void setPSCH_DFLT_FAC_POOL(String pSCH_DFLT_FAC_POOL) {
		this.PSCH_DFLT_FAC_POOL = pSCH_DFLT_FAC_POOL;
	}

	public String getPSCH_RISK_URL() {
		return PSCH_RISK_URL;
	}

	public void setPSCH_RISK_URL(String pSCH_RISK_URL) {
		this.PSCH_RISK_URL = pSCH_RISK_URL;
	}

	public String getPSCH_SEP_TAX_ENTRY_YN() {
		return PSCH_SEP_TAX_ENTRY_YN;
	}

	public void setPSCH_SEP_TAX_ENTRY_YN(String pSCH_SEP_TAX_ENTRY_YN) {
		this.PSCH_SEP_TAX_ENTRY_YN = pSCH_SEP_TAX_ENTRY_YN;
	}
	
    public ProductScheme(){
    	
    }

	public ProductScheme(
			@NotNull @Size(min = 1, max = 12, message = "psch prod code is required") String pSCH_PROD_CODE,
			@NotNull @Size(min = 1, max = 12, message = "psch comp code is required") String pSCH_COMP_CODE,
			@NotNull @Size(min = 1, max = 12, message = "psch scheme code is required") String pSCH_SCHEME_CODE,
			@NotNull @Size(min = 1, max = 12, message = "psch scheme name is required") String pSCH_SCHEME_NAME,
			@NotNull @Size(min = 1, max = 240, message = "psch scheme name bl is required") String pSCH_SCHEME_NAME_BL,
			@NotNull @Size(min = 1, max = 1, message = "psch scheme name bl yn is required") String pSCH_SCHEME_NAME_BL_YN,
			@NotNull @Size(min = 1, max = 1, message = "psch sep disc entry yn is required") String pSCH_SEP_DISC_ENTRY_YN,
			@NotNull @Size(min = 1, max = 1, message = "psch sep load entry yn is required") String pSCH_SEP_LOAD_ENTRY_YN,
			@NotNull @Size(min = 1, max = 1, message = "psch sep fees entry yn is required") String pSCH_SEP_FEES_ENTRY_YN,
			Date pSCH_EFF_FM_DT, Date pSCH_EFF_TO_DT,
			@NotNull @Size(min = 1, max = 12, message = "psch cr uid is required") String pSCH_CR_UID,
			@NotNull @Size(min = 1, max = 12, message = "psch upd uid is required") String pSCH_UPD_UID,
			Date pSCH_CR_DT, Date pSCH_UPD_DT,
			@NotNull @Size(min = 1, max = 4000, message = "psch long desc is required") String pSCH_LONG_DESC,
			@NotNull @Size(min = 1, max = 60, message = "psch dflt fac pool is required") String pSCH_DFLT_FAC_POOL,
			@NotNull @Size(min = 1, max = 60, message = "psch risk url is required") String pSCH_RISK_URL,
			@NotNull @Size(min = 1, max = 1, message = "psch_sep_tax_entry_yn is required") String pSCH_SEP_TAX_ENTRY_YN) {
		super();
		PSCH_PROD_CODE = pSCH_PROD_CODE;
		PSCH_COMP_CODE = pSCH_COMP_CODE;
		PSCH_SCHEME_CODE = pSCH_SCHEME_CODE;
		PSCH_SCHEME_NAME = pSCH_SCHEME_NAME;
		PSCH_SCHEME_NAME_BL = pSCH_SCHEME_NAME_BL;
		PSCH_SCHEME_NAME_BL_YN = pSCH_SCHEME_NAME_BL_YN;
		PSCH_SEP_DISC_ENTRY_YN = pSCH_SEP_DISC_ENTRY_YN;
		PSCH_SEP_LOAD_ENTRY_YN = pSCH_SEP_LOAD_ENTRY_YN;
		PSCH_SEP_FEES_ENTRY_YN = pSCH_SEP_FEES_ENTRY_YN;
		PSCH_EFF_FM_DT = pSCH_EFF_FM_DT;
		PSCH_EFF_TO_DT = pSCH_EFF_TO_DT;
		PSCH_CR_UID = pSCH_CR_UID;
		PSCH_UPD_UID = pSCH_UPD_UID;
		PSCH_CR_DT = pSCH_CR_DT;
		PSCH_UPD_DT = pSCH_UPD_DT;
		PSCH_LONG_DESC = pSCH_LONG_DESC;
		PSCH_DFLT_FAC_POOL = pSCH_DFLT_FAC_POOL;
		PSCH_RISK_URL = pSCH_RISK_URL;
		PSCH_SEP_TAX_ENTRY_YN = pSCH_SEP_TAX_ENTRY_YN;
	}
    
}
