package cn.xjt.book.controller;

import cn.xjt.book.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


/**
 * 内容：
 *
 * @author
 * @date 2020/9/18-16:18
 */

@Controller
public class BookController {

	@Autowired
	private BookService service;

	public void buybook()
	{
		service.buyBook("1001","1");
	}
}
