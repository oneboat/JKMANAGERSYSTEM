package cn.itcast.jk.dao;

import java.io.Serializable;
import java.util.List;

import cn.itcast.jk.vo.OutProduct;

/**
 * @Description:
 * @Author:	nutony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014-3-12
 */
public interface OutProductDao{
	public List<OutProduct> outProduct(Serializable inputDate);
	public List<String> getExtName(Serializable contractProductId);
}
