package com.example.demo.Model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import lombok.Data;
import lombok.ToString;
@Data
@ToString
@Entity
@Table(name="lob")
@Validated

public class Lob {
	@Id
	
	@NotNull
	@Size(min=1,max=12,message="lob code should have atleast 12 character")
	@Column(name="lob_code")
    private String LOB_CODE;
    
	
	@NotNull
	@Size(min=1,max=240,message="lob desc should have atleast 240 character")
	@Column(name="lob_desc")
	private String LOB_DESC;
	
	@NotNull
	@Size(min=1,max=240,message="lob desc bl should have atleast 240 character")
	@Column(name="lob_desc_bl")
	private String LOB_DESC_BL;
	
	@NotNull
	@Size(min=1,max=60,message="lob short desc should have atleast 60 character")
	@Column(name="lob_short_desc")
	private String LOB_SHORT_DESC;
	
	@NotNull
	@Size(min=1,max=60,message="lob url should have atleast 60 character")
	@Column(name="lob_url")
	private String LOB_URL;
	
	@Column(name="lob_eff_fm_dt")
	private Date LOB_EFF_FM_DT;
	
	@Column(name="lob_eff_to_dt")
	private Date LOB_EFF_TO_DT;
	
	@NotNull
	@Size(min=1,max=12,message="lob code should have atleast 12 character")
	@Column(name="lob_cr_uid")
	private String LOB_CR_UID;
	
	@Column(name="lob_cr_dt")
	private Date LOB_CR_DT;
	
	@NotNull
	@Size(min=1,max=12,message="lob code should have atleast 12 character")
	@Column(name="lob_upd_uid")
	private String LOB_UPD_UID;
	
	@Column(name="lob_upd_dt")
	private Date LOB_UPD_DT;
	
	
	
	
	public String getLOB_CODE() {
		return LOB_CODE;
	}


	public void setLOB_CODE(String lOB_CODE) {
		this.LOB_CODE = lOB_CODE;
	}


	public String getLOB_DESC() {
		return LOB_DESC;
	}


	public void setLOB_DESC(String lOB_DESC) {
		this.LOB_DESC = lOB_DESC;
	}


	public String getLOB_DESC_BL() {
		return LOB_DESC_BL;
	}


	public void setLOB_DESC_BL(String lOB_DESC_BL) {
		this.LOB_DESC_BL = lOB_DESC_BL;
	}


	public String getLOB_SHORT_DESC() {
		return LOB_SHORT_DESC;
	}


	public void setLOB_SHORT_DESC(String lOB_SHORT_DESC) {
		this.LOB_SHORT_DESC = lOB_SHORT_DESC;
	}


	public String getLOB_URL() {
		return LOB_URL;
	}


	public void setLOB_URL(String lOB_URL) {
		this.LOB_URL = lOB_URL;
	}


	public Date getLOB_EFF_FM_DT() {
		return LOB_EFF_FM_DT;
	}


	public void setLOB_EFF_FM_DT(Date lOB_EFF_FM_DT) {
		this.LOB_EFF_FM_DT = lOB_EFF_FM_DT;
	}


	public Date getLOB_EFF_TO_DT() {
		return LOB_EFF_TO_DT;
	}


	public void setLOB_EFF_TO_DT(Date lOB_EFF_TO_DT) {
		this.LOB_EFF_TO_DT = lOB_EFF_TO_DT;
	}


	public String getLOB_CR_UID() {
		return LOB_CR_UID;
	}


	public void setLOB_CR_UID(String lOB_CR_UID) {
		this.LOB_CR_UID = lOB_CR_UID;
	}


	public Date getLOB_CR_DT() {
		return LOB_CR_DT;
	}


	public void setLOB_CR_DT(Date lOB_CR_DT) {
		this.LOB_CR_DT = lOB_CR_DT;
	}


	public String getLOB_UPD_UID() {
		return LOB_UPD_UID;
	}


	public void setLOB_UPD_UID(String lOB_UPD_UID) {
		this.LOB_UPD_UID = lOB_UPD_UID;
	}


	public Date getLOB_UPD_DT() {
		return LOB_UPD_DT;
	}


	public void setLOB_UPD_DT(Date lOB_UPD_DT) {
		this.LOB_UPD_DT = lOB_UPD_DT;
	}


	public Lob() {
	    	
	    }


	public Lob(@NotNull @Size(min = 1, max = 12, message = "lob code should have 12 character") String lOB_CODE,
			@NotNull @Size(min = 1, max = 240, message = "lob desc should have 240 character") String lOB_DESC,
			@NotNull @Size(min = 1, max = 240, message = "lob desc bl should have 240 character") String lOB_DESC_BL,
			@NotNull @Size(min = 1, max = 60, message = "lob short desc should have 60 character") String lOB_SHORT_DESC,
			@NotNull @Size(min = 1, max = 60, message = "lob code should have 60 character") String lOB_URL,
			Date lOB_EFF_FM_DT, Date lOB_EFF_TO_DT,
			@NotNull @Size(min = 1, max = 12, message = "lob code should have 12 character") String lOB_CR_UID,
			Date lOB_CR_DT,
			@NotNull @Size(min = 1, max = 12, message = "lob code should have 12 character") String lOB_UPD_UID,
			Date lOB_UPD_DT) {
		super();
		LOB_CODE = lOB_CODE;
		LOB_DESC = lOB_DESC;
		LOB_DESC_BL = lOB_DESC_BL;
		LOB_SHORT_DESC = lOB_SHORT_DESC;
		LOB_URL = lOB_URL;
		LOB_EFF_FM_DT = lOB_EFF_FM_DT;
		LOB_EFF_TO_DT = lOB_EFF_TO_DT;
		LOB_CR_UID = lOB_CR_UID;
		LOB_CR_DT = lOB_CR_DT;
		LOB_UPD_UID = lOB_UPD_UID;
		LOB_UPD_DT = lOB_UPD_DT;
		
	}


	
}