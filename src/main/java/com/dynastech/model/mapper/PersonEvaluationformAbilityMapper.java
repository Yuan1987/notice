package com.dynastech.model.mapper;

import com.dynastech.model.entity.PersonEvaluationformAbility;
import com.dynastech.model.entity.PersonEvaluationformAbilityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonEvaluationformAbilityMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_evaluationform_ability
	 * @mbggenerated  Thu Sep 28 10:29:43 CST 2017
	 */
	int countByExample(PersonEvaluationformAbilityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_evaluationform_ability
	 * @mbggenerated  Thu Sep 28 10:29:43 CST 2017
	 */
	int deleteByExample(PersonEvaluationformAbilityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_evaluationform_ability
	 * @mbggenerated  Thu Sep 28 10:29:43 CST 2017
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_evaluationform_ability
	 * @mbggenerated  Thu Sep 28 10:29:43 CST 2017
	 */
	int insert(PersonEvaluationformAbility record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_evaluationform_ability
	 * @mbggenerated  Thu Sep 28 10:29:43 CST 2017
	 */
	int insertSelective(PersonEvaluationformAbility record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_evaluationform_ability
	 * @mbggenerated  Thu Sep 28 10:29:43 CST 2017
	 */
	List<PersonEvaluationformAbility> selectByExample(PersonEvaluationformAbilityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_evaluationform_ability
	 * @mbggenerated  Thu Sep 28 10:29:43 CST 2017
	 */
	PersonEvaluationformAbility selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_evaluationform_ability
	 * @mbggenerated  Thu Sep 28 10:29:43 CST 2017
	 */
	int updateByExampleSelective(@Param("record") PersonEvaluationformAbility record,
			@Param("example") PersonEvaluationformAbilityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_evaluationform_ability
	 * @mbggenerated  Thu Sep 28 10:29:43 CST 2017
	 */
	int updateByExample(@Param("record") PersonEvaluationformAbility record,
			@Param("example") PersonEvaluationformAbilityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_evaluationform_ability
	 * @mbggenerated  Thu Sep 28 10:29:43 CST 2017
	 */
	int updateByPrimaryKeySelective(PersonEvaluationformAbility record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_evaluationform_ability
	 * @mbggenerated  Thu Sep 28 10:29:43 CST 2017
	 */
	int updateByPrimaryKey(PersonEvaluationformAbility record);
}