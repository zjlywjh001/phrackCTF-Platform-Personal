package top.phrack.ctf.models.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.phrack.ctf.pojo.Submissions;
import top.phrack.ctf.pojo.SubmissionsExample;

public interface SubmissionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.submissions
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int countByExample(SubmissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.submissions
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int deleteByExample(SubmissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.submissions
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.submissions
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int insert(Submissions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.submissions
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int insertSelective(Submissions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.submissions
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    List<Submissions> selectByExample(SubmissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.submissions
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    Submissions selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.submissions
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int updateByExampleSelective(@Param("record") Submissions record, @Param("example") SubmissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.submissions
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int updateByExample(@Param("record") Submissions record, @Param("example") SubmissionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.submissions
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int updateByPrimaryKeySelective(Submissions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.submissions
     *
     * @mbggenerated Thu Mar 31 16:07:59 CST 2016
     */
    int updateByPrimaryKey(Submissions record);
    
    List<Submissions> getCorrectSubmitBytaskId(Long taskid);
    
    List<Submissions> getCorrectSubmitByUserid(Long userid);
    
    List<Submissions> getAllSubmitByUserId(Long userid);
    
    Submissions selectLastCorrectSubmitByUserId(Long id);
    
    Submissions selectLastSubmitByUserId(Long id);
    
    Long countSolvedByUseridAndTaskId(@Param("userid") Long userid,@Param("taskid") Long taskid);
    
    Submissions selectCorrectByUseridAndTaskId(@Param("userid") Long userid,@Param("taskid") Long taskid);
    
    List<Submissions> selectAll();
    
    Submissions selectExtraSubmitByUserId(Long id);
    
    Long countSubmitByUserIdAndTaskId(@Param("userid") Long userid,@Param("taskid") Long taskid);
    
    List<Submissions> SelectCorrectOrderByUserId();
}