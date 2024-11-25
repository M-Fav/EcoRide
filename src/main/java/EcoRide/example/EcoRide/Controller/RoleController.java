package EcoRide.example.EcoRide.Controller;

import EcoRide.example.EcoRide.Entity.Role;
import EcoRide.example.EcoRide.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleRepository roleRepository;

    @GetMapping
    public List<Role> getAllRole() {
        return roleRepository.findAll();
    }

    @GetMapping("/{roleId}")
    public Role getRoleById(@PathVariable Long roleId) {
        return  roleRepository.findById(roleId).orElseThrow(() -> new RuntimeException("Role introuvable"));
    }

    @PostMapping
    public Role createRole(@RequestBody Role role) {
        return roleRepository.save(role);
    }

    @PutMapping("/{roleId}")
    public Role updateRole(@PathVariable Long roleId, @RequestBody Role updateRole) {
        return roleRepository.findById(roleId).map(role -> {
            role.setLibelle(updateRole.getLibelle());
            return roleRepository.save(role);
        }).orElseThrow(() -> new RuntimeException("Role introuvable pour mise à jour !"));
    }

    @DeleteMapping("/{roleId}")
    public String deleteRole(@PathVariable Long roleId) {
        roleRepository.deleteById(roleId);
        return "Role supprimé avec succès !";
    }

    @GetMapping("/test")
    public String test() {
        return "l'accès Role fonctionne !";
    }
}
