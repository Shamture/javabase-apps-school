package org.javabase.apps.controller.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/student")
public class AddStudentController {
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
    public String studentPage() {
        return "student/addStudent";
    }
	
}
