package cn.xjt.book.service;

import cn.xjt.book.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/18-16:19
 */

@Service
public class BookSerrviceImp implements BookService{

	@Autowired
	private BookDao dao;
	//required:必须的，传播调用该方法的事务       这是默认值
	//required_new:必须新的,使用自身的事务注解

	//timeout :超出时间强制回滚，单位秒
	//readOnly :设置该事务的操作只能为只读
	@Transactional(propagation = Propagation.REQUIRED,timeout = 3,readOnly = true)
	public void buyBook(String uid, String bid) {
		Integer price = dao.selectprice(bid);
		dao.updatePrice(uid, price);
		dao.updateSt(bid);
	}
}
