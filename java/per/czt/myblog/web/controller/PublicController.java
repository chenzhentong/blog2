package per.czt.myblog.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public")
public class PublicController {
	/*@RequestMapping("resource")
	public String goFreeResourceCenter()
	{
		return "public/resourceCenter";
		
	}
	@RequestMapping("bbs")
	public String goBbs()
	{
		return "public/bbs";
		
	}*/
	@RequestMapping("index")
	public String goBbs()
	{
		return "index";
		
	}
	
}
