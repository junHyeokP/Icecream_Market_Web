package kr.ac.kopo.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.mybatis.MyConfig;
import kr.ac.kopo.vo.CartVO;

public class CartDAOImpl implements CartDAO{

private SqlSession sqlSession; 
	
	public CartDAOImpl() {
		this.sqlSession = new MyConfig().getInstance();
	}

	@Override
	public int insert(CartVO cart) {
		
		return 0;
	}

	@Override
	public List<CartVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartVO selectByCupName(CartVO cart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByCupName(CartVO cart) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
