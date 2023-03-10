package springweb.a05_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.a05_mvc.a02_service.A01_EmpService;
import springweb.z01_vo.Emp;

@Controller("empCtrl")
public class A01_EmpController {
	@Autowired
	private A01_EmpService service;
	// 
	@RequestMapping("empListMy.do")
	public String empList(@ModelAttribute("sch") Emp sch,Model d) {
		d.addAttribute("empList", service.getEmpList(sch));
		return "\\WEB-INF\\views\\a05_mvc\\a01_empList.jsp";
	}
}
