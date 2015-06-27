package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.VoteDAO;
import vo.vote.Vote;

@Component
public class VoteService {
	
	private VoteDAO voteDAO;
	
	@Autowired
	public void setVoteDAO(VoteDAO voteDAO) {
		this.voteDAO = voteDAO;
	}
	
	/////////////////////////////////////////////////////////////////////////////////
	public int insert(Vote vote) {
		return voteDAO.insert(vote);
	}
	public int update(Vote vote) {
		return voteDAO.update(vote);
	}
	public Vote selectVote(int bill_no) {
		return voteDAO.selectVote(bill_no);
	}
	public List<Vote> selectList() {
		return voteDAO.selectList();
	}

}