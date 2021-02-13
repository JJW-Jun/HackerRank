package demo.customerdata.webdatagenerator;

import demo.customerdata.DataGenerator;

import javax.xml.crypto.Data;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


enum Portal{
    NAVER(1, "네이버"), YOUTUBE(2, "Youtube"),
    GOOGLE(3, "구글"), DAUM(4, "다음"),
    KAKAO(5, "카카오"), INSTAGRAM(6, "Instagram");

    private final int portalUseRank;
    private final String portalName;
    Portal(int portalUseRank, String portalName) {
        this.portalUseRank = portalUseRank;
        this.portalName = portalName;
    }

    public int getRank() {
        return portalUseRank;
    }
    public String getPortalName() { return portalName; }

}


class FlowPathGenerator implements WebData{
    // makedat
    public String makeData() {
        List<Portal> portalList = Arrays.asList(Portal.values());
        Collections.shuffle(portalList);
        return portalList.get(0).getPortalName();
    }
    public static void main(String args []){
        WebData flowPath = new FlowPathGenerator();

    }

}