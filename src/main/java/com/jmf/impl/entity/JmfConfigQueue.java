package com.jmf.impl.entity;

import java.io.Serializable;
import java.util.Date;

public class JmfConfigQueue implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_CONFIG_QUEUE.CONFIG_ID
     *
     * @mbg.generated
     */
    private String configId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_CONFIG_QUEUE.QM_ID
     *
     * @mbg.generated
     */
    private String qmId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_CONFIG_QUEUE.QUEUE
     *
     * @mbg.generated
     */
    private String queue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_CONFIG_QUEUE.NOTE
     *
     * @mbg.generated
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_CONFIG_QUEUE.CREATETIME
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column JMF_CONFIG_QUEUE.UPDATETIME
     *
     * @mbg.generated
     */
    private Date updatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table JMF_CONFIG_QUEUE
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_CONFIG_QUEUE.CONFIG_ID
     *
     * @return the value of JMF_CONFIG_QUEUE.CONFIG_ID
     * @mbg.generated
     */
    public String getConfigId() {
        return configId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_CONFIG_QUEUE.CONFIG_ID
     *
     * @param configId the value for JMF_CONFIG_QUEUE.CONFIG_ID
     * @mbg.generated
     */
    public void setConfigId(String configId) {
        this.configId = configId == null ? null : configId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_CONFIG_QUEUE.QM_ID
     *
     * @return the value of JMF_CONFIG_QUEUE.QM_ID
     * @mbg.generated
     */
    public String getQmId() {
        return qmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_CONFIG_QUEUE.QM_ID
     *
     * @param qmId the value for JMF_CONFIG_QUEUE.QM_ID
     * @mbg.generated
     */
    public void setQmId(String qmId) {
        this.qmId = qmId == null ? null : qmId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_CONFIG_QUEUE.QUEUE
     *
     * @return the value of JMF_CONFIG_QUEUE.QUEUE
     * @mbg.generated
     */
    public String getQueue() {
        return queue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_CONFIG_QUEUE.QUEUE
     *
     * @param queue the value for JMF_CONFIG_QUEUE.QUEUE
     * @mbg.generated
     */
    public void setQueue(String queue) {
        this.queue = queue == null ? null : queue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_CONFIG_QUEUE.NOTE
     *
     * @return the value of JMF_CONFIG_QUEUE.NOTE
     * @mbg.generated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_CONFIG_QUEUE.NOTE
     *
     * @param note the value for JMF_CONFIG_QUEUE.NOTE
     * @mbg.generated
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_CONFIG_QUEUE.CREATETIME
     *
     * @return the value of JMF_CONFIG_QUEUE.CREATETIME
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_CONFIG_QUEUE.CREATETIME
     *
     * @param createtime the value for JMF_CONFIG_QUEUE.CREATETIME
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column JMF_CONFIG_QUEUE.UPDATETIME
     *
     * @return the value of JMF_CONFIG_QUEUE.UPDATETIME
     * @mbg.generated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column JMF_CONFIG_QUEUE.UPDATETIME
     *
     * @param updatetime the value for JMF_CONFIG_QUEUE.UPDATETIME
     * @mbg.generated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_CONFIG_QUEUE
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", configId=").append(configId);
        sb.append(", qmId=").append(qmId);
        sb.append(", queue=").append(queue);
        sb.append(", note=").append(note);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}