package epi.PFA.sevice;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import epi.PFA.entities.Role;
import epi.PFA.repository.RoleRepository;


@Service

public class RoleService {
	@Autowired
RoleRepository roleRepository;
	
	
	
	public List<Role> getAllRoles() {
		
		return roleRepository.findAll();
	}

	public Role persistRole(Role r) {
		return  roleRepository.save(r);
	}
	
	public void deleteRole(Long id) {
		roleRepository.deleteById(id);		
		
	}
	

	
	
	public Role findRoleById(Long id) {
		return roleRepository.findById(id).get();
	}
	

}	


	





	
		




