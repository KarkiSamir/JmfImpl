package com.jmf.impl.dao;

import java.util.List;

import com.jmf.impl.entity.JmfConfigQueue;

public interface JmfConfigQueueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_CONFIG_QUEUE
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String configId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_CONFIG_QUEUE
     *
     * @mbg.generated
     */
    int insert(JmfConfigQueue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_CONFIG_QUEUE
     *
     * @mbg.generated
     */
    JmfConfigQueue selectByPrimaryKey(String configId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_CONFIG_QUEUE
     *
     * @mbg.generated
     */
    List<JmfConfigQueue> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_CONFIG_QUEUE
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(JmfConfigQueue record);
}