package com.choa.f1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.choa.freeboard.FreeboardDAO;
import com.choa.freeboard.FreeboardDTO;

public class FreeboardDAOTest extends MyAbstract{

	@Autowired
	private FreeboardDAO freeboardDAO;
	

	public void test() throws Exception{
		
		FreeboardDTO freeboardDTO = new FreeboardDTO();
		
		freeboardDTO.setWriter("han");
		freeboardDTO.setTitle("hyung");
		freeboardDTO.setContents("sun");
		
		freeboardDAO.write(freeboardDTO);
		System.out.println("WriteFinish");
	
	
	}

	

	public void test2() throws Exception{
		
		FreeboardDTO freeboardDTO = new FreeboardDTO();
		
		freeboardDTO.setNum(3);
		freeboardDTO.setTitle("hjhj");
		freeboardDTO.setContents("asd");
		
		assertEquals(1, freeboardDAO.update(freeboardDTO));
		
		System.out.println("UpdateFinish");
	
	}
	
	@Test
	public void test3() throws Exception{
		
		FreeboardDTO freeboardDTO = new FreeboardDTO();
		
		freeboardDTO.setNum(1);
		freeboardDTO.setWriter("1-3");
		freeboardDTO.setTitle("1-3");
		freeboardDTO.setContents("1-3");
		
		assertEquals(1, freeboardDAO.reply(freeboardDTO));
		
		System.out.println("UpdateFinish");
	
	}
	
	
}
