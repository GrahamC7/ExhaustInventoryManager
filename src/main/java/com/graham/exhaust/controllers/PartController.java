package com.graham.exhaust.controllers;

import com.graham.exhaust.domain.InhousePart;
import com.graham.exhaust.domain.OutsourcedPart;
import com.graham.exhaust.service.InhousePartService;
import com.graham.exhaust.service.OutsourcedPartService;
import com.graham.exhaust.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/parts")
public class PartController {

    private final InhousePartService inhousePartService;
    private final OutsourcedPartService outsourcedPartService;
    private final PartService partService;

    @Autowired
    public PartController(InhousePartService inhousePartService,
                          OutsourcedPartService outsourcedPartService,
                          PartService partService) {
        this.inhousePartService = inhousePartService;
        this.outsourcedPartService = outsourcedPartService;
        this.partService = partService;
    }

    @GetMapping("/inhouse/new")
    public String showInhouseForm(Model model) {
        model.addAttribute("inhousepart", new InhousePart());
        return "InhousePartForm";
    }

    @PostMapping("/inhouse")
    public String saveInhouse(@ModelAttribute("inhousepart") InhousePart part) {
        inhousePartService.save(part);
        return "confirmationaddpart";
    }

    @GetMapping("/outsourced/new")
    public String showOutsourcedForm(Model model) {
        model.addAttribute("outsourcedpart", new OutsourcedPart());
        return "OutsourcedPartForm";
    }

    @PostMapping("/outsourced")
    public String saveOutsourced(@ModelAttribute("outsourcedpart") OutsourcedPart part) {
        outsourcedPartService.save(part);
        return "confirmationaddpart";
    }

    @GetMapping("/delete/{id}")
    public String deletePart(@PathVariable("id") Long id) {
        partService.deleteById(id.intValue());
        return "confirmationdeletepart";
    }
}
