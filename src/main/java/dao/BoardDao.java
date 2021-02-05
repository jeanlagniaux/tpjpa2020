package dao;

import jpa.business.Board;

public class BoardDao extends AbstractJpaDao<Long, Board>{

	public BoardDao() {
		super(Board.class);
	}

}
