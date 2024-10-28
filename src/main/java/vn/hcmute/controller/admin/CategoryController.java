package vn.hcmute.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.hcmute.entity.Category;
import vn.hcmute.services.CategoryService;

import java.util.List;

@Controller
@RequestMapping("/admin/categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    public String all(Module model){
        List<Category> list = categoryService.findAll();
        return "admin/categories/list";
    }
}
