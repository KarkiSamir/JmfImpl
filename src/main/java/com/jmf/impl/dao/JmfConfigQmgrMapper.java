package com.jmf.impl.dao;

import java.util.List;

import com.jmf.impl.entity.JmfConfigQmgr;

public interface JmfConfigQmgrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_CONFIG_QMGR
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String qmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_CONFIG_QMGR
     *
     * @mbg.generated
     */
    int insert(JmfConfigQmgr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_CONFIG_QMGR
     *
     * @mbg.generated
     */
    JmfConfigQmgr selectByPrimaryKey(String qmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_CONFIG_QMGR
     *
     * @mbg.generated
     */
    List<JmfConfigQmgr> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_CONFIG_QMGR
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(JmfConfigQmgr record);
}