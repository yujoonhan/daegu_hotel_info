package com.greenart.api;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.greenart.service.HotelCartService;
import com.greenart.service.MemberService;
import com.greenart.vo.LoginVO;
import com.greenart.vo.MemberInfoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberAPIController {
    @Autowired
    MemberService service;
    @Autowired
    HotelCartService hc_service;

    @PostMapping("/member/join")
    public ResponseEntity<Map<String, Object>> postMemberJoin(
        @RequestBody MemberInfoVO vo
    ) {
        Map<String, Object> resultMap = service.insertMember(vo);
        if(!(boolean)resultMap.get("status")){
            return new ResponseEntity<>(resultMap, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(resultMap, HttpStatus.CREATED);
    }

    @GetMapping("/member/id_check")
    public Map<String, Object> getIdCheck(@RequestParam String id) {
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        // 아이디가 중복이 되는가? - true 그렇다 / false 아니다
        if(service.isDuplicatedId(id) == true){
            resultMap.put("status", false);
            resultMap.put("message", "["+id+"] 는 이미 사용중입니다.");
            return resultMap;
        }
        resultMap.put("status", true);
        resultMap.put("message", "["+id+"] 는 사용하실 수 있습니다.");
        return resultMap;
    }

    @GetMapping("/member/email_check")
    public Map<String, Object> getEmailCheck(@RequestParam String email) {
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        if(service.isDuplicatedEmail(email) == true){
            resultMap.put("status", false);
            resultMap.put("message", "["+email+"] 은 이미 사용중입니다.");
            return resultMap;
        }
        resultMap.put("status", true);
        resultMap.put("message", "["+email+"] 은 사용하실 수 있습니다.");
        return resultMap;
    }

    @PostMapping("/member/login")
    public Map<String, Object> postMemberLogin(
        @RequestBody LoginVO vo, HttpSession session
    ) {
        Map<String,Object> resultMap = service.loginMember(vo);
        session.setAttribute("member", resultMap.get("member"));

        MemberInfoVO member = (MemberInfoVO)resultMap.get("member");
        if(member != null){
            Integer cart_cnt = hc_service.selectCount(member.getMi_seq());
            session.setAttribute("cart_cnt", cart_cnt);
        }

        return resultMap;
    }

}
