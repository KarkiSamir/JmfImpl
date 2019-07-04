package com.jmf.impl.dao;

import java.util.List;

import com.jmf.impl.entity.JmfConfigCert;

public interface JmfConfigCertMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_CONFIG_CERT
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String configId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_CONFIG_CERT
     *
     * @mbg.generated
     */
    int insert(JmfConfigCert record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_CONFIG_CERT
     *
     * @mbg.generated
     */
    JmfConfigCert selectByPrimaryKey(String configId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_CONFIG_CERT
     *
     * @mbg.generated
     */
    List<JmfConfigCert> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JMF_CONFIG_CERT
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(JmfConfigCert record);
}