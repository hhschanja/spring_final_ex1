package com.choa.freeboard;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class FreeboardDAO {

	@Inject
	private SqlSession sqlSession;
	private final String NAMESPACE = "FreeboardMapper.";
		
	public int write(FreeboardDTO freeboardDTO) throws Exception{
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("freeboardDTO", freeboardDTO);
		
		sqlSession.insert(NAMESPACE+"write", map);
		
		Integer result = (Integer)map.get("result");
		
		
		return result;
	}
	
	
	public int update(FreeboardDTO freeboardDTO) throws Exception{
		
		Map<String, Object> map = new HashMap<String, Object>(); //DTO도 들어가고 result도 받아야하니까 OBJECT 타입
		map.put("freeboardDTO", freeboardDTO);
		
		sqlSession.update(NAMESPACE+"update", map); //return 값이 위에 map에 들어가는거야
		
		Integer result = (Integer)map.get("result"); //파라미터 타입 변수명과 동일하게
		
		
		return result;
	}
	
	public int reply(FreeboardDTO freeboardDTO) throws Exception{
		
		Map<String, Object> map = new HashMap<String, Object>(); //DTO도 들어가고 result도 받아야하니까 OBJECT 타입
		map.put("freeboardDTO", freeboardDTO);
		
		sqlSession.insert(NAMESPACE+"reply", map); //return 값이 위에 map에 들어가는거야
		
		Integer result = (Integer)map.get("result"); //파라미터 타입 변수명과 동일하게
		
		
		return result;
	}
	
	
}
