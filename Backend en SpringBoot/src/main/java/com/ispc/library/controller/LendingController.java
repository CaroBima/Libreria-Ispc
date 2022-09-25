
package com.ispc.library.controller;

import com.ispc.library.service.ILendingService;
import dto.LendingDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Caro
 */
@RestController
public class LendingController {
    
    @Autowired
    private ILendingService lendingService;
    
     @PostMapping("/buscarReservas")
    public List<LendingDto> guardarUsuario(@RequestBody String nombreUsuario){
        return lendingService.buscarReservasxUsuario(nombreUsuario);
    }
}
