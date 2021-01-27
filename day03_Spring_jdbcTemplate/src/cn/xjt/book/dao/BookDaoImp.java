package cn.xjt.book.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/18-16:21
 */

@Repository
public class BookDaoImp implements BookDao{

	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public Integer selectprice(String bid) {
		Integer price = jdbc.queryForObject("select price from book where bid=?", new Object[]{bid}, Integer.class);
		return price;
	}

	@Override
	public void updateSt(String bid) {
		//先获取该书籍的库存
		Integer stock = jdbc.queryForObject("select st from stock where sid=?", new Object[]{bid}, Integer.class);

		if(stock<=0)
		{
			System.out.println("当前库存为零，无法购买");
			throw new RuntimeException();
		}else {
			int update = jdbc.update("update stock set st=st-1 where sid=?", bid);
			if(update>=0)
			{
				System.out.println("更新成功,影响了"+update+"行");
			}else{
				System.out.println("更新失败");
			}
		}
	}

	@Override
	public void updatePrice(String uid,Integer price) {
		//查出当前余额
		Integer blance = jdbc.queryForObject("select blance from money where mid=?", new Object[]{uid}, Integer.class);
		if(blance>=-price)
		{
			int temp = blance-price;
			//更新余额
			int update = jdbc.update("update money set blance=? where mid=?", temp, uid);
			if(update>0)
			{
				System.out.println("购买成功");
			}
		}else {
			System.out.println("余额不足，购买失败");
			throw new RuntimeException();

		}
	}
}
