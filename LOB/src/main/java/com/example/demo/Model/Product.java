package com.example.demo.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="product")
public class Product {
		@Id
		@NotNull
		@Size(min=1,max=12,message="prod code should have atleast 12 characters")
		@Column(name="prod_code",nullable = false)
		private String PROD_CODE;
		
		@NotNull
		@Size(min=1,max=240,message="prod desc should have atleast 240 characters")
		@Column(name="prod_desc",nullable = false)
		private String PROD_DESC;
		
		@NotNull
		@Size(min=1,max=240,message="prod desc bl should have atleast 240 characters")
		@Column(name="prod_desc_bl",nullable = false)
		private String PROD_DESC_BL;
		
		@NotNull
		@Size(min=1,max=60,message="prod short desc should have atleast 60 characters")
		@Column(name="prod_short_desc",nullable = false)
		private String PROD_SHORT_DESC;
		
		@NotNull
		@Size(min=1,max=60,message="prod short desc should have atleast 60 characters")
		@Column(name="prod_short_desc_bl",nullable = false)
		private String PROD_SHORT_DESC_BL;
		
		@NotNull
		@Size(min=1,max=12,message="prod lob  code should have atleast 12 characters")
		@Column(name="prod_lob_code",nullable = false)
		private String PROD_LOB_CODE;
		
		@NotNull
		@Size(min=1,max=1,message="prod inst yn should have atleast 1 characters")
		@Column(name="prod_inst_yn",nullable = false)
		private String PROD_INST_YN;
		
		@NotNull
		@Size(min=1,max=1,message="prod annual yn should have atleast 1 characters")
		@Column(name="prod_annual_yn",nullable = false)
		private String PROD_ANNUAL_YN;
		
		@NotNull
		@Column(name="prod_max_disc_perc",nullable = false)
		private int  PROD_MAX_DISC_PERC;
		
		@NotNull
		@Column(name="prod_clm_intm_days",nullable = false)
		private int PROD_CLM_INTM_DAYS;
		
		@NotNull
		@Size(min=1,max=1,message="prod clm si valid yn should have atleast 1 characters")
		@Column(name="prod_clm_si_valid_yn",nullable = false)
		private String PROD_CLM_SI_VALID_YN;
		
		@NotNull
		@Size(min=1,max=1,message="prod clm lossdt valid yn should have atleast 1 characters")
		@Column(name="prod_clm_lossdt_valid_yn",nullable = false)
		private String PROD_CLM_LOSSDT_VALID_YN;
		
		@NotNull
		@Size(min=1,max=1,message="prod clm reinst val yn should have atleast 1 characters")
		@Column(name="prod_clm_reinst_val_yn",nullable = false)
		private String PROD_CLM_REINST_VAL_YN;
		
		@NotNull
		@Column(name="prod_clm_close_prox_days",nullable = false)
		private String PROD_CLM_CLOSE_PROX_DAYS;
		
		
		@Column(name="prod_eff_fm_dt",nullable = false)
		private Date PROD_EFF_FM_DT;
		
		@Column(name="prod_eff_to_dt",nullable = false)
		private Date PROD_EFF_TO_DT;
		
		@NotNull
		@Size(min=1,max=12,message="prod ri tty basis should have atleast 12 characters")
		@Column(name="prod_ri_tty_basis",nullable = false)
		private String PROD_RI_TTY_BASIS;
		
		@NotNull
		@Size(min=1,max=12,message="prod ri end alloc basis should have atleast 12 characters")
		@Column(name="prod_ri_end_alloc_basis",nullable = false)
		private String PROD_RI_END_ALLOC_BASIS;
		
		@NotNull
		@Size(min=1,max=12,message="prod ri ceding basis should have atleast 12 characters")
		@Column(name="prod_ri_ceding_basis",nullable = false)
		private String PROD_RI_CEDING_BASIS;
		
		@Column(name="prod_cr_dt",nullable = false)
		private Date PROD_CR_DT;
		
		@NotNull
		@Size(min=1,max=12,message="prod cr uid should have atleast 12 characters")
		@Column(name="prod_cr_uid",nullable = false)
		private String PROD_CR_UID;
		
		@NotNull
		@Column(name="prod_upd_dt",nullable = false)
		private Date PROD_UPD_DT;
		
		@NotNull
		@Size(min=1,max=12,message="prod upd uid should have atleast 12 characters")
		@Column(name="prod_upd_uid",nullable = false)
		private String PROD_UPD_UID;
		
		@NotNull
		@Size(min=1,max=1,message="prod fac auto appr yn should have atleast 1 characters")
		@Column(name="prod_fac_auto_appr_yn",nullable = false)
		private String PROD_FAC_AUTO_APPR_YN;
		
		@NotNull
		@Size(min=2,max=2,message="prod ri alloc type should have atleast 2 characters")
		@Column(name="prod_ri_alloc_type",nullable = false)
		private String PROD_RI_ALLOC_TYPE;
		
		@NotNull
		@Size(min=1,max=1,message="prod int insur yn should have atleast 1 characters")
		@Column(name="prod_ind_insure_yn",nullable = false)
		private String PROD_IND_INSURE_YN;
		
		
		public String getPROD_CODE() {
			return PROD_CODE;
		}
		public void setPROD_CODE(String pROD_CODE) {
		     this.PROD_CODE = pROD_CODE;
		}
		public String getPROD_DESC() {
			return PROD_DESC;
		}
		public void setPROD_DESC(String pROD_DESC) {
			this.PROD_DESC = pROD_DESC;
		}
		public String getPROD_DESC_BL() {
			return PROD_DESC_BL;
		}
		public void setPROD_DESC_BL(String pROD_DESC_BL) {
		   this.PROD_DESC_BL = pROD_DESC_BL;
		}
		public String getPROD_SHORT_DESC() {
			return PROD_SHORT_DESC;
		}
		public void setPROD_SHORT_DESC(String pROD_SHORT_DESC) {
			this.PROD_SHORT_DESC = pROD_SHORT_DESC;
		}
		public String getPROD_SHORT_DESC_BL() {
			return PROD_SHORT_DESC_BL;
		}
		public void setPROD_SHORT_DESC_BL(String pROD_SHORT_DESC_BL) {
			this.PROD_SHORT_DESC_BL = pROD_SHORT_DESC_BL;
		}
		public String getPROD_LOB_CODE() {
			return PROD_LOB_CODE;
		}
		public void setPROD_LOB_CODE(String pROD_LOB_CODE) {
			this.PROD_LOB_CODE = pROD_LOB_CODE;
		}
		public String getPROD_INST_YN() {
			return PROD_INST_YN;
		}
		public void setPROD_INST_YN(String pROD_INST_YN) {
			this.PROD_INST_YN = pROD_INST_YN;
		}
		public String getPROD_ANNUAL_YN() {
			return PROD_ANNUAL_YN;
		}
		public void setPROD_ANNUAL_YN(String PROD_ANNUAL_YN) {
			this.PROD_ANNUAL_YN = PROD_ANNUAL_YN;
		}
		public int getPROD_MAX_DISC_PERC() {
			return PROD_MAX_DISC_PERC;
		}
		public void setPROD_MAX_DISC_PERC(int pROD_MAX_DISC_PERC) {
			this.PROD_MAX_DISC_PERC = pROD_MAX_DISC_PERC;
		}
		public int getPROD_CLM_INTM_DAYS() {
			return PROD_CLM_INTM_DAYS;
		}
		public void setPROD_CLM_INTM_DAYS(String PROD_CLM_INTM_DAYS) {
			this.PROD_ANNUAL_YN  = PROD_CLM_INTM_DAYS;
		}
		public String getPROD_CLM_SI_VALID_YN() {
			return PROD_CLM_SI_VALID_YN;
		}
		public void setPROD_CLM_SI_VALID_YN(String pROD_CLM_SI_VALID_YN) {
			this.PROD_CLM_SI_VALID_YN = pROD_CLM_SI_VALID_YN;
		}
		public String getPROD_CLM_LOSSDT_VALID_YN() {
			return PROD_CLM_LOSSDT_VALID_YN;
		}
		public void setPROD_CLM_LOSSDT_VALID_YN(String pROD_CLM_LOSSDT_VALID_YN) {
			this.PROD_CLM_LOSSDT_VALID_YN = pROD_CLM_LOSSDT_VALID_YN;
		}
		public String getPROD_CLM_REINST_VAL_YN() {
			return PROD_CLM_REINST_VAL_YN;
		}
		public void setPROD_CLM_REINST_VAL_YN(String pROD_CLM_REINST_VAL_YN) {
			this.PROD_CLM_REINST_VAL_YN = pROD_CLM_REINST_VAL_YN;
		}
		public String getPROD_CLM_CLOSE_PROX_DAYS() {
			return PROD_CLM_CLOSE_PROX_DAYS;
		}
		public void setPROD_CLM_CLOSE_PROX_DAYS(String pROD_CLM_CLOSE_PROX_DAYS) {
			this.PROD_CLM_CLOSE_PROX_DAYS = pROD_CLM_CLOSE_PROX_DAYS;
		}
		public Date getPROD_EFF_FM_DT() {
			return PROD_EFF_FM_DT;
		}
		public void setPROD_EFF_FM_DT(Date pROD_EFF_FM_DT) {
			this.PROD_EFF_FM_DT = pROD_EFF_FM_DT;
		}
		public Date getPROD_EFF_TO_DT() {
			return PROD_EFF_TO_DT;
		}
		public void setPROD_EFF_TO_DT(Date pROD_EFF_TO_DT) {
			this.PROD_EFF_TO_DT = pROD_EFF_TO_DT;
		}
		public String getPROD_RI_TTY_BASIS() {
			return PROD_RI_TTY_BASIS;
		}
		public void setPROD_RI_TTY_BASIS(String pROD_RI_TTY_BASIS) {
			this.PROD_RI_TTY_BASIS = pROD_RI_TTY_BASIS;
		}
		public String getPROD_RI_END_ALLOC_BASIS() {
			return PROD_RI_END_ALLOC_BASIS;
		}
		public void setPROD_RI_END_ALLOC_BASIS(String pROD_RI_END_ALLOC_BASIS) {
			this.PROD_RI_END_ALLOC_BASIS = pROD_RI_END_ALLOC_BASIS;
		}
		public String getPROD_RI_CEDING_BASIS() {
			return PROD_RI_CEDING_BASIS;
		}
		public void setPROD_RI_CEDING_BASIS(String pROD_RI_CEDING_BASIS) {
			this.PROD_RI_CEDING_BASIS = pROD_RI_CEDING_BASIS;
		}
		public Date getPROD_CR_DT() {
			return PROD_CR_DT;
		}
		public void setPROD_CR_DT(Date pROD_CR_DT) {
			this.PROD_CR_DT = pROD_CR_DT;
		}
		public String getPROD_CR_UID() {
			return PROD_CR_UID;
		}
		public void setPROD_CR_UID(String pROD_CR_UID) {
			this.PROD_CR_UID = pROD_CR_UID;
		}
		public Date getPROD_UPD_DT() {
			return PROD_UPD_DT;
		}
		public void setPROD_UPD_DT(Date pROD_UPD_DT) {
			this.PROD_UPD_DT = pROD_UPD_DT;
		}
		public String getPROD_UPD_UID() {
			return PROD_UPD_UID;
		}
		public void setPROD_UPD_UID(String pROD_UPD_UID) {
			this.PROD_UPD_UID = pROD_UPD_UID;
		}
		public String getPROD_FAC_AUTO_APPR_YN() {
			return PROD_FAC_AUTO_APPR_YN;
		}
		public void setPROD_FAC_AUTO_APPR_YN(String pROD_FAC_AUTO_APPR_YN) {
			this.PROD_FAC_AUTO_APPR_YN = pROD_FAC_AUTO_APPR_YN;
		}
		public String getPROD_RI_ALLOC_TYPE() {
			return PROD_RI_ALLOC_TYPE;
		}
		public void setPROD_RI_ALLOC_TYPE(String pROD_RI_ALLOC_TYPE) {
			this.PROD_RI_ALLOC_TYPE = pROD_RI_ALLOC_TYPE;
		}
		public String getPROD_IND_INSURE_YN() {
			return PROD_IND_INSURE_YN;
		}
		public void setPROD_IND_INSURE_YN(String pROD_IND_INSURE_YN) {
			this.PROD_IND_INSURE_YN = pROD_IND_INSURE_YN;
		}
		public Product() {
			
		}
		public Product(
				@NotNull @Size(min = 1, max = 12, message = "prod code should have atleast 12 characters") String pROD_CODE,
				@NotNull @Size(min = 1, max = 240, message = "prod desc should have atleast 240 characters") String pROD_DESC,
				@NotNull @Size(min = 1, max = 240, message = "prod desc bl should have atleast 240 characters") String pROD_DESC_BL,
				@NotNull @Size(min = 1, max = 60, message = "prod short desc should have atleast 60 characters") String pROD_SHORT_DESC,
				@NotNull @Size(min = 1, max = 60, message = "prod short desc should have atleast 60 characters") String pROD_SHORT_DESC_BL,
				@NotNull @Size(min = 1, max = 12, message = "prod lob  code should have atleast 12 characters") String pROD_LOB_CODE,
				@NotNull @Size(min = 1, max = 1, message = "prod inst yn should have atleast 1 characters") String pROD_INST_YN,
				@NotNull @Size(min = 1, max = 1, message = "prod annual yn should have atleast 1 characters") String pROD_ANNUAL_YN,
				@NotNull int pROD_MAX_DISC_PERC, @NotNull int pROD_CLM_INTM_DAYS,
				@NotNull @Size(min = 1, max = 1, message = "prod clm si valid yn should have atleast 1 characters") String pROD_CLM_SI_VALID_YN,
				@NotNull @Size(min = 1, max = 1, message = "prod clm lossdt valid yn should have atleast 1 characters") String pROD_CLM_LOSSDT_VALID_YN,
				@NotNull @Size(min = 1, max = 1, message = "prod clm reinst val yn should have atleast 1 characters") String pROD_CLM_REINST_VAL_YN,
				@NotNull String pROD_CLM_CLOSE_PROX_DAYS, Date pROD_EFF_FM_DT, Date pROD_EFF_TO_DT,
				@NotNull @Size(min = 1, max = 12, message = "prod ri tty basis should have atleast 12 characters") String pROD_RI_TTY_BASIS,
				@NotNull @Size(min = 1, max = 12, message = "prod ri end alloc basis should have atleast 12 characters") String pROD_RI_END_ALLOC_BASIS,
				@NotNull @Size(min = 1, max = 12, message = "prod ri ceding basis should have atleast 12 characters") String pROD_RI_CEDING_BASIS,
				Date pROD_CR_DT,
				@NotNull @Size(min = 1, max = 12, message = "prod cr uid should have atleast 12 characters") String pROD_CR_UID,
				@NotNull Date pROD_UPD_DT,
				@NotNull @Size(min = 1, max = 12, message = "prod upd uid should have atleast 12 characters") String pROD_UPD_UID,
				@NotNull @Size(min = 1, max = 1, message = "prod fac auto appr yn should have atleast 1 characters") String pROD_FAC_AUTO_APPR_YN,
				@NotNull @Size(min = 2, max = 2, message = "prod ri alloc type should have atleast 2 characters") String pROD_RI_ALLOC_TYPE,
				@NotNull @Size(min = 1, max = 1, message = "prod int insur yn should have atleast 1 characters") String pROD_IND_INSURE_YN) {
			super();
			PROD_CODE = pROD_CODE;
			PROD_DESC = pROD_DESC;
			PROD_DESC_BL = pROD_DESC_BL;
			PROD_SHORT_DESC = pROD_SHORT_DESC;
			PROD_SHORT_DESC_BL = pROD_SHORT_DESC_BL;
			PROD_LOB_CODE = pROD_LOB_CODE;
			PROD_INST_YN = pROD_INST_YN;
			PROD_ANNUAL_YN = pROD_ANNUAL_YN;
			PROD_MAX_DISC_PERC = pROD_MAX_DISC_PERC;
			PROD_CLM_INTM_DAYS = pROD_CLM_INTM_DAYS;
			PROD_CLM_SI_VALID_YN = pROD_CLM_SI_VALID_YN;
			PROD_CLM_LOSSDT_VALID_YN = pROD_CLM_LOSSDT_VALID_YN;
			PROD_CLM_REINST_VAL_YN = pROD_CLM_REINST_VAL_YN;
			PROD_CLM_CLOSE_PROX_DAYS = pROD_CLM_CLOSE_PROX_DAYS;
			PROD_EFF_FM_DT = pROD_EFF_FM_DT;
			PROD_EFF_TO_DT = pROD_EFF_TO_DT;
			PROD_RI_TTY_BASIS = pROD_RI_TTY_BASIS;
			PROD_RI_END_ALLOC_BASIS = pROD_RI_END_ALLOC_BASIS;
			PROD_RI_CEDING_BASIS = pROD_RI_CEDING_BASIS;
			PROD_CR_DT = pROD_CR_DT;
			PROD_CR_UID = pROD_CR_UID;
			PROD_UPD_DT = pROD_UPD_DT;
			PROD_UPD_UID = pROD_UPD_UID;
			PROD_FAC_AUTO_APPR_YN = pROD_FAC_AUTO_APPR_YN;
			PROD_RI_ALLOC_TYPE = pROD_RI_ALLOC_TYPE;
			PROD_IND_INSURE_YN = pROD_IND_INSURE_YN;
		}
		
		
}
