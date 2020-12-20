package com.mars.mobiletower.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@Entity
@Table(name = "CellTowerBean")
@EntityListeners(AuditingEntityListener.class)
@JacksonXmlRootElement(localName = "CellTowerBean")
@JsonIgnoreProperties(
allowGetters = true)
public class CellTower {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	@JacksonXmlProperty(isAttribute = true)
	private Integer id;

	@Column(name = "applicationStage")
	private String applicationStage;

	@Column(name = "docEnclosed")
	private Character docEnclosed;

	@Column(name = "")
	private String doc_path;

	@Column(name = "uniqueRequestNumber")
	private long uniqueRequestNumber;

	@Column(name = "paymentflag")
	private Character paymentflag;
    
	@Column(name = "RegFeeAmount")
	private Double regFeeAmount;
	
	@Column(name = "delflag")
	private Character delflag;

	@Column(name = "timestamp")
	@Temporal(TemporalType.DATE)
	private Date timestamp;

	@Column(name = "applicantName")
	private String applicantName;

	@Column(name = "applicantDoorNo")
	private String applicantDoorNo;

	@Column(name = "applicantStreet")
	private String applicantStreet;
	
	@Column(name = "applicantVillageMandal")
	private String applicantVillageMandal;

	
	@Column(name = "applicantCity_town")
	private String applicantCityTown;

	@Column(name = "applicantDistrict")
	private String applicantDistrict;
   
	
	@Column(name = "applicantMobileNo")
	private String applicantMobileNo;

	@Column(name = "applicantFulb")
	private String applicantPinCode;
	
	@Column(name = "applicantEmailId")
	private String applicantEmailId;

	@Column(name = "sitePlotNo")
	private String sitePlotNo;

	@Column(name = "siteSanctionedLayoutNo")
	private String siteSanctionedLayoutNo;

	@Column(name = "siteSurveyNo")
	private String siteSurveyNo;

	@Column(name = "premisesDoorNo")
	private String premisesDoorNo;
	
	@Column(name = "siteDistrictName")
	private String siteDistrictName;
	
	@Column(name="ulb_code")
	private Integer ulbCode;

    @Column(name = "siteRoad_Or_Street")
	private String siteRoad_Or_Street;
	
    @Column(name = "site_Ward_Block")
	private String siteWardBlock;
	
	@Column(name = "siteLocality")
	private String siteLocality;
	
	@Column(name = "circleDivision")
	private String circleDivision;
	
    @Column(name = "site_City_Town")
	private String siteCityTown;
	
	@Column(name = "plotSiteDocNumber")
	private String plotSiteDocNumber;
	
	@Column(name = "occupancyCertificateNo")
	private String occupancyCertificateNo;
	
	@Column(name = "buldingPermissionNo")
	private String buldingPermissionNo;
	
	@Column(name = "buldingPermissonDate")
	@Temporal(TemporalType.DATE)
	private Date buldingPermissonDate;
	
	@Column(name = "occupancyCertificateDate")
	@Temporal(TemporalType.DATE)
	private Date occupancyCertificateDate;
	
	@Column(name = "siteArea_As_Per_Doc")
	private String siteAreaAsPerDoc;
	
	@Column(name = "siteArea_As_Per_Plan")
	private String siteAreaAsPerPlan;
	
	@Column(name = "road_Widening_Area")
	private String roadWideningArea;
	
	@Column(name = "net_Area")
	private String netArea;
	
	@Column(name = "proposals")
	private String proposals;
	
	@Column(name = "isplanApproval")
	private Character isplanApproval;
	
	@Column(name = "is_Open_Plot_Site")
	private Character isOpenPlotSite;
	
	@Column(name = "TPS_TPPO_Flag")
	private Character tpsTPPOFlag;
	
	@Column(name = "ACP_TPO_Flag")
	private Character acpTPOFlag;
	
	@Column(name = "CMNR_Flag")
	private Character CMNRFlag;

	@Column(name = "TPS_TPPO_Remarks")
	private String tspTPPORemarks;

	@Column(name = "ACP_TPO_Remarks")
	private String acpTPORemarks;

	@Column(name = "CMNR_Remarks")
	private String cmnrRemarks;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApplicationStage() {
		return applicationStage;
	}

	public void setApplicationStage(String applicationStage) {
		this.applicationStage = applicationStage;
	}

	public Character getDocEnclosed() {
		return docEnclosed;
	}

	public void setDocEnclosed(Character docEnclosed) {
		this.docEnclosed = docEnclosed;
	}

	public String getDoc_path() {
		return doc_path;
	}

	public void setDoc_path(String doc_path) {
		this.doc_path = doc_path;
	}

	public long getUniqueRequestNumber() {
		return uniqueRequestNumber;
	}

	public void setUniqueRequestNumber(long uniqueRequestNumber) {
		this.uniqueRequestNumber = uniqueRequestNumber;
	}

	public Character getPaymentflag() {
		return paymentflag;
	}

	public void setPaymentflag(Character paymentflag) {
		this.paymentflag = paymentflag;
	}

	public Double getRegFeeAmount() {
		return regFeeAmount;
	}

	public void setRegFeeAmount(Double regFeeAmount) {
		this.regFeeAmount = regFeeAmount;
	}

	public Character getDelflag() {
		return delflag;
	}

	public void setDelflag(Character delflag) {
		this.delflag = delflag;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantDoorNo() {
		return applicantDoorNo;
	}

	public void setApplicantDoorNo(String applicantDoorNo) {
		this.applicantDoorNo = applicantDoorNo;
	}

	public String getApplicantStreet() {
		return applicantStreet;
	}

	public void setApplicantStreet(String applicantStreet) {
		this.applicantStreet = applicantStreet;
	}

	public String getApplicantVillageMandal() {
		return applicantVillageMandal;
	}

	public void setApplicantVillageMandal(String applicantVillageMandal) {
		this.applicantVillageMandal = applicantVillageMandal;
	}

	public String getApplicantCityTown() {
		return applicantCityTown;
	}

	public void setApplicantCityTown(String applicantCityTown) {
		this.applicantCityTown = applicantCityTown;
	}

	public String getApplicantDistrict() {
		return applicantDistrict;
	}

	public void setApplicantDistrict(String applicantDistrict) {
		this.applicantDistrict = applicantDistrict;
	}

	public String getApplicantMobileNo() {
		return applicantMobileNo;
	}

	public void setApplicantMobileNo(String applicantMobileNo) {
		this.applicantMobileNo = applicantMobileNo;
	}

	public String getApplicantPinCode() {
		return applicantPinCode;
	}

	public void setApplicantPinCode(String applicantPinCode) {
		this.applicantPinCode = applicantPinCode;
	}

	public String getApplicantEmailId() {
		return applicantEmailId;
	}

	public void setApplicantEmailId(String applicantEmailId) {
		this.applicantEmailId = applicantEmailId;
	}

	public String getSitePlotNo() {
		return sitePlotNo;
	}

	public void setSitePlotNo(String sitePlotNo) {
		this.sitePlotNo = sitePlotNo;
	}

	public String getSiteSanctionedLayoutNo() {
		return siteSanctionedLayoutNo;
	}

	public void setSiteSanctionedLayoutNo(String siteSanctionedLayoutNo) {
		this.siteSanctionedLayoutNo = siteSanctionedLayoutNo;
	}

	public String getSiteSurveyNo() {
		return siteSurveyNo;
	}

	public void setSiteSurveyNo(String siteSurveyNo) {
		this.siteSurveyNo = siteSurveyNo;
	}

	public String getPremisesDoorNo() {
		return premisesDoorNo;
	}

	public void setPremisesDoorNo(String premisesDoorNo) {
		this.premisesDoorNo = premisesDoorNo;
	}

	public String getSiteDistrictName() {
		return siteDistrictName;
	}

	public void setSiteDistrictName(String siteDistrictName) {
		this.siteDistrictName = siteDistrictName;
	}

	public Integer getUlbCode() {
		return ulbCode;
	}

	public void setUlbCode(Integer ulbCode) {
		this.ulbCode = ulbCode;
	}

	public String getSiteRoad_Or_Street() {
		return siteRoad_Or_Street;
	}

	public void setSiteRoad_Or_Street(String siteRoad_Or_Street) {
		this.siteRoad_Or_Street = siteRoad_Or_Street;
	}

	public String getSiteWardBlock() {
		return siteWardBlock;
	}

	public void setSiteWardBlock(String siteWardBlock) {
		this.siteWardBlock = siteWardBlock;
	}

	public String getSiteLocality() {
		return siteLocality;
	}

	public void setSiteLocality(String siteLocality) {
		this.siteLocality = siteLocality;
	}

	public String getCircleDivision() {
		return circleDivision;
	}

	public void setCircleDivision(String circleDivision) {
		this.circleDivision = circleDivision;
	}

	public String getSiteCityTown() {
		return siteCityTown;
	}

	public void setSiteCityTown(String siteCityTown) {
		this.siteCityTown = siteCityTown;
	}

	public String getPlotSiteDocNumber() {
		return plotSiteDocNumber;
	}

	public void setPlotSiteDocNumber(String plotSiteDocNumber) {
		this.plotSiteDocNumber = plotSiteDocNumber;
	}

	public String getOccupancyCertificateNo() {
		return occupancyCertificateNo;
	}

	public void setOccupancyCertificateNo(String occupancyCertificateNo) {
		this.occupancyCertificateNo = occupancyCertificateNo;
	}

	public String getBuldingPermissionNo() {
		return buldingPermissionNo;
	}

	public void setBuldingPermissionNo(String buldingPermissionNo) {
		this.buldingPermissionNo = buldingPermissionNo;
	}

	public Date getBuldingPermissonDate() {
		return buldingPermissonDate;
	}

	public void setBuldingPermissonDate(Date buldingPermissonDate) {
		this.buldingPermissonDate = buldingPermissonDate;
	}

	public Date getOccupancyCertificateDate() {
		return occupancyCertificateDate;
	}

	public void setOccupancyCertificateDate(Date occupancyCertificateDate) {
		this.occupancyCertificateDate = occupancyCertificateDate;
	}

	public String getSiteAreaAsPerDoc() {
		return siteAreaAsPerDoc;
	}

	public void setSiteAreaAsPerDoc(String siteAreaAsPerDoc) {
		this.siteAreaAsPerDoc = siteAreaAsPerDoc;
	}

	public String getSiteAreaAsPerPlan() {
		return siteAreaAsPerPlan;
	}

	public void setSiteAreaAsPerPlan(String siteAreaAsPerPlan) {
		this.siteAreaAsPerPlan = siteAreaAsPerPlan;
	}

	public String getRoadWideningArea() {
		return roadWideningArea;
	}

	public void setRoadWideningArea(String roadWideningArea) {
		this.roadWideningArea = roadWideningArea;
	}

	public String getNetArea() {
		return netArea;
	}

	public void setNetArea(String netArea) {
		this.netArea = netArea;
	}

	public String getProposals() {
		return proposals;
	}

	public void setProposals(String proposals) {
		this.proposals = proposals;
	}

	public Character getIsplanApproval() {
		return isplanApproval;
	}

	public void setIsplanApproval(Character isplanApproval) {
		this.isplanApproval = isplanApproval;
	}

	public Character getIsOpenPlotSite() {
		return isOpenPlotSite;
	}

	public void setIsOpenPlotSite(Character isOpenPlotSite) {
		this.isOpenPlotSite = isOpenPlotSite;
	}

	public Character getTpsTPPOFlag() {
		return tpsTPPOFlag;
	}

	public void setTpsTPPOFlag(Character tpsTPPOFlag) {
		this.tpsTPPOFlag = tpsTPPOFlag;
	}

	public Character getAcpTPOFlag() {
		return acpTPOFlag;
	}

	public void setAcpTPOFlag(Character acpTPOFlag) {
		this.acpTPOFlag = acpTPOFlag;
	}

	public Character getCMNRFlag() {
		return CMNRFlag;
	}

	public void setCMNRFlag(Character cMNRFlag) {
		CMNRFlag = cMNRFlag;
	}

	public String getTspTPPORemarks() {
		return tspTPPORemarks;
	}

	public void setTspTPPORemarks(String tspTPPORemarks) {
		this.tspTPPORemarks = tspTPPORemarks;
	}

	public String getAcpTPORemarks() {
		return acpTPORemarks;
	}

	public void setAcpTPORemarks(String acpTPORemarks) {
		this.acpTPORemarks = acpTPORemarks;
	}

	public String getCmnrRemarks() {
		return cmnrRemarks;
	}

	public void setCmnrRemarks(String cmnrRemarks) {
		this.cmnrRemarks = cmnrRemarks;
	}
	
	

}
