package com.company.service;

import java.util.List;

import com.company.bean.Evaluate;
import com.company.vo.EvaluateVO;

/**
 * @author 金子阳
 * @category 评论的业务逻辑层
 *
 */
public interface IEvaluateService {
	/**
	 * 查询评论
	 * 
	 * @param clientid客户编号
	 * @return
	 */
	public List<EvaluateVO> find(String clientid);

	/**
	 * 增加评论
	 * 
	 * @param evaluate
	 * @return
	 */
	public boolean add(Evaluate evaluate);
}
