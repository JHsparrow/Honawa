package Honawa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import Honawa.DTO.MemberFormDto;
import lombok.RequiredArgsConstructor;

@RequestMapping(value="/items")
@Controller
@RequiredArgsConstructor
public class ItemController {
	@GetMapping(value="itemList_as")
	public String assembleList() {
		return "item/itemList_as";
	}
	
}
