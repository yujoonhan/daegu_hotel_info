package com.greenart.api;

import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import com.greenart.service.DaeguTourService;
import com.greenart.vo.DaeguTourVO;
import com.greenart.vo.TourRegionVO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@RestController
public class DaeguTourAPIController {
    @Autowired
    DaeguTourService service;
    // https://tour.daegu.go.kr/openapi-data/service/rest/getTourKorAttract/svTourKorAttract.do?serviceKey=XcMVI%252BPYP9PXFzduwTkGpO3CLQp%252BznCPhBdTLXkiDkvBUpEmttNmd%252FN0xAzf1q%252FFNw0nDMBjCfLYb%252Bj9MJxTFg%253D%253D
    // &pageNo=1
    // &numOfRows=10
    // &SG_APIM=2ug8Dm9qNBfD32JLZGPN64f3EoTlkpD8kSOHWfXpyrY
    @GetMapping("/api/daeguTour")
    public Map<String, Object> getDaeguTour() throws Exception{
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        StringBuilder urlBuilder = new StringBuilder("https://tour.daegu.go.kr/openapi-data/service/rest/getTourKorAttract/svTourKorAttract.do"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8")
        + "=XcMVI%252BPYP9PXFzduwTkGpO3CLQp%252BznCPhBdTLXkiDkvBUpEmttNmd%252FN0xAzf1q%252FFNw0nDMBjCfLYb%252Bj9MJxTFg%253D%253D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("1000", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("SG_APIM","UTF-8") + "=" + URLEncoder.encode("2ug8Dm9qNBfD32JLZGPN64f3EoTlkpD8kSOHWfXpyrY", "UTF-8")); /**/
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = factory.newDocumentBuilder();
        Document doc = docBuilder.parse(urlBuilder.toString());
        
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("item");
        for(int i=0; i<nList.getLength(); i++) {
            Node node = nList.item(i);
            Element elem = (Element)node;
            System.out.println("=================================");
            System.out.println("주소 : "+getTagValue("address", elem));
            System.out.println("설명 : "+getTagValue("attractcontents", elem));
            System.out.println("이름 : "+getTagValue("attractname", elem));
            System.out.println("전화번호 : "+getTagValue("tel", elem));

            DaeguTourVO vo = new DaeguTourVO();
            vo.setT_address(getTagValue("address", elem));
            vo.setT_contents(getTagValue("attractcontents", elem));
            vo.setT_name(getTagValue("attractname", elem));
            vo.setT_tel(getTagValue("tel", elem));
            System.out.println(vo);
            // service.insertDaeguTour(vo);
            }
        

        resultMap.put("status", true);
        resultMap.put("message", "데이터가 입력되었습니다.");
        
        return resultMap;
    }

    public static String getTagValue(String tag, Element elem) {
        NodeList nlList = elem.getElementsByTagName(tag).item(0).getChildNodes();
        if(nlList == null) {
            return null;
        }
        Node node = (Node) nlList.item(0);
        if(node == null) {
            return null;
        }
        return node.getNodeValue();
    }

    @GetMapping("/api/tour")
    public Map<String, Object> getTourRegion(
        @RequestParam @Nullable String region,
        @RequestParam @Nullable Integer h_seq
        ){
        Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
        List<TourRegionVO> list = service.selectTourByAddress(h_seq, region);
        resultMap.put("list", list);
        return resultMap;
    }
}
