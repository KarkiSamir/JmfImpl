package com.jmf.impl.dao;

import java.util.List;

import com.jmf.impl.entity.JmfTaskMqRef;

public interface JmfTaskMqRefMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_TASK_MQ_REF
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String relationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_TASK_MQ_REF
     *
     * @mbg.generated
     */
    int insert(JmfTaskMqRef record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_TASK_MQ_REF
     *
     * @mbg.generated
     */
    JmfTaskMqRef selectByPrimaryKey(String relationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_TASK_MQ_REF
     *
     * @mbg.generated
     */
    List<JmfTaskMqRef> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_TASK_MQ_REF
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(JmfTaskMqRef record);
}