package com.greenart.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.greenart.mapper.MemberMapper;
import com.greenart.vo.LoginVO;
import com.greenart.vo.MemberInfoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    MemberMapper mapper;

    public Map<String, Object> insertMember(MemberInfoVO vo) {
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        boolean duplicated = isDuplicatedId(vo.getMi_id());

        if(duplicated) {
            resultMap.put("status", false);
            resultMap.put("message", "아이디가 중복됩니다.");
            return resultMap;
        }

        boolean email_dup = isDuplicatedEmail(vo.getMi_email());
        if(email_dup) {
            resultMap.put("status", false);
            resultMap.put("message", "이메일 중복됩니다.");
            return resultMap;
        }

        mapper.insertMember(vo);

        resultMap.put("status", true);
        resultMap.put("message", "회원가입이 완료되었습니다.");

        return resultMap;
    }
    public boolean isDuplicatedId(String id) {
        return mapper.selectMemberById(id) > 0;
    }
    public boolean isDuplicatedEmail(String email) {
        return mapper.selectMemberByEmail(email) > 0;
    }
    public List<MemberInfoVO> selectMemberAll() {
        return mapper.selectMemberAll();
    }
    public Map<String, Object> loginMember(LoginVO vo) {
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        Integer result = mapper.loginMember(vo);
        if(result == 1) {
            resultMap.put("status", true);
            MemberInfoVO member = mapper.selectMemberInfo(vo.getId());
            resultMap.put("member", member);
        }
        else {
            resultMap.put("status", false);
            resultMap.put("message", "아이디 혹은 비밀번호 오류입니다.");
        }
        return resultMap;
    }

}
