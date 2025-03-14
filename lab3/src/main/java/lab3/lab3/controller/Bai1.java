package lab3.lab3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Bai1 {
    @RequestMapping("/staff/detail")
    public String detail(Model model) {
        Staff staff = Staff.builder()
                        .id("user@gmail.com")
                        .fullname("nguyễn văn user")
                        .level(2)
                        .build();
        model.addAttribute("staff", staff);
        return "bai1/staff-detail";
    }
    
}
