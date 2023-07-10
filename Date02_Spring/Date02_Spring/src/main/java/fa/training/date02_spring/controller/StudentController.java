package fa.training.date02_spring.controller;

import fa.training.date02_spring.model.Student;
import fa.training.date02_spring.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    public static final String REDIRECT_LOCATION = "redirect:/student/student-list";
    @GetMapping("/student")
    public String home(){
        return "home";
    }

    @GetMapping("/student-list")
    public String list(Model model){
        model.addAttribute("listStudent",studentService.getAll());
        return "student-list";
    }

    @GetMapping("/add-student")
    public String addStudent(Model model){
        model.addAttribute("student", new Student());
        return "add-student";
    }

    @PostMapping("/save-student")
    public String saveStudent(@ModelAttribute Student student, BindingResult result, Model model ){
        this.studentService.addStudent(student);
        return REDIRECT_LOCATION;
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("studentId") int id){
        studentService.deleteStudentById(id);
        return REDIRECT_LOCATION;
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("studentId") int id, Model model){
        Student student = studentService.getOne(id);
        model.addAttribute("student", student);
        return "update-student";
    }
    @PostMapping("/update-student")
    public String updateStudent(@ModelAttribute Student student, BindingResult result, Model model ){
        this.studentService.updateStudent(student);
        return REDIRECT_LOCATION;
    }

}
