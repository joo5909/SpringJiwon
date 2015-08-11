package demo.repository;

import java.util.List;
import org.springframework.data.repository.Repository;
import demo.model.Friends;

public interface JiwonRepository extends Repository<Friends, String> {

	public List<Friends> findByName(String name);
}
