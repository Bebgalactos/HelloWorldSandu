package fr.ul.miage.beb.boundary;

import java.net.URI;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.miage.intervenantservice.control.IntervenantAssembler;
import org.miage.intervenantservice.entity.Intervenant;
import org.miage.intervenantservice.entity.IntervenantInput;
import org.miage.intervenantservice.entity.IntervenantValidator;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@Controller
@ResponseBody
@RequestMapping(value = "/intervenants", produces = MediaType.APPLICATION_JSON_VALUE)
public class HWRepresentation {


    public HWRepresentation() {
    }

    // GET all
    @GetMapping
    public ResponseEntity<?> getAllIntervenants() {
        return ResponseEntity.ok("Hello World I'm Lucas");
    }

}
