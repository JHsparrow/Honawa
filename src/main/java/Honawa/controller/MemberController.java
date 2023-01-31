package Honawa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Honawa.DTO.MemberFormDto;
import lombok.RequiredArgsConstructor;

@RequestMapping(value="/members")
@Controller
@RequiredArgsConstructor
public class MemberController {
	@GetMapping(value="login")
	public String Login() {
		return "member/login";
	}
	
	@GetMapping(value="join")
	public String Join(Model model) {
		model.addAttribute("memberFormDto", new MemberFormDto());
		return "member/join";
	}
}
