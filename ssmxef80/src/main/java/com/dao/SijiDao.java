package com.dao;

import com.entity.SijiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SijiVO;
import com.entity.view.SijiView;


/**
 * 司机
 * 
 * @author 
 * @email 
 * @date 2021-03-08 16:42:30
 */
public interface SijiDao extends BaseMapper<SijiEntity> {
	
	List<SijiVO> selectListVO(@Param("ew") Wrapper<SijiEntity> wrapper);
	
	SijiVO selectVO(@Param("ew") Wrapper<SijiEntity> wrapper);
	
	List<SijiView> selectListView(@Param("ew") Wrapper<SijiEntity> wrapper);

	List<SijiView> selectListView(Pagination page,@Param("ew") Wrapper<SijiEntity> wrapper);
	
	SijiView selectView(@Param("ew") Wrapper<SijiEntity> wrapper);
	
}
