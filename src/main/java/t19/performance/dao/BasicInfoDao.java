package t19.performance.dao;

import t19.performance.model.BasicInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @Description 设备基础信息接口
 * @author wangzhuo
 * @date 2018/5/22 9:18
 */
public interface BasicInfoDao {
	//根据id和sn号查询
	BasicInfo selectBySn(@Param("serialNum") String serialNum);
	int select();

	int insert(BasicInfo basicInfo);

	/**
	 * 批量插入
	 * @param records
	 * @return
	 */
	int insertBatch(List<BasicInfo> records);
}