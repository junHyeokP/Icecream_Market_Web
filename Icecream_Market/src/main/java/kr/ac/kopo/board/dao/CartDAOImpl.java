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
		int result = sqlSession.insert("dao.cartDAO.insertCart", cart);
		sqlSession.commit();
		return result;
	}

	@Override
	public List<CartVO> selectAll() {
		List<CartVO> list = sqlSession.selectList("dao.cartDAO.selectAllCart");
		return list;
	}

	@Override
	public CartVO selectByCup_and_Id(CartVO cart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByCup_and_Id(CartVO cart) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByCup_and_Id(CartVO cart) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAll() {
		int result = sqlSession.delete("dao.cartDAO.deleteAllCart");
		sqlSession.commit();
		return result;
	}
	
}
