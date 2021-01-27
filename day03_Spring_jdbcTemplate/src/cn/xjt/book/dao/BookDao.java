package cn.xjt.book.dao;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/18-16:21
 */
public interface BookDao {

	/**
	 * 通过id查询图书价格
	 * @param bid   图书id
	 * @return  返回当前图书的价格
	 */
	Integer selectprice(String bid);

	/**
	 * 更新库存
	 * @param bid   图书id
	 */
	void updateSt(String bid);

	/**
	 * 更新当前余额
	 * @param uid   用户id
	 * @param price     图书金额
	 */
	void updatePrice(String uid,Integer price);
}
