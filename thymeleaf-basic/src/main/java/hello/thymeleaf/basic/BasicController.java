package hello.thymeleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/basic")
public class BasicController {
    @GetMapping("/text-basic")
    public String textBasic(Model model) {
//        model.addAttribute("data", "hello Spring");
        model.addAttribute("data", "hello <b>Spring</b>");
        return "basic/text-basic";
    }

    @GetMapping("/text-basic/{string}")
    public String textBasic2(Model model,
                             @PathVariable("string") String string) {
        model.addAttribute("data", string);
        return "basic/text-basic";
    }

    @GetMapping("/text-unescaped")
    public String textUnescaped(Model model) {
        model.addAttribute("data", "hello <b>Spring</b>");
        return "basic/text-unescaped";
    }
}
