package za.co.kss.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.kss.app.domain.AppUser;


public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	public AppUser findOneByUsername(String username);
}
