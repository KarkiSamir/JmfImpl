package com.jmf.impl.entity;

import java.io.Serializable;
import java.util.Date;

public class JmfTaskConfigHistory implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.TASK_CONFIG_HISTORY_ID
     *
     * @mbg.generated
     */
    private String taskConfigHistoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.TASK_NAME
     *
     * @mbg.generated
     */
    private String taskName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.AVG_COUNT
     *
     * @mbg.generated
     */
    private Integer avgCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.IS_SIGNATURE
     *
     * @mbg.generated
     */
    private String isSignature;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.SIGNATURE_UPDATE
     *
     * @mbg.generated
     */
    private String signatureUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.IS_ENCRYPT
     *
     * @mbg.generated
     */
    private String isEncrypt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.ENCRYPT_UPDATE
     *
     * @mbg.generated
     */
    private String encryptUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.IS_COMPRESS
     *
     * @mbg.generated
     */
    private String isCompress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.COMPRESS_UPDATE
     *
     * @mbg.generated
     */
    private String compressUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.IS_LANDING
     *
     * @mbg.generated
     */
    private String isLanding;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.LANDING_UPDATE
     *
     * @mbg.generated
     */
    private String landingUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.IS_VALIDATE
     *
     * @mbg.generated
     */
    private String isValidate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.VALIDATE_UPDATE
     *
     * @mbg.generated
     */
    private String validateUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.SEND_MODE
     *
     * @mbg.generated
     */
    private String sendMode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.MSG_LAND_PATH
     *
     * @mbg.generated
     */
    private String msgLandPath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.CERT_SEQ_NO
     *
     * @mbg.generated
     */
    private String certSeqNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.ENCRYPT_CONFIG_ID
     *
     * @mbg.generated
     */
    private String encryptConfigId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.HISTORY_ACTION
     *
     * @mbg.generated
     */
    private String historyAction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.OPREATION_TIME
     *
     * @mbg.generated
     */
    private Date opreationTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.CREATETIME
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.UPDATETIME
     *
     * @mbg.generated
     */
    private Date updatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.CRYPT_KEY_NO
     *
     * @mbg.generated
     */
    private Short cryptKeyNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.CIPHER_KEY_NO
     *
     * @mbg.generated
     */
    private Short cipherKeyNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.CMS_SIGN_ATTRIBUTE
     *
     * @mbg.generated
     */
    private String cmsSignAttribute;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_TASK_CONFIG_HISTORY.SIGN_ATTRIBUTE
     *
     * @mbg.generated
     */
    private Short signAttribute;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table JMF_TASK_CONFIG_HISTORY
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.TASK_CONFIG_HISTORY_ID
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.TASK_CONFIG_HISTORY_ID
     * @mbg.generated
     */
    public String getTaskConfigHistoryId() {
        return taskConfigHistoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.TASK_CONFIG_HISTORY_ID
     *
     * @param taskConfigHistoryId the value for JMF_TASK_CONFIG_HISTORY.TASK_CONFIG_HISTORY_ID
     * @mbg.generated
     */
    public void setTaskConfigHistoryId(String taskConfigHistoryId) {
        this.taskConfigHistoryId = taskConfigHistoryId == null ? null : taskConfigHistoryId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.TASK_NAME
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.TASK_NAME
     * @mbg.generated
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.TASK_NAME
     *
     * @param taskName the value for JMF_TASK_CONFIG_HISTORY.TASK_NAME
     * @mbg.generated
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.AVG_COUNT
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.AVG_COUNT
     * @mbg.generated
     */
    public Integer getAvgCount() {
        return avgCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.AVG_COUNT
     *
     * @param avgCount the value for JMF_TASK_CONFIG_HISTORY.AVG_COUNT
     * @mbg.generated
     */
    public void setAvgCount(Integer avgCount) {
        this.avgCount = avgCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.IS_SIGNATURE
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.IS_SIGNATURE
     * @mbg.generated
     */
    public String getIsSignature() {
        return isSignature;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.IS_SIGNATURE
     *
     * @param isSignature the value for JMF_TASK_CONFIG_HISTORY.IS_SIGNATURE
     * @mbg.generated
     */
    public void setIsSignature(String isSignature) {
        this.isSignature = isSignature == null ? null : isSignature.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.SIGNATURE_UPDATE
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.SIGNATURE_UPDATE
     * @mbg.generated
     */
    public String getSignatureUpdate() {
        return signatureUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.SIGNATURE_UPDATE
     *
     * @param signatureUpdate the value for JMF_TASK_CONFIG_HISTORY.SIGNATURE_UPDATE
     * @mbg.generated
     */
    public void setSignatureUpdate(String signatureUpdate) {
        this.signatureUpdate = signatureUpdate == null ? null : signatureUpdate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.IS_ENCRYPT
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.IS_ENCRYPT
     * @mbg.generated
     */
    public String getIsEncrypt() {
        return isEncrypt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.IS_ENCRYPT
     *
     * @param isEncrypt the value for JMF_TASK_CONFIG_HISTORY.IS_ENCRYPT
     * @mbg.generated
     */
    public void setIsEncrypt(String isEncrypt) {
        this.isEncrypt = isEncrypt == null ? null : isEncrypt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.ENCRYPT_UPDATE
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.ENCRYPT_UPDATE
     * @mbg.generated
     */
    public String getEncryptUpdate() {
        return encryptUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.ENCRYPT_UPDATE
     *
     * @param encryptUpdate the value for JMF_TASK_CONFIG_HISTORY.ENCRYPT_UPDATE
     * @mbg.generated
     */
    public void setEncryptUpdate(String encryptUpdate) {
        this.encryptUpdate = encryptUpdate == null ? null : encryptUpdate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.IS_COMPRESS
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.IS_COMPRESS
     * @mbg.generated
     */
    public String getIsCompress() {
        return isCompress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.IS_COMPRESS
     *
     * @param isCompress the value for JMF_TASK_CONFIG_HISTORY.IS_COMPRESS
     * @mbg.generated
     */
    public void setIsCompress(String isCompress) {
        this.isCompress = isCompress == null ? null : isCompress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.COMPRESS_UPDATE
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.COMPRESS_UPDATE
     * @mbg.generated
     */
    public String getCompressUpdate() {
        return compressUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.COMPRESS_UPDATE
     *
     * @param compressUpdate the value for JMF_TASK_CONFIG_HISTORY.COMPRESS_UPDATE
     * @mbg.generated
     */
    public void setCompressUpdate(String compressUpdate) {
        this.compressUpdate = compressUpdate == null ? null : compressUpdate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.IS_LANDING
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.IS_LANDING
     * @mbg.generated
     */
    public String getIsLanding() {
        return isLanding;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.IS_LANDING
     *
     * @param isLanding the value for JMF_TASK_CONFIG_HISTORY.IS_LANDING
     * @mbg.generated
     */
    public void setIsLanding(String isLanding) {
        this.isLanding = isLanding == null ? null : isLanding.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.LANDING_UPDATE
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.LANDING_UPDATE
     * @mbg.generated
     */
    public String getLandingUpdate() {
        return landingUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.LANDING_UPDATE
     *
     * @param landingUpdate the value for JMF_TASK_CONFIG_HISTORY.LANDING_UPDATE
     * @mbg.generated
     */
    public void setLandingUpdate(String landingUpdate) {
        this.landingUpdate = landingUpdate == null ? null : landingUpdate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.IS_VALIDATE
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.IS_VALIDATE
     * @mbg.generated
     */
    public String getIsValidate() {
        return isValidate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.IS_VALIDATE
     *
     * @param isValidate the value for JMF_TASK_CONFIG_HISTORY.IS_VALIDATE
     * @mbg.generated
     */
    public void setIsValidate(String isValidate) {
        this.isValidate = isValidate == null ? null : isValidate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.VALIDATE_UPDATE
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.VALIDATE_UPDATE
     * @mbg.generated
     */
    public String getValidateUpdate() {
        return validateUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.VALIDATE_UPDATE
     *
     * @param validateUpdate the value for JMF_TASK_CONFIG_HISTORY.VALIDATE_UPDATE
     * @mbg.generated
     */
    public void setValidateUpdate(String validateUpdate) {
        this.validateUpdate = validateUpdate == null ? null : validateUpdate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.SEND_MODE
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.SEND_MODE
     * @mbg.generated
     */
    public String getSendMode() {
        return sendMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.SEND_MODE
     *
     * @param sendMode the value for JMF_TASK_CONFIG_HISTORY.SEND_MODE
     * @mbg.generated
     */
    public void setSendMode(String sendMode) {
        this.sendMode = sendMode == null ? null : sendMode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.MSG_LAND_PATH
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.MSG_LAND_PATH
     * @mbg.generated
     */
    public String getMsgLandPath() {
        return msgLandPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.MSG_LAND_PATH
     *
     * @param msgLandPath the value for JMF_TASK_CONFIG_HISTORY.MSG_LAND_PATH
     * @mbg.generated
     */
    public void setMsgLandPath(String msgLandPath) {
        this.msgLandPath = msgLandPath == null ? null : msgLandPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.CERT_SEQ_NO
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.CERT_SEQ_NO
     * @mbg.generated
     */
    public String getCertSeqNo() {
        return certSeqNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.CERT_SEQ_NO
     *
     * @param certSeqNo the value for JMF_TASK_CONFIG_HISTORY.CERT_SEQ_NO
     * @mbg.generated
     */
    public void setCertSeqNo(String certSeqNo) {
        this.certSeqNo = certSeqNo == null ? null : certSeqNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.ENCRYPT_CONFIG_ID
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.ENCRYPT_CONFIG_ID
     * @mbg.generated
     */
    public String getEncryptConfigId() {
        return encryptConfigId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.ENCRYPT_CONFIG_ID
     *
     * @param encryptConfigId the value for JMF_TASK_CONFIG_HISTORY.ENCRYPT_CONFIG_ID
     * @mbg.generated
     */
    public void setEncryptConfigId(String encryptConfigId) {
        this.encryptConfigId = encryptConfigId == null ? null : encryptConfigId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.HISTORY_ACTION
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.HISTORY_ACTION
     * @mbg.generated
     */
    public String getHistoryAction() {
        return historyAction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.HISTORY_ACTION
     *
     * @param historyAction the value for JMF_TASK_CONFIG_HISTORY.HISTORY_ACTION
     * @mbg.generated
     */
    public void setHistoryAction(String historyAction) {
        this.historyAction = historyAction == null ? null : historyAction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.OPREATION_TIME
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.OPREATION_TIME
     * @mbg.generated
     */
    public Date getOpreationTime() {
        return opreationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.OPREATION_TIME
     *
     * @param opreationTime the value for JMF_TASK_CONFIG_HISTORY.OPREATION_TIME
     * @mbg.generated
     */
    public void setOpreationTime(Date opreationTime) {
        this.opreationTime = opreationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.CREATETIME
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.CREATETIME
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.CREATETIME
     *
     * @param createtime the value for JMF_TASK_CONFIG_HISTORY.CREATETIME
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.UPDATETIME
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.UPDATETIME
     * @mbg.generated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.UPDATETIME
     *
     * @param updatetime the value for JMF_TASK_CONFIG_HISTORY.UPDATETIME
     * @mbg.generated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.CRYPT_KEY_NO
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.CRYPT_KEY_NO
     * @mbg.generated
     */
    public Short getCryptKeyNo() {
        return cryptKeyNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.CRYPT_KEY_NO
     *
     * @param cryptKeyNo the value for JMF_TASK_CONFIG_HISTORY.CRYPT_KEY_NO
     * @mbg.generated
     */
    public void setCryptKeyNo(Short cryptKeyNo) {
        this.cryptKeyNo = cryptKeyNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.CIPHER_KEY_NO
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.CIPHER_KEY_NO
     * @mbg.generated
     */
    public Short getCipherKeyNo() {
        return cipherKeyNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.CIPHER_KEY_NO
     *
     * @param cipherKeyNo the value for JMF_TASK_CONFIG_HISTORY.CIPHER_KEY_NO
     * @mbg.generated
     */
    public void setCipherKeyNo(Short cipherKeyNo) {
        this.cipherKeyNo = cipherKeyNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.CMS_SIGN_ATTRIBUTE
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.CMS_SIGN_ATTRIBUTE
     * @mbg.generated
     */
    public String getCmsSignAttribute() {
        return cmsSignAttribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.CMS_SIGN_ATTRIBUTE
     *
     * @param cmsSignAttribute the value for JMF_TASK_CONFIG_HISTORY.CMS_SIGN_ATTRIBUTE
     * @mbg.generated
     */
    public void setCmsSignAttribute(String cmsSignAttribute) {
        this.cmsSignAttribute = cmsSignAttribute == null ? null : cmsSignAttribute.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_TASK_CONFIG_HISTORY.SIGN_ATTRIBUTE
     *
     * @return the value of JMF_TASK_CONFIG_HISTORY.SIGN_ATTRIBUTE
     * @mbg.generated
     */
    public Short getSignAttribute() {
        return signAttribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_TASK_CONFIG_HISTORY.SIGN_ATTRIBUTE
     *
     * @param signAttribute the value for JMF_TASK_CONFIG_HISTORY.SIGN_ATTRIBUTE
     * @mbg.generated
     */
    public void setSignAttribute(Short signAttribute) {
        this.signAttribute = signAttribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_TASK_CONFIG_HISTORY
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taskConfigHistoryId=").append(taskConfigHistoryId);
        sb.append(", taskName=").append(taskName);
        sb.append(", avgCount=").append(avgCount);
        sb.append(", isSignature=").append(isSignature);
        sb.append(", signatureUpdate=").append(signatureUpdate);
        sb.append(", isEncrypt=").append(isEncrypt);
        sb.append(", encryptUpdate=").append(encryptUpdate);
        sb.append(", isCompress=").append(isCompress);
        sb.append(", compressUpdate=").append(compressUpdate);
        sb.append(", isLanding=").append(isLanding);
        sb.append(", landingUpdate=").append(landingUpdate);
        sb.append(", isValidate=").append(isValidate);
        sb.append(", validateUpdate=").append(validateUpdate);
        sb.append(", sendMode=").append(sendMode);
        sb.append(", msgLandPath=").append(msgLandPath);
        sb.append(", certSeqNo=").append(certSeqNo);
        sb.append(", encryptConfigId=").append(encryptConfigId);
        sb.append(", historyAction=").append(historyAction);
        sb.append(", opreationTime=").append(opreationTime);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", cryptKeyNo=").append(cryptKeyNo);
        sb.append(", cipherKeyNo=").append(cipherKeyNo);
        sb.append(", cmsSignAttribute=").append(cmsSignAttribute);
        sb.append(", signAttribute=").append(signAttribute);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}