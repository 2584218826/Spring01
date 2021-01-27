package cn.xjt.book;

import cn.xjt.book.controller.BookController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 内容：
 *
 * @author
 * @date 2020/9/18-17:16
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("book.xml");
		BookController book = ac.getBean("bookController", BookController.class);
		book.buybook();

	}
}
