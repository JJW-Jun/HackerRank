package demo.customerdata.webdatagenerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

enum BouncePage{

    PAGE_1(1), PAGE_2(2), PAGE_3(3), PAGE_4(4), PAGE_5(5),
    PAGE_6(6), PAGE_7(7), PAGE_8(8), PAGE_9(9), PAGE_10(10);

    private final int pageNumber;
    BouncePage(int pageNumber){
        this.pageNumber = pageNumber;
    }
    public int getPageNumber() { return pageNumber; }
}

public class BouncePageGenerator implements WebData{

    Random random = new Random();
    public String makeRandomPage(){
        List<BouncePage> bouncePageList = Arrays.asList(BouncePage.values());
        Collections.shuffle(bouncePageList);
        return String.valueOf(bouncePageList.get(0).getPageNumber());
    }
}