package com.dynastech.model.mapper;

import com.dynastech.model.entity.Exam;
import com.dynastech.model.entity.ExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_exam
	 * @mbggenerated  Thu Sep 28 10:23:09 CST 2017
	 */
	int countByExample(ExamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_exam
	 * @mbggenerated  Thu Sep 28 10:23:09 CST 2017
	 */
	int deleteByExample(ExamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_exam
	 * @mbggenerated  Thu Sep 28 10:23:09 CST 2017
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_exam
	 * @mbggenerated  Thu Sep 28 10:23:09 CST 2017
	 */
	int insert(Exam record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_exam
	 * @mbggenerated  Thu Sep 28 10:23:09 CST 2017
	 */
	int insertSelective(Exam record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_exam
	 * @mbggenerated  Thu Sep 28 10:23:09 CST 2017
	 */
	List<Exam> selectByExample(ExamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_exam
	 * @mbggenerated  Thu Sep 28 10:23:09 CST 2017
	 */
	Exam selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_exam
	 * @mbggenerated  Thu Sep 28 10:23:09 CST 2017
	 */
	int updateByExampleSelective(@Param("record") Exam record, @Param("example") ExamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_exam
	 * @mbggenerated  Thu Sep 28 10:23:09 CST 2017
	 */
	int updateByExample(@Param("record") Exam record, @Param("example") ExamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_exam
	 * @mbggenerated  Thu Sep 28 10:23:09 CST 2017
	 */
	int updateByPrimaryKeySelective(Exam record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table t_exam
	 * @mbggenerated  Thu Sep 28 10:23:09 CST 2017
	 */
	int updateByPrimaryKey(Exam record);
}